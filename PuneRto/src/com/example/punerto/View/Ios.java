package com.example.punerto.View;

import com.androidexample.gcm.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Ios extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View ios = inflater.inflate(R.layout.layout_motor_vehicle_information,
				container, false);
		
		return ios;
	}
}
