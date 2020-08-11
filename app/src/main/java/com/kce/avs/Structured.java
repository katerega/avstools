package com.kce.avs;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;


import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class Structured extends Service {

    @Override
    public IBinder onBind(Intent intent) {


      //  service call isms 5 s16 "PhoneNumber" i32 0 i32 0 s16 "BodyText";
        //service call <your_service_name> <number at which the function appears in your_service_name.aidl> <type of the argument like i32 or i64> <argument>

       // service sshd start;

       // adb kill-server
       // killall adb
       // ssh -L 5037:localhost:5037 remote-build-machine.hostname.com;
        // create a shh turnnel and replace localhost with the target IPaddress from interget scanned ips in our extracted database

       // $ ssh -NL 5556:localhost:5554 -L 5557:localhost:5555 $REMOTE_USER@$REMOTE_HOST

        //once connection establiehd open another terminal, write sket pipe, read socket to ip, scan ip for vpn traffic
       //         killall adb

                // terinate vpn connection via shh

        //get device name for future disconnetions
       // $ adb devices

                //Android ==REVERSESSHTUNNEL==> Desktop <==PORTFORWARD== Router with public IP

        //Android:3331 ==REVERSESSHTUNNEL==> Desktop:3331 <==PORTFORWARD== Router:3331 with public IP

        return null;

    }
}
