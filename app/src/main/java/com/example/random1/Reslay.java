package com.example.random1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class Reslay extends MainActivity {


    TextView cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8;
    TextView tt1,tt2,tt3,tt4,tt5,tt6,tt7,tt8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.res_lay);


        cad1 = findViewById(R.id.reste1);
        cad2 = findViewById(R.id.reste2);
        cad3 = findViewById(R.id.reste3);
        cad4 = findViewById(R.id.reste4);
        cad5 = findViewById(R.id.reste5);
        cad6 = findViewById(R.id.reste6);
        cad7 = findViewById(R.id.reste7);
        cad8 = findViewById(R.id.reste8);

        tt1 = findViewById(R.id.restext1);
        tt2 = findViewById(R.id.restext2);
        tt3 = findViewById(R.id.restext3);
        tt4 = findViewById(R.id.restext4);
        tt5 = findViewById(R.id.restext5);
        tt6 = findViewById(R.id.restext6);
        tt7 = findViewById(R.id.restext7);
        tt8 = findViewById(R.id.restext8);

        Intent intent = getIntent();
        String text1 = intent.getStringExtra("afq1");
        cad1.setText(text1);

        String text2 = intent.getStringExtra("afq2");
        cad2.setText(text2);

        String text3 = intent.getStringExtra("afq3");
        cad3.setText(text3);

        String text4 = intent.getStringExtra("afq4");
        cad4.setText(text4);

        String text5 = intent.getStringExtra("afq5");
        cad5.setText(text5);

        String text6 = intent.getStringExtra("afq6");
        cad6.setText(text6);

        String text7 = intent.getStringExtra("afq7");
        cad7.setText(text7);

        String text8 = intent.getStringExtra("afq8");
        cad8.setText(text8);


        String gg1 = intent.getStringExtra("pp1");
        tt1.setText(gg1);

        String gg2 = intent.getStringExtra("pp2");
        tt2.setText(gg2);

        String gg3 = intent.getStringExtra("pp3");
        tt3.setText(gg3);

        String gg4 = intent.getStringExtra("pp4");
        tt4.setText(gg4);

        String gg5 = intent.getStringExtra("pp5");
        tt5.setText(gg5);

        String gg6 = intent.getStringExtra("pp6");
        tt6.setText(gg6);

        String gg7 = intent.getStringExtra("pp7");
        tt7.setText(gg7);

        String gg8 = intent.getStringExtra("pp8");
        tt8.setText(gg8);


//        int cadtwo     = bundle.getInt("cad2");
//        cad2 = findViewById(R.id.reste2);
//        cad2.setText(cadtwo);
    }




}
