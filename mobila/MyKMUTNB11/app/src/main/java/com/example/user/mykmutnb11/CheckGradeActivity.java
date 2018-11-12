package com.example.user.mykmutnb11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class CheckGradeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_grade);
        String url = "http://grade-report.icit.kmutnb.ac.th/";
        WebView wV = (WebView)findViewById(R.id.wVCG);
        wV.getSettings().setJavaScriptEnabled(true);
        wV.loadUrl(url);
    }
}
