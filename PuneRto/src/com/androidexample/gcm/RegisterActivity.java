package com.androidexample.gcm;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends Activity {

	// UI elements
	EditText txtName;
	EditText txtEmail;

	// Register button
	Button btnRegister;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// setContentView(R.layout.activity_register);

		String possibleEmail = "";

		try {

			Account[] accounts = AccountManager.get(this).getAccountsByType(
					"com.google");

			for (Account account : accounts) {

				possibleEmail += "" + account.name;

			}
		} catch (Exception e) {
			Log.i("Exception", "Exception:" + e);
		}

		// Get Global Controller Class object (see application tag in
		// AndroidManifest.xml)
		final Controller aController = (Controller) getApplicationContext();

		// Check if Internet Connection present
		if (!aController.isConnectingToInternet()) {

			// Internet Connection is not present
			aController.showAlertDialog(RegisterActivity.this,
					"Internet Connection Error",
					"Please connect to working Internet connection", false);

			// stop executing code by return
			return;
		}

		// Check if GCM configuration is set
		if (Config.YOUR_SERVER_URL == null || Config.GOOGLE_SENDER_ID == null
				|| Config.YOUR_SERVER_URL.length() == 0
				|| Config.GOOGLE_SENDER_ID.length() == 0) {

			// GCM sernder id / server url is missing
			aController.showAlertDialog(RegisterActivity.this,
					"Configuration Error!",
					"Please set your Server URL and GCM Sender ID", false);

			// stop executing code by return
			return;
		}

		String name = "Hardcastle User";
		String email = possibleEmail;
		// Check if user filled the form
		if (name.trim().length() > 0 && email.trim().length() > 0) {

			// Launch Main Activity
			Intent i = new Intent(getApplicationContext(),
					MainActivityImportatnt.class);

			// Registering user on our server
			// Sending registraiton details to MainActivity
			i.putExtra("name", name);
			i.putExtra("email", email);
			startActivity(i);
			finish();

		} else {

			// user doen't filled that data
			aController.showAlertDialog(RegisterActivity.this,
					"Registration Error!", "Please enter your details", false);
		}

	}

}