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
public class MainActivity extends AppCompatActivity  {


    Button butlock, butResult;
    int count1=0, count2=0, count3=0, count4=0, count5=0, count6=0, count7=0, count8=0;
    TextView cad1, cad2, cad3, cad4, cad5, cad6, cad7, cad8;
    TextView t1,t2,t3,t4,t5,t6,t7,t8;
    int[] array;
    Button push_button1, push_button2, push_button3, push_button4, push_button5, push_button6, push_button7, push_button8;
    EditText editText1, editText2, editText3, editText4, editText5, editText6, editText7, editText8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        butlock   = (Button) findViewById(R.id.lock);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);
        editText6 = (EditText) findViewById(R.id.editText6);
        editText7 = (EditText) findViewById(R.id.editText7);
        editText8 = (EditText) findViewById(R.id.editText8);

        push_button1 = (Button)findViewById(R.id.push_button1);
        push_button2 = (Button)findViewById(R.id.push_button2);
        push_button3 = (Button)findViewById(R.id.push_button3);
        push_button4 = (Button)findViewById(R.id.push_button4);
        push_button5 = (Button)findViewById(R.id.push_button5);
        push_button6 = (Button)findViewById(R.id.push_button6);
        push_button7 = (Button)findViewById(R.id.push_button7);
        push_button8 = (Button)findViewById(R.id.push_button8);

        butResult    = (Button)findViewById(R.id.results);

        cad1        = findViewById(R.id.reste1);
        cad2        = findViewById(R.id.reste2);
        cad3        = findViewById(R.id.reste3);
        cad4        = findViewById(R.id.reste4);
        cad5        = findViewById(R.id.reste5);
        cad6        = findViewById(R.id.reste6);
        cad7        = findViewById(R.id.reste7);
        cad8        = findViewById(R.id.reste8);

        t1 = findViewById(R.id.editText1);
        t2 = findViewById(R.id.editText2);
        t3 = findViewById(R.id.editText3);
        t4 = findViewById(R.id.editText4);
        t5 = findViewById(R.id.editText5);
        t6 = findViewById(R.id.editText6);
        t7 = findViewById(R.id.editText7);
        t8 = findViewById(R.id.editText8);

        butlock.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                editText1.setEnabled(false);
                editText2.setEnabled(false);
                editText3.setEnabled(false);
                editText4.setEnabled(false);
                editText5.setEnabled(false);
                editText6.setEnabled(false);
                editText7.setEnabled(false);
                editText8.setEnabled(false);
            }
        });



        push_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                push_button1.setBackgroundResource(R.drawable.button_clicked);
                push_button1.setEnabled(false);
                push_button2.setEnabled(false);
                push_button3.setEnabled(false);
                push_button4.setEnabled(false);
                push_button5.setEnabled(false);
                push_button6.setEnabled(false);
                push_button7.setEnabled(false);
                push_button8.setEnabled(false);
                count1++;
//                cad1.setText(count1);



                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        push_button1.setBackgroundResource(R.drawable.button_bg_round);
                        push_button1.setEnabled(true);
                        push_button2.setEnabled(true);
                        push_button3.setEnabled(true);
                        push_button4.setEnabled(true);
                        push_button5.setEnabled(true);
                        push_button6.setEnabled(true);
                        push_button7.setEnabled(true);
                        push_button8.setEnabled(true);
                    }
                },2000);
            }

            });
        push_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                push_button1.setEnabled(false);
                push_button2.setBackgroundResource(R.drawable.button_clicked);
                push_button2.setEnabled(false);
                push_button3.setEnabled(false);
                push_button4.setEnabled(false);
                push_button5.setEnabled(false);
                push_button6.setEnabled(false);
                push_button7.setEnabled(false);
                push_button8.setEnabled(false);
                count2++;
