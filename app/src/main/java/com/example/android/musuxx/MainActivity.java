package com.example.android.musuxx;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView play = (TextView) findViewById(R.id.play);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playIntent = new Intent(MainActivity.this, PlayActivity.class);
                startActivity(playIntent);
            }

        });


        TextView playlist = (TextView) findViewById(R.id.playlist);


        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent playlistIntent = new Intent(MainActivity.this, PlayListActivity.class);
                startActivity(playlistIntent);
            }

        });

        TextView favorites = (TextView) findViewById(R.id.favoriteslist);
        favorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent favoritesIntent = new Intent(MainActivity.this, FavoritesActivity.class);
                startActivity(favoritesIntent);
            }

        });
    }}