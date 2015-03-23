package com.example.punerto.Adapter;

import com.androidexample.gcm.R;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AdapterLicenseRelated extends BaseAdapter {

	Context context;
	String[] licenseRelated;

	LayoutInflater inflater;

	public AdapterLicenseRelated(Context context, String[] licenseRelated) {
		// TODO Auto-generated constructor stub

		this.context = context;
		this.licenseRelated = licenseRelated;
		inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return licenseRelated.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	public class Holder {
		TextView txt_LicenseRelated;

	}

	@SuppressLint("ViewHolder")
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Holder holder = new Holder();
		View rowView;
		rowView = inflater.inflate(R.layout.layout_license_view, null);
		holder.txt_LicenseRelated = (TextView) rowView
				.findViewById(R.id.txt_LicenseRelated);

		holder.txt_LicenseRelated.setText(licenseRelated[position]);

		return rowView;
	}

}
