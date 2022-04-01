package com.example.pasarmalamcarimakan;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;

public class Pasar2_Main extends AppCompatActivity {
    private DrawerLayout drawer;
    private int[] mImage = new int[]{
            R.drawable.pasar_kai_4,R.drawable.pasar_kai_5,R.drawable.pasar_kai_6,R.drawable.pasar_kai_7,R.drawable.pasar_kai_8,R.drawable.pasar_kai_9
    };

    private String[] mImageTitle=new String[]{
        "OUG Pasar MaLam","OUG Pasar MaLam","OUG Pasar MaLam","OUG Pasar MaLam","OUG Pasar MaLam","OUG Pasar MaLam"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasar2__main);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer=findViewById(R.id.drawer_layout);

        NavigationView navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.home:
                        Intent i =new Intent(Pasar2_Main.this,MainActivity.class);
                        startActivity(i);
                        break;
                    case R.id.recommend:
                        Intent c =new Intent(Pasar2_Main.this,recommended.class);
                        startActivity(c);
                        break;
                    case R.id.about:
                        Intent d =new Intent(Pasar2_Main.this,About.class);
                        startActivity(d);
                        break;
                    case R.id.contact:
                        Intent e =new Intent(Pasar2_Main.this,Contact.class);
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

                    Intent i=new Intent(Pasar2_Main.this,Pasar1_Main.class);
                    startActivity(i);

                    Toast.makeText(Pasar2_Main.this,mImageTitle[position], Toast.LENGTH_SHORT).show();
                    finish();
                }
                if(mImageTitle[position]=="OUG Pasar MaLam"){

                    Intent i=new Intent(Pasar2_Main.this,Pasar2_Main.class);
                    startActivity(i);

                    Toast.makeText(Pasar2_Main.this,mImageTitle[position], Toast.LENGTH_SHORT).show();
                    finish();
                }
                else Toast.makeText(Pasar2_Main.this,mImageTitle[position], Toast.LENGTH_SHORT).show();
            }
        });
        Button button = findViewById(R.id.go_map2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i= new Intent(Pasar2_Main.this,pasar2_map.class);
                startActivity(i);
                finish();
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
    public void gotorecommend(View view)
    {
        Intent i=new Intent(Pasar2_Main.this,recommended.class);
        startActivity(i);
        Toast.makeText(Pasar2_Main.this,"Recommended Section", Toast.LENGTH_SHORT).show();

    }

    public void gotoLayout2(View view){
        Intent i=new Intent(Pasar2_Main.this,pasarlayout_2.class);
        startActivity(i);
        Toast.makeText(Pasar2_Main.this,"Pasar Malam OUG Layout", Toast.LENGTH_SHORT).show();
    }


}
