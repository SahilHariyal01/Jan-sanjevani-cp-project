package com.example.jansanjivani;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Logins extends AppCompatActivity {

    private Button button ,button2 ,button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_logins);



        // Simple User  Lo Button

        button = (Button)findViewById(R.id.SimpleUserLogin) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensimpleuserLog() ;
            }
        });

        // Blood Bank Login Button

        button = (Button)findViewById(R.id.BloodBankLogin) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openBloodBankLogin() ;
            }
        });
        button = (Button)findViewById(R.id.gpsbutton) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opengpsactivity() ;
            }
        });

    }

    public  void opensimpleuserLog(){
        Intent intent = new Intent(this,SimplerUserclass.class);
        startActivity(intent);
    }

    public  void openBloodBankLogin(){
        Intent intent = new Intent(this,BloodBankclass.class);
        startActivity(intent);
    }
    public  void opengpsactivity(){
        Intent intent = new Intent(this,gpsactivity.class);
        startActivity(intent);
    }




}