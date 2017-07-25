package com.example.android.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PlacesInfo extends AppCompatActivity {

    String web;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_layout);

        Intent i = getIntent();
        String point = i.getStringExtra("x");

        if (point.equals("1")) {
            TextView info = (TextView) findViewById(R.id.textViewInfo);
            TextView link = (TextView) findViewById(R.id.textViewLink);
            ImageView image = (ImageView) findViewById(R.id.imageView);
            info.setText(R.string.place_1);
            link.setText(R.string.place_info_detail);
            image.setImageResource(R.drawable.klcc);
            web = getString(R.string.web_petronas);

        } else if (point.equals("2")) {
            TextView info = (TextView) findViewById(R.id.textViewInfo);
            TextView link = (TextView) findViewById(R.id.textViewLink);
            ImageView image = (ImageView) findViewById(R.id.imageView);
            info.setText(R.string.place_2);
            link.setText(R.string.place_info2);
            image.setImageResource(R.drawable.kltower);
            web = getString(R.string.web_kl);

        } else if (point.equals("3")) {
            TextView info = (TextView) findViewById(R.id.textViewInfo);
            TextView link = (TextView) findViewById(R.id.textViewLink);
            ImageView image = (ImageView) findViewById(R.id.imageView);
            info.setText(R.string.place_3);
            link.setText(R.string.place_info3);
            image.setImageResource(R.drawable.afamosa2);
            web = getString(R.string.web_famosa);

        } else if (point.equals("4")) {
            TextView info = (TextView) findViewById(R.id.textViewInfo);
            TextView link = (TextView) findViewById(R.id.textViewLink);
            ImageView image = (ImageView) findViewById(R.id.imageView);
            info.setText(R.string.place_4);
            link.setText(R.string.place_info4);
            image.setImageResource(R.drawable.komtar);
            web = getString(R.string.web_thetop);

        } else if (point.equals("5")) {
            TextView info = (TextView) findViewById(R.id.textViewInfo);
            TextView link = (TextView) findViewById(R.id.textViewLink);
            ImageView image = (ImageView) findViewById(R.id.imageView);
            Button button = (Button) findViewById(R.id.buttonInfo);
            info.setText(R.string.place_5);
            link.setText(R.string.place_info5);
            image.setImageResource(R.drawable.star);
            web = getString(R.string.web_stadthuys);

        } else if (point.equals("6")) {
            TextView info = (TextView) findViewById(R.id.textViewInfo);
            TextView link = (TextView) findViewById(R.id.textViewLink);
            ImageView image = (ImageView) findViewById(R.id.imageView);
            Button button = (Button) findViewById(R.id.buttonInfo);
            info.setText(R.string.place_6);
            link.setText(R.string.place_info6);
            image.setImageResource(R.drawable.putra);
            web = getString(R.string.web_putra);

        } else {
            TextView info = (TextView) findViewById(R.id.textViewInfo);
            TextView link = (TextView) findViewById(R.id.textViewLink);
            ImageView image = (ImageView) findViewById(R.id.imageView);
            Button button = (Button) findViewById(R.id.buttonInfo);
            info.setText(R.string.place_7);
            link.setText(R.string.place_info7);
            image.setImageResource(R.drawable.batucaves);
            web = getString(R.string.web_caves);

        }
    }

    public void goToWeb(View view) {
        goToUrl(web);
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launcherBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launcherBrowser);
    }
}







