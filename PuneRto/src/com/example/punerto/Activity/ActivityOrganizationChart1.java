package com.example.punerto.Activity;

import com.androidexample.gcm.R;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewFlipper;

public class ActivityOrganizationChart1 extends ActionBarActivity implements
		GestureDetector.OnGestureListener {

	private GestureDetectorCompat mDetector;

	Button buttonPrev, buttonNext;
	ViewFlipper viewFlipper;

	Animation slide_in_left, slide_out_right;
	Animation slide_in_right, slide_out_left;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setHomeButtonEnabled(true);

		getSupportActionBar().setHomeAsUpIndicator(R.drawable.actionbar);
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#8B6417")));

		if (ActivityLanguage.lang.equals("English")) {
			setContentView(R.layout.activity_organization_chart1);
			actionBar.setTitle("Organization Chart");

		} else {

			setContentView(R.layout.activity_organization_chart1);
			actionBar.setTitle("मोटार वाहन विभागाची संरचना ");
		}

		actionBar.show();
		// ActionBar actionBar=getActionBar();
		// actionBar.setTitle("Organization Chart");
		// actionBar.setBackgroundDrawable(new
		// ColorDrawable(Color.parseColor("#252525")));
		// actionBar.show();

		mDetector = new GestureDetectorCompat(this, this);

		viewFlipper = (ViewFlipper) findViewById(R.id.viewflipper);

		slide_in_left = AnimationUtils
				.loadAnimation(this, R.anim.slide_in_left);
		slide_out_right = AnimationUtils.loadAnimation(this,
				R.anim.slide_out_right);

		slide_in_right = AnimationUtils.loadAnimation(this,
				R.anim.slide_in_right);
		slide_out_left = AnimationUtils.loadAnimation(this,
				R.anim.slide_out_left);

		// viewFlipper.setInAnimation(slide_in_left);
		// viewFlipper.setOutAnimation(slide_out_right);

		// buttonPrev.setOnClickListener(new OnClickListener() {
		//
		// @Override
		// public void onClick(View arg0) {
		// viewFlipper.setInAnimation(slide_in_right);
		// viewFlipper.setOutAnimation(slide_out_left);
		// viewFlipper.showPrevious();
		// }
		// });

		// buttonNext.setOnClickListener(new OnClickListener() {
		//
		// @Override
		// public void onClick(View arg0) {
		// viewFlipper.setInAnimation(slide_in_left);
		// viewFlipper.setOutAnimation(slide_out_right);
		// viewFlipper.showNext();
		// }
		// });

	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		this.mDetector.onTouchEvent(event);
		return super.onTouchEvent(event);
	}

	@Override
	public boolean onDown(MotionEvent arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
			float velocityY) {
		float sensitvity = 1;

		if ((e1.getX() - e2.getX()) > sensitvity) {
			viewFlipper.setInAnimation(slide_in_right);
			viewFlipper.setOutAnimation(slide_out_left);
			viewFlipper.showPrevious();
			// Toast.makeText(MainActivity.this,
			// "Previous", Toast.LENGTH_SHORT).show();
		} else if ((e2.getX() - e1.getX()) > sensitvity) {
			viewFlipper.setInAnimation(slide_in_left);
			viewFlipper.setOutAnimation(slide_out_right);
			viewFlipper.showNext();
			// Toast.makeText(MainActivity.this,
			// "Next", Toast.LENGTH_SHORT).show();
		}

		return true;
	}

	@Override
	public void onLongPress(MotionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX,
			float distanceY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onShowPress(MotionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean onSingleTapUp(MotionEvent e) {
		// TODO Auto-generated method stub
		return false;
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
