package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * PlacesFragment Class.
 */
public class PlacesFragment extends Fragment {

    public PlacesFragment() {
        // Required empty public constructor
    }

    Intent i;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of content
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.place_1, R.string.place_info1, R.drawable.klcc));
        locations.add(new Location(R.string.place_2, R.string.place_info2, R.drawable.kltower));
        locations.add(new Location(R.string.place_3, R.string.place_info3, R.drawable.afamosa2));
        locations.add(new Location(R.string.place_4, R.string.place_info4, R.drawable.komtar));
        locations.add(new Location(R.string.place_5, R.string.place_info5, R.drawable.star));
        locations.add(new Location(R.string.place_6, R.string.place_info6, R.drawable.putra));
        locations.add(new Location(R.string.place_7, R.string.place_info7, R.drawable.batucaves));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                Location local = locations.get(position);

                switch (position) {
                    case 0:
                        i = new Intent(getActivity(), PlacesInfo.class);
                        i.putExtra("x", "1");
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(getActivity(), PlacesInfo.class);
                        i.putExtra("x", "2");
                        startActivity(i);
                        break;
                    case 2:
                        i = new Intent(getActivity(), PlacesInfo.class);
                        i.putExtra("x", "3");
                        startActivity(i);
                        break;
                    case 3:
                        i = new Intent(getActivity(), PlacesInfo.class);
                        i.putExtra("x", "4");
                        startActivity(i);
                        break;
                    case 4:
                        i = new Intent(getActivity(), PlacesInfo.class);
                        i.putExtra("x", "5");
                        startActivity(i);
                        break;
                    case 5:
                        i = new Intent(getActivity(), PlacesInfo.class);
                        i.putExtra("x", "6");
                        startActivity(i);
                        break;
                    case 6:
                        i = new Intent(getActivity(), PlacesInfo.class);
                        i.putExtra("x", "7");
                        startActivity(i);
                        break;
                }

            }
        });

        return rootView;
    }
}