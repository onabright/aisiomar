
/*==============================================================================
Aisiom Augmented Reality Project
Bright Onapito | 2013
Aisiom app splash screen class

==============================================================================*/


package com.onabright.aisiomar;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;	
import android.os.Handler;

public class AisiomSplashAR  extends Activity{

	private final int SPLASH_DISPLAY_LENGHT = 3000;	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aisiom_splash);
		
		
		/* New Handler to start the Main-Activity 
         * and close this AisiomSplashAR screen after some seconds.*/
		
		new Handler().postDelayed(new Runnable(){

			@Override
			public void run() {
				
				/* Finish/end the AisiomSplashAR activity*/
				AisiomSplashAR.this.finish();
				/* Create new intent to launch main activity*/
				Intent mainIntent = new Intent(AisiomSplashAR.this, AboutAisiomAR.class);
				AisiomSplashAR.this.startActivity(mainIntent);
				
			
			}
			
		}
		 //continuation of postDelayed() parameters
		, SPLASH_DISPLAY_LENGHT);
		
	} //end of postDelayed method
	
}


