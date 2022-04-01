package com.example.pasarmalamcarimakan;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;

public class recommended extends AppCompatActivity {

    private RecyclerView.LayoutManager layoutManager;
    private recycleradapter2 adapter;

    private RecyclerView recyclerView;
    private DrawerLayout drawer;
    private ArrayList<String> pasarname=new ArrayList<>();

    private int[] recommendimage ={

            R.drawable.chewytofu,R.drawable.dimsum,R.drawable.fishball,R.drawable.friedcarrot,R.drawable.homemade,R.drawable.meekari,R.drawable.nasi,R.drawable.rendang,R.drawable.tayaki
    };

    private int[] mImage = new int[]{

            R.drawable.pasar_adam_1,R.drawable.pasar_adam_2,R.drawable.pasar_adam_3,R.drawable.pasar_kai_1,R.drawable.pasar_kai_2,R.drawable.pasar_kai_3
    };

    private String[] mImageTitle=new String[]{
            "Pasar Lembah Subang","Pasar Lembah Subang","Pasar Lembah Subang","OUG Pasar MaLam","OUG Pasar MaLam","OUG Pasar MaLam"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommended);



        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer=findViewById(R.id.drawer_layout);

        NavigationView navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.home:
                        Intent i =new Intent(recommended.this,MainActivity.class);
                        startActivity(i);
                        finish();
                        break;
                    case R.id.recommend:
                        Intent c =new Intent(recommended.this,recommended.class);
                        startActivity(c);
                        break;
                    case R.id.about:
                        Intent d =new Intent(recommended.this,About.class);
                        startActivity(d);
                        break;
                    case R.id.contact:
                        Intent e =new Intent(recommended.this,Contact.class);
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

                    Intent i=new Intent(recommended.this,Pasar1_Main.class);
                    startActivity(i);

                    Toast.makeText(recommended.this,mImageTitle[position], Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(mImageTitle[position]=="OUG Pasar MaLam"){

                    Intent i=new Intent(recommended.this,Pasar2_Main.class);
                    startActivity(i);

                    Toast.makeText(recommended.this,mImageTitle[position], Toast.LENGTH_SHORT).show();
                    finish();
                }
                else Toast.makeText(recommended.this,mImageTitle[position], Toast.LENGTH_SHORT).show();
            }
        });

recyclerView=findViewById(R.id.recycler_view2);
        layoutManager=new GridLayoutManager(this,2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

adapter=new recycleradapter2(recommendimage);
recyclerView.setAdapter(adapter);

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
