package com.kce.avs;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.VpnService;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.crowdfire.cfalertdialog.CFAlertDialog;
import com.kce.avstools.MyAntiVpnService;
import com.kce.avstools.R;

import java.util.Random;

public class MainActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView ready = findViewById(R.id.ready);
        Button connecta = findViewById(R.id.connecta);
        connecta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //coount 10 seconds
                ready.setText("SuccessFully Connected to Server");
            }
        });


        Button vpshut1 = findViewById(R.id.vpshut);
        vpshut1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent regintentess1un = new Intent(MainActivity.this, UnStructured.class);
                startActivity(regintentess1un);
            }
        });

        Button button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String result1;
                Random random = new Random();
                int rand = 0;
                while (true){
                    rand = random.nextInt(5);
                    int number=rand;
                    result1 = String.valueOf(number);
                    if(rand !=0) break;
                }


                Intent intent = VpnService.prepare(getApplicationContext());if (intent != null) {startActivityForResult(intent, 0);} else {onActivityResult(0, RESULT_OK, null);}

                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(MainActivity.this);
                builder.setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT);
                builder.setTitle("VPN off Notification");
                builder.addButton(result1+" Numbers with VPN  disconnected", -1, -1, CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, new DialogInterface.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // callPhoneNumber();

                        //WebView webview2r = (WebView) findViewById(R.id.avsweb);
                        // webview2r.loadUrl("https://avstool.com/structuredandunstracturedapi.php");

                        Intent regintentess = new Intent(MainActivity.this, Structuredoff.class);
                        startActivity(regintentess);

                        dialog.dismiss();
                    }
                });

                builder.show();
            }
        });

        Button vpshutfiletransfer1 = findViewById(R.id.vpshutfiletransfer);
        vpshutfiletransfer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent regintentess1 = new Intent(MainActivity.this, SShTestRemoteCommands.class);
                startActivity(regintentess1);
            }
        });

        Button btnOTT1 = findViewById(R.id.btnOTT);
        btnOTT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent regintentess1 = new Intent(MainActivity.this, OTTreport.class);
                startActivity(regintentess1);
            }
        });


    }
}
