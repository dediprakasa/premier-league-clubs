package com.example.premierleaguestats;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    public static final String INDEX = "0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.club_details);

        TextView clubName = findViewById(R.id.club_name_detail);
        TextView manager = findViewById(R.id.manager);
        TextView stadium = findViewById(R.id.stadium_detail);
        TextView website = findViewById(R.id.website);

        String index = getIntent().getStringExtra(INDEX);

        clubName.setText(ClubData.data[Integer.parseInt(index)][0]);
    }
}
