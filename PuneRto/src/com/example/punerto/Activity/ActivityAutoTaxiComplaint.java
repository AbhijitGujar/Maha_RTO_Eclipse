package com.example.punerto.Activity;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import co.example.punerto.classes.ServerAccess1;

import com.androidexample.gcm.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class ActivityAutoTaxiComplaint extends ActionBarActivity {

	ProgressDialog mProgressDialog;
    String strTest;
	private Button btn_Camera, btn_Gallery, btn_SendData;
	private ImageView img_selected;
	private NumberPicker numberPicker1, numberPicker2, numberPicker3,
			numberPicker4, numberPickermh, numberPickeralpha1,
			numberPickeralpha2;
	private RadioButton radioBtn_Auto, radioBtn_Taxi;

	private EditText edtPhoneNum, edtComplainantName, edtComplainantAddress,
			edtRouteTo, edtRouteFrom, edtEmailID, edtMessage;
	private CheckBox chkBoxRefusal, chkBoxOther, chkBoxTakLongDistRoute,
			chkBoxExcessFare, chkBoxIDNotDisplayed, chkBoxRudeBehave;
	private TimePicker timePicker;
	// private CalendarView calendarView;
	private Bitmap bitmap;
	private LinearLayout from_to, msg;
	private boolean excessfare, refuse, other, rude, id, longdist;

	TextView txt_Message, txt_To, txt_From;
	private static final int REQUEST_CODE = 1;
	private static final int CAMERA_REQUEST = 1888;
	Spinner spinner_RtoList;

	String mail_subject = "Auto/Taxi Complaint generated From Maha RTO App.";
	String motorVehicleNumber;
	String time;
	static String date;
	String complaint_Type;
	String otherComplaint;
	String motor_VehicleType;
	String Refusal = " ";
	String Other = " ";
	String LongDistRout = " ";
	String ExcessFare = " ";
	String IDNotDisplayed = " ";
	String RudeBehave = " ";
	String strMH;

	@SuppressLint("SimpleDateFormat")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setHomeButtonEnabled(true);
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#8B6417")));

		if (ActivityLanguage.lang.equals("English")) {
			setContentView(R.layout.activity_auto_taxi_complaint_abhi);

			actionBar.setTitle("Auto/Taxi Complaint");
		} else {
			setContentView(R.layout.activity_auto_taxi_complaint_marathi);
			actionBar.setTitle(R.string.auto_rikshaw);
		}

		actionBar.show();

		init();

		String[] mh = getResources().getStringArray(R.array.spinner_onlyMhItem);
		String[] alpha = getResources().getStringArray(
				R.array.spinner_onlyFirstAlph);

		numberPickermh.setMinValue(0);
		numberPickermh.setMaxValue(49);
		numberPickermh.setDisplayedValues(mh);

		numberPickeralpha1.setMinValue(0);
		numberPickeralpha1.setMaxValue(26);
		numberPickeralpha1.setDisplayedValues(alpha);

		numberPickeralpha2.setMinValue(0);
		numberPickeralpha2.setMaxValue(26);
		numberPickeralpha2.setDisplayedValues(alpha);

		numberPicker1.setMaxValue(9);
		numberPicker1.setMinValue(0);
		numberPicker2.setMaxValue(9);
		numberPicker2.setMinValue(0);
		numberPicker3.setMaxValue(9);
		numberPicker3.setMinValue(0);
		numberPicker4.setMaxValue(9);
		numberPicker4.setMinValue(0);
		date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

		btn_SendData.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) 
			{
				// TODO Auto-generated method stub

				if (radioBtn_Auto.isChecked() == true) {
					motor_VehicleType = "Auto";
				} else {
					motor_VehicleType = "Taxi";
				}

				motorVehicleNumber = "" + numberPickermh.getValue() + ""
						+ numberPickeralpha1.getValue() + ""
						+ numberPickeralpha2.getValue() + ""
						+ numberPicker1.getValue() + ""
						+ numberPicker2.getValue() + ""
						+ numberPicker3.getValue() + ""
						+ numberPicker4.getValue();

				getdata();
				if (checkValidation())
				{	// submitForm();
					
					new uploadData().execute();

				}

				else
				{
					//Toast.makeText(ActivityAutoTaxiComplaint.this,"Please fill the details", Toast.LENGTH_LONG).show();
				}

			}

		

			private boolean checkValidation() {
				boolean ret = true;

				if (!Validation.hasText(edtComplainantName))
					ret = false;
				if (!Validation.hasText(edtComplainantAddress))
					ret = false;
				if (!Validation.hasText(edtRouteFrom))
					//ret = false;
				if (!Validation.hasText(edtRouteTo))
					//ret = false;

				if (!Validation.isEmailAddress(edtEmailID, true))
					ret = false;
				if (!Validation.isPhoneNumber(edtPhoneNum, false))
					ret = false;
				if(!((edtPhoneNum.getText().length())==10))
				{
					ret = false;
					if(ActivityLanguage.lang.equalsIgnoreCase("english"))
					{
						
						AlertDialog show = new AlertDialog.Builder(ActivityAutoTaxiComplaint.this)
		                .setTitle("Message")
		                .setMessage("  Mobile number is not 10 digits  ")
		                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
		                    public void onClick(DialogInterface dialog, int which) { 
		                        // continue with delete
		                    }
		                 })
		                
		                //.setIcon(android.R.drawable.actionbar)
		                 .show();
						
					
					}
					else
					{
						
						AlertDialog show = new AlertDialog.Builder(ActivityAutoTaxiComplaint.this)
		                .setTitle("संदेश")
		                .setMessage("मोबाइल क्रमांक 10 अंकी नाही")
		                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
		                    public void onClick(DialogInterface dialog, int which) { 
		                        // continue with delete
		                    }
		                 })
		                
		                //.setIcon(android.R.drawable.actionbar)
		                 .show();
						
					}
				}

				return ret;
			}
		});

		btn_Camera.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(ActivityAutoTaxiComplaint.this,
						"Take Pic Via Camera", Toast.LENGTH_LONG).show();
				Intent cameraIntent = new Intent(
						android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
				startActivityForResult(cameraIntent, CAMERA_REQUEST);

			}
		});

		btn_Gallery.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				try {
					Intent intent = new Intent();
					intent.setType("image/*");
					intent.setAction(Intent.ACTION_GET_CONTENT);
					intent.addCategory(Intent.CATEGORY_OPENABLE);
					startActivityForResult(intent, REQUEST_CODE);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}

			}
		});

		/*
		 * datePicker1.setOnTouchListener(new OnDateChangeListener() {
		 * 
		 * public void onSelectedDayChange(CalendarView view, int year, int
		 * month, int dayOfMonth) { // TODO Auto-generated method stub
		 * 
		 * date = "" + dayOfMonth + "-" + (month + 1) + "-" + year;
		 * 
		 * } });
		 */

	}

	public boolean isTablet(Context context) {
		return (context.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) >= Configuration.SCREENLAYOUT_SIZE_LARGE;
	}

	public static class DatePickerFragment extends DialogFragment implements
			DatePickerDialog.OnDateSetListener {

		@Override
		public Dialog onCreateDialog(Bundle savedInstanceState) {
			// Use the current date as the default date in the picker
			final Calendar c = Calendar.getInstance();
			int year = c.get(Calendar.YEAR);
			int month = c.get(Calendar.MONTH);
			int day = c.get(Calendar.DAY_OF_MONTH);

			// Create a new instance of DatePickerDialog and return it
			return new DatePickerDialog(getActivity(), this, year, month, day);
		}

		public void onDateSet(DatePicker view, int year, int month, int day) {
			// Do something with the date chosen by the user
			date = "" + month + "-" + (month + 1) + "-" + year;

		}
	}

	protected void getdata() {

		String AM_PM;

		if (timePicker.getCurrentHour() < 12) {
			AM_PM = "AM";
		} else {
			AM_PM = "PM";
		}

		time = "" + timePicker.getCurrentHour() + ":"
				+ timePicker.getCurrentMinute() + ":"
				+ "00 " +
				AM_PM;

		if (chkBoxRefusal.isChecked() == true) {

			Refusal = chkBoxRefusal.getText().toString();
			
		}
		if (chkBoxRudeBehave.isChecked()) {
			RudeBehave = chkBoxRudeBehave.getText().toString();

		}
		if (chkBoxIDNotDisplayed.isChecked())

		{
			IDNotDisplayed = chkBoxIDNotDisplayed.getText().toString();
		}
		if (chkBoxExcessFare.isChecked() == true) {
			ExcessFare = chkBoxExcessFare.getText().toString();
		}
		if (chkBoxOther.isChecked()) {
			Other = chkBoxOther.getText().toString();
		}
		if (chkBoxTakLongDistRoute.isChecked() == true) {
			LongDistRout = chkBoxTakLongDistRoute.getText().toString();
		}

		complaint_Type = "" + Refusal + "," + RudeBehave + "," + IDNotDisplayed
				+ "," + ExcessFare + "," + LongDistRout + "," + Other;

	}

	private void init() {

		from_to = (LinearLayout) findViewById(R.id.from_to);
		from_to.setVisibility(LinearLayout.GONE);
		msg = (LinearLayout) findViewById(R.id.msg);
		msg.setVisibility(LinearLayout.GONE);

		numberPickermh = (NumberPicker) findViewById(R.id.pickermh);
		numberPickeralpha1 = (NumberPicker) findViewById(R.id.pickerone);
		numberPickeralpha2 = (NumberPicker) findViewById(R.id.pickertwo);
		btn_Camera = (Button) findViewById(R.id.btn_Camera);
		btn_Gallery = (Button) findViewById(R.id.btn_Gallery);
		btn_SendData = (Button) findViewById(R.id.btn_SendData);
		img_selected = (ImageView) findViewById(R.id.img_selected);
		numberPicker1 = (NumberPicker) findViewById(R.id.picker_first);
		numberPicker2 = (NumberPicker) findViewById(R.id.pickerTwo);
		numberPicker3 = (NumberPicker) findViewById(R.id.pickerThree);
		numberPicker4 = (NumberPicker) findViewById(R.id.pickerFour);
		radioBtn_Auto = (RadioButton) findViewById(R.id.radio01);
		radioBtn_Taxi = (RadioButton) findViewById(R.id.radio11);

		edtPhoneNum = (EditText) findViewById(R.id.edtPhoneNum);
		edtComplainantName = (EditText) findViewById(R.id.edtComplainantName);
		edtComplainantAddress = (EditText) findViewById(R.id.edtComplainantAddress);

		edtEmailID = (EditText) findViewById(R.id.edtEmailID);
		edtMessage = (EditText) findViewById(R.id.edtMessage);

		chkBoxRefusal = (CheckBox) findViewById(R.id.chkBoxRefusal);
		chkBoxOther = (CheckBox) findViewById(R.id.chkBoxOther);
		chkBoxTakLongDistRoute = (CheckBox) findViewById(R.id.chkBoxTakLongDistRoute);
		chkBoxExcessFare = (CheckBox) findViewById(R.id.chkBoxExcessFare);
		chkBoxIDNotDisplayed = (CheckBox) findViewById(R.id.chkBoxIDNotDisplayed);
		chkBoxRudeBehave = (CheckBox) findViewById(R.id.chkBoxRudeBehave);

		txt_Message = (TextView) findViewById(R.id.tv_msg);
		timePicker = (TimePicker) findViewById(R.id.timePicker1);

		txt_To = (TextView) findViewById(R.id.tv_to);
		txt_From = (TextView) findViewById(R.id.tv_from);

		edtRouteTo = (EditText) findViewById(R.id.edtRouteTo);
		edtRouteFrom = (EditText) findViewById(R.id.edtRouteFrom);
		
		
		
		spinner_RtoList= (Spinner)findViewById(R.id.spinner_RtoList);
		
		

	}

	private Session createSessionObject() {

		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");

		return Session.getInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				Log.e("test", "in getPasswordAuthentication()");
				return new PasswordAuthentication("tarhannum@gmail.com",
						"shaikhti");
			}
		});
	}

	private Message createMessage(String email, String subject,
			String messageBody, Session session) throws MessagingException,
			UnsupportedEncodingException {
		Log.e("test", "in createMessage()");
		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress("tarhannum@gmail.com",
				"Tarhannum Pathan"));
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(
				email, email));
		message.setSubject(subject);
		message.setText(messageBody);
		return message;
	}

	void sendMail(String email, String subject, String messageBody) {
		Session session = createSessionObject();
		Log.e("test", "in  sendMail()");
		try {
			Message message = createMessage(email, subject, messageBody,
					session);
			new SendMailTask().execute(message);
			Toast.makeText(ActivityAutoTaxiComplaint.this,
					"Mail sent successfully..", Toast.LENGTH_LONG).show();
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();

		if (ActivityLanguage.lang.equals("English")) {
			inflater.inflate(R.menu.marathi, menu);
		} else {
			inflater.inflate(R.menu.english, menu);
		}

		return super.onCreateOptionsMenu(menu);
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		super.onOptionsItemSelected(item);
		switch (item.getItemId()) {
		case R.id.action_lanMarathi:
			ActivityLanguage.lang = "Marathi";
			Intent i = getIntent();
			overridePendingTransition(R.anim.anim_for_eng_mar_switch_entry,
					R.anim.exit_from_bottom);
			finish();
			// i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(i);
			overridePendingTransition(R.anim.anim_for_eng_mar_switch_entry,
					R.anim.exit_from_bottom);
			break;

		case R.id.action_lanEnglish:
			ActivityLanguage.lang = "English";
			Intent iM = getIntent();
			finish();
			startActivity(iM);
			overridePendingTransition(R.anim.anim_for_eng_mar_switch_entry,
					R.anim.exit_from_bottom);
			break;
		case android.R.id.home:
			this.finish();
			overridePendingTransition(R.anim.enter_from_bottom,
					R.anim.anim_for_eng_mar_switch_exit);
			break;

		default:
			return super.onOptionsItemSelected(item);

		}
		return true;

	}

	protected void onActivityResult(int requestCode, int resultCode, Intent data) {

		if (requestCode == CAMERA_REQUEST && resultCode == RESULT_OK) {
			if (data.getData() == null) {
				bitmap = (Bitmap) data.getExtras().get("data");
			} else {

				try {
					bitmap = MediaStore.Images.Media.getBitmap(
							this.getContentResolver(), data.getData());
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			img_selected.setImageBitmap(bitmap);
		}

		if (requestCode == REQUEST_CODE && resultCode == Activity.RESULT_OK)
			try {
				// We need to recyle unused bitmaps
				if (bitmap != null) {
					bitmap.recycle();
				}
				InputStream stream = getContentResolver().openInputStream(
						data.getData());
				bitmap = BitmapFactory.decodeStream(stream);
				stream.close();
				img_selected.setImageBitmap(bitmap);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		super.onActivityResult(requestCode, resultCode, data);

	}

	public void itemClicked(View v) {

		// Toast.makeText(TaxiComplaint.this,"othrs ... ",
		// Toast.LENGTH_LONG).show();

		if (chkBoxOther.isChecked() == true)
			other = true;
		else
			other = false;

		from_to();

	}

	public void itemClickedRefusal(View v) {
		// Toast.makeText(TaxiComplaint.this,"Refusal ?... ",
		// Toast.LENGTH_LONG).show();

		if (chkBoxRefusal.isChecked() == true)
			refuse = true;
		else
			refuse = false;

		from_to();

	}

	public void itemClickedRudeBehaviour(View v) {
		// Toast.makeText(TaxiComplaint.this,"rude... ",
		// Toast.LENGTH_LONG).show();
		if (chkBoxRudeBehave.isChecked() == true)
			rude = true;
		else
			rude = false;

		from_to();

	}

	public void itemClickedId(View v) {
		// Toast.makeText(TaxiComplaint.this,"id  ... ",
		// Toast.LENGTH_LONG).show();
		if (chkBoxIDNotDisplayed.isChecked() == true)
			id = true;
		else
			id = false;

		from_to();

	}

	public void itemClickedTakingLong(View v) {

		// .makeText(TaxiComplaint.this,"Long dist ", Toast.LENGTH_LONG).show();
		if (chkBoxTakLongDistRoute.isChecked() == true)
			longdist = true;
		else
			longdist = false;
		from_to();
	}

	public void itemClickedExcessFare(View v) {

		// Toast.makeText(TaxiComplaint.this,"Exxcess fares",
		// Toast.LENGTH_LONG).show();

		if (chkBoxExcessFare.isChecked() == true)
			excessfare = true;
		else
			excessfare = false;

		from_to();
	}

	public void from_to() {

		if (excessfare == true || other == true || rude == true || id == true
				|| longdist == true) {
			from_to.setVisibility(LinearLayout.VISIBLE);
		} else {
			from_to.setVisibility(LinearLayout.GONE);
		}

		if (other == true) {
			msg.setVisibility(LinearLayout.VISIBLE);
		} else {
			msg.setVisibility(LinearLayout.GONE);

		}

	}

	public void itemAuto(View v) {
		// code to check if this checkbox is checked!
		if (radioBtn_Taxi.isChecked() == true) {

			radioBtn_Auto.setChecked(false);

		}

	}

	public void itemAuto1(View v)
	{
		// code to check if this checkbox is checked!
		if (radioBtn_Auto.isChecked() == true) {

			radioBtn_Taxi.setChecked(false);

		}

	}
	
	
	

    private class uploadData extends AsyncTask<Void, Void, Void>
    {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mProgressDialog = new ProgressDialog(ActivityAutoTaxiComplaint.this);
            mProgressDialog.setMessage("Uploading your complain ... ");
            mProgressDialog.setCancelable(false);
            mProgressDialog.show();

        }

        @Override
        protected Void doInBackground(Void... params)
        
        
        
        
        {
        	
        	String mob_no =edtPhoneNum.getText().toString();
        	String stremail=edtEmailID.getText().toString();
        	strMH= spinner_RtoList.getSelectedItem().toString();
        	
        	 
        	String fail ="jfkhakfhaskfh";
        	
        		String complain_data1=   
        			
        				"MobileApp|" +
        				"|" +
        				"|" +
        				"|" +
        				""+motor_VehicleType+"|" +
                        ""+motorVehicleNumber+"|" +
        				""+edtMessage.getText().toString()+"|" +
        				"1000002|" +
        				 ""+date+"|" +
        				 ""+time+"|" +
        				""+edtPhoneNum.getText().toString()+"|" +
        				""+edtComplainantName.getText().toString()+"|" +
        				""+edtComplainantAddress.getText().toString()+"|" +
        				""+edtEmailID.getText().toString()+"|" +
        				"|" +
        				"|" +
        				"|" +
        				""+spinner_RtoList.getSelectedItem().toString()+"|";
        	
        	
            ArrayList<NameValuePair> nameValuePairs=new ArrayList<NameValuePair>();
            nameValuePairs.add(new BasicNameValuePair("COMPLAINT_DATA",complain_data1));   // rto office         
            nameValuePairs.add(new BasicNameValuePair("COMPLAINT_TYPE","1|2|3"));

            // test
            strTest=ServerAccess1.getJSONfromURL( "http://testmmvd.mahaonlinegov.in/Public/RegisterComplaint_Public.aspx" ,nameValuePairs);
            //jsonobject1 = ServerAccess.getJSONfromURL( "http://hardcastlegis.in/pmc/databaseAccess.php", nameValuePairs);

            return null;
        }
        @Override
        protected void onPostExecute(Void args)
        {
            if (mProgressDialog.isShowing())
                mProgressDialog.dismiss();
            
            String word = "Success";
          
            if (strTest.contains(word)) 
            {
            	if(ActivityLanguage.lang.equalsIgnoreCase("english"))
				{
                
			            	AlertDialog show = new AlertDialog.Builder(ActivityAutoTaxiComplaint.this)
			                .setTitle("Message")
			                .setMessage("Your complain has been added succesfully.")
			                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
			                    public void onClick(DialogInterface dialog, int which) { 
			                        // continue with delete
			                    }
			                 })
			                
			                //.setIcon(android.R.drawable.ic_dialog_alert)
			                 .show();
				}
            	else
            	{
            		
            		AlertDialog show = new AlertDialog.Builder(ActivityAutoTaxiComplaint.this)
	                .setTitle("संदेश")
	                .setMessage("तक्रारची नोंद घेण्यात आली")
	                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
	                    public void onClick(DialogInterface dialog, int which) { 
	                        // continue with delete
	                    }
	                 })
	                
	                //.setIcon(android.R.drawable.ic_dialog_alert)
	                 .show();
            		
            	}
            	
            }
            else
            {
            	
            	if(ActivityLanguage.lang.equalsIgnoreCase("english"))
				{
            		
		            	AlertDialog show = new AlertDialog.Builder(ActivityAutoTaxiComplaint.this)
		                .setTitle("Message")
		                .setMessage("Error in upload. please try again.")
		                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
		                    public void onClick(DialogInterface dialog, int which) { 
		                        // continue with delete
		                    }
		                 })
		                
		                //.setIcon(android.R.drawable.actionbar)
		                 .show();
            	}
            	else
            	{
            		AlertDialog show = new AlertDialog.Builder(ActivityAutoTaxiComplaint.this)
	                .setTitle("संदेश")
	                .setMessage("कनेक्शन त्रुटी , कृपया पुन्हा प्रयत्न करा .")
	                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
	                    public void onClick(DialogInterface dialog, int which) { 
	                        // continue with delete
	                    }
	                 })
	                
	                //.setIcon(android.R.drawable.actionbar)
	                 .show();
            		
            		
            	}
            	
            }
            
            
            

            Log.d("result ", ""+strTest);

            //result.setText("Complain uploaded succesfuly");

        }
    }
	

}
