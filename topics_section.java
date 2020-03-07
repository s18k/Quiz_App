package com.example.quizzapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class topics_section extends AppCompatActivity {
    Button b1,b2,b3,b4;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics_section);
        b1=findViewById(R.id.button4);
        b2=findViewById(R.id.button5);
        b3=findViewById(R.id.button6);
        b4=findViewById(R.id.button7);
        t1=findViewById(R.id.tv);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(topics_section.this,quizpage.class);
                startActivity(intent);
                finish();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(topics_section.this,dbms.class);
                startActivity(in);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte=new Intent(topics_section.this,android.class);
                startActivity(inte);
                finish();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bn=new Intent(topics_section.this,iot.class);
                startActivity(bn);
                finish();
            }
        });
    }
}
