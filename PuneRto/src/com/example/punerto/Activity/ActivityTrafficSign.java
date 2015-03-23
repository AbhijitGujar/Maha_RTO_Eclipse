package com.example.punerto.Activity;

import com.androidexample.gcm.R;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityTrafficSign extends ActionBarActivity {

	Button btn_InformationSign;
	Button btn_Mandatory;
	Button btn_CautionarySign;

	public static String sign;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_traffic_sign);
		btn_InformationSign = (Button) findViewById(R.id.btn_Information_Sign);
		btn_Mandatory = (Button) findViewById(R.id.btn_Mandatory);
		btn_CautionarySign = (Button) findViewById(R.id.btn_Cautionary_Sign);
		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setTitle("Traffic Sign");
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#E45252")));
		actionBar.show();

		btn_Mandatory.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				sign = "mandatory";
				Intent intent = new Intent(ActivityTrafficSign.this,
						ActivityMandatorySign.class);
				startActivity(intent);

			}
		});

		btn_InformationSign.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {

				sign = "information";
				Intent intent = new Intent(ActivityTrafficSign.this,
						ActivityMandatorySign.class);
				startActivity(intent);
			

			}
		});

		btn_CautionarySign.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sign = "cautionary";
				Intent intent = new Intent(ActivityTrafficSign.this,
						ActivityMandatorySign.class);
				startActivity(intent);
			}
		});

	}
}
