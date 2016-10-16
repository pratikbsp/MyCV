package com.example.mycv;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentD extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		View v = inflater.inflate(R.layout.fragment4, container, false);
		
		TextView txtView1 = (TextView)v.findViewById(R.id.r1);
		TextView txtView2 = (TextView)v.findViewById(R.id.r2);
		TextView txtView5 = (TextView)v.findViewById(R.id.r5);
		
		
		
		String first = "Built an android app ";
		String next = "<font color='#19a9f0'>WriteNote</font>";
		String last = " to write notes, memos, messages, shopping lists.";
		txtView1.setText(Html.fromHtml(first + next+last));
		
		txtView1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
				    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + "com.freakypulse.writenote")));
				} catch (android.content.ActivityNotFoundException anfe) {
				    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + "com.freakypulse.writenote")));
				}
			}
		});
		txtView2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String url = "https://github.com/pratikbsp/MineCalci";
				//https://github.com/pratikbsp/languagetool/blob/master/languagetool-language-modules/en/src/main/resources/org/languagetool/rules/en/grammar.xml
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);
			}
		});
		txtView5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String url = "https://github.com/pratikbsp/languagetool/blob/master/languagetool-language-modules/en/src/main/resources/org/languagetool/rules/en/grammar.xml";
			//https://github.com/pratikbsp/languagetool/blob/master/languagetool-language-modules/en/src/main/resources/org/languagetool/rules/en/grammar.xml
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);
			}
		});
		
		return v;
	}
}
