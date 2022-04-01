package com.example.pasarmalamcarimakan;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class pasarlayout_1 extends AppCompatActivity {

    private DrawerLayout drawer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasarlayout_1);



        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        drawer=findViewById(R.id.drawer_layout);

        NavigationView navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.home:
                        Intent i =new Intent(pasarlayout_1.this,MainActivity.class);
                        startActivity(i);
                        finish();
                        break;
                    case R.id.recommend:
                        Intent c =new Intent(pasarlayout_1.this,recommended.class);
                        startActivity(c);
                        break;
                    case R.id.about:
                        Intent d =new Intent(pasarlayout_1.this,About.class);
                        startActivity(d);
                        break;
                    case R.id.contact:
                        Intent e =new Intent(pasarlayout_1.this,Contact.class);
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



public void mainstreet(View view){
    final MediaPlayer mp = MediaPlayer.create(this, R.raw.bruh);
    ImageView image = new ImageView(this);
    image.setImageResource(R.drawable.pasar_adam_1);
    AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.CustomAlertDialog));
    builder.setCancelable(true);
    builder.setView(image);
    builder.setTitle("Pasar Lembah Subang Main Street");


    builder.setPositiveButton("View More Info",new DialogInterface.OnClickListener()
    {

        @Override
        public void onClick(DialogInterface dialog, int which)
        {
            mp.start();
            AlertDialog.Builder builder1 = new AlertDialog.Builder(pasarlayout_1.this);
            builder1.setTitle("Pasar Lembah Subang");
            builder1.setMessage(R.string.pasar_mainstreet);
            builder1.setCancelable(true);

            builder1.setPositiveButton(
                    "Done",

                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.dismiss();
                        }
                    });






            AlertDialog alert11 = builder1.create();
            alert11.show();


        }
    });

    builder.setNegativeButton("Continue Looking",new DialogInterface.OnClickListener()
    {

        @Override
        public void onClick(DialogInterface dialog, int which)
        {
            dialog.dismiss();
        }
    });



    AlertDialog alert=builder.create();
    alert.show();
}


    public void madu(View view){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bruh);
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.pasar_adam_2);
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.CustomAlertDialog));
        builder.setCancelable(true);
        builder.setView(image);
        builder.setTitle("Ayam Madu Istimewa!");


        builder.setPositiveButton("View More Info",new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                mp.start();
                AlertDialog.Builder builder1 = new AlertDialog.Builder(pasarlayout_1.this);
                builder1.setTitle("Ayam Madu KALLOLO");
                builder1.setMessage(R.string.pasar_ayam);
                builder1.setCancelable(true);

                builder1.setPositiveButton(
                        "Done",

                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.dismiss();
                            }
                        });






                AlertDialog alert11 = builder1.create();
                alert11.show();


            }
        });

        builder.setNegativeButton("Continue Looking",new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                dialog.dismiss();
            }
        });



        AlertDialog alert=builder.create();
        alert.show();
    }

    public void samosa(View view){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bruh);
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.pasar_adam_3);
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.CustomAlertDialog));
        builder.setCancelable(true);
        builder.setView(image);
        builder.setTitle("Samosa Malay Style Special");


        builder.setPositiveButton("View More Info",new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                mp.start();
                AlertDialog.Builder builder1 = new AlertDialog.Builder(pasarlayout_1.this);
                builder1.setTitle("Samosa Mak Cik Hong");
                builder1.setMessage(R.string.pasar_samosa);
                builder1.setCancelable(true);

                builder1.setPositiveButton(
                        "Done",

                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.dismiss();
                            }
                        });






                AlertDialog alert11 = builder1.create();
                alert11.show();


            }
        });

        builder.setNeutralButton("Continue Looking",new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                dialog.dismiss();
            }
        });



        AlertDialog alert=builder.create();
        alert.show();
    }

    public void drink(View view){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bruh);
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.pasar_adam_4);
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.CustomAlertDialog));
        builder.setCancelable(true);
        builder.setView(image);
        builder.setTitle("Refreshing Drinks!");


        builder.setPositiveButton("View More Info",new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                mp.start();
                AlertDialog.Builder builder1 = new AlertDialog.Builder(pasarlayout_1.this);
                builder1.setTitle("Alynn Juicy Drink Stand");
                builder1.setMessage(R.string.pasar_drink);
                builder1.setCancelable(true);

                builder1.setPositiveButton(
                        "Done",

                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.dismiss();
                            }
                        });






                AlertDialog alert11 = builder1.create();
                alert11.show();


            }
        });

        builder.setNeutralButton("Continue Looking",new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                dialog.dismiss();
            }
        });



        AlertDialog alert=builder.create();
        alert.show();
    }

    public void roti(View view){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bruh);
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.pasar_adam_6);
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.CustomAlertDialog));
        builder.setCancelable(true);
        builder.setView(image);
        builder.setTitle("Good-Looking Well Made and Tasty Roti!");


        builder.setPositiveButton("View More Info",new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                mp.start();
                AlertDialog.Builder builder1 = new AlertDialog.Builder(pasarlayout_1.this);
                builder1.setTitle("Aisyadina Station");
                builder1.setMessage(R.string.pasar_roti);
                builder1.setCancelable(true);

                builder1.setPositiveButton(
                        "Done",

                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.dismiss();
                            }
                        });






                AlertDialog alert11 = builder1.create();
                alert11.show();


            }
        });

        builder.setNeutralButton("Continue Looking",new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                dialog.dismiss();
            }
        });



        AlertDialog alert=builder.create();
        alert.show();
    }

    public void putu(View view){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bruh);
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.pasar_adam_7);
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.CustomAlertDialog));
        builder.setCancelable(true);
        builder.setView(image);
        builder.setTitle("Fresh Putu Bambu made by a Malay");


        builder.setPositiveButton("View More Info",new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                mp.start();
                AlertDialog.Builder builder1 = new AlertDialog.Builder(pasarlayout_1.this);
                builder1.setTitle("Home-Made Putu Bambu");
                builder1.setMessage(R.string.pasar_putu);
                builder1.setCancelable(true);

                builder1.setPositiveButton(
                        "Done",

                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.dismiss();
                            }
                        });






                AlertDialog alert11 = builder1.create();
                alert11.show();


            }
        });

        builder.setNeutralButton("Continue Looking",new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                dialog.dismiss();
            }
        });



        AlertDialog alert=builder.create();
        alert.show();
    }

    public void bakar(View view){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bruh);
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.pasar_adam_8);
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.CustomAlertDialog));
        builder.setCancelable(true);
        builder.setView(image);
        builder.setTitle("Bakar Food that is wrapped in tinfoil to encase the Aroma of the food!");


        builder.setPositiveButton("View More Info",new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                mp.start();
                AlertDialog.Builder builder1 = new AlertDialog.Builder(pasarlayout_1.this);
                builder1.setTitle("Bakar Bakar Tapi Tak Mahal");
                builder1.setMessage(R.string.pasar_bakar);
                builder1.setCancelable(true);

                builder1.setPositiveButton(
                        "Done",

                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.dismiss();
                            }
                        });






                AlertDialog alert11 = builder1.create();
                alert11.show();


            }
        });

        builder.setNeutralButton("Continue Looking",new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                dialog.dismiss();
            }
        });



        AlertDialog alert=builder.create();
        alert.show();
    }






    public void onBackPressed(){
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }
    }
}
























