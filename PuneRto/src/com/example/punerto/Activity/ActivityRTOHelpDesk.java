package com.example.punerto.Activity;

import com.androidexample.gcm.R;
import com.example.punerto.View.TabAdapterRtoHelDisk;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBar.TabListener;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

@SuppressWarnings("deprecation")
public class ActivityRTOHelpDesk extends ActionBarActivity implements
		TabListener {

	private ViewPager tabsviewPager;
	TabAdapterRtoHelDisk tabAdapterRtoHelDisk;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		if (ActivityLanguage.lang.equals("English")) {
			setContentView(R.layout.activity_rto_help_disk);
			getSupportActionBar().setTitle("RTO HelpDesk");
		} else {
			setContentView(R.layout.activity_rto_help_disk);
			getSupportActionBar().setTitle(R.string.rto_help_desk);
		}

		tabsviewPager = (ViewPager) findViewById(R.id.tabRtoHelpDisk);
		tabAdapterRtoHelDisk = new TabAdapterRtoHelDisk(
				getSupportFragmentManager());
		tabsviewPager.setAdapter(tabAdapterRtoHelDisk);
		getSupportActionBar().setBackgroundDrawable(
				new ColorDrawable(Color.parseColor("#E45252")));

		if (ActivityLanguage.lang.equals("English")) {
			getSupportActionBar().setNavigationMode(
					ActionBar.NAVIGATION_MODE_TABS);

			Tab friendstab = getSupportActionBar().newTab()
					.setText("License Related ").setTabListener(this);

			Tab publicprofiletab = getSupportActionBar().newTab()
					.setText("Vehicle Related").setTabListener(this);
			getSupportActionBar().addTab(friendstab);
			getSupportActionBar().addTab(publicprofiletab);

		} else {
			getSupportActionBar().setNavigationMode(
					ActionBar.NAVIGATION_MODE_TABS);

			Tab friendstab = getSupportActionBar()
					.newTab()
					.setText(
							"परवाना संबंधी")
					.setTabListener(this);

			Tab publicprofiletab = getSupportActionBar().newTab()
					.setText("वाहन निगडीत")
					.setTabListener(this);
			getSupportActionBar().addTab(friendstab);
			getSupportActionBar().addTab(publicprofiletab);
		}

		// Tab communitytab =
		// getSupportActionBar().newTab().setText("professional Tax")
		// .setTabListener(this);

		tabsviewPager.setOnPageChangeListener(new OnPageChangeListener() {

			@Override
			public void onPageSelected(int position) {
				// TODO Auto-generated method stub
				getSupportActionBar().setSelectedNavigationItem(position);
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub

			}
		});

	}

	@Override
	public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTabSelected(Tab selectedtab, FragmentTransaction arg1) {
		// TODO Auto-generated method stub

		tabsviewPager.setCurrentItem(selectedtab.getPosition()); // update tab
																	// position
																	// on tap
	}

	@Override
	public void onTabUnselected(Tab arg0, FragmentTransaction arg1) {
		// TODO Auto-generated method stub

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
