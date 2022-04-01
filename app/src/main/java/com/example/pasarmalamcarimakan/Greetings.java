package com.example.pasarmalamcarimakan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Greetings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greetings);



        Button button = findViewById(R.id.login);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.voice2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp.start();
                Intent i= new Intent(Greetings.this, Login.class);
                startActivity(i);
                finish();
            }
        });

        Button button2 = findViewById(R.id.sign);

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                mp.start();
                Intent i= new Intent(Greetings.this,SignUp.class);
                startActivity(i);
                finish();
            }
        });


    }

}

