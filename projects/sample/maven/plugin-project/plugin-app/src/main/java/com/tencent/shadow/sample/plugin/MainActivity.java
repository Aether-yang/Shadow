package com.tencent.shadow.sample.plugin;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.jeanboy.demo.jnitest.NdkTest;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivity", "getTimestampMillis=" + NdkTest.getTimestampMillis());
    }
}