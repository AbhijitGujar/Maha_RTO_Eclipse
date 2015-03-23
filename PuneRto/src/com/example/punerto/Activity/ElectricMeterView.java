package com.example.punerto.Activity;

import com.androidexample.gcm.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ElectricMeterView extends LinearLayout {

	Context context;
	TextView txt_distance;
	TextView txt_FareShow;
	TextView txt_FarePayable;
	TextView txt_dayFare;
	TextView txt_nightFare;

	public ElectricMeterView(Context context) {
		super(context);
		this.context = context;
		// TODO Auto-generated constructor stub
		hookup();
	}

	private void hookup() {
		LayoutInflater inflater = LayoutInflater.from(context);
		View view = inflater.inflate(R.layout.layout_electronic_meter_view,
				null);
		txt_distance = (TextView) view.findViewById(R.id.txt_Electric_Distance);
		txt_FareShow = (TextView) view.findViewById(R.id.txt_ElectricFARESHOW);
		txt_FarePayable = (TextView) view
				.findViewById(R.id.txt_eLECTRIC_fARE_payable);
		txt_dayFare = (TextView) view.findViewById(R.id.txt_Electric_DayFare);
		txt_nightFare = (TextView) view
				.findViewById(R.id.txt_Electric_NightFare);
		this.addView(view);
	}

	public void setData(ElectricMeter electricMeter) {

		txt_distance.setText(electricMeter.getDistance());
		txt_FareShow.setText(electricMeter.getFareShown());
		txt_FarePayable.setText(electricMeter.getFarePayable());
		txt_dayFare.setText(electricMeter.getDayFare());
		txt_nightFare.setText(electricMeter.getNightFare());
	}
}