package com.example.pasarmalamcarimakan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class Login extends AppCompatActivity {
    EditText edEmail,edPassword;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edEmail=findViewById(R.id.email);
        edPassword=findViewById(R.id.password);
        auth= FirebaseAuth.getInstance();


    }


    public void login(View v){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.error);
        String email=edEmail.getText().toString();
        String password=edPassword.getText().toString();


        if(!email.equals("")&& !password.equals("")){

            auth.signInWithEmailAndPassword(email,password)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {

                                Intent i = new Intent(Login.this, MainActivity.class);

                                Login.this.startActivity(i);
                                finish();

                            } else {
                              mp.start();
                                Toast.makeText(Login.this, "User Could not be logged in", Toast.LENGTH_LONG).show();
                            }
                        }
                    });



        }


    }
    public void goToRegister(View v){
        Intent i= new Intent(Login.this,SignUp.class);
        startActivity(i);


    }
}
