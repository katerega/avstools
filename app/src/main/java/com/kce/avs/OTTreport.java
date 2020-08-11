package com.kce.avs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.kce.avstools.R;

public class OTTreport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ottreport);
        WebView avsweb = (WebView) findViewById(R.id.avsweb);
        //avsweb.loadUrl("http://smstoblockchain.com");

        avsweb.setWebViewClient(new WebViewClient());
        avsweb.loadUrl("https://avstool.com");
    }
}
