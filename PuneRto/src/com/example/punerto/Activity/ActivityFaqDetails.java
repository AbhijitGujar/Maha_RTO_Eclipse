package com.example.punerto.Activity;

import com.androidexample.gcm.R;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class ActivityFaqDetails extends ActionBarActivity {

	TextView txt_faq;
	TextView txt_FaqDetails;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_faq_details);
		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setHomeButtonEnabled(true);
		actionBar.setTitle("FAQ Details");
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#DF3905")));
		actionBar.show();
		txt_faq = (TextView) findViewById(R.id.txt_FaqDetails);
		txt_FaqDetails = (TextView) findViewById(R.id.txt_FaqName);
		Intent intent = getIntent();
		Bundle extras = intent.getExtras();
		String faq = extras.getString("faq");
		String faqDetails = extras.getString("faqDetails");
		txt_faq.setText(faq);
		txt_FaqDetails.setText(faqDetails);
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
