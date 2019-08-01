package com.example.premierleaguestats;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    public static final String INDEX = "0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.club_details);

        TextView clubName = findViewById(R.id.club_name_detail);
        TextView stdm = findViewById(R.id.stadium_detail);
        ImageView logo = findViewById(R.id.logo_detail);
        TextView website = findViewById(R.id.website);
        ImageView stdmImg = findViewById(R.id.img_stadium);
        LinearLayout color = findViewById(R.id.color_detail);


        String index = getIntent().getStringExtra(INDEX);

        clubName.setText(ClubData.data[Integer.parseInt(index)][0]);

        stdm.setText(ClubData.data[Integer.parseInt(index)][2]);
        website.setText(ClubData.data[Integer.parseInt(index)][4]);
        Glide.with(this).load(ClubData.data[Integer.parseInt(index)][3])
                .apply(new RequestOptions().override(80, 80))
                .into(logo);
        Glide.with(this).load(ClubData.data[Integer.parseInt(index)][5])
                .into(stdmImg);
        color.setBackgroundColor(Color.parseColor(ClubData.data[Integer.parseInt(index)][6]));

        //color.setBackgroundColor(Color.parseColor(ClubData.data[Integer.parseInt(index)][6]));

    }
}
