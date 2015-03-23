package com.example.punerto.Activity;

import com.androidexample.gcm.R;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.VideoView;

public class ActivityAnimationVideo extends ActionBarActivity {

	VideoView videoView;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_video_play_animation);
		videoView = (VideoView) findViewById(R.id.videoView_Animation);
		Uri video1 = Uri.parse("android.resource://" + getPackageName() + "/"
				+ R.raw.logoanimation);
		videoView.setVideoURI(video1);
		videoView.start();
		
		videoView.setOnCompletionListener(new OnCompletionListener() {

			@Override
			public void onCompletion(MediaPlayer mp) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(getApplicationContext(),
						ActivityLanguage.class);
				intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
				finish();

			}
		});
	}

}
