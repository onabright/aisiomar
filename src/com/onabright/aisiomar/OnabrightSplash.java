

/*==============================================================================
Aisiom Augmented Reality Project
Bright Onapito | 2013
Onabright Ware splash screen class

==============================================================================*/


package com.onabright.aisiomar;

import android.os.Bundle;
import android.app.Activity;
//import android.view.Window;
import android.content.Intent;
import android.os.Handler;

public class OnabrightSplash extends Activity {
	private final int SPLASH_DISPLAY_LENGHT = 3000;	
	@Override
	public void onCreate(Bundle splash) {
		super.onCreate(splash);
		setContentView(R.layout.splash);
		 // this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		
		/* New Handler to start the Menu-Activity 
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
            	
            	/* Finish/end the splash activity*/
            	 OnabrightSplash.this.finish();
                /* Create an Intent that will start the AisiomSplash AR Activity. */
                Intent aisiomIntent = new Intent(OnabrightSplash.this,AisiomSplashAR.class);
                OnabrightSplash.this.startActivity(aisiomIntent);
               
            }
        }, SPLASH_DISPLAY_LENGHT);
        
	}

	
}
