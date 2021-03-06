package com.wedwise.adapter;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.wedwiseapp.R;

public class BidAdapter extends BaseAdapter{

	Context mContext;
	public ArrayList<HashMap<String, String>> listChat;

	public BidAdapter(Context mContext,ArrayList<HashMap<String, String>> listChat)
	{
		this.mContext=mContext;	
		this.listChat=listChat;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return listChat.size();
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View listItem = convertView;
		LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
		listItem = inflater.inflate(R.layout.messagelistadapter, parent, false);
		TextView tvContactName=(TextView) listItem.findViewById(R.id.tvContactName);
		TextView tvDate=(TextView) listItem.findViewById(R.id.tvDate);
		TextView tvSubject=(TextView) listItem.findViewById(R.id.tvSubject);
		TextView tvDescription=(TextView) listItem.findViewById(R.id.tvDescription);
		ImageView imViewAtttachment=(ImageView) listItem.findViewById(R.id.imViewAttachment);
//		CustomFonts.setFontOfTextView(mContext,tvContactName,"fonts/GothamRnd-Light.otf");
//		CustomFonts.setFontOfTextView(mContext,tvDate,"fonts/GothamRnd-Light.otf");
//		CustomFonts.setFontOfTextView(mContext,tvSubject,"fonts/GothamRnd-Light.otf");
//		CustomFonts.setFontOfTextView(mContext,tvDescription,"fonts/GothamRnd-Light.otf");
		/*tvContactName.setText(listChat.get(position).get("receiver_name"));
		tvDescription.setText(listChat.get(position).get("message"));
		tvDate.setText(listChat.get(position).get("msg_date"));*/
		return listItem;
	}
}
