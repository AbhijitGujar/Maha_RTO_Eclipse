package com.example.punerto.Activity;

import com.androidexample.gcm.R;
import com.example.punerto.Adapter.AdapterLicenseRelated;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

import android.widget.ListView;

public class FragmentLicenseRelated extends Fragment {

	ListView lst_LicenseRelated;

	public static String[] licenseRelated = {
			"1) Nature of Work-Required forms-Fees", "2) New Learning License",
			"3) New Permanant License", "4) Renewal Of License",
			"5) Duplicate License ", "6) NOC for change of Address",
			"7) International Driving Permit" };

	public static String[] vehicleRelated = { "1) Transfer of vehicle",
			"2) Nothing of Hypothication Endorsement/Cancellation (HPA/HPter)",
			"3) Renewal of 15 years old registration",
			"4) Duplicate certificate of registration",
			"5) NOC for transfer of ownership" };

	public static String[] mlicenseRelated = {
			"1) Nature of Work-Required forms-Fees", "2) नवीन शिकवू  परवाना",
			"3) नवीन कायम परवाना", "4) परवाना नूतनीकरण", "5) नक्कल परवाना ",
			"6) बदललेल्या पत्त्यासाठी ना हरकत प्रमाणपत्र",
			"7) आंतरराष्ट्रीय वाहतुक अनुज्ञा" };

	public static String[] mvehicleRelated = { "1) वाहनाचे हस्तांतरण",
			"2) तारण पृष्ठांकन न होणे बाबत / रद्द करणे बाबत",
			"3) 15 वर्षे जुन्या नोंदणीचे नूतनीकरण",
			"4) नोंदणी च्या प्रमाणपत्राची नक्कल",
			"5) मालकी हक्काच्या हस्तांतरणासाठी ना हरकत प्रमाणपत्र" };

	String temp;

