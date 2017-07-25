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

public class IslandsFragment extends Fragment {

    public IslandsFragment() {
    }

    Intent i;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.island_1, R.string.island_info1, R.drawable.tioman));
        locations.add(new Location(R.string.island_2, R.string.island_info2, R.drawable.langkawi));
        locations.add(new Location(R.string.island_3, R.string.island_info3, R.drawable.pangkor));
        locations.add(new Location(R.string.island_4, R.string.island_info4, R.drawable.kapas));
        locations.add(new Location(R.string.island_5, R.string.island_info5, R.drawable.redang));
        locations.add(new Location(R.string.island_6, R.string.island_info6, R.drawable.rawa));
        locations.add(new Location(R.string.island_7, R.string.island_info7, R.drawable.payar));

        // Create an {@link LocationAdapter}, whose data source is a list of {@link Details}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_islands);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link LocationAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Details} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                Location local = locations.get(position);

                switch (position) {
                    case 0:
                        i = new Intent(getActivity(), IslandInfo.class);
                        i.putExtra("x", "1");
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(getActivity(), IslandInfo.class);
                        i.putExtra("x", "2");
                        startActivity(i);
                        break;
                    case 2:
                        i = new Intent(getActivity(), IslandInfo.class);
                        i.putExtra("x", "3");
                        startActivity(i);
                        break;
                    case 3:
                        i = new Intent(getActivity(), IslandInfo.class);
                        i.putExtra("x", "4");
                        startActivity(i);
                        break;
                    case 4:
                        i = new Intent(getActivity(), IslandInfo.class);
                        i.putExtra("x", "5");
                        startActivity(i);
                        break;
                    case 5:
                        i = new Intent(getActivity(), IslandInfo.class);
                        i.putExtra("x", "6");
                        startActivity(i);
                        break;
                    case 6:
                        i = new Intent(getActivity(), IslandInfo.class);
                        i.putExtra("x", "7");
                        startActivity(i);
                        break;
                }

            }
        });

        return rootView;
    }
}
