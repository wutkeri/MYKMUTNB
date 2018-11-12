package com.example.user.mykmutnb11;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openProfile(View V){
        Intent itn = new Intent(this, ProfileActivity.class);
        startActivity(itn);
    }
    public void openCheckGrade(View V){
        Intent itn = new Intent(this, CheckGradeActivity.class);
        startActivity(itn);
    }
    public void openSubjectTable(View V){
        Intent itn = new Intent(this, SubjectTableActivity.class);
        startActivity(itn);
    }
    public void openTestTable(View V){
        Intent itn = new Intent(this, TestTableActivity.class);
        startActivity(itn);
    }
    public void openInfo(View V){
        Intent itn = new Intent(this, MyinfoActiviti.class);
        startActivity(itn);
    }
    public void openNews(View V){
        Intent itn = new Intent(this, NewsActivity.class);
        startActivity(itn);
    }

    public void openMaps(View V){
        Intent itn = new Intent(this, MapActivity.class);
        startActivity(itn);
    }

    public void openReport(View V){
        Intent itn = new Intent(this, ReportActivity.class);
        startActivity(itn);
    }

    public void openContact(View V){
        Intent itn = new Intent(this,ContactActivity.class);
        startActivity(itn);
    }



}