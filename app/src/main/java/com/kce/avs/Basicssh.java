package com.kce.avstools;

import android.annotation.SuppressLint;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.AsyncTask;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

import java.io.ByteArrayOutputStream;
import java.util.Properties;

public class Basicssh extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicssh);
        new AsyncTask<Integer, Void, Void>(){
            @SuppressLint("WrongThread")
            @Override
            protected Void doInBackground(Integer... params) {
                try {
                    executeRemoteCommand("root", "3355","37.120.153.138", 22);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }
        }.execute(1);

       // reportingwebview
        WebView avsweb = (WebView) findViewById(R.id.reportingwebview);
        //avsweb.loadUrl("http://smstoblockchain.com");

        avsweb.setWebViewClient(new WebViewClient());
        avsweb.loadUrl("https://avstool.com/reporting.php");

        Toast.makeText(Basicssh.this, "VPN switched off Sucessfully", Toast.LENGTH_LONG).show();
        executeSSHcommand();
        new AsyncTask<Integer, Void, String>(){
            @SuppressLint("WrongThread")
            @Override
            protected String doInBackground(Integer... params) {
                String resultssh = null;
                try {
                    executeSSHcommand();
                } catch (Exception e) {
                    e.printStackTrace();
                    resultssh = e.toString();
                }
                return resultssh;
            }
        }.execute(1);


    }
    public static String executeRemoteCommand(String username,String password,String hostname,int port)
            throws Exception {
        JSch jsch = new JSch();
        Session session = jsch.getSession(username, hostname, port);
        session.setPassword(password);

        // Avoid asking for key confirmation
        Properties prop = new Properties();
        prop.put("StrictHostKeyChecking", "no");
        session.setConfig(prop);

        session.connect();

        // SSH Channel
        ChannelExec channelssh = (ChannelExec)
                session.openChannel("exec");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        channelssh.setOutputStream(baos);

        // Execute command
        channelssh.setCommand("lsusb > /home/pi/test.txt");
        channelssh.connect();
        channelssh.disconnect();

        return baos.toString();
    }
    public void executeSSHcommand(){
        String user = "TECNO CamonCXAir";
        String password = "3355";
        String host = "10.127.24.25";
        int port=22;
        try{

            JSch jsch = new JSch();
            Session session = null;
            try {
                session = jsch.getSession(user, host, port);
            } catch (JSchException e) {
                e.printStackTrace();
            }
            session.setPassword(password);
            session.setConfig("StrictHostKeyChecking", "no");
            session.setTimeout(10000);
            session.connect();
            ChannelExec channel = (ChannelExec)session.openChannel("exec");
            channel.setCommand("ls -k");//kill -9 ,,,,, ls -al
            channel.connect();
            channel.disconnect();
            // show success in UI with a snackbar alternatively use a toast
            Snackbar.make(getCurrentFocus().findViewById(android.R.id.content),
                    "Success!", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();

        }
        catch(JSchException e){
            // show the error in the UI
          /*  Snackbar.make(getCurrentFocus().findViewById(android.R.id.content),
                    "Check WIFI or Server! Error : "+e.getMessage(),
                    Snackbar.LENGTH_LONG)
                    .setDuration(20000).setAction("Action", null).show();*/
        }

    }
}
