package com.kce.avs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.kce.avstools.R;

public class Structuredoff  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_structuredoff);

        // reportingwebview
        WebView avsweb = (WebView) findViewById(R.id.reportingwebviewq);
        //avsweb.loadUrl("http://smstoblockchain.com");

        avsweb.setWebViewClient(new WebViewClient());
        avsweb.loadUrl("https://avstool.com/structuredandunstracturedapi.php");
    }
}