package com.example.punerto.Activity;

import com.androidexample.gcm.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Android extends Fragment {

	RadioButton radio_MotorCycle;
	RadioButton radio_4Wheeler;
	RadioButton radio_Indian;
	RadioButton radio_Imported;
	RadioButton radio_Individual;
	RadioButton radio_Company;
	RadioButton radio_Petrol;
	RadioButton radio_Disel;
	RadioButton radio_CngOrLPG;
	RadioButton radio_BatteryOperated;
	Button btn_Calculate;
	Button btn_Cancel;
	EditText edt_VehicleCost;
	TextView txt_CalculateResult;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View android = inflater.inflate(R.layout.activity_motor_vehicle,
				container, false);
		radio_MotorCycle = (RadioButton) android
				.findViewById(R.id.radio_MotorCycle);
		radio_4Wheeler = (RadioButton) android
				.findViewById(R.id.radio_four_Wheeler);
		radio_Company = (RadioButton) android.findViewById(R.id.radio_Company);
		radio_Individual = (RadioButton) android
				.findViewById(R.id.radio_Individual);
		radio_BatteryOperated = (RadioButton) android
				.findViewById(R.id.radio_Battery);
		radio_CngOrLPG = (RadioButton) android.findViewById(R.id.radio_Cng);
		radio_Disel = (RadioButton) android.findViewById(R.id.radio_Disel);
		radio_Imported = (RadioButton) android
				.findViewById(R.id.radio_Imported);
		radio_Indian = (RadioButton) android.findViewById(R.id.radio_indian);
		radio_Petrol = (RadioButton) android.findViewById(R.id.radio_Petrol);
		btn_Calculate = (Button) android.findViewById(R.id.btn_Calculate);
		btn_Cancel = (Button) android.findViewById(R.id.btn_Cancel);
		edt_VehicleCost = (EditText) android
				.findViewById(R.id.edt_CostOfVehicle);
		txt_CalculateResult = (TextView) android
				.findViewById(R.id.txt_CalculateShow);

		btn_Calculate.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {

				if (radio_MotorCycle.isChecked() == true) {

					if (radio_Indian.isChecked() == true) {

						if (radio_Individual.isChecked() == true) {

							int invoiceValue = 7;
							int vehicleCost = Integer.parseInt(edt_VehicleCost
									.getText().toString());
							int claculateTax = vehicleCost * invoiceValue / 100;
							txt_CalculateResult.setText("" + claculateTax);
							// Toast.makeText(getApplicationContext(),
							// "Calculate Tax Is " + claculateTax,
							// Toast.LENGTH_LONG).show();
						}
					}

				}

				// second condition
				if (radio_MotorCycle.isChecked() == true) {

					if (radio_Indian.isChecked() == true) {

						if (radio_Company.isChecked() == true) {

							int invoiceValue = 14;
							int vehicleCost = Integer.parseInt(edt_VehicleCost
									.getText().toString());
							int claculateTax = vehicleCost * invoiceValue / 100;
							txt_CalculateResult.setText("" + claculateTax);
							// Toast.makeText(
							// getApplicationContext(),
							// "Calculate Company Invoice Value Tax Is "
							// + claculateTax, Toast.LENGTH_LONG)
							// .show();
						}
					}

				}

				// third condition
				if (radio_4Wheeler.isChecked() == true) {

					if (radio_Indian.isChecked() == true) {

						if (radio_Petrol.isChecked() == true) {

							int vehicleCost = Integer.parseInt(edt_VehicleCost
									.getText().toString());
							if (vehicleCost < 1000000) {

								int invoiceValueUptoTenLakh = 7;
								Toast.makeText(getActivity(), "Up to ten Lakh",
										Toast.LENGTH_LONG).show();
								int claculateTax = vehicleCost
										* invoiceValueUptoTenLakh / 100;
								txt_CalculateResult.setText("" + claculateTax);
								// Toast.makeText(
								// getApplicationContext(),
								// "Calculate Company Invoice Value Tax Is "
								// + claculateTax,
								// Toast.LENGTH_LONG).show();
							}

							if (vehicleCost < 2000000) {
								int invoiceValueUptoTenLakh = 8;
								Toast.makeText(getActivity(), "Up to 20  Lakh",
										Toast.LENGTH_LONG).show();
								int claculateTax = vehicleCost
										* invoiceValueUptoTenLakh / 100;
								txt_CalculateResult.setText("" + claculateTax);
								// Toast.makeText(
								// getApplicationContext(),
								// "Calculate Company Invoice Value Tax Is "
								// + claculateTax,
								// Toast.LENGTH_LONG).show();
							}
							if (vehicleCost > 2000000) {
								int invoiceValueUptoTenLakh = 8;
								Toast.makeText(getActivity(), "Above 20  Lakh",
										Toast.LENGTH_LONG).show();
								int claculateTax = vehicleCost
										* invoiceValueUptoTenLakh / 100;
								txt_CalculateResult.setText("" + claculateTax);
								// Toast.makeText(
								// getApplicationContext(),
								// "Calculate Company Invoice Value Tax Is "
								// + claculateTax,
								// Toast.LENGTH_LONG).show();

							}

						}
					}

				}

				if (radio_4Wheeler.isChecked() == true
						|| radio_Indian.isSelected() == true
						|| radio_Disel.isSelected() == true) {

					int vehicleCost = Integer.parseInt(edt_VehicleCost
							.getText().toString());
					if (vehicleCost < 1000000) {

						int invoiceValueUptoTenLakh = 9;
						// Toast.makeText(ActivityMotorVehicleTax.this,
						// "Up to ten Lakh 4w+Indain+Disel",
						// Toast.LENGTH_LONG).show();
						int claculateTax = vehicleCost
								* invoiceValueUptoTenLakh / 100;
						txt_CalculateResult.setText("" + claculateTax);
						// Toast.makeText(
						// getApplicationContext(),
						// "Calculate Company Invoice Value Tax Is "
						// + claculateTax, Toast.LENGTH_LONG)
						// .show();
					}

					if (vehicleCost < 2000000) {

						int invoiceValueUptoTenLakh = 10;
						Toast.makeText(getActivity(),
								"Up to 20 Lakh 4w+Indain+Disel",
								Toast.LENGTH_LONG).show();
						int claculateTax = vehicleCost
								* invoiceValueUptoTenLakh / 100;
						txt_CalculateResult.setText("" + claculateTax);
						// Toast.makeText(
						// getApplicationContext(),
						// "Calculate Company Invoice Value Tax Is "
						// + claculateTax, Toast.LENGTH_LONG)
						// .show();
					}

					if (vehicleCost > 2000000) {

						int invoiceValueUptoTenLakh = 9;
						Toast.makeText(getActivity(),
								"Up to twenty Lakh 4w+Indain+Disel",
								Toast.LENGTH_LONG).show();
						int claculateTax = vehicleCost
								* invoiceValueUptoTenLakh / 100;
						txt_CalculateResult.setText("" + claculateTax);
						// Toast.makeText(
						// getApplicationContext(),
						// "Calculate Company Invoice Value Tax Is "
						// + claculateTax, Toast.LENGTH_LONG)
						// .show();
					}

				}

			}
		});

		btn_Cancel.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				getActivity().finish();
			}
		});
		return android;
	}
}