//                cad2.setText(count2);

                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        push_button2.setBackgroundResource(R.drawable.button_bg_round);
                        push_button2.setEnabled(true);
                        push_button1.setEnabled(true);
                        push_button3.setEnabled(true);
                        push_button4.setEnabled(true);
                        push_button5.setEnabled(true);
                        push_button6.setEnabled(true);
                        push_button7.setEnabled(true);
                        push_button8.setEnabled(true);
                    }
                },2000);
            }
        });

        push_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                push_button3.setBackgroundResource(R.drawable.button_clicked);
                push_button3.setEnabled(false);
                push_button2.setEnabled(false);
                push_button1.setEnabled(false);
                push_button4.setEnabled(false);
                push_button5.setEnabled(false);
                push_button6.setEnabled(false);
                push_button7.setEnabled(false);
                push_button8.setEnabled(false);
                count3++;
//                cad3.setText(count3);

                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        push_button3.setBackgroundResource(R.drawable.button_bg_round);
                        push_button3.setEnabled(true);
                        push_button2.setEnabled(true);
                        push_button1.setEnabled(true);
                        push_button4.setEnabled(true);
                        push_button5.setEnabled(true);
                        push_button6.setEnabled(true);
                        push_button7.setEnabled(true);
                        push_button8.setEnabled(true);
                    }
                },2000);
            }
        });

        push_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                push_button4.setBackgroundResource(R.drawable.button_clicked);
                push_button4.setEnabled(false);
                push_button2.setEnabled(false);
                push_button3.setEnabled(false);
                push_button1.setEnabled(false);
                push_button5.setEnabled(false);
                push_button6.setEnabled(false);
                push_button7.setEnabled(false);
                push_button8.setEnabled(false);
                count4++;
//                cad4.setText(count4);

                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        push_button4.setBackgroundResource(R.drawable.button_bg_round);
                        push_button4.setEnabled(true);
                        push_button2.setEnabled(true);
                        push_button3.setEnabled(true);
                        push_button1.setEnabled(true);
                        push_button5.setEnabled(true);
                        push_button6.setEnabled(true);
                        push_button7.setEnabled(true);
                        push_button8.setEnabled(true);
                    }
                },2000);
            }
        });

        push_button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                push_button5.setBackgroundResource(R.drawable.button_clicked);
                push_button5.setEnabled(false);
                push_button2.setEnabled(false);
                push_button3.setEnabled(false);
                push_button4.setEnabled(false);
                push_button1.setEnabled(false);
                push_button6.setEnabled(false);
                push_button7.setEnabled(false);
                push_button8.setEnabled(false);
                count5++;
//                cad5.setText(count5);

                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        push_button5.setBackgroundResource(R.drawable.button_bg_round);
                        push_button5.setEnabled(true);
                        push_button2.setEnabled(true);
                        push_button3.setEnabled(true);
                        push_button4.setEnabled(true);
                        push_button1.setEnabled(true);
                        push_button6.setEnabled(true);
                        push_button7.setEnabled(true);
                        push_button8.setEnabled(true);
                    }
                },2000);
            }
        });

        push_button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                push_button6.setBackgroundResource(R.drawable.button_clicked);
                push_button6.setEnabled(false);
                push_button2.setEnabled(false);
                push_button3.setEnabled(false);
                push_button4.setEnabled(false);
                push_button5.setEnabled(false);
                push_button1.setEnabled(false);
                push_button7.setEnabled(false);
                push_button8.setEnabled(false);
                count6++;
//                cad6.setText(count6);

                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        push_button6.setBackgroundResource(R.drawable.button_bg_round);
                        push_button6.setEnabled(true);
                        push_button2.setEnabled(true);
                        push_button3.setEnabled(true);
                        push_button4.setEnabled(true);
                        push_button5.setEnabled(true);
                        push_button1.setEnabled(true);
                        push_button7.setEnabled(true);
                        push_button8.setEnabled(true);
                    }
                },2000);
            }
        });

        push_button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                push_button7.setBackgroundResource(R.drawable.button_clicked);
                push_button7.setEnabled(false);
                push_button2.setEnabled(false);
                push_button3.setEnabled(false);
                push_button4.setEnabled(false);
                push_button5.setEnabled(false);
                push_button6.setEnabled(false);
                push_button1.setEnabled(false);
                push_button8.setEnabled(false);
                count7++;
