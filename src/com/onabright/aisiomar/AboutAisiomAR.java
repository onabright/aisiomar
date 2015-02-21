
/*==============================================================================
Aisiom Augmented Reality Project
Bright Onapito | 2013
The 'About Aisiom' class

==============================================================================*/



package com.onabright.aisiomar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class AboutAisiomAR extends Activity implements OnClickListener
{
    private TextView mAboutText;
    private Button mLaunchButton;
   // private Button mExitButton; //might not be a good idea @bright


    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_aisiom);

        mAboutText = (TextView) findViewById(R.id.about_text); //load text from about_text.xml file
        mAboutText.setText(Html.fromHtml(getString(R.string.about_text)));
        mAboutText.setMovementMethod(LinkMovementMethod.getInstance());

        // Setups the link color
        mAboutText.setLinkTextColor(getResources().getColor(
                R.color.holo_light_blue));

        mLaunchButton = (Button) findViewById(R.id.button_start);
        mLaunchButton.setOnClickListener(this);
        
    //    mExitButton = (Button) findViewById(R.id.button_close);
      //  mExitButton.setOnClickListener(this);
    }


    /** Starts the ImageTargets main activity */
    private void startARActivity()
    {
        Intent i = new Intent(this, AisiomLaunchAR.class);
        startActivity(i);
    }


    public void onClick(View v)
    {
        switch (v.getId())
        {
     //   case R.id.button_close: //is this a good idea? @bright
     //   	finish(); 
        case R.id.button_start:
            startARActivity();
            break;
        }
    }
}
