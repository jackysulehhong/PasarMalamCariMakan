package com.example.pasarmalamcarimakan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pasarmalamcarimakan.Models.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignUp extends AppCompatActivity {
    EditText r_email, r_password;
    DatabaseReference reference;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        r_email = findViewById(R.id.email);
        r_password = findViewById(R.id.password);
        reference = FirebaseDatabase.getInstance().getReference().child("User");
        auth = FirebaseAuth.getInstance();

    }

    public void register(View v)
    {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.error);

        Toast.makeText(SignUp.this.getApplicationContext(), "Please wait a moment while we setup your account.", Toast.LENGTH_LONG).show();
      final  String email = r_email.getText().toString();
       final String password = r_password.getText().toString();

        User user = new User();
        user.setEmail(email);

        auth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            FirebaseUser firebaseUser = auth.getCurrentUser();
                            User User = new User(email, password, firebaseUser.getUid());
                            reference.child(firebaseUser.getUid()).setValue(User)
                                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task1) {
                                            if (task1.isSuccessful()) {
                                                SignUp.this.finish();
                                                Intent i = new Intent(SignUp.this, MainActivity.class);
                                                SignUp.this.startActivity(i);
                                                Toast.makeText(SignUp.this.getApplicationContext(), "user created successfully", Toast.LENGTH_LONG).show();
                                                finish();
                                            } else {
                                                mp.start();
                                                Toast.makeText(SignUp.this.getApplicationContext(), "user could not be registered", Toast.LENGTH_LONG).show();
                                            }
                                        }
                                    });
                        }
                    }
                });
    }

    public void gotologin(View view){
        Intent i= new Intent(SignUp.this,Login.class);
        startActivity(i);

    }
}
