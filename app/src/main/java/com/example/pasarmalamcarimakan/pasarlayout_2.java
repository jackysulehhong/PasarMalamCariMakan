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

public class pasarlayout_2 extends AppCompatActivity  {

    private DrawerLayout drawer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasarlayout_2);



        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        drawer=findViewById(R.id.drawer_layout);

        NavigationView navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.home:
                        Intent i =new Intent(pasarlayout_2.this,MainActivity.class);
                        startActivity(i);
                        finish();
                        break;
                    case R.id.recommend:
                        Intent c =new Intent(pasarlayout_2.this,recommended.class);
                        startActivity(c);
                        break;
                    case R.id.about:
                        Intent d =new Intent(pasarlayout_2.this,About.class);
                        startActivity(d);
                        break;
                    case R.id.contact:
                        Intent e =new Intent(pasarlayout_2.this,Contact.class);
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



    public void balik(View view){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bruh);
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.pasar_kai_4);
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.CustomAlertDialog));
        builder.setCancelable(true);
        builder.setView(image);
        builder.setTitle("Apam Balik China Edition");


        builder.setPositiveButton("View More Info",new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                mp.start();
                AlertDialog.Builder builder1 = new AlertDialog.Builder(pasarlayout_2.this);
                builder1.setTitle("Apam Balik Special Version");
                builder1.setMessage(R.string.Apam);
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


    public void cheechong_food(View view){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bruh);
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.pasar_kai_5);
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.CustomAlertDialog));
        builder.setCancelable(true);
        builder.setView(image);
        builder.setTitle("Chee chong Fang Food Sedap!");


        builder.setPositiveButton("View More Info",new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                mp.start();
                AlertDialog.Builder builder1 = new AlertDialog.Builder(pasarlayout_2.this);
                builder1.setTitle("Chee Chong Fang");
                builder1.setMessage(R.string.cheechong);
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

    public void snack(View view){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bruh);
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.pasar_kai_9);
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.CustomAlertDialog));
        builder.setCancelable(true);
        builder.setView(image);
        builder.setTitle("Tempat Jual Snek Sedap");


        builder.setPositiveButton("View More Info",new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                mp.start();
                AlertDialog.Builder builder1 = new AlertDialog.Builder(pasarlayout_2.this);
                builder1.setTitle("Snack Stall OUG");
                builder1.setMessage(R.string.snack_stuff);
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

    public void dimsum(View view){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bruh);
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.kai_1);
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.CustomAlertDialog));
        builder.setCancelable(true);
        builder.setView(image);
        builder.setTitle("Special Chinese Dimsum");


        builder.setPositiveButton("View More Info",new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                mp.start();
                AlertDialog.Builder builder1 = new AlertDialog.Builder(pasarlayout_2.this);
                builder1.setTitle("Alok Cheng Dimsum");
                builder1.setMessage(R.string.dim);
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

    public void stuff(View view){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bruh);
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.kai_2);
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.CustomAlertDialog));
        builder.setCancelable(true);
        builder.setView(image);
        builder.setTitle("Special Movie Stall !");


        builder.setPositiveButton("View More Info",new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                mp.start();
                AlertDialog.Builder builder1 = new AlertDialog.Builder(pasarlayout_2.this);
                builder1.setTitle("DVD/BLU-Ray Disc Stall");
                builder1.setMessage(R.string.stuff_cd);
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

    public void laksa(View view){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bruh);
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.kai_3);
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.CustomAlertDialog));
        builder.setCancelable(true);
        builder.setView(image);
        builder.setTitle("Chinese Style Laksa Sedap!");


        builder.setPositiveButton("View More Info",new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                mp.start();
                AlertDialog.Builder builder1 = new AlertDialog.Builder(pasarlayout_2.this);
                builder1.setTitle("Ah Leong Laksa Stall");
                builder1.setMessage(R.string.laksa_info);
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

    public void goreng(View view){
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.bruh);
        ImageView image = new ImageView(this);
        image.setImageResource(R.drawable.kai_4);
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(this, R.style.CustomAlertDialog));
        builder.setCancelable(true);
        builder.setView(image);
        builder.setTitle("Delicious & Fresh Goreng Goreng Food!");


        builder.setPositiveButton("View More Info",new DialogInterface.OnClickListener()
        {

            @Override
            public void onClick(DialogInterface dialog, int which)
            {
                mp.start();
                AlertDialog.Builder builder1 = new AlertDialog.Builder(pasarlayout_2.this);
                builder1.setTitle("Leng Hong Goreng Goreng");
                builder1.setMessage(R.string.pasar_goreng);
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

























