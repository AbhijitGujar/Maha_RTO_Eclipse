package com.example.punerto.Activity;

import com.androidexample.gcm.R;
import com.example.punerto.Adapter.AdapterUserManual;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

public class ActivityUserManual extends ActionBarActivity {

	ListView lst_UseManual;
	AdapterUserManual adapterUserManual;

	public static String[] rtoContentNameList = {
			"This section lets you understand detailed information about Motor Vehicle Department, Organization Hierarchy Chart and RTO Offices.\n\nWe have mentioned vision, mission and objectives of our department. You can go through the entire act which had helped to achieve the objectives of department. The main objectives of RTO department are also listed in this section.\n\nYou will see three icons in this section which are mentioned below:\n\nAbout Motor Vehicle Department -\nIn order to give effect to the provision of Motor Vehicle Act, 1988 & Rules made there under, Motor Vehicle Act 1988 in the state of Maharashtra. Detailed information about the principle jobs of the RTO Department is also included in this section.\n\nOrganization Chart – You can see the organization chart of Maharashtra RTO. This shows the hierarchy of all the officers from transport commissioner to Dy. RTO.\n\nRTO Offices- Click on any of the RTO Offices, You can get all the details for eg:. officer’s name, address, phone number, fax and email id as well. You can directly call on the click of phone number present in the respective RTO offices. You can also send emails to RTO office as well on the click of email id’s and compose your mail.",
			"This section is dedicated to all RTO offices in Maharashtra, if you need to contact any of them. This section is perfect for you. You can get all the details for ex. officer’s name, address, phone number, fax and email id as well. ",
			"The government of Maharashtra has prepared the citizen’s Charter with the objective that public should be aware about the working of the Motor Vehicle Department and for proper implementation of the Motor Vehicles Act. This will help to make the working of the Motor Vehicles Department more speedy, transparent and public oriented.",
			"You have complaint regarding rude behavior, excess fare, refusal and many more which we face on day to day life. This section is made only for you. We have come with very innovative idea of submitting complains related to auto and taxi. You just need to fill a form with all the detailed information which include image upload too.\n\nPlease follow the procedure mentioned below:\n\nStep 1- Choose respective RTO office\n\nStep 2- Choose auto or taxi\n\nStep 3-Upload image of auto or taxi number plate\n\nStep 4- From the motor vehicle no. section, you need to select appropriate license plate number. You have been provided with the scrollable option for easier entry.\n\nStep 5- Select the time of complaint\n\nStep 6- You need to select the incident date from date selection tool.\n\nStep 7- Enter complaint’s name\n\nStep 8- Enter complaint’s address\n\nStep 9- Enter complaint’s mobile Number\n\nStep 10- Enter complaint’s Email id\n\nStep 11- Select appropriate complaint’s type\n\nStep 12- Press send button and we will get your complain immediately",
			"You can submit other than rickshaw and taxi related complaints here.\n\nPleas follow the procedure mentioned below:\n\nStep 1- Choose respective RTO office\n\nStep 2- Enter complaint’s name\n\nStep 3- Enter complaint’s email address\n\nStep 4- Enter complaint’s mobile number\n\nStep 5- Enter appropriate and detailed complaint\n\nStep 6- Press send button and we will get your complain immediately.",
			"This section gives you information about the things (rules) to be done / followed and the things not to be done. The information is available to you when you are in a role of a pedestrian, a cyclist or a motorist.\n\nThis is an educative section giving a view of all road traffic signs, viz. mandatory sign boards, cautionary sign boards and informative sign boards. We have mentioned all the latest campaign information banners.\n\nYou will see three icons in this section which are mentioned below:\n\nInformation about Road Safety: We have attached PDF into this section which includes safety related information. You need to read this file as it will be helpful for you while riding as your life is valuable for your family. This PDF is having all the detailed information regarding accidents of the vehicle.\n\nTraffic Signs: We have included all the traffic signs such as information sign, mandatory sign, and cautionary sign. This section is also helpful for the person who is going to give examination to get driving license.  There is a short description of all the sign which you can watch on the roadside mentioned in this section.\n\nRoad Safety Campaign 2015: We have integrated all the campaign banners which were conducted throughout the year 2015.",
			"You can practice for the learning license test here. This will be helpful in the real examination. It includes more than 400 questions and on the completion it gives your test report.",
			"We will be sending you all the important messages throughout the year. This section is dedicated section for viewing all the notices released by RTO.",
			"This section includes license, vehicle related help information.\n\nLicense Related- We have listed all the queries which can come across your mind related to license issue. Example: new learning license issue, renewal, issue duplicate license etc.\n\nVehicle Related- This area is consist of information related to vehicle such as transfer of vehicle, renewal of registration etc. ",
			"This section contains questions and answers, pertaining to abiding the laws under Motor Vehicle Act.\n\nFor Example: What are the documents should a driver carry when driving? ",
			"New initiatives have been taken by the department to display the attractive numbers on television in the offices.For ex. In this scheme, series wise attractive registration numbers are displayed on television in front portion or every office.",
			"School bus policy is for safe transportation of students. " };

