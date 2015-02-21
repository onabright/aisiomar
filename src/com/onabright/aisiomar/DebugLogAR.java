/*==============================================================================
Aisiom Augmented Reality Project
Bright Onapito | 2013

Debug logging utility class
==============================================================================*/

package com.onabright.aisiomar;

import android.util.Log;

/** 
 *  Exposes functionality for logging the Aisiom AR App using 
 * Qualcolm QCAR Library
 *
 * */

public class DebugLogAR
{
    private static final String LOGTAG = "QCAR";

    /** Logging functions to generate ADB logcat messages. */

    public static final void LOGE(String nMessage)
    {
        Log.e(LOGTAG, nMessage);
    }


    public static final void LOGW(String nMessage)
    {
        Log.w(LOGTAG, nMessage);
    }


    public static final void LOGD(String nMessage)
    {
        Log.d(LOGTAG, nMessage);
    }


    public static final void LOGI(String nMessage)
    {
        Log.i(LOGTAG, nMessage);
    }
}
