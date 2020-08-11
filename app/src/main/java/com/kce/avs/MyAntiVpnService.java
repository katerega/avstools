package com.kce.avstools;

import android.app.Service;
import android.content.Intent;
import android.net.VpnService;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.ParcelFileDescriptor;

import java.net.DatagramSocket;


public class MyAntiVpnService extends VpnService implements Handler.Callback {
    // Configure a new interface from our VpnService instance. This must be done
// from inside a VpnService.
//

    VpnService.Builder builder = new VpnService.Builder();
    public void avpnoff(){


        // Create a local TUN interface using predetermined addresses. In your app,
// you typically use values returned from the VPN gateway during handshaking.
        ParcelFileDescriptor localTunnel = builder
                .addAddress("10.3.57.248", 24)
                .addRoute("0.0.0.0", 0)
                .addDnsServer("192.168.1.1")
                .establish();
        //DatagramSocket.close();

    }



    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }

    @Override
    public boolean handleMessage(Message msg) {
        return false;
    }
}
