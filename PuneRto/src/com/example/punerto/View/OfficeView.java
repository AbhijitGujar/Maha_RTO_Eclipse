package com.example.punerto.View;

import com.androidexample.gcm.R;
import co.example.punerto.classes.OfficeList;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class OfficeView extends LinearLayout {

	public Context context;
	TextView txt_officeId;
	TextView txt_OfficeName;

	public OfficeView(Context context) {
		super(context);
		this.context = context;
		hookup();

	}

	private void hookup() {
		LayoutInflater inflater = LayoutInflater.from(context);
		View view = inflater.inflate(R.layout.layout_office_view, null);
		txt_officeId = (TextView) view.findViewById(R.id.txt_Id);
		txt_OfficeName = (TextView) view.findViewById(R.id.txt_officeName);

		// if (ActivityLanguage.lang.equals("English")) {
		//
		// } else {
		//
		// Typeface font = Typeface.createFromAsset(context.getAssets(),
		// "mangal.ttf");
		// txt_officeId.setTypeface(font);
		// txt_OfficeName.setTypeface(font);
		// }
		this.addView(view);
	}

	public void setData(OfficeList officeList) {

		txt_officeId.setText(officeList.getOfficeId());
		txt_OfficeName.setText(officeList.getOfficeName());

	}

}
