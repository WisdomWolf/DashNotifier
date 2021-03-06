package com.umang.dashnotifier;

import android.os.Bundle;
import android.view.MenuItem;
import android.app.Activity;
import android.app.FragmentManager;


public class AppSelectActivity extends Activity {
	AppListFragment mAppSelectFragment;
	String message;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		FragmentManager mFragmentManager = getFragmentManager();
		
		mAppSelectFragment = (AppListFragment) mFragmentManager.findFragmentByTag("appSelect");
		 
	    // If the Fragment is non-null, then it is currently being
	    // retained across a configuration change.
	    if (mAppSelectFragment == null) {
	    	mAppSelectFragment = new AppListFragment();
	    	mFragmentManager.beginTransaction().replace(android.R.id.content, mAppSelectFragment,"appSelect").commit();
	    }
	    
	}
	
	
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	    // Respond to the action bar's Up/Home button
	    case android.R.id.home:
	        finish();
	        return true;
	    }
	    return super.onOptionsItemSelected(item);
	}

}
