package com.example.user.mykmutnb11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class SubjectTableActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_table);
        String url = "http://klogic.kmutnb.ac.th:8080/kris/tess/dataQuerySelector.jsp?query=studentTab";
        WebView wV = (WebView) findViewById(R.id.wVST);
        wV.getSettings().setJavaScriptEnabled(true);
        wV.loadUrl(url);
    }
}
