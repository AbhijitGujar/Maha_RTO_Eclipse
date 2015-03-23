package com.example.punerto.View;

import java.util.ArrayList;

import com.example.punerto.Activity.ElectricMeter;
import com.example.punerto.Activity.ElectricMeterView;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class AdapterElectricMeter  extends BaseAdapter{

	Context context;
	ArrayList<ElectricMeter> arrayElectricMeters;

	public AdapterElectricMeter(Context context,
			ArrayList<ElectricMeter> arrayElectricMeters) {
		// TODO Auto-generated constructor stub
		this.context = context;
		this.arrayElectricMeters = arrayElectricMeters;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return arrayElectricMeters.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		ElectricMeterView electricMeterView;

		if (convertView == null) {
			electricMeterView = new ElectricMeterView(context);

		} else {

			electricMeterView = (ElectricMeterView) convertView;
		}

		electricMeterView.setData(arrayElectricMeters.get(position));
		return electricMeterView;
	}
	
}
