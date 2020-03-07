package com.example.quizzapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import cn.pedant.SweetAlert.SweetAlertDialog;

import static cn.pedant.SweetAlert.SweetAlertDialog.*;


public class quizpage extends AppCompatActivity {
    TextView t1,t2,t3;

    int pos=0;
    int mscore=0;
    Button b3,b4,b5,b6;
    ArrayList<question> questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizpage);
        t1 = findViewById(R.id.textView4);
        t2 = findViewById(R.id.textView5);

        b3 = findViewById(R.id.push_button3);
        b4 = findViewById(R.id.push_button4);
        b5 = findViewById(R.id.push_button5);
        b6 = findViewById(R.id.push_button6);
        t3 = findViewById(R.id.score);
        questions = new ArrayList<>();
        setquestion();
        setdata();
        checkanswer();

        };

    private void checkanswer() {
        final String a,b,c,d;

        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if(b3.getText().toString().equalsIgnoreCase(questions.get(pos).getAnswer()))
                {

                    new SweetAlertDialog(quizpage.this, SweetAlertDialog.SUCCESS_TYPE)
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
                    new SweetAlertDialog(quizpage.this,ERROR_TYPE)
                            .setTitleText("WRONG Answer!")
                            .setContentText("Correct answer is "+questions.get(pos).getAnswer())
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

                if(b4.getText().toString().equalsIgnoreCase(questions.get(pos).getAnswer()))
                {

                    new SweetAlertDialog(quizpage.this, SUCCESS_TYPE)
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
                    new SweetAlertDialog(quizpage.this, ERROR_TYPE)
                            .setTitleText("WRONG Answer !")
                            .setContentText("Correct answer is "+questions.get(pos).getAnswer())
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
                if(b5.getText().toString().equalsIgnoreCase(questions.get(pos).getAnswer()))
                {

                    new SweetAlertDialog(quizpage.this, SUCCESS_TYPE)
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
                    new SweetAlertDialog(quizpage.this, ERROR_TYPE)
                            .setTitleText("WRONG Answer !")
                            .setContentText("Correct answer is " + (questions.get(pos).getAnswer()))
                            .setConfirmText("OK")
                            .setConfirmClickListener(new OnSweetClickListener() {
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
                if(b6.getText().toString().equalsIgnoreCase(questions.get(pos).getAnswer()))
                {

                    new SweetAlertDialog(quizpage.this, SUCCESS_TYPE)
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
                    new SweetAlertDialog(quizpage.this, ERROR_TYPE)
                            .setTitleText("WRONG Answer !")
                            .setContentText("Correct answer is "+questions.get(pos).getAnswer())
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
    questions.add(new question("C++ was originally developed by; ","Bjame Stroustrup","Clocksin and Mellish","Donald E. Knuth","Sir Richard Hadlee","Bjame Stroustrup"));
        questions.add(new question("Which of the following is not a type of constructor?","Friend constructor","Copy constructor","Friend constructor","Default constructor","Parameterized constructor"));
        questions.add(new question("How many instances of an abstract class can be created?","0","1","5","13","0"));
        questions.add(new question("Which of the following approach is adapted by C++?","Bottom-up","Bottom-up","Top-down","Right-left","Left-right"));
        questions.add(new question("Which of the following concepts means wrapping up of data and functions together?","Encapsulation","Abstraction","Encapsulation","Inheritance","Polymorphism"));
    }
    public  void setdata() {
        if(questions.size()>pos){
            t2.setText(questions.get(pos).getQuestion());
            b3.setText(questions.get(pos).getOption1());
            b4.setText(questions.get(pos).getOption2());
            b5.setText(questions.get(pos).getOption3());
            b6.setText(questions.get(pos).getOption4());

            t1.setText("Question no." + (pos + 1));
            t3.setText("Score :" + (mscore));
        }
        else
        {
            new SweetAlertDialog(this)
                    .setTitleText("END OF QUIZ !")
                    .setContentText("Total correct :"+mscore +"\n Total incorrect "+(questions.size()-mscore))
                    .setConfirmText("Restart")
                    .setConfirmClickListener(new OnSweetClickListener() {
                        @Override
                        public void onClick(SweetAlertDialog sDialog) {
                            sDialog.dismissWithAnimation();
                            Intent intent=new Intent(quizpage.this,topics_section.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .show();
        }
    }
}

