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
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class signup extends AppCompatActivity {
    Button button;
    EditText e,p,u;
    ProgressDialog prop;
    FirebaseAuth mAuth;
    DatabaseReference mdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        button=findViewById(R.id.button);
        e=findViewById(R.id.editText2);
        u=findViewById(R.id.editText);
        p=findViewById(R.id.editText3);
        mAuth=FirebaseAuth.getInstance();
        String X=u.getText().toString();
        prop=new ProgressDialog(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uid = u.getEditableText().toString().trim();
                String ema = e.getEditableText().toString().trim();
                String passw = p.getEditableText().toString().trim();
                if (!TextUtils.isEmpty(uid)&& !TextUtils.isEmpty(ema) && !TextUtils.isEmpty(passw)) {
                    prop.setTitle("Registering User");
                    prop.setMessage("please wait while we create account");
                    prop.setCanceledOnTouchOutside(false);
                    prop.show();
                    reg(uid, ema, passw);
                }
                else {
                    Toast.makeText(signup.this,"Please fill All the details !",Toast.LENGTH_SHORT).show();
                }
            }

    });


        }
        private void reg(final String uid, final String email, final String password)
        {
            mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener( new OnCompleteListener<AuthResult>() {


                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        // Sign in success, update UI with the signed-in user's information
                        FirebaseUser cu=FirebaseAuth.getInstance().getCurrentUser();
                        String uida=cu.getUid();
                        mdata= FirebaseDatabase.getInstance().getReference().child("Users").child(uida);
                        HashMap<String,String> hashMap=new HashMap<>();
                        hashMap.put("uid",uid);
                        hashMap.put("Email",email);
                        hashMap.put("password",password);

                        mdata.setValue(hashMap).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {

                                if(task.isSuccessful())
                                {
                                    prop.dismiss();
                                    Toast.makeText(getApplicationContext(),"Registration Success !",Toast.LENGTH_SHORT).show();
                                    Intent in = new Intent(signup.this,MainActivity.class);
                                    in.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK |Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                    startActivity(in);
                                    finish();
                                }

                            }
                        });



                    } else {
                        // If sign in fails, display a message to the user.
                        prop.hide();
                        Toast.makeText(signup.this, "ERROR OCCURED", Toast.LENGTH_SHORT).show();
                    }

                    // ...
                }
            });
        }
        }

