package com.example.punerto.Activity;

import com.androidexample.gcm.R;
import com.example.punerto.Adapter.AdapterMandatorySign;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.widget.GridView;

public class ActivityMandatorySign extends ActionBarActivity {

	GridView grid_MandatorySign;

	public static String[] rtoContentNameList = { "Motor Vehicle Department",
			"RTO Office                 ", "Citizen Charter/GR/Notifications",
			"Auto/Taxi Complaint", "    Other Complaint", "Road Safety",
			"Practice Test", "         LL Appointment",
			"          DL Appointment", "Important Message",
			"Photograph / Video Gallery", "License Type", "       FAQ",
			"       Tax", "New Projects", "School Bus", "User Manual",
			"     Credits" };

	public static int[] rtoMandatorySignImages = { R.drawable.me1,
			R.drawable.me2, R.drawable.me3, R.drawable.me4, R.drawable.me5,
			R.drawable.me6, R.drawable.me7, R.drawable.me8, R.drawable.me9,
			R.drawable.me10, R.drawable.me11, R.drawable.me12, R.drawable.me13,
			R.drawable.me14, R.drawable.me15, R.drawable.me16, R.drawable.me17,
			R.drawable.me18, R.drawable.me19, R.drawable.me20, R.drawable.me21,
			R.drawable.me22, R.drawable.me23, R.drawable.me24, R.drawable.me25 };

	public static int[] rtoInformationSignImages = { R.drawable.ie2,
			R.drawable.ie3, R.drawable.ie4, R.drawable.ie5, R.drawable.ie6,
			R.drawable.ie7, R.drawable.ie8, R.drawable.ie9, R.drawable.ie10,
			R.drawable.ie11, R.drawable.ie12, R.drawable.ie13, R.drawable.ie14 };

	public static int[] rtoCautionarySignImages = { R.drawable.ce1,
			R.drawable.ce2, R.drawable.ce3, R.drawable.ce4, R.drawable.ce5,
			R.drawable.ce6, R.drawable.ce7, R.drawable.ce8, R.drawable.ce9,
			R.drawable.ce10, R.drawable.ce11, R.drawable.ce12, R.drawable.ce13,
			R.drawable.ce14, R.drawable.ce15, R.drawable.ce16, R.drawable.ce17,
			R.drawable.ce18, R.drawable.ce19, R.drawable.ce20, R.drawable.ce21,
			R.drawable.ce22, R.drawable.ce23, R.drawable.ce24, R.drawable.ce25,
			R.drawable.ce26, R.drawable.ce27, R.drawable.ce28, R.drawable.ce29,
			R.drawable.ce30, R.drawable.ce31, R.drawable.ce32, R.drawable.ce33,
			R.drawable.ce34 };

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mandatory_sign);
		grid_MandatorySign = (GridView) findViewById(R.id.grid_MandatorySign);
		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#E45252")));
		if (ActivityTrafficSign.sign.equals("mandatory")) {
			grid_MandatorySign.setAdapter(new AdapterMandatorySign(
					ActivityMandatorySign.this, rtoContentNameList,
					rtoMandatorySignImages));
			actionBar.setTitle("Mandatory Sign");
			actionBar.show();

		}
		if (ActivityTrafficSign.sign.equals("information")) {
			grid_MandatorySign.setAdapter(new AdapterMandatorySign(
					ActivityMandatorySign.this, rtoContentNameList,
					rtoInformationSignImages));

			actionBar.setTitle("Information Sign ");
			actionBar.show();
		}
		if (ActivityTrafficSign.sign.equals("cautionary")) {
			grid_MandatorySign.setAdapter(new AdapterMandatorySign(
					ActivityMandatorySign.this, rtoContentNameList,
					rtoCautionarySignImages));
			actionBar.setTitle("Cautionary Sign");
			actionBar.show();
		}

	}

}
