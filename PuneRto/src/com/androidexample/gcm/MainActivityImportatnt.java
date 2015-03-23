package com.androidexample.gcm;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import co.example.punerto.classes.NotificationMessage;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.example.punerto.Activity.ActivityLanguage;
import com.example.punerto.Activity.AdapterNotificationMessages;
import com.google.android.gcm.GCMRegistrar;
import com.volley.VolleySingelton;

public class MainActivityImportatnt extends ActionBarActivity {
	// label to display gcm messages
	TextView lblMessage;
	Controller aController;

	ListView list_Notification;
	// Asyntask
	AsyncTask<Void, Void, Void> mRegisterTask;
	ArrayList<NotificationMessage> notifications = new ArrayList<NotificationMessage>();
	NotificationMessage notificationMessage;
	AdapterNotificationMessages adapterNotificationMessages;
	public static String name;
	public static String email;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setHomeButtonEnabled(true);
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#95114D")));
		if (ActivityLanguage.lang.equals("English")) {
			setContentView(R.layout.activity_important_message);
			actionBar.setTitle("Important Messages");
			Toast.makeText(getApplicationContext(), "Please Wait..",
					Toast.LENGTH_LONG).show();
		} else {
			setContentView(R.layout.activity_important_message);
			actionBar.setTitle("महत्वाचे संदेश");
			Toast.makeText(getApplicationContext(),
					"कृपया प्रतीक्षा करा संदेश लोड होत आहेत.. ",
					Toast.LENGTH_LONG).show();

		}
		actionBar.show();

		list_Notification = (ListView) findViewById(R.id.list_Notification);
		// Get Global Controller Class object (see application tag in
		// AndroidManifest.xml)
		aController = (Controller) getApplicationContext();

		// Check if Internet present
		if (!aController.isConnectingToInternet()) {

			// Internet Connection is not present
			aController.showAlertDialog(MainActivityImportatnt.this,
					"Internet Connection Error",
					"Please connect to Internet connection", false);
			// stop executing code by return
			return;
		}

		// Getting name, email from intent
		Intent i = getIntent();

		name = i.getStringExtra("name");
		email = i.getStringExtra("email");

		// Make sure the device has the proper dependencies.
		GCMRegistrar.checkDevice(this);

		// Make sure the manifest permissions was properly set
		GCMRegistrar.checkManifest(this);

		// lblMessage = (TextView) findViewById(R.id.lblMessage);

		// Register custom Broadcast receiver to show messages on activity
		registerReceiver(mHandleMessageReceiver, new IntentFilter(
				Config.DISPLAY_MESSAGE_ACTION));

		// Get GCM registration id
		final String regId = GCMRegistrar.getRegistrationId(this);

		// Check if regid already presents
		if (regId.equals("")) {

			// Register with GCM
			GCMRegistrar.register(this, Config.GOOGLE_SENDER_ID);

		} else {

			// Device is already registered on GCM Server
			if (GCMRegistrar.isRegisteredOnServer(this)) {

				// Skips registration.
				// Toast.makeText(getApplicationContext(),
				// "Already registered with GCM Server", Toast.LENGTH_LONG)
				// .show();

				getNotification();
			} else {

				// Try to register again, but not in the UI thread.
				// It's also necessary to cancel the thread onDestroy(),
				// hence the use of AsyncTask instead of a raw thread.

				final Context context = this;
				mRegisterTask = new AsyncTask<Void, Void, Void>() {

					@Override
					protected Void doInBackground(Void... params) {

						// Register on our server
						// On server creates a new user
						aController.register(context, name, email, regId);

						return null;
					}

					@Override
					protected void onPostExecute(Void result) {
						mRegisterTask = null;
					}

				};

				// execute AsyncTask
				mRegisterTask.execute(null, null, null);
			}
		}
	}

	public void getNotification() {

		String url = "http://hardcastlegis.co.in/MAHRTO/notification.php";
		// Toast.makeText(getApplicationContext(), "Url" + url,
		// Toast.LENGTH_LONG)
		// .show();
		JsonArrayRequest arrayRequest = new JsonArrayRequest(url,
				new Listener<JSONArray>() {

					public void onResponse(JSONArray response) {
						// TODO Auto-generated method stub

						try {

							JSONArray jsonArray = new JSONArray(response
									.toString());
							for (int i = 0; i < jsonArray.length(); i++) {
								JSONObject jobj = jsonArray.getJSONObject(i);
								String no_id = jobj.getString("no_id");
								String notification_messages = jobj
										.getString("notification_messages");
								String time_stamp = jobj
										.getString("time_stamp");

								notificationMessage = new NotificationMessage(
										no_id, notification_messages,
										time_stamp);
								notifications.add(notificationMessage);

							}

							adapterNotificationMessages = new AdapterNotificationMessages(
									getApplicationContext(), notifications);
							list_Notification
									.setAdapter(adapterNotificationMessages);

						} catch (JSONException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					}
				}, new ErrorListener() {

					@Override
					public void onErrorResponse(VolleyError error) {
						// TODO Auto-generated method stub

					}
				});

		VolleySingelton.getInstance(getApplicationContext()).getRequestQueue()
				.add(arrayRequest);

	}

	// Create a broadcast receiver to get message and show on screen
	private final BroadcastReceiver mHandleMessageReceiver = new BroadcastReceiver() {

		@Override
		public void onReceive(Context context, Intent intent) {

			String newMessage = intent.getExtras().getString(
					Config.EXTRA_MESSAGE);

			// Waking up mobile if it is sleeping
			aController.acquireWakeLock(getApplicationContext());

			// Display message on the screen
			// lblMessage.append(newMessage + "\n");

			// Toast.makeText(getApplicationContext(),
			// "Got Message: " + newMessage, Toast.LENGTH_LONG).show();

			notifications.clear();
			getNotification();
			// Releasing wake lock
			aController.releaseWakeLock();
		}
	};

	@Override
	protected void onDestroy() {
		// Cancel AsyncTask
		if (mRegisterTask != null) {
			mRegisterTask.cancel(true);
		}
		try {
			// Unregister Broadcast Receiver
			unregisterReceiver(mHandleMessageReceiver);

			// Clear internal resources.
			GCMRegistrar.onDestroy(this);

		} catch (Exception e) {
			Log.e("UnRegister Receiver Error", "> " + e.getMessage());
		}
		super.onDestroy();
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			this.finish();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

}
