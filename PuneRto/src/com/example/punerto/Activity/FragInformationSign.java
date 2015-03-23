package com.example.punerto.Activity;

import com.androidexample.gcm.R;
import com.example.punerto.Adapter.AdapterMandatorySign;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class FragInformationSign extends Fragment {

	GridView grid_MandatorySign;
	String val;

	public static String[] rtoContentNameList = { "Motor Vehicle Department",
			"RTO Office                 ", "Citizen Charter/GR/Notifications",
			"Auto/Taxi Complaint", "    Other Complaint", "Road Safety",
			"Practice Test", "         LL Appointment",
			"          DL Appointment", "Important Message",
			"Photograph / Video Gallery", "License Type", "       FAQ",
			"       Tax", "New Projects", "School Bus", "User Manual",
			"     Credits" };

	public static int[] rtoMandatorySignImages = { R.drawable.me1,
			R.drawable.me2, R.drawable.me3, R.drawable.me4, R.drawable.me5,
			R.drawable.me6, R.drawable.me7, R.drawable.me8, R.drawable.me9,
			R.drawable.me10, R.drawable.me11, R.drawable.me12, R.drawable.me13,
			R.drawable.me14, R.drawable.me15, R.drawable.me16, R.drawable.me17,
			R.drawable.me18, R.drawable.me19, R.drawable.me20, R.drawable.me21,
			R.drawable.me22, R.drawable.me23, R.drawable.me24, R.drawable.me25 ,R.drawable.ceblank37,R.drawable.ceblank37};

	public static int[] rtoInformationSignImages = {R.drawable.ie1, R.drawable.ie2,
			R.drawable.ie3, R.drawable.ie4, R.drawable.ie5, R.drawable.ie6,
			R.drawable.ie7, R.drawable.ie8, R.drawable.ie9, R.drawable.ie10,
			R.drawable.ie11, R.drawable.ie12, R.drawable.ie13, R.drawable.ie14,R.drawable.ceblank37 };

	public static int[] rtoCautionarySignImages = { R.drawable.ce1,
			R.drawable.ce2, R.drawable.ce3, R.drawable.ce4, R.drawable.ce5,
			R.drawable.ce6, R.drawable.ce7, R.drawable.ce8, R.drawable.ce9,
			R.drawable.ce10, R.drawable.ce11, R.drawable.ce12, R.drawable.ce13,
			R.drawable.ce14, R.drawable.ce15, R.drawable.ce16, R.drawable.ce17,
			R.drawable.ce18, R.drawable.ce19, R.drawable.ce20, R.drawable.ce21,
			R.drawable.ce22, R.drawable.ce23, R.drawable.ce24, R.drawable.ce25,
			R.drawable.ce26, R.drawable.ce27, R.drawable.ce28, R.drawable.ce29,
			R.drawable.ce30, R.drawable.ce31, R.drawable.ce32, R.drawable.ce33,
			R.drawable.ce34 ,R.drawable.ceblank37,R.drawable.ceblank37};

	// array for marathi images

	public static int[] rtoCautionarySignImagesMarathi = { R.drawable.cem1,
			R.drawable.cem2, R.drawable.cem3, R.drawable.cem4, R.drawable.cem5,
			R.drawable.cem6, R.drawable.cem7, R.drawable.cem8, R.drawable.cem9,
			R.drawable.cem10, R.drawable.cem11, R.drawable.cem12,
			R.drawable.cem13, R.drawable.cem14, R.drawable.cem15,
			R.drawable.cem16, R.drawable.cem17, R.drawable.cem18,
			R.drawable.cem19, R.drawable.cem20, R.drawable.cem21,
			R.drawable.cem22, R.drawable.cem23, R.drawable.cem24,
			R.drawable.cem25, R.drawable.ce26, R.drawable.ce27,
			R.drawable.ce28, R.drawable.ce29, R.drawable.ce30, R.drawable.ce31,
			R.drawable.ce32, R.drawable.ce33, R.drawable.ce34,R.drawable.ceblank37,R.drawable.ceblank37 };

	public static int[] rtoInformationSignImagesMarathi = { R.drawable.iem1,R.drawable.iem2,
			R.drawable.iem3, R.drawable.iem4, R.drawable.iem5, R.drawable.iem6,
			R.drawable.iem7, R.drawable.iem8, R.drawable.iem9, R.drawable.iem10,
			R.drawable.iem11, R.drawable.iem12, R.drawable.iem13, R.drawable.iem14 ,R.drawable.ceblank37};

	public static int[] rtoMandatorySignImagesMarathi = { R.drawable.mme1,
			R.drawable.mme2, R.drawable.mme3, R.drawable.mme4, R.drawable.mme5,
			R.drawable.mme6, R.drawable.mme7, R.drawable.mme8, R.drawable.mme9,
			R.drawable.mme10, R.drawable.mme11, R.drawable.mme12, R.drawable.mme13,
			R.drawable.mme14, R.drawable.mme15, R.drawable.mme16, R.drawable.mme17,
			R.drawable.mme18, R.drawable.mme19, R.drawable.mme20, R.drawable.mme21,
			R.drawable.mme22, R.drawable.mme23, R.drawable.mme24, R.drawable.mme25,R.drawable.ceblank37,R.drawable.ceblank37 };

	public FragInformationSign(String val) {
		// TODO Auto-generated constructor stub
		this.val = val;

	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View sign = inflater.inflate(R.layout.activity_mandatory_sign,
				container, false);
		grid_MandatorySign = (GridView) sign
				.findViewById(R.id.grid_MandatorySign);

		if (ActivityLanguage.lang.equals("English")) {
			if (val.equals("information")) {
				grid_MandatorySign.setAdapter(new AdapterMandatorySign(
						getActivity(), rtoContentNameList,
						rtoInformationSignImages));
			} else if (val.equals("mandatory")) {

				grid_MandatorySign.setAdapter(new AdapterMandatorySign(
						getActivity(), rtoContentNameList,
						rtoMandatorySignImages));

			} else {

				grid_MandatorySign.setAdapter(new AdapterMandatorySign(
						getActivity(), rtoContentNameList,
						rtoCautionarySignImages));
			}
		} else {
			if (val.equals("information")) {
				grid_MandatorySign.setAdapter(new AdapterMandatorySign(
						getActivity(), rtoContentNameList,
						rtoInformationSignImagesMarathi));
			} else if (val.equals("mandatory")) {

				grid_MandatorySign.setAdapter(new AdapterMandatorySign(
						getActivity(), rtoContentNameList,
						rtoMandatorySignImagesMarathi));

			} else {

				grid_MandatorySign.setAdapter(new AdapterMandatorySign(
						getActivity(), rtoContentNameList,
						rtoCautionarySignImagesMarathi));
			}
		}

		return sign;
	}

}
