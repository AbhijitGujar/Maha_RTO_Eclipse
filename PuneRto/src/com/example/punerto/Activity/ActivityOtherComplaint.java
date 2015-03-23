package com.example.punerto.Activity;

import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import com.androidexample.gcm.R;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityOtherComplaint extends ActionBarActivity {

	Spinner spin_motarcomplaint;
	TextView txt_choose_office, txt_complaint_name, txt_email_id,
			txt_mobile_no, txt_complaint;
	EditText edt_complaint_name, edt_email_id, edt_mobile_no, edt_complaint;
	Button btn_send;
	String mailSubject = " Other Complaint generated from Maha RTO App.";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setHomeButtonEnabled(true);
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#8F3899")));
		if(ActivityLanguage.lang.equals("English"))
		{
			setContentView(R.layout.activity_motor_complaint);
			actionBar.setTitle("Other Complaint");
		}else{
			setContentView(R.layout.activity_motor_complaint_marathi);
			actionBar.setTitle(R.string.other_complaint);	
		}
		
		actionBar.show();
		spin_motarcomplaint = (Spinner) findViewById(R.id.spinner_motorComplaint);
		txt_choose_office = (TextView) findViewById(R.id.textView1);
		txt_complaint_name = (TextView) findViewById(R.id.textView2);
		txt_email_id = (TextView) findViewById(R.id.textView3);
		txt_mobile_no = (TextView) findViewById(R.id.textView4);
		txt_complaint = (TextView) findViewById(R.id.textView5);
		edt_complaint_name = (EditText) findViewById(R.id.editText1);
		edt_email_id = (EditText) findViewById(R.id.editText3);
		edt_mobile_no = (EditText) findViewById(R.id.editText4);
		edt_complaint = (EditText) findViewById(R.id.editText5);
		btn_send = (Button) findViewById(R.id.btn_SendOtherComplentMail);
	
		btn_send.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (checkValidation())
					// submitForm();
					sendMail(edt_email_id.getText().toString(), mailSubject,
							" Dear Admin \n Below is the details of complaint \n \n Name:"
									+ edt_complaint_name.getText().toString()
									+ " \n Mobile :"
									+ edt_mobile_no.getText().toString()
									+ " \n Email Id :"
									+ edt_email_id.getText().toString()
									+ " \n Message :"
									+ edt_complaint.getText().toString());
				else
					
					if(ActivityLanguage.lang.equals("English"))
					{
						Toast.makeText(ActivityOtherComplaint.this,
								"Please fill the details", Toast.LENGTH_LONG)
								.show();
						
					}else{
						Toast.makeText(ActivityOtherComplaint.this,
								"à¤•à¥ƒà¤ªà¤¯à¤¾ à¤¸à¤°à¥�à¤µ à¤®à¤¾à¤¹à¤¿à¤¤à¥€ à¤­à¤°à¤¾", Toast.LENGTH_LONG)
								.show();
					}
					
			}


			private boolean checkValidation() {
				boolean ret = true;

				if (!Validation.hasText(edt_complaint_name))
					ret = false;
				if (!Validation.hasText(edt_complaint))
					ret = false;
				if (!Validation.hasText(edt_mobile_no))
					ret = false;
				if (!Validation.hasText(edt_email_id))
					ret = false;
				if (!Validation.isEmailAddress(edt_email_id, true))
					ret = false;
				if (!Validation.isPhoneNumber(edt_mobile_no, false))
					ret = false;

				return ret;
			}
		});
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
			if(ActivityLanguage.lang.equals("English"))
			{
				Toast.makeText(ActivityOtherComplaint.this,
						"Mail sent successfully..", Toast.LENGTH_LONG).show();
			}else{
				Toast.makeText(ActivityOtherComplaint.this,
						"à¤¤à¥�à¤®à¤šà¥€ à¤¤à¤•à¥�à¤°à¤¾à¤° à¤ªà¤¾à¤ à¤µà¤£à¥�à¤¯à¤¾à¤¤ à¤†à¤²à¥€ à¤†à¤¹à¥‡..", Toast.LENGTH_LONG).show();
			}
				 
			
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

}
