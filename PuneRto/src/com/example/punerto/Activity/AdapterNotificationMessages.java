package com.example.punerto.Activity;

import java.util.ArrayList;

import com.androidexample.gcm.R;

import co.example.punerto.classes.NotificationMessage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import android.widget.TextView;

public class AdapterNotificationMessages extends BaseAdapter {

	Context context;
	ArrayList<NotificationMessage> notifications;
	LayoutInflater inflater;

	public AdapterNotificationMessages(Context context,
			ArrayList<NotificationMessage> notifications) {
		// TODO Auto-generated constructor stub
		this.context = context;
		this.notifications = notifications;
		inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return notifications.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	public class Holder {
		TextView txt_NotificationMessage;
		TextView txt_TimeStamp;

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub

		final Holder holder = new Holder();
		View rowView;
		rowView = inflater.inflate(R.layout.layout_notification_messages, null);
		holder.txt_NotificationMessage = (TextView) rowView
				.findViewById(R.id.txt_NotificationMessage);
		holder.txt_TimeStamp = (TextView) rowView
				.findViewById(R.id.txt_TimeStamp);

		holder.txt_NotificationMessage.setText(notifications.get(position)
				.getTime_stamp());
		holder.txt_TimeStamp.setText(notifications.get(position)
				.getNot_message());

		return rowView;
	}

}
