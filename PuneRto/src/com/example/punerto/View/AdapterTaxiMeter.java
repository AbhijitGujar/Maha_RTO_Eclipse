package com.example.punerto.View;

import java.util.ArrayList;


import com.example.punerto.Activity.TaxiFare;
import com.example.punerto.Activity.TaxiMeterView;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class AdapterTaxiMeter extends BaseAdapter {

	Context context;
	ArrayList<TaxiFare> arrayTaxiFares;

	public AdapterTaxiMeter(Context context,
			ArrayList<TaxiFare> arrayTaxiFares) {
		// TODO Auto-generated constructor stub
		this.context = context;
		this.arrayTaxiFares= arrayTaxiFares;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return arrayTaxiFares.size();
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

		TaxiMeterView taxiMeterView;

		if (convertView == null) {
			taxiMeterView = new TaxiMeterView(context);

		} else {

			taxiMeterView =  (TaxiMeterView) convertView;
		}

		taxiMeterView.setData(arrayTaxiFares.get(position));
		return taxiMeterView;
	}

}
