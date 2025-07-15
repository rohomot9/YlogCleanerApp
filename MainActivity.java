package com.example.ylogcleaner;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.widget.TextView;
import java.io.File;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("YlogCleaner running...");
        File dir = new File(Environment.getExternalStorageDirectory(), "ylog");
        if (dir.exists()) {
            for (File file : dir.listFiles()) {
                file.delete();
            }
            tv.setText("Ylog logs cleared!");
        } else {
            tv.setText("No ylog folder!");
        }
        setContentView(tv);
    }
}