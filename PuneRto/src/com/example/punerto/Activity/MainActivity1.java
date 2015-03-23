package com.example.punerto.Activity;

import com.androidexample.gcm.R;

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
import android.view.MenuItem;

@SuppressWarnings("deprecation")
public class MainActivity1 extends ActionBarActivity implements TabListener {

	private ViewPager tabsviewPager;
	private Tabsadapter mTabsAdapter;

	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// requestWindowFeature(Window.FEATURE_ACTION_BAR);
		setContentView(R.layout.activity_main_sample);
		tabsviewPager = (ViewPager) findViewById(R.id.tabspager);
		mTabsAdapter = new Tabsadapter(getSupportFragmentManager());
		tabsviewPager.setAdapter(mTabsAdapter);
		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setTitle("Motor Vehicle Tax");
		getSupportActionBar().setBackgroundDrawable(
				new ColorDrawable(Color.parseColor("#E45252")));
		getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		Tab friendstab = getSupportActionBar().newTab()
				.setText("Motor Vehicle Tax").setTabListener(this);

		Tab publicprofiletab = getSupportActionBar().newTab()
				.setText("Information").setTabListener(this);
		// Tab communitytab =
		// getSupportActionBar().newTab().setText("professional Tax")
		// .setTabListener(this);

		getSupportActionBar().addTab(friendstab);
		getSupportActionBar().addTab(publicprofiletab);
		// getSupportActionBar().addTab(communitytab);

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
