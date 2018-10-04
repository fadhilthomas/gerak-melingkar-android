package com.wibudev.gerakmelingkar.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.wibudev.gerakmelingkar.R;

public class VideoActivity extends AppCompatActivity {

    private VideoView vid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        vid = findViewById(R.id.videoView);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/font.ttf");
        Typeface custom_font_bold = Typeface.createFromAsset(getAssets(),  "fonts/fontBold.ttf");
        TextView tvJudul = findViewById(R.id.tvJudul);
        TextView tvVideo1 = findViewById(R.id.tvVideo1);
        TextView tvVideo2 = findViewById(R.id.tvVideo2);
        TextView tvPlay = findViewById(R.id.tvPlay1);
        TextView tvPlay2 = findViewById(R.id.tvPlay2);
        tvJudul.setTypeface(custom_font_bold);
        tvVideo1.setTypeface(custom_font);
        tvVideo2.setTypeface(custom_font);
        tvPlay.setTypeface(custom_font);
        tvPlay2.setTypeface(custom_font);
    }

    public void playVideo(View v) {
        MediaController m = new MediaController(this);
        vid.setMediaController(m);
        String path = "android.resource://com.wibudev.gerakmelingkar/"+R.raw.vid1;
        Uri u = Uri.parse(path);
        vid.setVideoURI(u);
        vid.start();
    }

    public void playVideo2(View v) {
        MediaController m = new MediaController(this);
        vid.setMediaController(m);
        String path = "android.resource://com.wibudev.gerakmelingkar/"+R.raw.vid2;
        Uri u = Uri.parse(path);
        vid.setVideoURI(u);
        vid.start();
    }

    public void menuUtama(View view) {
        startActivity(new Intent(this, MenuActivity.class));
    }

    public void video1(View view) {
        CardView btPlay1 = findViewById(R.id.btPlay1);
        CardView btPlay2 = findViewById(R.id.btPlay2);
        btPlay2.setVisibility(View.GONE);
        btPlay1.setVisibility(View.VISIBLE);
        MediaController m = new MediaController(this);
        vid.setMediaController(m);
        String path = "android.resource://com.wibudev.gerakmelingkar/"+R.raw.vid1;
        Uri u = Uri.parse(path);
        vid.setVideoURI(u);
        vid.start();
    }

    public void video2(View view) {
        CardView btPlay1 = findViewById(R.id.btPlay1);
        CardView btPlay2 = findViewById(R.id.btPlay2);
        btPlay2.setVisibility(View.VISIBLE);
        btPlay1.setVisibility(View.GONE);
        MediaController m = new MediaController(this);
        vid.setMediaController(m);
        String path = "android.resource://com.wibudev.gerakmelingkar/"+R.raw.vid2;
        Uri u = Uri.parse(path);
        vid.setVideoURI(u);
        vid.start();
    }
}
