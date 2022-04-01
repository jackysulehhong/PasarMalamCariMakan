package com.example.pasarmalamcarimakan;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;


public class Contact extends AppCompatActivity {

    private DrawerLayout drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);



        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer=findViewById(R.id.drawer_layout);

        NavigationView navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.home:
                        Intent i =new Intent(Contact.this,MainActivity.class);
                        startActivity(i);
                        finish();
                        break;
                    case R.id.recommend:
                        Intent c =new Intent(Contact.this,recommended.class);
                        startActivity(c);
                        break;
                    case R.id.about:
                        Intent d =new Intent(Contact.this,About.class);
                        startActivity(d);
                        break;
                    case R.id.contact:
                        Intent e =new Intent(Contact.this,Contact.class);
                        startActivity(e);
                        break;
                }

                return true;
            }
        });


        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();



    }

    public void onBackPressed(){
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }
    }


    public void goToSubmit(View v) {



        AlertDialog.Builder builder1 = new AlertDialog.Builder(Contact.this);
        builder1.setMessage("Your Feedback/Problem has been received.\n\nPlease wait as our Customer Care takes care of your problem/question.");
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                         Intent i = new Intent(Contact.this, MainActivity.class);
                        startActivity(i);
                        finish();
                    }
                });



        AlertDialog alert11 = builder1.create();
        alert11.show();



    }


}

