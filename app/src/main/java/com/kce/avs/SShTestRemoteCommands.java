package com.kce.avs;

import android.content.Intent;
import android.content.pm.PackageInstaller;
import android.net.VpnService;
import android.os.AsyncTask;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.app.Activity;
import chilkatsoft.*;
import chilkatsoft.CkCrypt2;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

import com.kce.avstools.R;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import org.apache.http.HttpEntity;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.ContentType;
//import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
//import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Random;

import static java.net.InetAddress.*;

public class SShTestRemoteCommands<ipaddress> extends AppCompatActivity {
    private static final String TAG = "Chilkat";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ssh_test_remote_commands);
        TextView tv1 = findViewById(R.id.textViewcon);
        TextView tv2 = findViewById(R.id.textView2offvpn);
        EditText edport = findViewById(R.id.edtport);
        String result1;
        Random random = new Random();
        int rand = 0;
        /*while (true){
            rand = random.nextInt(1000);
            int number=rand;
            result1 = String.valueOf(number);

            if(rand !=0) break;
        }*/
        rand = random.nextInt(1000);
        String portns = String.valueOf (rand);
        edport.setText(portns);
        TextView tv = new TextView(this);

        //  This example assumes Chilkat SSH/SFTP to have been previously unlocked.
        //  See Unlock SSH for sample code.
        Button vpshutfiletransfer1 = findViewById(R.id.vpshutfiletransfer1);
        vpshutfiletransfer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = VpnService.prepare(getApplicationContext());if (intent != null) {startActivityForResult(intent, 0);} else {onActivityResult(0, RESULT_OK, null);}

              //  PackageInstaller.Session sessionA = jsch.getSession("usernameA", "hostA");
// ...
               // sessionA.connect();

                int forwardedPort = 2222; // any port number which is not in use on the local machine
              //  sessionA.setPortForwardingL(forwardedPort, "hostB", 22);

              //  PackageInstaller.Session sessionB = jsch.getSession("usernameB", "localhost", forwardedPort);
// ...
             //   sessionB.connect();
                //ssh tannel connetion
               // new CkSshTunnel();

               // CkCrypt2 crypt = new CkCrypt2();

                // Display the version of the CkCrypt2 class
              //  tv.setText(crypt.version());

               // setContentView(tv);

                //connect tannel

               // void get_TunnelLog(CkString str);
               // String tunnelLog();
               // void put_TunnelLog(String newVal);
             //   boolean Connect("d", 22);

                //execute vpn off ssh commands






                tv1.setVisibility(View.VISIBLE);
                MyCountDown  timer = new MyCountDown(5000, 1000);



                Socket socket = new Socket();

                try {
                    Process process = Runtime.getRuntime().exec("arp -i en0 -a -n");
                    process.waitFor();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

                    while (reader.ready()) {
                        String ipaddre = reader.readLine();
                        ipaddre = ipaddre.substring(3, ipaddre.indexOf(')'));

                        try {
                            socket.connect(new InetSocketAddress(ipaddre, 1234), 1000);
                            System.out.println("Found socket!");
                        } catch (ConnectException | SocketTimeoutException ignored) {

                        }
                    }

                    if (socket == null) {
                        System.err.println("Could not find socket.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
               /* CkSsh ssh = new CkSsh();
                CkZip zip = new CkZip();
                System.out.println(zip.version());

                int port = 22;
                boolean success = ssh.Connect("10.127.24.25",port);
                if (success != true) {
                    Log.i(TAG, ssh.lastErrorText());
                    return;
                }

                //  Authenticate using login/password:
                success = ssh.AuthenticatePw("theSshLogin","theSshPassword");
                if (success != true) {
                    Log.i(TAG, ssh.lastErrorText());
                    return;
                }
                // Basicssh bch = new Basicssh();
                // bch.executeSSHcommand();

                //  Send some commands and get the output.
                String strOutput = ssh.quickCommand("ls -k","ansi");
                //ssh user@remotehost "ls -k"
                //ssh -fN -L 3306:localhost:3306 remotehost

               // Intent regintentesstb = new Intent(SShTestRemoteCommands.this, Basicssh.class);
               // startActivity(regintentesstb);

                if (ssh.get_LastMethodSuccess() != true) {
                    Log.i(TAG, ssh.lastErrorText());
                    tv2.setVisibility(View.VISIBLE);
                    tv1.setVisibility(View.INVISIBLE);
                    return;
                }

                Log.i(TAG, "---- df ----");
                Log.i(TAG, strOutput);

//                strOutput = ssh.quickCommand("echo hello world","ansi");
//                if (ssh.get_LastMethodSuccess() != true) {
//                    Log.i(TAG, ssh.lastErrorText());
//                    return;
//                }


                strOutput = ssh.quickCommand("date","ansi");
                if (ssh.get_LastMethodSuccess() != true) {
                    Log.i(TAG, ssh.lastErrorText());
                    return;
                }

                Log.i(TAG, "---- date ----");
                Log.i(TAG, strOutput);

               // static {
                    try {
                        System.load("/app/libs/libchilkat.so");
                        System.load("/app/libs/armeabi-v7a/libchilkat.so");
                        System.load("/app/libs/x86/libchilkat.so");
                        System.load("/app/libs/x86_64/libchilkat.so");
                        //export LD_LIBRARY_PATH=/home/joe/chilkatJava-9.1.1-x86_64-linux:$LD_LIBRARY_PATH
                        //setenv LD_LIBRARY_PATH "/home/joe/chilkatJava-9.1.1-x86_64-linux:$LD_LIBRARY_PATH"
                        //java -Djava.library.path=".:/home/joe/chilkatJava-9.1.1-x86_64-linux" TestApp

                    } catch (UnsatisfiedLinkError e) {
                        System.err.println("Native code library failed to load.\n" + e);
                        System.exit(1);
                    }*/
                // }

            }
        });



    }


    private class MyCountDown extends CountDownTimer
    {
        long duration, interval;
        public MyCountDown(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
            // TODO Auto-generated constructor stub
            start();
        }

        @Override
        public void onFinish() {
            TextView tv1 = findViewById(R.id.textViewcon);
            TextView tv2 = findViewById(R.id.textView2offvpn);
            tv1.setVisibility(View.INVISIBLE);
            tv2.setVisibility(View.VISIBLE);
        }

        @Override
        public void onTick(long duration) {
            // could set text for a timer here
        }
    }

    String ipaddress;
    class RetrieveFeedTask extends AsyncTask<String, Void, ipaddress> {
        @Override
        protected ipaddress doInBackground(String... strings) {
            InetAddress ip;
            String hostname;
            try {
                ip = getLocalHost();
                hostname = ip.getHostName();
                System.out.println(" IP address : " + ip);
                System.out.println(" Hostname : " + hostname);
                String ipname = ip+hostname;

                TextView tv3 = findViewById(R.id.hostnametd);
                tv3.setText(ipname);
            } catch (UnknownHostException e) {

                e.printStackTrace();
            }

            return null;
        }
    }

    static {
        // System.loadLibrary("libchilkat");

        // Note: If the incorrect library name is passed to System.loadLibrary,
        // then you will see the following error message at application startup:
        //"The application <your-application-name> has stopped unexpectedly. Please try again."

    }


}
