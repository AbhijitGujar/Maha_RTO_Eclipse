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
import android.widget.TextView;


public class ActivityAbout extends ActionBarActivity {

	TextView textView;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);

		ActionBar actionBar = getSupportActionBar();
		actionBar.setHomeButtonEnabled(true);
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#0000ff")));
		

		if (ActivityLanguage.lang.equals("English")) {
			setContentView(R.layout.activity_about);
			actionBar.setTitle("ABOUT RTO");

		} else {
			setContentView(R.layout.activity_about_marathi);
			actionBar
					.setTitle("मोटार वाहन विभागासंबंधी ");
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
//			overridePendingTransition(R.anim.anim_for_eng_mar_switch_entry,
//					R.anim.exit_from_bottom);
			break;

		case R.id.action_lanEnglish:
			ActivityLanguage.lang = "English";
			Intent iM = getIntent();
			finish();
			startActivity(iM);
//			overridePendingTransition(R.anim.anim_for_eng_mar_switch_entry,
//					R.anim.exit_from_bottom);
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