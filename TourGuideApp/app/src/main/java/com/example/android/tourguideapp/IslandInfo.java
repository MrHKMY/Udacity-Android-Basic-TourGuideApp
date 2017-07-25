package com.example.android.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class IslandInfo extends AppCompatActivity {

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
            info.setText(R.string.island_1);
            link.setText(R.string.island_info1);
            image.setImageResource(R.drawable.tioman);
            web = getString(R.string.web_tioman);

        } else if (point.equals("2")) {
            TextView info = (TextView) findViewById(R.id.textViewInfo);
            TextView link = (TextView) findViewById(R.id.textViewLink);
            ImageView image = (ImageView) findViewById(R.id.imageView);
            info.setText(R.string.island_2);
            link.setText(R.string.island_info2);
            image.setImageResource(R.drawable.langkawi);
            web = getString(R.string.web_langkawi);

        } else if (point.equals("3")) {
            TextView info = (TextView) findViewById(R.id.textViewInfo);
            TextView link = (TextView) findViewById(R.id.textViewLink);
            ImageView image = (ImageView) findViewById(R.id.imageView);
            info.setText(R.string.island_3);
            link.setText(R.string.island_info3);
            image.setImageResource(R.drawable.pangkor);
            web = getString(R.string.web_pangkor);

        } else if (point.equals("4")) {
            TextView info = (TextView) findViewById(R.id.textViewInfo);
            TextView link = (TextView) findViewById(R.id.textViewLink);
            ImageView image = (ImageView) findViewById(R.id.imageView);
            info.setText(R.string.island_4);
            link.setText(R.string.island_info_detail);
            image.setImageResource(R.drawable.kapas);
            web = getString(R.string.web_kapas);

        } else if (point.equals("5")) {
            TextView info = (TextView) findViewById(R.id.textViewInfo);
            TextView link = (TextView) findViewById(R.id.textViewLink);
            ImageView image = (ImageView) findViewById(R.id.imageView);
            Button button = (Button) findViewById(R.id.buttonInfo);
            info.setText(R.string.island_5);
            link.setText(R.string.island_info5);
            image.setImageResource(R.drawable.redang);
            web = getString(R.string.web_redang);

        } else if (point.equals("6")) {
            TextView info = (TextView) findViewById(R.id.textViewInfo);
            TextView link = (TextView) findViewById(R.id.textViewLink);
            ImageView image = (ImageView) findViewById(R.id.imageView);
            Button button = (Button) findViewById(R.id.buttonInfo);
            info.setText(R.string.island_6);
            link.setText(R.string.island_info6);
            image.setImageResource(R.drawable.rawa);
            web = getString(R.string.web_rawa);
        }
        else {
            TextView info = (TextView) findViewById(R.id.textViewInfo);
            TextView link = (TextView) findViewById(R.id.textViewLink);
            ImageView image = (ImageView) findViewById(R.id.imageView);
            Button button = (Button) findViewById(R.id.buttonInfo);
            info.setText(R.string.island_7);
            link.setText(R.string.island_info7);
            image.setImageResource(R.drawable.rawa);
            web = getString(R.string.web_payar);
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







