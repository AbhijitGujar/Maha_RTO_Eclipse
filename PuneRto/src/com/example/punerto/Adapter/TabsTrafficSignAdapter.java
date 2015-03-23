package com.example.punerto.Adapter;

import com.example.punerto.Activity.FragInformationSign;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabsTrafficSignAdapter extends FragmentStatePagerAdapter {

	private int TOTAL_TABS = 3;

	public TabsTrafficSignAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int index) {
		// TODO Auto-generated method stub
		switch (index) {
		case 0:
			String val = "information";
			return new FragInformationSign(val);

		case 1:
			val = "mandatory";
			return new FragInformationSign(val);

		case 2:
			val = "cautionary";
			return new FragInformationSign(val);
		}

		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return TOTAL_TABS;
	}

}
