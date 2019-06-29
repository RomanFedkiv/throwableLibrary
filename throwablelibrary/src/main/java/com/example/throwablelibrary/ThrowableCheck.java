package com.example.throwablelibrary;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ThrowableCheck {

    private static final String TAG = "com.example.throw.lib";
    private static final String FILE_NAME = "info.txt";

    private static final String SAVE = "Save to Internal Storage";
    private static final String ERROR = "Error when saving to Internal Storage";

    public static void writeToLog(Throwable throwable) {
        Log.d(TAG, throwable.toString());
    }

    public static void writeFileOnInternalStorage(Context mcoContext, Throwable throwable){

        String throwableInfo = throwable.toString();

        File file = new File(mcoContext.getFilesDir(),"info");
        if(!file.exists()){
            file.mkdir();
        }
        try{
            File gpxfile = new File(file, FILE_NAME);
            FileWriter writer = new FileWriter(gpxfile);
            writer.append(throwableInfo);
            writer.flush();
            writer.close();
            Toast.makeText(mcoContext, SAVE, Toast.LENGTH_LONG).show();

        }catch (Exception e){
            e.printStackTrace();
            Toast.makeText(mcoContext, ERROR, Toast.LENGTH_LONG).show();
        }
    }

}
