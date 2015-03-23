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
import android.widget.Button;
import android.widget.ViewFlipper;

public class ActivityRoadSafetyCampaign extends ActionBarActivity {

	int mFlipping = 0; // Initially flipping is off
	Button mButton; // Reference to button available in the layout to start and
					// stop the flipper

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setHomeButtonEnabled(true);
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#2CAC4F")));

		if (ActivityLanguage.lang.equals("English")) {
			actionBar.setTitle("Road Safety Campaign 2015");
			setContentView(R.layout.activity_road_safety_campaign);
		} else {
			actionBar
					.setTitle("à¤°à¤¸à¥�à¤¤à¤¾ à¤¸à¥�à¤°à¤•à¥�à¤·à¤¾ à¤…à¤­à¤¿à¤¯à¤¾à¤¨ à¥¨à¥¦à¥§à¥« ");
			setContentView(R.layout.activity_road_safety_campaign);
		}

		ViewFlipper flipper = (ViewFlipper) findViewById(R.id.flipper1);
		actionBar.show();

		if (mFlipping == 0) {
			/** Start Flipping */
			flipper.startFlipping();
			mFlipping = 1;
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