	public static int[] rtoContenImages = {
			R.drawable.motor_vehicle_department, R.drawable.rto_office,
			R.drawable.gr_notification, R.drawable.auto_taxi_complaint,
			R.drawable.other_complaints, R.drawable.road_safety,
			R.drawable.practice_test, R.drawable.important_message,
			R.drawable.license_type, R.drawable.new_project, R.drawable.faq,
			R.drawable.school_bus };

	public static String[] rtoContentNameListMarathi = { "मराठी", "RTO Office",
			"Citizen Charter/GR/Notifications", "Auto/Taxi Complaint",
			"Other Complaint", "Road Safety", "Practice Test",
			"Important Message", "License Type", "New Projects", "FAQ",
			"School Bus" };
	public static int[] rtoContenImagesMarathi = {
			R.drawable.marathi_motor_vehicle_department,
			R.drawable.marathi_rto_offices, R.drawable.marathi_citizen_charter,
			R.drawable.marathi_auto_rikshaw_taxi_complains,
			R.drawable.marathi_other_complaints,
			R.drawable.marathi_road_safety,
			R.drawable.marathi_learnig_license_practice_test,
			R.drawable.marathi_important_messages,
			R.drawable.marathi_rto_help_desk, R.drawable.marathi_new_projects,
			R.drawable.marathi_faq, R.drawable.marathi_school_bus_policy };

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user_manual);
		lst_UseManual = (ListView) findViewById(R.id.lst_UseManual);
		ActionBar actionBar = getSupportActionBar();
		getSupportActionBar().setBackgroundDrawable(
				new ColorDrawable(Color.parseColor("#E45252")));
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setHomeButtonEnabled(true);
		if (ActivityLanguage.lang.equals("English")) {
			actionBar.setTitle("User Manual");
			adapterUserManual = new AdapterUserManual(getApplicationContext(),
					rtoContentNameList, rtoContenImages);
			lst_UseManual.setAdapter(adapterUserManual);

		} else {
			actionBar.setTitle("मार्गदर्शिका ");
			adapterUserManual = new AdapterUserManual(getApplicationContext(),
					rtoContentNameListMarathi, rtoContenImagesMarathi);
			lst_UseManual.setAdapter(adapterUserManual);

		}

		actionBar.show();
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
			// overridePendingTransition(R.anim.anim_for_eng_mar_switch_entry,
			// R.anim.exit_from_bottom);
			break;

		case R.id.action_lanEnglish:
			ActivityLanguage.lang = "English";
			Intent iM = getIntent();
			finish();
			startActivity(iM);
			// overridePendingTransition(R.anim.anim_for_eng_mar_switch_entry,
			// R.anim.exit_from_bottom);
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
