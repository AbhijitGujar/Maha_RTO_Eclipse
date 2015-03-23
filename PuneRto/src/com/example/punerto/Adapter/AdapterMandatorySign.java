package com.example.punerto.Adapter;

import com.androidexample.gcm.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterMandatorySign extends BaseAdapter {

	Context context;
	String[] rtoContentNameList;
	int[] rtoMandatorySignImages;

	LayoutInflater inflater;

	public AdapterMandatorySign(Context context, String[] rtoContentNameList,
			int[] rtoMandatorySignImages) {
		// TODO Auto-generated constructor stub

		this.context = context;
		this.rtoContentNameList = rtoContentNameList;
		this.rtoMandatorySignImages = rtoMandatorySignImages;
		inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return rtoMandatorySignImages.length;
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

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Holder holder = new Holder();
		View rowView;
		rowView = inflater.inflate(R.layout.layout_mandatory, null);
		holder.txt_rtoContentName = (TextView) rowView
				.findViewById(R.id.txt_RtoMandatoryContentName);
		holder.img_rtoContentImage = (ImageView) rowView
				.findViewById(R.id.img_MandatoryContent);
		// holder.txt_rtoContentName.setText(rtoContentNameList[position]);
		holder.img_rtoContentImage
				.setImageResource(rtoMandatorySignImages[position]);

		return rowView;
	}

}
