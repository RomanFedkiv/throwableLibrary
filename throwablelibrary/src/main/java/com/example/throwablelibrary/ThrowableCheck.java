package com.example.throwablelibrary;

import android.util.Log;

public class ThrowableCheck {

    private static final String TAG = "com.example.throw.lib";

    public static void writeToLog(Throwable throwable) {
        Log.d(TAG, throwable.toString());
    }

}
