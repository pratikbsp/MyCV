package com.example.mycv;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FragmentC extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		View v = inflater.inflate(R.layout.fragment3, container, false);

		Button button1 = (Button) v.findViewById(R.id.button1);
		Button button2 = (Button) v.findViewById(R.id.button2);
		Button button3 = (Button) v.findViewById(R.id.button3);
		Button button4 = (Button) v.findViewById(R.id.button4);
		Button button5 = (Button) v.findViewById(R.id.button5);
		Button button6 = (Button) v.findViewById(R.id.button6);
		Button button7 = (Button) v.findViewById(R.id.button7);
		final TextView txtView = (TextView) v.findViewById(R.id.percentage);
		final TextView txtView1 = (TextView) v.findViewById(R.id.lang);
		final CircleProgressBar circleProgressBar = (CircleProgressBar) v
				.findViewById(R.id.custom_progressBar);
		button1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				txtView.setText("" + 55);
				txtView1.setText("C");
				float f = 55;
				circleProgressBar.setProgressWithAnimation(f);
			}
		});
		button2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				txtView1.setText("Java");
				txtView.setText("" + 70);
				float f = 70;
				circleProgressBar.setProgressWithAnimation(f);
			}
		});
		button3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				txtView1.setText("HTML");
				txtView.setText("" + 60);
				float f = 60;
				circleProgressBar.setProgressWithAnimation(f);
			}
		});

		button4.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				txtView1.setText("JS");
				txtView.setText("" + 55);
				float f = 55;
				circleProgressBar.setProgressWithAnimation(f);
			}
		});
		button5.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				txtView1.setText("PHP");
				txtView.setText("" + 60);
				float f = 60;
				circleProgressBar.setProgressWithAnimation(f);
			}
		});
		button6.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				txtView1.setText("SQL");
				txtView.setText("" + 60);
				float f = 60;
				circleProgressBar.setProgressWithAnimation(f);
			}
		});
		button7.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				txtView1.setText("Android");
				txtView.setText("" + 70);
				float f = 70;
				circleProgressBar.setProgressWithAnimation(f);
			}
		});


		return v;
	}

}
