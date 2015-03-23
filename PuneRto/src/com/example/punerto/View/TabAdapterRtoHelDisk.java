package com.example.punerto.View;

import com.example.punerto.Activity.Android;
import com.example.punerto.Activity.FragmentLicenseRelated;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabAdapterRtoHelDisk extends FragmentStatePagerAdapter {

	private int TOTAL_TABS = 2;

	public TabAdapterRtoHelDisk(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int index) {
		// TODO Auto-generated method stub
		switch (index) {
		case 0:
			
			String temp="license";
			return new FragmentLicenseRelated(temp);

			
		case 1:
			
			String temp1="vehicle";
			return new FragmentLicenseRelated(temp1);
             
			
		case 2:
			return new Android();
		}

		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return TOTAL_TABS;
	}

}
