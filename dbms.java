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

public class dbms extends AppCompatActivity {
    TextView t1,t2,t3;

    int pos=0;
    int mscore=0;
    Button b3,b4,b5,b6;
    ArrayList<question> qu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbms);
        t1 = findViewById(R.id.textView4);
        t2 = findViewById(R.id.textView5);

        b3 = findViewById(R.id.push_button3);
        b4 = findViewById(R.id.push_button4);
        b5 = findViewById(R.id.push_button5);
        b6 = findViewById(R.id.push_button6);
        t3 = findViewById(R.id.score);

        qu = new ArrayList<>();
        setquestion();
        setdata();
        checkanswer();


    };
    private void checkanswer() {
        final String a,b,c,d;

        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if(b3.getText().toString().equalsIgnoreCase(qu.get(pos).getAnswer()))
                {

                    new SweetAlertDialog(dbms.this, SweetAlertDialog.SUCCESS_TYPE)
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
                    new SweetAlertDialog(dbms.this,ERROR_TYPE)
                            .setTitleText("WRONG Answer!")
                            .setContentText("Correct answer is "+qu.get(pos).getAnswer())
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

                if(b4.getText().toString().equalsIgnoreCase(qu.get(pos).getAnswer()))
                {

                    new SweetAlertDialog(dbms.this, SUCCESS_TYPE)
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
                    new SweetAlertDialog(dbms.this, ERROR_TYPE)
                            .setTitleText("WRONG Answer !")
                            .setContentText("Correct answer is "+qu.get(pos).getAnswer())
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
                if(b5.getText().toString().equalsIgnoreCase(qu.get(pos).getAnswer()))
                {

                    new SweetAlertDialog(dbms.this, SUCCESS_TYPE)
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
                    new SweetAlertDialog(dbms.this, ERROR_TYPE)
                            .setTitleText("WRONG Answer !")
                            .setContentText("Correct answer is " + (qu.get(pos).getAnswer()))
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
                if(b6.getText().toString().equalsIgnoreCase(qu.get(pos).getAnswer()))
                {

                    new SweetAlertDialog(dbms.this, SUCCESS_TYPE)
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
                    new SweetAlertDialog(dbms.this, ERROR_TYPE)
                            .setTitleText("WRONG Answer !")
                            .setContentText("Correct answer is "+qu.get(pos).getAnswer())
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
        qu.add(new question("A characteristic of an entity. ","Attribute","Relation","Attribute","Parameter","Constraint"));
        qu.add(new question("In the architecture of a database system external level is the","view level","physical level","logical level","conceptual level","view level"));
        qu.add(new question("In an E-R diagram attributes are represented by","ellipse","rectangle","ellipse","triangle","square"));
        qu.add(new question(" The method of access which uses key transformation is known as","hash","direct","hash","random","sequential"));
        qu.add(new question(" The statement in SQL which allows changing the definition of a table is","Alter","Alter","Update","Create","Select"));
    }
    public  void setdata()
    {
        if(qu.size()>pos) {
            t2.setText(qu.get(pos).getQuestion());
            b3.setText(qu.get(pos).getOption1());
            b4.setText(qu.get(pos).getOption2());
            b5.setText(qu.get(pos).getOption3());
            b6.setText(qu.get(pos).getOption4());

            t1.setText("Question no." + (pos + 1));
            t3.setText("Score :" + (mscore));
        }
        else
        {
            new SweetAlertDialog(this)
                    .setTitleText("END OF QUIZ !")
                    .setContentText("Total correct :"+mscore +"\n Total incorrect "+(qu.size()-mscore))
                    .setConfirmText("Restart")
                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                        @Override
                        public void onClick(SweetAlertDialog sDialog) {
                            sDialog.dismissWithAnimation();
                            Intent intent=new Intent(dbms.this,topics_section.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .show();
        }
    }
}


