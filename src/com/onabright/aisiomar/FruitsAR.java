
/* This class is incomplete ... */


package com.onabright.aisiomar;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;
import android.os.Bundle;

//using fragments to create a tabbed menu
public class FruitsAR extends Fragment {

	@Override
    public View onCreateView( LayoutInflater inflater, 
        ViewGroup container,
        Bundle savedInstanceState )
    {
        return inflater.inflate( R.layout.fruits_layout, 
            container, false );
    }

}
