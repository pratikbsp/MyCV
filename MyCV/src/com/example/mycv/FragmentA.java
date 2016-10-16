package com.example.mycv;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class FragmentA extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v = inflater.inflate(R.layout.fragment1, container, false);
		LinearLayout mobText = (LinearLayout) v.findViewById(R.id.mobNo);
		LinearLayout emailText = (LinearLayout) v.findViewById(R.id.email);
		LinearLayout address = (LinearLayout) v.findViewById(R.id.address);
		LinearLayout skype = (LinearLayout) v.findViewById(R.id.skype);
		mobText.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(Intent.ACTION_DIAL);
				i.setData(Uri.parse("tel:8083367824"));
				startActivity(i);
			}
		});

		skype.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (isSkypeClientInstalled(getActivity())) {
					Intent skypeIntent = new Intent(Intent.ACTION_VIEW);
					skypeIntent.setData(Uri.parse("skype:" + "pratikbsp"+ "?call"));
					skypeIntent.setComponent(new ComponentName(
							"com.skype.raider", "com.skype.raider.Main"));
					skypeIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					getActivity().startActivity(skypeIntent);
				} else {
					Uri marketUri = Uri
							.parse("market://details?id=com.skype.raider");
					Intent myIntent = new Intent(Intent.ACTION_VIEW, marketUri);
					myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
					getActivity().startActivity(myIntent);
				}
			}
		});

		address.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				double latitude = 23.819339;
				double longitude = 86.436795;
				String label = "Sapphire Hostel";
				String uriBegin = "geo:" + latitude + "," + longitude;
				String query = latitude + "," + longitude + "(" + label + ")";
				String encodedQuery = Uri.encode(query);
				String uriString = uriBegin + "?q=" + encodedQuery + "&z=16";
				Uri uri = Uri.parse(uriString);
				Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
						uri);
				startActivity(intent);

			}
		});

		emailText.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Intent.ACTION_SEND);
				intent.setType("plain/text");
				intent.putExtra(Intent.EXTRA_EMAIL,
						new String[] { "pratikbsp@yahoo.com" });
				intent.putExtra(Intent.EXTRA_SUBJECT, "subject");
				intent.putExtra(Intent.EXTRA_TEXT, "mail body");
				startActivity(Intent.createChooser(intent, ""));
			}
		});
		return v;
	}

	public boolean isSkypeClientInstalled(Context myContext) {
		PackageManager myPackageMgr = myContext.getPackageManager();
		try {
			myPackageMgr.getPackageInfo("com.skype.raider",
					PackageManager.GET_ACTIVITIES);
		} catch (PackageManager.NameNotFoundException e) {
			return (false);
		}
		return (true);
	}

}
