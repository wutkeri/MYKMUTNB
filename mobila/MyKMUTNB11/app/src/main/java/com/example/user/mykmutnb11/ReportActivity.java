package com.example.user.mykmutnb11;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class ReportActivity extends AppCompatActivity {

    private ListView jsonListview ;
    private ArrayList<String> exData ;
    private ArrayList<String> exData2 ;
    private ProgressDialog progressDialog ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        jsonListview = (ListView)findViewById(R.id.json_listview);

        exData = new ArrayList<String>();
        exData2 = new ArrayList<String>();
//        exData.add("Test1");
//        exData.add("Test2");
//        exData.add("Test3");
//        exData.add("Test4");
//        exData.add("Test5");


        new AsyncTask<Void, Void, Void>() {

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                progressDialog = new ProgressDialog(ReportActivity.this);
                progressDialog.setCancelable(false);
                progressDialog.setMessage("Dowloading...");
                progressDialog.show();
            }

            @Override
            protected Void doInBackground(Void... params) {
                try {
                    URL url = new URL("http://kmutnbapp.atwebpages.com/report.php");
                    URLConnection urlConnection = url.openConnection();
                    HttpURLConnection httpURLConnection = (HttpURLConnection)urlConnection ;
                    httpURLConnection.setAllowUserInteraction(false);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.connect();

                    InputStream inputStream = null ;
                    if(httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK){
                        inputStream = httpURLConnection.getInputStream();
                        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream,"ISO-8859-1"),8);
                        StringBuilder stringBuilder = new StringBuilder();
                        String line = null ;
                        while((line = reader.readLine())!=null){
                            stringBuilder.append(line + "\n");

                        }

                        inputStream.close();
                        Log.i("JSON Result",stringBuilder.toString());


                        JSONObject jsonObject = new JSONObject(stringBuilder.toString());
                        JSONArray exArray = jsonObject.getJSONArray("showtime movie");

                        for(int i=0;i<exArray.length();i++){
                            JSONObject jsonObj = exArray.getJSONObject(i);
                            exData.add(jsonObj.getString("detail_report"));

                        }
                    }
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(ReportActivity.this,android.R.layout.simple_list_item_1,android.R.id.text1,exData);
                jsonListview.setAdapter(myAdapter);
                progressDialog.dismiss();
            }
        }.execute();



    }
}
