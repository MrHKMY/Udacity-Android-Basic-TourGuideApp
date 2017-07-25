package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ThemeparkFragment extends Fragment {

    public ThemeparkFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.theme_1, R.string.theme_info1, R.drawable.sunway));
        locations.add(new Location(R.string.theme_2, R.string.theme_info2, R.drawable.legoland4));
        locations.add(new Location(R.string.theme_3, R.string.theme_info3, R.drawable.aquaria));
        locations.add(new Location(R.string.theme_4, R.string.theme_info4, R.drawable.genting));
        locations.add(new Location(R.string.theme_5, R.string.theme_info5, R.drawable.lostworld));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_themepark);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}