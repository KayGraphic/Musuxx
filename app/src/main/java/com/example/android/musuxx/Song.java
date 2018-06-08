package com.example.android.musuxx;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Song {
    // Name of the Song
    private String mSongName;

    // Name of the Group
    private String mGroup;

    // Drawable resource ID
    private int mImageResourceId;

    /*
     * Create a new Song object.
     *
     * @param vName is the name of the Song
     * @param vGroup is the musical group responsible
     * @param image is drawable reference ID that corresponds to the song cover
     * */
    public Song(String vSongName, String vGroup, int imageResourceId)
    {
        mSongName = vSongName;
        mGroup = vGroup;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the Song
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the Group Responsible
     */
    public String getGroup() {
        return mGroup;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


    public static class SongAdapter extends ArrayAdapter<Song> {

        private static final String LOG_TAG = SongAdapter.class.getSimpleName();

        /**

         *Custom Constructor
         * @param context        The current context. Used to inflate the layout file.
         * @param songObjects A List of AndroidFlavor objects to display in a list
         */
        public SongAdapter(Activity context, ArrayList<Song> songObjects) {
            // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
            // the second argument is used when the ArrayAdapter is populating a single TextView.
            // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
            // going to use this second argument, so it can be any value. Here, we used 0.
            super(context, 0, songObjects);
        }

        /**
         * Provides a view for an AdapterView (ListView, GridView, etc.)
         *
         * @param position The position in the list of data that should be displayed in the
         *                 list item view.
         * @param convertView The recycled view to populate.
         * @param parent The parent ViewGroup that is used for inflation.
         * @return The View for the position in the AdapterView.
         */
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Check if the existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
            if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item, parent, false);
            }

            // Get the {@Song} object located at this position in the list
            Song currentSong = getItem(position);

            // Find the TextView in the list_item.xml layout with the ID version_name
            TextView nameTextView = (TextView) listItemView.findViewById(R.id.song_name);
            // Get the version name from the current AndroidFlavor object and
            // set this text on the name TextView
            nameTextView.setText(currentSong.getSongName());

            // Find the TextView in the list_item.xml layout with the ID version_number
            TextView numberTextView = (TextView) listItemView.findViewById(R.id.group_name);
            // Get the version number from the current AndroidFlavor object and
            // set this text on the number TextView
            numberTextView.setText(currentSong.getGroup());

            // Find the ImageView in the list_item.xml layout with the ID list_item_icon
            ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
            // Get the image resource ID from the current AndroidFlavor object and
            // set the image to iconView
            iconView.setImageResource(currentSong.getImageResourceId());

            // Return the whole list item layout (containing 2 TextViews and an ImageView)
            // so that it can be shown in the ListView
            return listItemView;
        }

    }
}
