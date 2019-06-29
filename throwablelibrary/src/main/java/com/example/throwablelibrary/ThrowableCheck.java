package com.example.throwablelibrary;

import android.content.Context;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ThrowableCheck {

    private static final String TAG = "com.example.throw.lib";
    private static final String FILE_NAME = "info.txt";

    public static void writeToLog(Throwable throwable) {
        Log.d(TAG, throwable.toString());
    }

    public void writeFileOnInternalStorage(Context mcoContext, Throwable throwable){

        String throwableInfo = throwable.toString();

        File file = new File(mcoContext.getFilesDir(),"mydir");
        if(!file.exists()){
            file.mkdir();
        }
        try{
            File gpxfile = new File(file, FILE_NAME);
            FileWriter writer = new FileWriter(gpxfile);
            writer.append(throwableInfo);
            writer.flush();
            writer.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
