package com.example.punerto.Activity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBar.TabListener;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.androidexample.gcm.R;
import com.example.punerto.Adapter.TabsTrafficSignAdapter;

@SuppressWarnings("deprecation")
public class ActivityTrafficSign1 extends ActionBarActivity implements
		TabListener {

	private ViewPager tabsviewPager;
	private TabsTrafficSignAdapter mTabsAdapter;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// requestWindowFeature(Window.FEATURE_ACTION_BAR);
		setContentView(R.layout.activity_traffic_sign1);
		tabsviewPager = (ViewPager) findViewById(R.id.tabsTrafficSign);
		mTabsAdapter = new TabsTrafficSignAdapter(getSupportFragmentManager());
		tabsviewPager.setAdapter(mTabsAdapter);
		getSupportActionBar().setHomeButtonEnabled(true);

		if (ActivityLanguage.lang.equals("English")) {
			getSupportActionBar().setTitle("Traffic Signs");

		} else {

			getSupportActionBar().setTitle(R.string.road_sign);
		}

		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setBackgroundDrawable(
				new ColorDrawable(Color.parseColor("#E45252")));
		getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		if(ActivityLanguage.lang.equals("English"))
		{
			Tab friendstab = getSupportActionBar().newTab()
					.setText("Information Sign").setTabListener(this);
			Tab publicprofiletab = getSupportActionBar().newTab()
					.setText("Mandatory Sign").setTabListener(this);
			Tab communitytab = getSupportActionBar().newTab()
					.setText("Cautionary Sign").setTabListener(this);
			getSupportActionBar().addTab(friendstab);
			getSupportActionBar().addTab(publicprofiletab);
			getSupportActionBar().addTab(communitytab);
		}else{
			Tab friendstab = getSupportActionBar().newTab()
					.setText(R.string.information_sign).setTabListener(this);
			Tab publicprofiletab = getSupportActionBar().newTab()
					.setText(R.string.mandatory_sign).setTabListener(this);
			Tab communitytab = getSupportActionBar().newTab()
					.setText(R.string.cautionary_sign).setTabListener(this);
			getSupportActionBar().addTab(friendstab);
			getSupportActionBar().addTab(publicprofiletab);
			getSupportActionBar().addTab(communitytab);
		}
	

		// This helps in providing swiping effect for v7 compat library
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
