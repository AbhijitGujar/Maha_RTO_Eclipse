package com.example.punerto.Activity;

import com.androidexample.gcm.R;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class ActivityOfficeDetails extends ActionBarActivity {

	TextView txt_id;
	TextView txt_name;
	TextView txt_address;
	TextView txt_email;
	TextView txt_fax;
	TextView txt_telNo;
	TextView txt_telNo1;
	TextView txt_telNo2;
	TextView txt_telN03;
	TextView txt_OfficerName;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ActionBar actionBar = getSupportActionBar();
		actionBar.setHomeButtonEnabled(true);
		actionBar.setDisplayHomeAsUpEnabled(true);
		
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#0000ff")));
		if (ActivityLanguage.lang.equals("English")) {
			setContentView(R.layout.activity_office_details_rto);
			actionBar.setTitle("RTO Offices Details");
		} else {
			setContentView(R.layout.activity_office_details_rto_marathi);
			actionBar.setTitle("प्रादेशिक परिवहन कार्यालयाची  माहीती");
		}

		txt_id = (TextView) findViewById(R.id.txt_OfficeIdDetails);
		txt_name = (TextView) findViewById(R.id.txt_OfficeNameDetails);
		txt_address = (TextView) findViewById(R.id.txt_Address);
		txt_telNo1 = (TextView) findViewById(R.id.txt_TelNo1);
		txt_telNo2 = (TextView) findViewById(R.id.txt_TelNo2);
		txt_telN03 = (TextView) findViewById(R.id.txt_telNo3);
		txt_email = (TextView) findViewById(R.id.txt_EmailAddress);
		txt_telNo = (TextView) findViewById(R.id.txt_TelNo);
		txt_fax = (TextView) findViewById(R.id.txt_Fax);
		txt_OfficerName = (TextView) findViewById(R.id.txt_OfficerName);
		Intent intent = getIntent();
		Bundle extras = intent.getExtras();
		String id = extras.getString("id");
		String name = extras.getString("name");
		String address = extras.getString("address");
		String email = extras.getString("email");
		String fax = extras.getString("fax");
		String telno = extras.getString("telno3");
		String telno1 = extras.getString("telno");
		String telno2 = extras.getString("telno1");
		String telno3 = extras.getString("telno2");
		String officerName = extras.getString("officerName");
		txt_OfficerName.setText(officerName);
		txt_id.setText(id);
		txt_name.setText(name);
		txt_address.setText(address);
		txt_email.setText(email);
		txt_fax.setText(fax);
		txt_telNo.setText(telno);
		txt_telNo1.setText(telno1);
		txt_telNo2.setText(telno2);
		txt_telN03.setText(telno3);
		txt_telNo.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent sIntent = new Intent(Intent.ACTION_CALL, Uri
						.parse("tel:" + txt_telNo.getText()));
				startActivity(sIntent);

			}
		});

		txt_telNo1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent sIntent = new Intent(Intent.ACTION_CALL, Uri
						.parse("tel:" + txt_telNo1.getText()));
				startActivity(sIntent);

			}
		});

		txt_telNo2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent sIntent = new Intent(Intent.ACTION_CALL, Uri
						.parse("tel:" + txt_telNo2.getText()));
				startActivity(sIntent);

			}
		});
		txt_telN03.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				Intent sIntent = new Intent(Intent.ACTION_CALL, Uri
						.parse("tel:" + txt_telN03.getText()));
				startActivity(sIntent);

			}
		});

	}

	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:

			this.finish();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

}
