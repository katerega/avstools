package com.kce.avstools;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;

public class AVSsslComands extends Service {



    @Override
    public  IBinder onBind(Intent intent) {

      /*  try {
            IPowerManager adapter = IPowerManager.Stub.asInterface(ServiceManager.getService("power"));
            adapter.goToSleep(SystemClock.uptimeMillis(), 0, 0);
            return true;
        } catch (Throwable e) {
            return false;
        }*/
        return null;
    }
}
