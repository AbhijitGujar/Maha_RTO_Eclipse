package com.example.punerto.Activity;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import com.androidexample.gcm.R;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ActivitySchoolBus extends ActionBarActivity {

	Button btn_Pdf;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setHomeButtonEnabled(true);
		if(ActivityLanguage.lang.equals("English")){
			setContentView(R.layout.activity_school_bus);
			actionBar.setTitle("School Bus");
		}else{
			setContentView(R.layout.activity_school_bus_marathi);
			actionBar.setTitle(R.string.school_bus);
		}
		
		
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#7BB813")));
		actionBar.show();
		btn_Pdf = (Button) findViewById(R.id.btnOpenpdf);
		btn_Pdf.setOnClickListener(new OnClickListener() {
			// InputStream is = getResources().openRawResource(R.raw.filepdf);
			@Override
			public void onClick(View v) {
				startpdf();

			}

			@SuppressLint("WorldReadableFiles") @SuppressWarnings("deprecation")
			private void startpdf() {

				AssetManager assetManager = getAssets();

				InputStream in = null;
				OutputStream out = null;
				File file = new File(getFilesDir(), "schoolbus.pdf");

				try {
					in = assetManager.open("schoolbus.pdf");
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
						Uri.parse("file://" + getFilesDir() + "/schoolbus.pdf"),
						"application/pdf");
				startActivity(intent);
			}

			private void copyFile(InputStream in, OutputStream out)
					throws IOException {
				byte[] buffer = new byte[1024];
				int read;
				while ((read = in.read(buffer)) != -1) {
					out.write(buffer, 0, read);
				}
			}
		});
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();

		if (ActivityLanguage.lang.equals("English")) {
			inflater.inflate(R.menu.marathi, menu);
		} else {
			inflater.inflate(R.menu.english, menu);
		}

		return super.onCreateOptionsMenu(menu);
	}

	public boolean onOptionsItemSelected(MenuItem item) {
		super.onOptionsItemSelected(item);
		switch (item.getItemId()) {
		case R.id.action_lanMarathi:
			ActivityLanguage.lang = "Marathi";
			Intent i = getIntent();
			overridePendingTransition(R.anim.anim_for_eng_mar_switch_entry,
					R.anim.exit_from_bottom);
			finish();
			// i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
			startActivity(i);
			overridePendingTransition(R.anim.anim_for_eng_mar_switch_entry,
					R.anim.exit_from_bottom);
			break;

		case R.id.action_lanEnglish:
			ActivityLanguage.lang = "English";
			Intent iM = getIntent();
			finish();
			startActivity(iM);
			overridePendingTransition(R.anim.anim_for_eng_mar_switch_entry,
					R.anim.exit_from_bottom);
			break;
		case android.R.id.home:
			this.finish();
			overridePendingTransition(R.anim.enter_from_bottom,
					R.anim.anim_for_eng_mar_switch_exit);
			break;

		default:
			return super.onOptionsItemSelected(item);

		}
		return true;

	}
}
