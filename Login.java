package com.example.quizzapp1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {
    EditText em,pa;
    Button btn;
    ProgressDialog prop;
    FirebaseAuth mauth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        em=findViewById(R.id.em);
        pa=findViewById(R.id.pa);
        btn=findViewById(R.id.button);
        mauth=FirebaseAuth.getInstance();
        prop=new ProgressDialog(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ema=em.getEditableText().toString().trim();
                String passw=pa.getEditableText().toString().trim();
                if(!TextUtils.isEmpty(ema)||!TextUtils.isEmpty(passw))
                {
                    prop.setTitle("Logging IN");
                    prop.setMessage("Checking Your Credentials");
                    prop.setCanceledOnTouchOutside(false);
                    prop.show();
                    login(ema,passw);
                }

            }
        });
    }
    private void login(String ema,String passw)
    {
        mauth.signInWithEmailAndPassword(ema,passw).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {

                    Intent in=new Intent(Login.this,topics_section.class);
                    startActivity(in);
                    finish();
                }
                else
                {
                    Toast.makeText(Login.this, "ERROR OCCURED", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
