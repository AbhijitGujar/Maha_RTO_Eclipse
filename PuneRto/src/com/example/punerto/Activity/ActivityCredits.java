package com.example.punerto.Activity;

import com.androidexample.gcm.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;


public class ActivityCredits extends ActionBarActivity {

	
	
	private static ConnectionDetector cd;
	ImageView img_Harcastel,img_Turnear;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setHomeButtonEnabled(true);
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#DF3905")));
		if (ActivityLanguage.lang.equals("English")) {
			setContentView(R.layout.activity_credits);
			actionBar.setTitle("Credits");

		} else {
			setContentView(R.layout.activity_credits);
			actionBar.setTitle(R.string.credits);

		}

		actionBar.show();
		img_Turnear=(ImageView) findViewById(R.id.imageView3);
		img_Harcastel=(ImageView) findViewById(R.id.imageView2);
		
	img_Harcastel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				View view=View.inflate(ActivityCredits.this, R.layout.credits_info, null);
				AlertDialog.Builder builder=new AlertDialog.Builder(ActivityCredits.this);
				builder.setView(view);
				
				TextView address=(TextView) view.findViewById(R.id.ctextView1);
				TextView phone=(TextView) view.findViewById(R.id.ctextView2);
				TextView email=(TextView) view.findViewById(R.id.ctextView3);
				TextView website=(TextView) view.findViewById(R.id.ctextView4);
				
				address.setText("Address   : Cecilia Building, Ground Floor, Ardeshir Irani Road, Padamjee Park 941 Nana Peth, Pune 02");
				phone.setText  ("Telephone : 020-26353535");
				email.setText  ("Email     : info@hardcastlegis.com");
				website.setText("Website   : http://hardcastlegis.com/");
				
				builder.show();
				