//                cad7.setText(count7);


                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        push_button7.setBackgroundResource(R.drawable.button_bg_round);
                        push_button7.setEnabled(true);
                        push_button2.setEnabled(true);
                        push_button3.setEnabled(true);
                        push_button4.setEnabled(true);
                        push_button5.setEnabled(true);
                        push_button6.setEnabled(true);
                        push_button1.setEnabled(true);
                        push_button8.setEnabled(true);
                    }
                },2000);
            }
        });

        push_button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                push_button8.setBackgroundResource(R.drawable.button_clicked);
                push_button8.setEnabled(false);
                push_button2.setEnabled(false);
                push_button3.setEnabled(false);
                push_button4.setEnabled(false);
                push_button5.setEnabled(false);
                push_button6.setEnabled(false);
                push_button7.setEnabled(false);
                push_button1.setEnabled(false);
                count8++;
//                cad8.setText(count8);

                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        push_button8.setBackgroundResource(R.drawable.button_bg_round);
                        push_button8.setEnabled(true);
                        push_button2.setEnabled(true);
                        push_button3.setEnabled(true);
                        push_button4.setEnabled(true);
                        push_button5.setEnabled(true);
                        push_button6.setEnabled(true);
                        push_button7.setEnabled(true);
                        push_button1.setEnabled(true);
                    }
                },2000);
            }
        });



        butResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater li = LayoutInflater.from(MainActivity.this);
                View promptsView = li.inflate(R.layout.promp, null);

                AlertDialog.Builder alertDialougeBuilder = new AlertDialog.Builder(MainActivity.this);

                alertDialougeBuilder.setView(promptsView);


                final EditText abc = (EditText)promptsView.findViewById(R.id.resultpassword);

                alertDialougeBuilder.setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
//                        butResult.setText(userInput.getText());

                        String userpass = abc.getText().toString();
                        if(userpass.equals("9999")){
                            Intent intent = new Intent(MainActivity.this, Reslay.class);

                            String s1 = String.valueOf(count1);
                            intent.putExtra("afq1", s1);

                            String s2 = String.valueOf(count2);
                            intent.putExtra("afq2", s2);

                            String s3 = String.valueOf(count3);
                            intent.putExtra("afq3", s3);

                            String s4 = String.valueOf(count4);
                            intent.putExtra("afq4", s4);

                            String s5 = String.valueOf(count5);
                            intent.putExtra("afq5", s5);

                            String s6 = String.valueOf(count6);
                            intent.putExtra("afq6", s6);

                            String s7 = String.valueOf(count7);
                            intent.putExtra("afq7", s7);

                            String s8 = String.valueOf(count8);
                            intent.putExtra("afq8", s8);

                            String aa1 = t1.getText().toString();
                            intent.putExtra("pp1",aa1);

                            String aa2 = t2.getText().toString();
                            intent.putExtra("pp2",aa2);

                            String aa3 = t3.getText().toString();
                            intent.putExtra("pp3", aa3);

                            String aa4 = t4.getText().toString();
                            intent.putExtra("pp4",aa4);

                            String aa5 = t5.getText().toString();
                            intent.putExtra("pp5",aa5);

                            String aa6 = t6.getText().toString();
                            intent.putExtra("pp6", aa6);

                            String aa7 = t7.getText().toString();
                            intent.putExtra("pp7",aa7);

                            String aa8 = t8.getText().toString();
                            intent.putExtra("pp8",aa8);

                            startActivity(intent);


                        }

                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                AlertDialog alertDialog = alertDialougeBuilder.create();
                alertDialog.show();

            }
        });



    }

}
