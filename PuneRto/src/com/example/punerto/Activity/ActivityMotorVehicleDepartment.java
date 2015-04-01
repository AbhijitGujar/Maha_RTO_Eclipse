package com.example.punerto.Activity;

import com.androidexample.gcm.R;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class ActivityMotorVehicleDepartment extends ActionBarActivity {

	private Button btn_About;
	private Button btn_OrganizationChart;
	private Button btn_OfficersList;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setHomeButtonEnabled(true);

		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#840A3B")));
		if (ActivityLanguage.lang.equals("English")) {
			setContentView(R.layout.activity_motorvehicle_department);
			actionBar.setTitle("Motor Vehicle Department");
		} else {
			setContentView(R.layout.activity_motorvehicle_department_marathi);
			actionBar.setTitle("मोटार वाहन विभाग");

		}

		actionBar.show();
		btn_About = (Button) findViewById(R.id.btn_aboutEnglish);
		btn_OfficersList = (Button) findViewById(R.id.btn_OfficersListEnglish);
		btn_OrganizationChart = (Button) findViewById(R.id.btn_organizationChartEnglish);

		// if (ActivityLanguage.lang.equals("English")) {
		// btn_About.setVisibility(View.VISIBLE);
		// btn_OfficersList.setVisibility(View.VISIBLE);
		// btn_OrganizationChart.setVisibility(View.VISIBLE);
		//
		// } else {
		//
		// btn_About.setVisibility(View.VISIBLE);
		// btn_OfficersList.setVisibility(View.VISIBLE);
		// btn_OrganizationChart.setVisibility(View.VISIBLE);
		// // btn_About.setBackgroundResource(R.drawable.marathi_about);
		// // btn_OfficersList
		// // .setBackgroundResource(R.drawable.marathi_officer_list);
		// // btn_OrganizationChart
		// // .setBackgroundResource(R.drawable.marathi_organisation_chart);
		//
		// }

		btn_About.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// Toast.makeText(ActivityMotorVehicleDepartment.this,
				// "About Info", Toast.LENGTH_LONG).show();
				Intent intent = new Intent(ActivityMotorVehicleDepartment.this,
						ActivityAbout.class);
				startActivity(intent);

			}
		});

		btn_OfficersList.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// Toast.makeText(ActivityMotorVehicleDepartment.this,
				// "Officer List", Toast.LENGTH_LONG).show();
				Intent intent = new Intent(ActivityMotorVehicleDepartment.this,
						ActivityRtoOfficeList.class);
				startActivity(intent);

			}
		});

		btn_OrganizationChart.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// Toast.makeText(ActivityMotorVehicleDepartment.this,
				// "Organization Chart", Toast.LENGTH_LONG).show();

				Intent intent = new Intent(ActivityMotorVehicleDepartment.this,
						ActivityOrganizationChart1.class);
				startActivity(intent);
			}
		});

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
			Toast.makeText(getApplicationContext(),
					"Marathi language Icon convert into englsih",
					Toast.LENGTH_LONG).show();
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
