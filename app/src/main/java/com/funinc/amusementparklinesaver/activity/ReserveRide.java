package com.funinc.amusementparklinesaver.activity;

import android.os.Bundle;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.funinc.amusementparklinesaver.R;

public class ReserveRide extends AppCompatActivity {

    // calls the activities layout where a user can select a ride
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve_ride);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    // chooses the appropriate ride reservation form once one has been selected
    public void reserverollercoaster(View view){
        Intent reserveCoaster = new Intent(this, ReservePage.class);
        startActivity(reserveCoaster);
    }
    public void reservecarousel(View view){
        Intent reserveCarousel = new Intent(this, ReservePage2.class);
        startActivity(reserveCarousel);
    }

}
