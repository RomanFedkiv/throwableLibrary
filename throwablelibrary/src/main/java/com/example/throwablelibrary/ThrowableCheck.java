package com.example.throwablelibrary;

import android.content.Context;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ThrowableCheck {

    private static final String TAG = "com.example.throw.lib";
    private static final String FILE_NAME = "info.txt";

    public static void writeToLog(Throwable throwable) {
        Log.d(TAG, throwable.toString());
    }

    public static void writeToFile(Context context, Throwable throwable) {
        String throwableInfo = throwable.toString();

        FileOutputStream outputStream = null;

        File file;

        try {
            outputStream = new FileOutputStream(FILE_NAME);
            file = File.createTempFile(FILE_NAME, null, context.getCacheDir());

            outputStream.write(throwableInfo.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
