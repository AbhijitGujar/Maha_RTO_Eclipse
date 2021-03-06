package com.example.punerto.Activity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.VideoView;

import com.androidexample.gcm.R;

public class ActivityLanguage extends Activity {
	// button declartion
	Button btn_English;
	Button btn_Marathi;
	// language string declaration
	public static String lang;

	VideoView videoView;

	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		requestWindowFeature(Window.FEATURE_NO_TITLE); 
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_language);
	

		videoView = (VideoView) findViewById(R.id.videoView1);
		Uri video1 = Uri.parse("android.resource://" + getPackageName() + "/"+ R.raw.logoanimation);
		videoView.setVideoURI(video1);
		videoView.start();

		btn_English = (Button) findViewById(R.id.btn_English);
		btn_Marathi = (Button) findViewById(R.id.btn_Marathi);
//		Typeface font = Typeface.createFromAsset(getAssets(), "Shivaji01.ttf");
//		btn_Marathi.setTypeface(font);

		videoView.setOnCompletionListener(new OnCompletionListener() {

			@Override
			public void onCompletion(MediaPlayer mp) {
				// TODO Auto-generated method stub
				videoView.start();
			}
		});
		btn_English.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(ActivityLanguage.this,
						MainActivity.class);

				lang = "English";
				startActivity(intent);

			}
		});
		btn_Marathi.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				lang = "Marathi";
				Intent intent = new Intent(ActivityLanguage.this,
						MainActivity.class);
				startActivity(intent);
			}
		});

	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		videoView.start();
		super.onResume();
	}
}
