package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    private int mColorId;

    public LocationAdapter(Context context, ArrayList<Location> locations, int colorId) {
        super(context, 0, locations);
        mColorId = colorId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView textViewTop = (TextView) listItemView.findViewById(R.id.textViewTop);
        textViewTop.setText(currentLocation.gettopText());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.textViewBelow);
        defaultTextView.setText(currentLocation.getbelowText());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentLocation.hasImage()) {
            imageView.setImageResource(currentLocation.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }

}
