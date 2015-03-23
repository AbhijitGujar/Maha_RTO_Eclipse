package com.example.punerto.Activity;

import java.util.ArrayList;

import com.androidexample.gcm.R;
import com.example.punerto.View.AdapterTaxiMeter;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.widget.ListView;

public class ActivityTaxiFare extends ActionBarActivity {

	ListView lst_TaxiFare;
	ArrayList<TaxiFare> arrayTaxiFares = new ArrayList<TaxiFare>();
	AdapterTaxiMeter adapterTaxiMeter;

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_taxi_fare);
		ActionBar actionBar = getSupportActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);
		actionBar.setHomeButtonEnabled(true);
		actionBar.setTitle("Taxi Meter");
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#009688")));
		actionBar.show();
		lst_TaxiFare = (ListView) findViewById(R.id.lst_taxiFare);

		arrayTaxiFares.add(new TaxiFare("10", "100 Rs", "200 Rs"));
		arrayTaxiFares.add(new TaxiFare("10", "100 Rs", "200 Rs"));
		arrayTaxiFares.add(new TaxiFare("10", "100 Rs", "200 Rs"));
		arrayTaxiFares.add(new TaxiFare("10", "100 Rs", "200 Rs"));
		arrayTaxiFares.add(new TaxiFare("10", "100 Rs", "200 Rs"));
		arrayTaxiFares.add(new TaxiFare("10", "100 Rs", "200 Rs"));
		arrayTaxiFares.add(new TaxiFare("10", "100 Rs", "200 Rs"));
		arrayTaxiFares.add(new TaxiFare("10", "100 Rs", "200 Rs"));
		arrayTaxiFares.add(new TaxiFare("10", "100 Rs", "200 Rs"));
		arrayTaxiFares.add(new TaxiFare("10", "100 Rs", "200 Rs"));
		arrayTaxiFares.add(new TaxiFare("10", "100 Rs", "200 Rs"));
		arrayTaxiFares.add(new TaxiFare("10", "100 Rs", "200 Rs"));
		arrayTaxiFares.add(new TaxiFare("10", "100 Rs", "200 Rs"));
		arrayTaxiFares.add(new TaxiFare("10", "100 Rs", "200 Rs"));
		arrayTaxiFares.add(new TaxiFare("10", "100 Rs", "200 Rs"));
		arrayTaxiFares.add(new TaxiFare("10", "100 Rs", "200 Rs"));
		arrayTaxiFares.add(new TaxiFare("10", "100 Rs", "200 Rs"));
		arrayTaxiFares.add(new TaxiFare("10", "100 Rs", "200 Rs"));
		arrayTaxiFares.add(new TaxiFare("10", "100 Rs", "200 Rs"));
		arrayTaxiFares.add(new TaxiFare("10", "100 Rs", "200 Rs"));
		adapterTaxiMeter = new AdapterTaxiMeter(ActivityTaxiFare.this,
				arrayTaxiFares);
		lst_TaxiFare.setAdapter(adapterTaxiMeter);

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
