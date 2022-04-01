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
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    FirebaseAuth auth;
    FirebaseUser firebaseUser;


    private DrawerLayout drawer;
private int[] mImage = new int[]{

        R.drawable.pasar_adam_1,R.drawable.pasar_adam_2,R.drawable.pasar_adam_3,R.drawable.pasar_kai_1,R.drawable.pasar_kai_2,R.drawable.pasar_kai_3
};

private String[] mImageTitle=new String[]{
        "Pasar Lembah Subang","Pasar Lembah Subang","Pasar Lembah Subang","OUG Pasar MaLam","OUG Pasar MaLam","OUG Pasar MaLam"
    };
private ArrayList<String> pasarname=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        startRecycler();

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer=findViewById(R.id.drawer_layout);

NavigationView navigationView=findViewById(R.id.nav_view);
navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch(menuItem.getItemId()){
            case R.id.home:
                Intent i =new Intent(MainActivity.this,MainActivity.class);
                startActivity(i);
                finish();
        break;
            case R.id.recommend:
                Intent c =new Intent(MainActivity.this,recommended.class);
                startActivity(c);
                break;
            case R.id.about:
                Intent d =new Intent(MainActivity.this,About.class);
                startActivity(d);
                break;
            case R.id.contact:
                Intent e =new Intent(MainActivity.this,Contact.class);
                startActivity(e);
                break;
        }

        return true;
    }
});


        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        CarouselView carouselView = findViewById(R.id.carousel);
carouselView.setPageCount(mImage.length);
carouselView.setImageListener(new ImageListener() {
    @Override
    public void setImageForPosition(int position, ImageView imageView) {
imageView.setImageResource(mImage[position]);
    }
});
carouselView.setImageClickListener(new ImageClickListener() {
    @Override
    public void onClick(int position) {
        if(mImageTitle[position]=="Pasar Lembah Subang"){

            Intent i=new Intent(MainActivity.this,Pasar1_Main.class);
            startActivity(i);

            Toast.makeText(MainActivity.this,mImageTitle[position], Toast.LENGTH_SHORT).show();
            finish();
        }
        if(mImageTitle[position]=="OUG Pasar MaLam"){

            Intent i=new Intent(MainActivity.this,Pasar2_Main.class);
            startActivity(i);

            Toast.makeText(MainActivity.this,mImageTitle[position], Toast.LENGTH_SHORT).show();
            finish();
        }
        else Toast.makeText(MainActivity.this,mImageTitle[position], Toast.LENGTH_SHORT).show();

    }
});


    }


    public void onBackPressed(){
        if (drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }
    }
    private void startRecycler(){
        pasarname.add("Pasar Lembah Subang");
        pasarname.add("Pasar Malam OUG");
        pasarname.add("Pasar 3 Exmple");
        pasarname.add("Pasar 4 Exmple");


        initRecyclerView();
    }
    private void initRecyclerView(){
        RecyclerView recyclerview = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(pasarname,this);
        recyclerview.setAdapter(adapter);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.voice1);
        AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
        builder1.setMessage("Are you sure you want to logout?");
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                            Intent i=new Intent(MainActivity.this,Greetings.class);
                        Toast.makeText(MainActivity.this, "Thank you for using our Service!", Toast.LENGTH_SHORT).show();
                            startActivity(i);
                        mp.start();
                           finish();

                        if(firebaseUser!=null){

                            auth.signOut();


                            startActivity(i);
                            finish();

                        }


                    }
                });

        builder1.setNegativeButton(
                        "No",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent i = new Intent(MainActivity.this, MainActivity.class);
                                startActivity(i);
                                finish();
                            }
                        }
                );



        AlertDialog alert11 = builder1.create();
        alert11.show();
        return super.onOptionsItemSelected(item);
    }


}
