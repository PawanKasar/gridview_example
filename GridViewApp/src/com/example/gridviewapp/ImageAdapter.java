package com.example.gridviewapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ImageAdapter extends BaseAdapter {

	private Context mContext;
	
	public ImageAdapter(Context context){

		mContext=context;
		
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer[] mThumIds = { R.drawable.sample_0, R.drawable.sample_1,
								R.drawable.sample_2, R.drawable.sample_3,
								R.drawable.sample_4,R.drawable.sample_5,
								R.drawable.sample_6,R.drawable.sample_7,
								R.drawable.sample_1,R.drawable.sample_3,
								R.drawable.sample_5,R.drawable.sample_7,
								R.drawable.sample_0,R.drawable.sample_2,
								R.drawable.sample_4,R.drawable.sample_6};

}