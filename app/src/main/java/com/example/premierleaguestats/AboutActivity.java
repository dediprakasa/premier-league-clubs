package com.example.premierleaguestats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class AboutActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView name, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_activity);

        imageView = findViewById(R.id.profile_photo);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);

        name.setText(getString(R.string.my_name));
        email.setText(getString(R.string.my_email));

    }
}
