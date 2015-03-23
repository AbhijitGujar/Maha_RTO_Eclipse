package com.example.punerto.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.androidexample.gcm.R;

public class AdapterUserManual extends BaseAdapter {

	String[] rtoContentNameList;
	int[] rtoContenImages;
	Context mContext;
	LayoutInflater inflater;

	public AdapterUserManual(Context mContext, String[] rtoContentNameList,
			int[] rtoContenImages) {

		this.mContext = mContext;
		this.rtoContentNameList = rtoContentNameList;
		this.rtoContenImages = rtoContenImages;
		inflater = (LayoutInflater) mContext
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return rtoContentNameList.length;
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
		TextView txt_rtoContentName;
		ImageView img_rtoContentImage;
	}

	@SuppressLint("ViewHolder") @Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub

		Holder holder = new Holder();
		View rowView;
		rowView = inflater.inflate(R.layout.layout_user_manual, null);
		holder.txt_rtoContentName = (TextView) rowView
				.findViewById(R.id.txt_UseManual);
		holder.img_rtoContentImage = (ImageView) rowView
				.findViewById(R.id.img_UserManual);
		holder.txt_rtoContentName.setText(rtoContentNameList[position]);
		holder.img_rtoContentImage.setImageResource(rtoContenImages[position]);
		return rowView;
	}

}
