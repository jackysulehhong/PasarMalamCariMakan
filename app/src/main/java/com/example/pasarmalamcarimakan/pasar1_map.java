package com.example.pasarmalamcarimakan;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.pasarmalamcarimakan.DirectionHelper.FetchURL;
import com.example.pasarmalamcarimakan.DirectionHelper.TaskLoadedCallback;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;
import java.util.List;

public class pasar1_map extends AppCompatActivity implements OnMapReadyCallback, TaskLoadedCallback {

    private DrawerLayout drawer;


    private GoogleMap mMap;
    private MarkerOptions place1,place2;
    Button getDirection;
    private Polyline currentPolyline;

    List<MarkerOptions> markerOptionList=new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasar1_map);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer=findViewById(R.id.drawer_layout);
        NavigationView navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()){
                    case R.id.home:
                        Intent i =new Intent(pasar1_map.this,MainActivity.class);
                        startActivity(i);
                        finish();
                        break;
                    case R.id.recommend:
                        Intent c =new Intent(pasar1_map.this,recommended.class);
                        startActivity(c);
                        break;
                    case R.id.about:
                        Intent d =new Intent(pasar1_map.this,About.class);
                        startActivity(d);
                        break;
                    case R.id.contact:
                        Intent e =new Intent(pasar1_map.this,Contact.class);
                        startActivity(e);
                        break;
                }

                return true;
            }
        });


        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawer,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        getDirection=findViewById(R.id.btnGetDirection);
        getDirection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new FetchURL(pasar1_map.this)
                        .execute(getUrl(place1.getPosition(),place2.getPosition(),"driving"),"driving" );
            }
        });

        place1=new MarkerOptions().position(new LatLng(3.074745,101.591287)).title("Location1");
        place2=new MarkerOptions().position(new LatLng(3.115251,101.586251)).title("Location2");

        markerOptionList.add(place1);
        markerOptionList.add(place2);

        MapFragment mapFragment=(MapFragment)getFragmentManager().findFragmentById(R.id.mapFragment);

        mapFragment.getMapAsync(this);

    }
    @Override
    public void onMapReady(GoogleMap googleMap){
        mMap=googleMap;
        mMap.addMarker(place1);
        mMap.addMarker(place2);

        showAllMarkers();
    }

    private void showAllMarkers() {
        LatLngBounds.Builder builder=new LatLngBounds.Builder();

        for(MarkerOptions m: markerOptionList){
            builder.include(m.getPosition());

        }
        LatLngBounds bounds=builder.build();

        int width=getResources().getDisplayMetrics().widthPixels;
        int height=getResources().getDisplayMetrics().heightPixels;
        int padding=(int)(width*0.30);

        CameraUpdate cu = CameraUpdateFactory.newLatLngBounds(bounds,width,height,padding);

        mMap.animateCamera(cu);

    }

    private String getUrl(LatLng origin, LatLng destination, String direcetionMode) {
        String str_origin="origin="+origin.latitude+","+origin.longitude;

        String str_dest="destination="+destination.latitude+","+destination.longitude;

        String mode="mode="+direcetionMode;

        String parameter=str_origin+"&"+str_dest+"&"+mode;

        String format="json";

        String url="https://maps.googleapis.com/maps/api/directions/"+format+"?"
                +parameter+"&key=AIzaSyDPKJF5K9sCe-w6hRBe_CQk_xLew9CjCpE";

        return url;
    }

    @Override
    public void onTaskDone(Object... values) {
        if(currentPolyline!=null)
            currentPolyline.remove();

        currentPolyline=mMap.addPolyline((PolylineOptions)values[0]);
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


