package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import static com.example.android.tourguideapp.R.string.category_1;
import static com.example.android.tourguideapp.R.string.category_2;
import static com.example.android.tourguideapp.R.string.category_3;
import static com.example.android.tourguideapp.R.string.category_4;

public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PlacesFragment();
        } else if (position == 1) {
            return new IslandsFragment();
        } else if (position == 2) {
            return new ThemeparkFragment();
        } else {
            return new NatureFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(category_1);
        } else if (position == 1) {
            return mContext.getString(category_2);
        } else if (position == 2) {
            return mContext.getString(category_3);
        } else {
            return mContext.getString(category_4);
        }
    }
}