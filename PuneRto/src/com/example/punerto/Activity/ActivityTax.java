package com.example.punerto.Activity;

import com.androidexample.gcm.R;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityTax extends ActionBarActivity {

	Button btn_MotorVehicle;
	Button btn_EnvironmentTax;
	Button btn_Professionaltax;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		if(ActivityLanguage.lang.equals("English"))
		{
			setContentView(R.layout.activity_tax);
		}else{
			setContentView(R.layout.activity_tax_marathi);
		}
		
		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setHomeButtonEnabled(true);
		actionBar.setTitle("Tax");
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#ECBC50")));
		actionBar.show();
		btn_MotorVehicle = (Button) findViewById(R.id.btn_MotorVehicleTax);
		btn_Professionaltax = (Button) findViewById(R.id.btn_ProfessionalTax);
		btn_EnvironmentTax = (Button) findViewById(R.id.btn_Environmenttax);

		btn_MotorVehicle.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(ActivityTax.this,
						MainActivity1.class);
				startActivity(intent);
			}
		});

		btn_EnvironmentTax.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(ActivityTax.this,
						ActivityEnvironmentTax.class);
				startActivity(intent);
				
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
