package com.tencent.shadow.sample.plugin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import com.jeanboy.demo.jnitest.NdkTest;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.i("MainActivity", "onBind getTimestampMillis=" + NdkTest.getTimestampMillis());
        return new IMyAidlInterface.Stub() {
            @Override
            public String basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {
                return Integer.toString(anInt) + aLong + aBoolean + aFloat + aDouble + aString;
            }
        };
    }
}
