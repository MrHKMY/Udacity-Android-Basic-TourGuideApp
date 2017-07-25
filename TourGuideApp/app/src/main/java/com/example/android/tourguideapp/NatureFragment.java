package com.example.android.tourguideapp;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class NatureFragment extends Fragment {

    public NatureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.nature_1, R.string.nature_info1, R.drawable.ic_launcher));
        locations.add(new Location(R.string.nature_2, R.string.nature_info2, R.drawable.ic_launcher));
        locations.add(new Location(R.string.nature_3, R.string.nature_info3, R.drawable.ic_launcher));
        locations.add(new Location(R.string.nature_4, R.string.nature_info4, R.drawable.ic_launcher));
        locations.add(new Location(R.string.nature_5, R.string.nature_info5, R.drawable.ic_launcher));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_nature);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}