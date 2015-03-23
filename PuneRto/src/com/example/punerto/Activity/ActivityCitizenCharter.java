package com.example.punerto.Activity;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.content.Intent;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

public class ActivityCitizenCharter extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		if(ActivityLanguage.lang.equals("English"))
		{
			getCitizenCharterEnglish();
		}else{
			getCitizenCharter();
		}
		
	}

	@SuppressWarnings("deprecation")
	private void getCitizenCharterEnglish() {


		AssetManager assetManager = getAssets();
		InputStream in = null;
		OutputStream out = null;
		File file = new File(getFilesDir(),"EnglishCitizensCharter.pdf");
		try {
			in = assetManager.open("EnglishCitizensCharter.pdf");
			out = openFileOutput(file.getName(),
					ActivitySchoolBus.MODE_WORLD_READABLE);

			copyFile(in, out);
			in.close();
			in = null;
			out.flush();
			out.close();
			out = null;
		} catch (Exception e) {
			Log.e("tag", e.getMessage());
		}

		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setDataAndType(
				Uri.parse("file://" + getFilesDir() + "/EnglishCitizensCharter.pdf"),
				"application/pdf");
		startActivity(intent);

	
		
	}

	@SuppressWarnings("deprecation")
	private void getCitizenCharter() {

		AssetManager assetManager = getAssets();
		InputStream in = null;
		OutputStream out = null;
		File file = new File(getFilesDir(),"citizenCharter.pdf");
		try {
			in = assetManager.open("citizenCharter.pdf");
			out = openFileOutput(file.getName(),
					ActivitySchoolBus.MODE_WORLD_READABLE);

			copyFile(in, out);
			in.close();
			in = null;
			out.flush();
			out.close();
			out = null;
		} catch (Exception e) {
			Log.e("tag", e.getMessage());
		}

		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setDataAndType(
				Uri.parse("file://" + getFilesDir() + "/citizenCharter.pdf"),
				"application/pdf");
		startActivity(intent);

	}

	private void copyFile(InputStream in, OutputStream out) throws IOException {
		byte[] buffer = new byte[1024];
		int read;
		while ((read = in.read(buffer)) != -1) {
			out.write(buffer, 0, read);
		}
	}
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		finish();
		super.onBackPressed();
	}

}
