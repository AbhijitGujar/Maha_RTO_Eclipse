package com.example.punerto.View;

import java.util.ArrayList;

import com.example.punerto.Activity.MechanicMeter;
import com.example.punerto.Activity.MechanicMeterView;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class AdapterMechanicMeter extends BaseAdapter {

	Context context;
	ArrayList<MechanicMeter> arrayMechanicMeters;

	public AdapterMechanicMeter(Context context,
			ArrayList<MechanicMeter> arrayMechanicMeters) {
		// TODO Auto-generated constructor stub
		this.context = context;
		this.arrayMechanicMeters = arrayMechanicMeters;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return arrayMechanicMeters.size();
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

		MechanicMeterView mechanicMeterView;

		if (convertView == null) {
			mechanicMeterView = new MechanicMeterView(context);

		} else {

			mechanicMeterView = (MechanicMeterView) convertView;
		}

		mechanicMeterView.setData(arrayMechanicMeters.get(position));
		return mechanicMeterView;
	}

}