				address.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						try
						{
							
							if(cd.isConnectingToInternet())
							{
									
								AlertDialog.Builder aalert=new AlertDialog.Builder(ActivityCredits.this);
								aalert.setMessage("This will open Google Maps");
								aalert.setPositiveButton("GO", new AlertDialog.OnClickListener() {
									
									@Override
									public void onClick(DialogInterface dialog, int which) {
										// TODO Auto-generated method stub

										Uri uri = Uri.parse( "geo:0,0?q=hardcastlegis");
										Intent i=new Intent(Intent.ACTION_VIEW);
										i.setData(uri);
										startActivity(i);
										dialog.cancel();
									}
								});
								
								aalert.setNegativeButton("Cancel", new AlertDialog.OnClickListener() {
									
									@Override
									public void onClick(DialogInterface dialog, int which) {
										// TODO Auto-generated method stub
										dialog.dismiss();
									}
								});
								
								aalert.show();
							}
							else
							{
								AlertDialog.Builder aalert=new AlertDialog.Builder(ActivityCredits.this);
								aalert.setTitle("Please Check your Internet Connection!");
								aalert.setMessage("Turn on the GPS/WIFI for accurate Locaton!");
								aalert.setNegativeButton("Settings", new AlertDialog.OnClickListener() {
									
									@Override
									public void onClick(DialogInterface dialog, int which) {
										// TODO Auto-generated method stub
										startActivity(new Intent(android.provider.Settings.ACTION_WIRELESS_SETTINGS));
									}
								});
								aalert.show();
								
							}
						}
						catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
						
					}
				});

				phone.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(Intent.ACTION_DIAL);
						intent.setData(Uri.parse("tel:020-26353535"));
						if (intent.resolveActivity(getPackageManager()) != null) {
					        startActivity(Intent.createChooser(intent, "Choose.."));
						}
					
					}
				});

				email.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent intent = new Intent(Intent.ACTION_SENDTO);
					    intent.setData(Uri.parse("mailto:info@hardcastlegis.com")); 
					    if (intent.resolveActivity(getPackageManager()) != null) {
					    	startActivity(Intent.createChooser(intent, "Choose..."));
					    }
					    else
					    {
					    	
					    }
					}
				});

				website.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						
						Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://hardcastlegis.com/"));
						startActivity(Intent.createChooser(browserIntent, "Choose browser"));
					}
				});
				
			}
		});
	
	
	img_Turnear.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			View view=View.inflate(ActivityCredits.this, R.layout.credit_info_turnher, null);
			AlertDialog.Builder builder=new AlertDialog.Builder(ActivityCredits.this);
			builder.setView(view);
			
			TextView address=(TextView) view.findViewById(R.id.tctextView1);
			TextView phone=(TextView) view.findViewById(R.id.cttextView2);
			TextView email=(TextView) view.findViewById(R.id.cttextView3);
			TextView website=(TextView) view.findViewById(R.id.cttextView4);
			
			address.setText("Address   : Cecilia Building, Ground Floor, Ardeshir Irani Road, Padamjee Park 941 Nana Peth, Pune 02");
			phone.setText  ("Telephone : 020-26352636");
			email.setText  ("Email     : info@turnhere.com");
			website.setText("Website   : http://turnhere.in/");
			
			builder.show();
			
			address.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					try
					{
						
						if(cd.isConnectingToInternet())
						{
								
							AlertDialog.Builder aalert=new AlertDialog.Builder(ActivityCredits.this);
							aalert.setMessage("This will open Google Maps");
							aalert.setPositiveButton("GO", new AlertDialog.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub

									Uri uri = Uri.parse( "geo:0,0?q=hardcastlegis");
									Intent i=new Intent(Intent.ACTION_VIEW);
									i.setData(uri);
									startActivity(i);
									dialog.cancel();
								}
							});
							
							aalert.setNegativeButton("Cancel", new AlertDialog.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									dialog.dismiss();
								}
							});
							
							aalert.show();
						}
						else
						{
							AlertDialog.Builder aalert=new AlertDialog.Builder(ActivityCredits.this);
							aalert.setTitle("Please Check your Internet Connection!");
							aalert.setMessage("Turn on the GPS/WIFI for accurate Locaton!");
							aalert.setNegativeButton("Settings", new AlertDialog.OnClickListener() {
								
								@Override
								public void onClick(DialogInterface dialog, int which) {
									// TODO Auto-generated method stub
									startActivity(new Intent(android.provider.Settings.ACTION_WIRELESS_SETTINGS));
								}
							});
							aalert.show();
							
						}
					}
					catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					
				}
			});

			phone.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(Intent.ACTION_DIAL);
					intent.setData(Uri.parse("tel:020-26352636"));
					if (intent.resolveActivity(getPackageManager()) != null) {
				        startActivity(Intent.createChooser(intent, "Choose.."));
					}
				
				}
			});

			email.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent intent = new Intent(Intent.ACTION_SENDTO);
				    intent.setData(Uri.parse("mailto:info@hardcastlegis.com")); 
				    if (intent.resolveActivity(getPackageManager()) != null) {
				    	startActivity(Intent.createChooser(intent, "Choose..."));
				    }
				    else
				    {
				    	
				    }
				}
			});

			website.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://hardcastlegis.com/"));
					startActivity(Intent.createChooser(browserIntent, "Choose browser"));
				}
			});
			
		}
	});
	}
	
	

	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.item, menu);
		return super.onCreateOptionsMenu(menu);
	}

	public boolean onOptionsItemSelected(MenuItem item) {

		super.onOptionsItemSelected(item);

		switch (item.getItemId()) {
		case R.id.action_share:

			Intent sharingIntent = new Intent(
					android.content.Intent.ACTION_SEND);
			sharingIntent.setType("text/plain");
			String shareBody = "www.google.com/hardcastlegis.com/MAHRto";
			sharingIntent
					.putExtra(android.content.Intent.EXTRA_SUBJECT,
							"Maharashtra RTO App- Let me recommend you this application");
			sharingIntent
					.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
			startActivity(Intent.createChooser(sharingIntent, "Share via"));

			break;

		case android.R.id.home:
			this.finish();

			break;

		default:
			return super.onOptionsItemSelected(item);

		}
		return true;

	}

}
