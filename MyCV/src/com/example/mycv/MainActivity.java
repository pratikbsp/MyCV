package com.example.mycv;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends FragmentActivity {

	ViewPager viewPager;
	ArrayList<Fragment> fList;
	
	
	static int count=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		fList = new ArrayList();
		
		fList.add(new FragmentA());

		fList.add(new FragmentB());
						

		fList.add(new FragmentC());
				

		fList.add(new FragmentD());
				
		
		viewPager = (ViewPager) findViewById(R.id.pager);
		FragmentManager fragmentManager = getSupportFragmentManager();
		viewPager.setAdapter(new MyAdapter(fragmentManager));
		//FragmentB fragment = new FragmentB();
		//fragment.setl2();
		

	}

	class MyAdapter extends FragmentStatePagerAdapter {

		public MyAdapter(FragmentManager fm) {
			super(fm);
			// TODO Auto-generated constructor stub
		}

		@Override
		public Fragment getItem(int i) {
			// TODO Auto-generated method stub
			Fragment fragment = null;
			
			fragment = fList.get(i);
			
			
			
			/**
			if (i == 0) {
				fragment = new FragmentA();
			}
			if (i == 1) {
				fragment = new FragmentB();
				
			}
			if (i == 2) {
				fragment = new FragmentD();
			}
			if (i == 3) {
				fragment = new FragmentC();
			}
**/
			return fragment;
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 4;
		}

		@Override
		public CharSequence getPageTitle(int position) {
			if(position==0){
				return "Info";
			}
			if(position==1){
				return "Academics";
			}
			if(position==2){
				return "Experience";
			}
			if(position==3){
			return "Skills";
		}
			return null;

		}

	}

}
