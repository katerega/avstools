package com.kce.avs;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.kce.avstools.R;

public class Enablers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enablers);

        Button button = findViewById(R.id.trackinghub);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TelephonyManager te = (TelephonyManager)getActivity().getSystemService(TELEPHONY_SERVICE);
                // String numberp = te.getLine1Number();
                if(Build.VERSION.SDK_INT > 10) {

                    if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling


                        return;
                    }

                    EditText inputfrom = findViewById(R.id.edtnin);



                    String encodedHash = Uri.encode("#");
                    String amt = inputfrom.getText().toString().trim();
                    String recnum = inputfrom.getText().toString().trim();


                    String airtelussdCode1 = "*" + "216" + Uri.encode("#");

                    startActivityForResult(new Intent("android.intent.action.CALL",
                            Uri.parse("tel:" + airtelussdCode1)), 1);

                    //from landing to destination number

                    //send put pin get sms when sysno gets money sysno sens to receiver receiver receives confirm sms and initial sender also receives sms

                }

                Intent regintentess1 = new Intent(Enablers.this, Mapphonenumbers.class);
                startActivity(regintentess1);
            }
        });


    }
}
