package com.example.punerto.Activity;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import com.androidexample.gcm.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivityRoadSafety extends ActionBarActivity {

	Button btn_trafficSign;
	Button btn_Information;
	Button RoadSafetyWeek;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		ActionBar actionBar = getSupportActionBar();
		actionBar.setHomeButtonEnabled(true);
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#0C9845")));

		if (ActivityLanguage.lang.equals("English")) {

			setContentView(R.layout.activit_road_safety);
			actionBar.setTitle("RTO Road Safety");
		} else {

			setContentView(R.layout.activit_road_safety_marathi);
			actionBar.setTitle(R.string.road_safety);

		}
		actionBar.show();
		btn_trafficSign = (Button) findViewById(R.id.btn_trafficSign);
		btn_Information = (Button) findViewById(R.id.btn_Information);
		RoadSafetyWeek = (Button) findViewById(R.id.btn_RoadSafetyWeek);

		btn_trafficSign.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// Intent intent = new Intent(ActivityRoadSafety.this,
				// ActivityTrafficSign.class);
				// startActivity(intent);

				Intent intent = new Intent(ActivityRoadSafety.this,
						ActivityTrafficSign1.class);
				startActivity(intent);

			}
		});

		btn_Information.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				roadSafetyinfo();

			}

			@SuppressLint("WorldReadableFiles") @SuppressWarnings("deprecation")
			private void roadSafetyinfo() {

				AssetManager assetManager = getAssets();

				InputStream in = null;
				OutputStream out = null;
				File file = new File(getFilesDir(), "roadsafetyinfo.pdf");

				try {
					in = assetManager.open("roadsafetyinfo.pdf");
					out = openFileOutput(file.getName(),
							ActivitySchoolBus.MODE_WORLD_READABLE);

					copyFile(in, out);
					in.close();
					in = null;
					out.flush();
					out.close();
					out = null;
				} catch (Exception e) {
					Log.e("tag", e.getMessage());
				}

				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setDataAndType(
						Uri.parse("file://" + getFilesDir()
								+ "/roadsafetyinfo.pdf"), "application/pdf");
				startActivity(intent);

			}

			private void copyFile(InputStream in, OutputStream out)
					throws IOException {
				byte[] buffer = new byte[1024];
				int read;
				while ((read = in.read(buffer)) != -1) {
					out.write(buffer, 0, read);
				}
			}
		});
		RoadSafetyWeek.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intentRaodSafety = new Intent(ActivityRoadSafety.this,
						ActivityRoadSafetyCampaign.class);
				startActivity(intentRaodSafety);

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
