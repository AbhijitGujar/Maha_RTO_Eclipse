package com.example.punerto.Activity;

import java.util.ArrayList;

import com.example.punerto.View.OfficeView;

import co.example.punerto.classes.OfficeList;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class AdapterOfficeList extends BaseAdapter{

	Context context;
	ArrayList<OfficeList>arryOfficeLists;
	public AdapterOfficeList(Context context,
			ArrayList<OfficeList> arryOfficeLists) {
		this.context=context;
		this.arryOfficeLists=arryOfficeLists;
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return arryOfficeLists.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		
		OfficeView officeView;
		
		if(convertView==null)
		{
			officeView=new OfficeView(context);
			
		}else{
			
			officeView=(OfficeView) convertView;
		}
		
		officeView.setData(arryOfficeLists.get(position));
		return officeView;
	}

}