	public FragmentLicenseRelated(String temp) {
		// TODO Auto-generated constructor stub
		this.temp = temp;
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View android = inflater.inflate(R.layout.layout_license_related,
				container, false);
		lst_LicenseRelated = (ListView) android
				.findViewById(R.id.lst_LicenseRelated);

		if (temp.equals("license")) {

			if (ActivityLanguage.lang.equals("English")) {
				lst_LicenseRelated.setAdapter(new AdapterLicenseRelated(
						getActivity(), licenseRelated));
			} else {
				lst_LicenseRelated.setAdapter(new AdapterLicenseRelated(
						getActivity(), mlicenseRelated));
			}

			lst_LicenseRelated
					.setOnItemClickListener(new OnItemClickListener() {

						@Override
						public void onItemClick(AdapterView<?> parent,
								View view, int position, long id) {
							// TODO Auto-generated method stub

							if (position == 0) {

								Intent intent = new Intent(getActivity(),
										NatureOfWork.class);
								startActivity(intent);
							}

							if (position == 1) {

								final Dialog dialog = new Dialog(getActivity());

								if (ActivityLanguage.lang.equals("English")) {
									dialog.setContentView(R.layout.layout_new_learning_license);
									dialog.setTitle("New Learning License");
									dialog.show();
								} else {
									dialog.setContentView(R.layout.layout_new_learning_license_marathi);
									dialog.setTitle("नवीन शिकवू  परवाना");
									dialog.show();
								}

							}

							if (position == 2) {

								if (ActivityLanguage.lang.equals("English")) {
									final Dialog dialog = new Dialog(
											getActivity());
									dialog.setContentView(R.layout.layout_new_permanant_license);
									dialog.setTitle("New Permanant License");
									dialog.show();
								} else {
									final Dialog dialog = new Dialog(
											getActivity());
									dialog.setContentView(R.layout.layout_new_permanant_license_marathi);
									dialog.setTitle("नवीन कायम परवाना");
									dialog.show();
								}

							}

							if (position == 3) {

								if (ActivityLanguage.lang.equals("English")) {
									final Dialog dialog = new Dialog(
											getActivity());
									dialog.setContentView(R.layout.layout_renewal);
									dialog.setTitle("Renewal Of License");
									dialog.show();
								} else {
									final Dialog dialog = new Dialog(
											getActivity());
									dialog.setContentView(R.layout.layout_renewal_marathi);
									dialog.setTitle("परवाना नूतनीकरण");
									dialog.show();
								}

							}

							if (position == 4) {

								if (ActivityLanguage.lang.equals("English")) {
									final Dialog dialog = new Dialog(
											getActivity());
									dialog.setContentView(R.layout.layout_duplicate_license);
									dialog.setTitle("Duplicate Of License");
									dialog.show();
								} else {
									final Dialog dialog = new Dialog(
											getActivity());
									dialog.setContentView(R.layout.layout_duplicate_license_marathi);
									dialog.setTitle("नक्कल परवाना ");
									dialog.show();
								}

							}
							if (position == 5) {

								if (ActivityLanguage.lang.equals("English")) {
									final Dialog dialog = new Dialog(
											getActivity());
									dialog.setContentView(R.layout.layout_noc_change_address);
									dialog.setTitle("N.O.C for change of Address");
									dialog.show();
								} else {
									final Dialog dialog = new Dialog(
											getActivity());
									dialog.setContentView(R.layout.layout_noc_change_address_marathi);
									dialog.setTitle("बदललेल्या पत्त्यासाठी ना हरकत प्रमाणपत्र");
									dialog.show();
								}

							}
							if (position == 6) {

								if (ActivityLanguage.lang.equals("English")) {
									final Dialog dialog = new Dialog(
											getActivity());
									dialog.setContentView(R.layout.layout_international_driving_permit);
									dialog.setTitle("International Driving Permit");
									dialog.show();
								} else {
									final Dialog dialog = new Dialog(
											getActivity());
									dialog.setContentView(R.layout.layout_international_driving_permit_marathi);
									dialog.setTitle("आंतरराष्ट्रीय वाहतुक अनुज्ञा");
									dialog.show();
								}

							}

						}
					});

		} else {

			if (ActivityLanguage.lang.equals("English")) {
				lst_LicenseRelated.setAdapter(new AdapterLicenseRelated(
						getActivity(), vehicleRelated));
			} else {
				lst_LicenseRelated.setAdapter(new AdapterLicenseRelated(
						getActivity(), mvehicleRelated));
			}

			lst_LicenseRelated
					.setOnItemClickListener(new OnItemClickListener() {

						@Override
						public void onItemClick(AdapterView<?> parent,
								View view, int position, long id) {
							// TODO Auto-generated method stub

							if (position == 0) {

								if (ActivityLanguage.lang.equals("English")) {
									final Dialog dialog = new Dialog(
											getActivity());
									dialog.setContentView(R.layout.layout_transfer_vehicle);
									dialog.setTitle("Transfer of Vehicle");
									dialog.show();
								} else {
									final Dialog dialog = new Dialog(
											getActivity());
									dialog.setContentView(R.layout.layout_transfer_vehicle_marathi);
									dialog.setTitle("वाहनाचे हस्तांतरण");
									dialog.show();
								}

							}

							if (position == 1) {

								if (ActivityLanguage.lang.equals("English")) {
									final Dialog dialog = new Dialog(
											getActivity());
									dialog.setContentView(R.layout.layout_cancellation_hpa);
									dialog.setTitle("Nothing of Hypothication Endorsement/Cancellation (HPA/HPter)");
									dialog.show();
								} else {
									final Dialog dialog = new Dialog(
											getActivity());
									dialog.setContentView(R.layout.layout_cancellation_hpa_marathi);
									dialog.setTitle(" तारण पृष्ठांकन न होणे बाबत / रद्द करणे बाबत");
									dialog.show();
								}

							}

							if (position == 2) {

								if (ActivityLanguage.lang.equals("English")) {
									final Dialog dialog = new Dialog(
											getActivity());
									dialog.setContentView(R.layout.layout_fifteen_years_old);
									dialog.setTitle("Renewal of 15 years old registration");
									dialog.show();
								} else {
									final Dialog dialog = new Dialog(
											getActivity());
									dialog.setContentView(R.layout.layout_fifteen_years_old_marathi);
									dialog.setTitle("15 वर्षे जुन्या नोंदणीचे नूतनीकरण");
									dialog.show();
								}

							}
							if (position == 3) {

								if (ActivityLanguage.lang.equals("English")) {
									final Dialog dialog = new Dialog(
											getActivity());
									dialog.setContentView(R.layout.duplicate_certification_of_registration);
									dialog.setTitle("Duplicate certificate of registration");
									dialog.show();
								} else {
									final Dialog dialog = new Dialog(
											getActivity());
									dialog.setContentView(R.layout.duplicate_certification_of_registration_marathi);
									dialog.setTitle("नोंदणी च्या प्रमाणपत्राची नक्कल");
									dialog.show();
								}

							}

							if (position == 4) {

								if (ActivityLanguage.lang.equals("English")) {
									final Dialog dialog = new Dialog(
											getActivity());
									dialog.setContentView(R.layout.layout_noc_transfer_ownership);
									dialog.setTitle("NOC for transfer of ownership");
									dialog.show();
								} else {
									final Dialog dialog = new Dialog(
											getActivity());
									dialog.setContentView(R.layout.layout_noc_transfer_ownership_marathi);
									dialog.setTitle("मालकी हक्काच्या हस्तांतरणासाठी ना हरकत प्रमाणपत्र");
									dialog.show();
								}

							}

						}
					});

		}

		return android;
	}
}
