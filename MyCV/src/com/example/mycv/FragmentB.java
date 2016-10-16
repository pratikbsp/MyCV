package com.example.mycv;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class FragmentB extends Fragment {

	LinearLayout l2;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v = inflater.inflate(R.layout.fragment2, container, false);

	/**	Button b1 = (Button) v.findViewById(R.id.button1);
		Button b2 = (Button) v.findViewById(R.id.button2);

		final LinearLayout l1 = (LinearLayout) v.findViewById(R.id.top);
		l2 = (LinearLayout) v.findViewById(R.id.bottom);

		//l2.animate().translationX(-l2.getWidth()).setDuration(100);
		//l1.animate().translationX(0).setDuration(100);
		
		final ArrayList l = new ArrayList();
		
		b1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// l1.setVisibility(View.VISIBLE);
				// l2.setVisibility(View.GONE);
					if(MainActivity.count==0){

						l2.setVisibility(View.VISIBLE);
						l2.animate().translationY(-l2.getHeight());
						
						l2.animate().alpha(0.0f);
					}
 
					else{
						l2.animate().translationY(-l2.getHeight()).setDuration(1000);
						l1.animate().translationY(0).setDuration(1000);
					}
					
					

					MainActivity.count++;
				}


			
		});

		b2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				if(MainActivity.count==0){
					l2.setVisibility(View.VISIBLE);
					l2.animate().translationY(-l2.getHeight());
					
					l2.animate().translationY(0).setDuration(1000);
					l1.animate().translationY(l1.getHeight()).setDuration(1000);
				}
				else{
					l2.animate().alpha(1.0f);
					l1.animate().translationY(l1.getHeight()).setDuration(1000);
					l2.animate().translationY(0).setDuration(1000);
				}


					
				MainActivity.count++;
			}
		});

		**/return v;
	}
	
	

}
