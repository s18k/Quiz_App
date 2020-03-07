package com.example.quizzapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import cn.pedant.SweetAlert.SweetAlertDialog;

import static cn.pedant.SweetAlert.SweetAlertDialog.ERROR_TYPE;
import static cn.pedant.SweetAlert.SweetAlertDialog.SUCCESS_TYPE;

public class iot extends AppCompatActivity {
    TextView t1,t2,t3;

    int pos=0;
    int mscore=0;
    Button b3,b4,b5,b6;
    ArrayList<question> qz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iot);
        t1 = findViewById(R.id.textView4);
        t2 = findViewById(R.id.textView5);

        b3 = findViewById(R.id.push_button3);
        b4 = findViewById(R.id.push_button4);
        b5 = findViewById(R.id.push_button5);
        b6 = findViewById(R.id.push_button6);
        t3 = findViewById(R.id.score);

        qz = new ArrayList<>();
        setquestion();
        setdata();
        checkanswer();
    };
    private void checkanswer() {
        final String a,b,c,d;

        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if(b3.getText().toString().equalsIgnoreCase(qz.get(pos).getAnswer()))
                {

                    new SweetAlertDialog(iot.this, SweetAlertDialog.SUCCESS_TYPE)
                            .setTitleText("CORRECT Answer!")
                            .setContentText("Keep Going!")
                            .setConfirmText("OK")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {
                                    sDialog.dismissWithAnimation();
                                    mscore++;
                                    pos++;
                                    setdata();

                                }
                            })
                            .show();

                }
                else
                {
                    new SweetAlertDialog(iot.this,ERROR_TYPE)
                            .setTitleText("WRONG Answer!")
                            .setContentText("Correct answer is "+qz.get(pos).getAnswer())
                            .setConfirmText("OK")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {
                                    sDialog.dismissWithAnimation();
                                    pos++;
                                    setdata();

                                }
                            })
                            .show();
                }


            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(b4.getText().toString().equalsIgnoreCase(qz.get(pos).getAnswer()))
                {

                    new SweetAlertDialog(iot.this, SUCCESS_TYPE)
                            .setTitleText("CORRECT Answer !")
                            .setContentText("Keep Going !")
                            .setConfirmText("OK")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {
                                    sDialog.dismissWithAnimation();
                                    mscore++;
                                    pos++;
                                    setdata();


                                }
                            })
                            .show();


                }
                else
                {
                    new SweetAlertDialog(iot.this, ERROR_TYPE)
                            .setTitleText("WRONG Answer !")
                            .setContentText("Correct answer is "+qz.get(pos).getAnswer())
                            .setConfirmText("OK")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {
                                    sDialog.dismissWithAnimation();
                                    pos++;
                                    setdata();


                                }
                            })
                            .show();
                }


            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b5.getText().toString().equalsIgnoreCase(qz.get(pos).getAnswer()))
                {

                    new SweetAlertDialog(iot.this, SUCCESS_TYPE)
                            .setTitleText("CORRECT Answer !")
                            .setContentText("Keep Going !")
                            .setConfirmText("OK")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {
                                    sDialog.dismissWithAnimation();
                                    mscore++;
                                    pos++;
                                    setdata();

                                }
                            })
                            .show();

                }
                else {
                    new SweetAlertDialog(iot.this, ERROR_TYPE)
                            .setTitleText("WRONG Answer !")
                            .setContentText("Correct answer is " + (qz.get(pos).getAnswer()))
                            .setConfirmText("OK")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {
                                    sDialog.dismissWithAnimation();
                                    pos++;
                                    setdata();

                                }
                            })
                            .show();
                }

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b6.getText().toString().equalsIgnoreCase(qz.get(pos).getAnswer()))
                {

                    new SweetAlertDialog(iot.this, SUCCESS_TYPE)
                            .setTitleText("CORRECT Answer !")
                            .setContentText("Keep Going !")
                            .setConfirmText("OK")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {
                                    sDialog.dismissWithAnimation();
                                    mscore++;
                                    pos++;
                                    setdata();

                                }
                            })
                            .show();

                }
                else
                {
                    new SweetAlertDialog(iot.this, ERROR_TYPE)
                            .setTitleText("WRONG Answer !")
                            .setContentText("Correct answer is "+qz.get(pos).getAnswer())
                            .setConfirmText("OK")
                            .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                @Override
                                public void onClick(SweetAlertDialog sDialog) {
                                    sDialog.dismissWithAnimation();
                                    pos++;
                                    setdata();

                                }
                            })
                            .show();
                }


            }
        });


    }
    private void setquestion() {
        qz.add(new question("_________ allows us to control electronic components ","RETful API","RETful API","RESTful API","HTTP","MQTT"));
        qz.add(new question("MQTT is _________ protocol","view level","M2M","IoT","M2M and IoT","Machine Things"));
        qz.add(new question("Which protocol is lightweight?","MQTT","MQTT","HTTP","CoAp","SPI"));
        qz.add(new question("Which one is not an element of IoT","security","people","process","security","things"));
        qz.add(new question(" What does LTE stand for","Long Term Evolution","Long Term Errors","Long Term Evolution","Lengthy Terminal Estimation","Long Term Estimates"));
}
    public  void setdata()
    {
        if(qz.size()>pos) {
            t2.setText(qz.get(pos).getQuestion());
            b3.setText(qz.get(pos).getOption1());
            b4.setText(qz.get(pos).getOption2());
            b5.setText(qz.get(pos).getOption3());
            b6.setText(qz.get(pos).getOption4());

            t1.setText("Question no." + (pos + 1));
            t3.setText("Score :" + (mscore));
        }
        else
        {
            new SweetAlertDialog(this)
                    .setTitleText("END OF QUIZ !")
                    .setContentText("Total correct :"+mscore +"\n Total incorrect "+(qz.size()-mscore))
                    .setConfirmText("Restart")
                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                        @Override
                        public void onClick(SweetAlertDialog sDialog) {
                            sDialog.dismissWithAnimation();
                            Intent intent=new Intent(iot.this,topics_section.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .show();

        }
    }
}
