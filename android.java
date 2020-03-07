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

public class android extends AppCompatActivity {
    int pos=0;
    int mscore=0;
    TextView t1,t2,t3;
    Button b3,b4,b5,b6;
    ArrayList<question> qui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);
        t1 = findViewById(R.id.textView4);
        t2 = findViewById(R.id.textView5);

        b3 = findViewById(R.id.push_button3);
        b4 = findViewById(R.id.push_button4);
        b5 = findViewById(R.id.push_button5);
        b6 = findViewById(R.id.push_button6);
        t3 = findViewById(R.id.score);

        qui = new ArrayList<>();
        setquestion();
        setdata();
        checkanswer();
    };
    private void checkanswer() {
        final String a,b,c,d;

        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if(b3.getText().toString().equalsIgnoreCase(qui.get(pos).getAnswer()))
                {

                    new SweetAlertDialog(android.this, SweetAlertDialog.SUCCESS_TYPE)
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
                    new SweetAlertDialog(android.this,ERROR_TYPE)
                            .setTitleText("WRONG Answer!")
                            .setContentText("Correct answer is "+qui.get(pos).getAnswer())
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

                if(b4.getText().toString().equalsIgnoreCase(qui.get(pos).getAnswer()))
                {

                    new SweetAlertDialog(android.this, SUCCESS_TYPE)
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
                    new SweetAlertDialog(android.this, ERROR_TYPE)
                            .setTitleText("WRONG Answer !")
                            .setContentText("Correct answer is "+qui.get(pos).getAnswer())
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
                if(b5.getText().toString().equalsIgnoreCase(qui.get(pos).getAnswer()))
                {

                    new SweetAlertDialog(android.this, SUCCESS_TYPE)
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
                    new SweetAlertDialog(android.this, ERROR_TYPE)
                            .setTitleText("WRONG Answer !")
                            .setContentText("Correct answer is " + (qui.get(pos).getAnswer()))
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
                if(b6.getText().toString().equalsIgnoreCase(qui.get(pos).getAnswer()))
                {

                    new SweetAlertDialog(android.this, SUCCESS_TYPE)
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
                    new SweetAlertDialog(android.this, ERROR_TYPE)
                            .setTitleText("WRONG Answer !")
                            .setContentText("Correct answer is "+qui.get(pos).getAnswer())
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
        qui.add(new question("Which one is not a nickname of a version of Andriod?","Muffin","cupcake","Gingerbread","Honeycomb","Muffin"));
        qui.add(new question("The ________ file specifies the layout of your screen.","Layout file ","Manifest file ","Strings XML","R file","Layout file "));
        qui.add(new question("The XML file that contains all the text that your application uses.","strings.xml ","stack.xml","text.xml","strings.xml ","string.java"));
        qui.add(new question("Android operating system is based on ?","Linux","MAC","Windows","Solaris","Linux"));
        qui.add(new question(" In android studio, callback that is called when activity interaction with user is started is","onResume","onStart","onStop","onResume","onDestroy"));
    }
    public  void setdata()
    {
        if(qui.size()>pos) {
            t2.setText(qui.get(pos).getQuestion());
            b3.setText(qui.get(pos).getOption1());
            b4.setText(qui.get(pos).getOption2());
            b5.setText(qui.get(pos).getOption3());
            b6.setText(qui.get(pos).getOption4());

            t1.setText("Question no." + (pos + 1));
            t3.setText("Score :" + (mscore));
        }
        else
        {
            new SweetAlertDialog(this)
                    .setTitleText("END OF QUIZ !")
                    .setContentText("Total correct :"+mscore +"\n Total incorrect "+(qui.size()-mscore))
                    .setConfirmText("Restart")
                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                        @Override
                        public void onClick(SweetAlertDialog sDialog) {
                            sDialog.dismissWithAnimation();
                            Intent intent=new Intent(android.this,topics_section.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .show();
        }
    }
}
