package com.example.android.musuxx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PlayListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);

        // Create an ArrayList of Song objects
        ArrayList<Song> songObjects = new ArrayList<Song>();
        //Band Names Generated with this: www.bandnamemaker.com

        songObjects.add(new Song("Getaway Troupe","Calm Behind Mustang", R.drawable.photo1));
        songObjects.add(new Song("Beside Canada", "Mumble Of Galore", R.drawable.photo2));
        songObjects.add(new Song("Blazer Elevation","Hippie Below Waiter", R.drawable.photo3));
        songObjects.add(new Song("Armed Stirrup","Unique Of The Buggy", R.drawable.photo4));
        songObjects.add(new Song("Delayed Flesh","Gap Near Mansion", R.drawable.photo5));
        songObjects.add(new Song("Homely Tiffany","Broom Of Exploitation", R.drawable.photo6));
        songObjects.add(new Song("Pragmatic Closing","Reject Of Basement", R.drawable.photo7));
        songObjects.add(new Song("Into Rumor","Non-skid Alfalfa", R.drawable.photo8));
        songObjects.add(new Song("Provided Betrayal","Stench Of Titanium", R.drawable.photo9));
        songObjects.add(new Song("Weakness Debate","Santa Fe Matrimony", R.drawable.photo10));


        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songObjects);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_song);
        listView.setAdapter(songAdapter);
    }
}
