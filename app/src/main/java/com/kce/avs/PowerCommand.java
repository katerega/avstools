package com.kce.avs;
/*

import android.content.Context;
import android.os.BatteryManager;
import android.os.IPowerManager;
import android.os.*;
import android.os.RemoteException;
import android.os.ServiceManager;
import android.os.SystemClock;



public class PowerCommand   {//Svc.Command
    public PowerCommand() {
        //super("power");
        PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
        pm.reboot(null);
    }
    public String shortHelp() {
        return "Control the power manager";
    }
    public String longHelp() {
        return shortHelp() + "\n"
                + "\n"
                + "usage: svc power stayon [true|false|usb|ac|wireless]\n"
                + "         Set the 'keep awake while plugged in' setting.\n"
                + "       svc power reboot [reason]\n"
                + "         Perform a runtime shutdown and reboot device with specified reason.\n"
                + "       svc power shutdown\n"
                + "         Perform a runtime shutdown and power off the device.\n";
    }
    public void run(String[] args) {
        fail: {
            if (args.length >= 2) {
                IPowerManager pm = IPowerManager.Stub.asInterface(
                        ServiceManager.getService(Context.POWER_SERVICE));
                if ("stayon".equals(args[1]) && args.length == 3) {
                    int val;
                    if ("true".equals(args[2])) {
                        val = BatteryManager.BATTERY_PLUGGED_AC |
                                BatteryManager.BATTERY_PLUGGED_USB |
                                BatteryManager.BATTERY_PLUGGED_WIRELESS;
                    }
                    else if ("false".equals(args[2])) {
                        val = 0;
                    } else if ("usb".equals(args[2])) {
                        val = BatteryManager.BATTERY_PLUGGED_USB;
                    } else if ("ac".equals(args[2])) {
                        val = BatteryManager.BATTERY_PLUGGED_AC;
                    } else if ("wireless".equals(args[2])) {
                        val = BatteryManager.BATTERY_PLUGGED_WIRELESS;
                    } else {
                        break fail;
                    }
                    try {
                        if (val != 0) {
                            // if the request is not to set it to false, wake up the screen so that
                            // it can stay on as requested
                            pm.wakeUp(SystemClock.uptimeMillis());
                        }
                        pm.setStayOnSetting(val);
                    }
                    catch (RemoteException e) {
                        System.err.println("Faild to set setting: " + e);
                    }
                    return;
                } else if ("reboot".equals(args[1])) {
                    String mode = null;
                    if (args.length == 3) {
                        mode = args[2];
                    }
                    try {
                        // no confirm, wait till device is rebooted
                        pm.reboot(false, mode, true);
                    } catch (RemoteException e) {
                        System.err.println("Failed to reboot.");
                    }
                    return;
                } else if ("shutdown".equals(args[1])) {
                    try {
                        // no confirm, wait till device is off
                        pm.shutdown(false, true);
                    } catch (RemoteException e) {
                        System.err.println("Failed to shutdown.");
                    }
                    return;
                }
            }
        }
        System.err.println(longHelp());
    }
}*/
