package com.example.user.mykmutnb11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MapActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);


        ImageButton imbB = (ImageButton) findViewById(R.id.imbBus);
        imbB.setOnClickListener(this);

        ImageButton imbF = (ImageButton) findViewById(R.id.imbFootball);
        imbF.setOnClickListener(this);

        ImageButton imbF2 = (ImageButton) findViewById(R.id.imbSport2);
        imbF2.setOnClickListener(this);

        ImageButton imbKFC = (ImageButton) findViewById(R.id.imbKFC);
        imbKFC.setOnClickListener(this);

        ImageButton imbSP = (ImageButton) findViewById(R.id.imbSP);
        imbSP.setOnClickListener(this);

        ImageButton imbPrint1 = (ImageButton) findViewById(R.id.imbPrint1);
        imbPrint1.setOnClickListener(this);

        ImageButton imbPrint2 = (ImageButton) findViewById(R.id.imbPrint2);
        imbPrint2.setOnClickListener(this);

        ImageButton imbPrint3 = (ImageButton) findViewById(R.id.imbPrint3);
        imbPrint3.setOnClickListener(this);

        ImageButton imbMinifood = (ImageButton) findViewById(R.id.imbMinifood);
        imbMinifood.setOnClickListener(this);

        ImageButton imbBook = (ImageButton) findViewById(R.id.imbBook);
        imbBook.setOnClickListener(this);

        ImageButton imbMinifood2 = (ImageButton) findViewById(R.id.imbMinifood2);
        imbMinifood2.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.imbBus):
                Toast.makeText(getApplication(), "ป้ายรถเมล์-รถตู้\nเดินทางไป นนทบุรี-กรุงเทพ", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.imbFootball):
                Toast.makeText(getApplication(), "สนามฟุตบอลหญ้าเทียม\nเปิดบริการ 9.00 - 21.00 น.", Toast.LENGTH_SHORT).show();
                break;


            case (R.id.imbKFC):
                Toast.makeText(getApplication(), "อาคาร 77 - ศูนย์อาหารKFC\nเปิดบริการ 9.00 - 17.00 น.", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.imbSP):
                Toast.makeText(getApplication(), "อาคาร 46 - ศูนย์อาหารสวนปาล์ม\nเปิดบริการ 9.00 - 17.00 น.", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.imbPrint1):
                Toast.makeText(getApplication(), "ร้านถ่ายเอกสาร\nเปิดบริการ 9.00 - 17.00 น.", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.imbMinifood):
                Toast.makeText(getApplication(), "โรงอาหาร-คณะวิทยาศาสตร์\nเปิดบริการ 9.00 - 17.00 น.", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.imbBook):
                Toast.makeText(getApplication(), "สำนักหอสมุดกลาง\nเปิดบริการ 9.00 - 21.00 น.", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.imbPrint2):
                Toast.makeText(getApplication(), "ร้านถ่ายเอกสาร\nเปิดบริการ 9.00 - 20.00 น.", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.imbPrint3):
                Toast.makeText(getApplication(), "ร้านถ่ายเอกสาร\nเปิดบริการ 9.00 - 20.00 น.", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.imbSport2):
                Toast.makeText(getApplication(), "ศูนย์พยาบาล\nเปิดบริการ 9.00 - 18.00 น.", Toast.LENGTH_SHORT).show();
                break;

            case (R.id.imbMinifood2):
                Toast.makeText(getApplication(), "ร้านขายอาหาร\nเปิดบริการ 9.00 - 18.00 น.", Toast.LENGTH_SHORT).show();
                break;
        }

    }

}
