/*
 * Reserve this later shall we? @bright
package com.onabright.aisiomar;

import android.os.Bundle;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
//import android.support.v4.app.Fragment;
import android.view.Menu;
import android.app.ActionBar;
public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 ActionBar ab = getActionBar();
		 //requires API 11 and above
		 ab.setNavigationMode( ActionBar.NAVIGATION_MODE_TABS );
		 //creating the first tab
		 Tab tab = ab.newTab().setText(R.string.fruits_desc)
				 .setTabListener(
						 new MyTabListener(this,
								FruitsAR.class.getName() )
						 ); //end of setTabListener
		 ab.addTab(tab);
		//creating the second tab
		 tab = ab.newTab().setText(R.string.leaves_desc)
				 .setTabListener(
						 new MyTabListener(this,
							  LeavesAR.class.getName() )
						 ); //end of setTabListener
		 ab.addTab(tab);
		 
		//creating the third tab
		 tab = ab.newTab().setText(R.string.roots_desc)
				 .setTabListener(
						 new MyTabListener(this,
							  RootsAR.class.getName() )
						 ); //end of setTabListener
		 ab.addTab(tab);
		 
		 
		//creating the fourth tab
		 tab = ab.newTab().setText(R.string.stem_desc)
				 .setTabListener(
						 new MyTabListener(this,
							  StemAR.class.getName() )
						 ); //end of setTabListener
		 ab.addTab(tab);
	//	setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash_ar, menu);
		return true;
	}

}

 class MyTabListener implements ActionBar.TabListener{
	
	private Fragment mFragment;
    private final Activity mActivity;
    private final String mFragName;
    
	public MyTabListener(Activity activity, 
	        String fragName){
		mActivity = activity;
        mFragName = fragName;	
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		mFragment = Fragment.instantiate( mActivity, 
	            mFragName );
	       ft.add(android.R.id.content, mFragment);
	       
	    }
		
	
	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		 ft.remove( mFragment );
	        mFragment = null;
		
	}
	
	
}

*/
