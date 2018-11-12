package com.example.user.mykmutnb11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class TestTableActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_table);
        String url = "http://www.scibase.kmutnb.ac.th/examroom/datatrain.html";
        WebView wV = (WebView) findViewById(R.id.wVTT);
        wV.getSettings().setJavaScriptEnabled(true);
        wV.loadUrl(url);
    }
}
