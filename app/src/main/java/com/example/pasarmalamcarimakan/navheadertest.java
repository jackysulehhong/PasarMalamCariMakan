package com.example.pasarmalamcarimakan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class navheadertest extends AppCompatActivity {
    FirebaseAuth auth;
    FirebaseUser firebaseUser;
    DatabaseReference reference;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nav_header);
        FirebaseUser user=FirebaseAuth.getInstance().getCurrentUser();
        String userid=user.getUid();
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("user");
        reference.child(userid);
        TextView textView1;

        textView1  = (TextView)findViewById(R.id.UserName);
        ((TextView) textView1).setText(userid);


    }
}
