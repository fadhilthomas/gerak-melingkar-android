package com.wibudev.gerakmelingkar.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.uncopt.android.widget.text.justify.JustifiedTextView;
import com.wibudev.gerakmelingkar.R;

public class PendahuluanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendahuluan);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/font.ttf");
        Typeface custom_font_bold = Typeface.createFromAsset(getAssets(),  "fonts/fontBold.ttf");
        JustifiedTextView tvJudul = findViewById(R.id.tvJudul);
        JustifiedTextView tvDaftar = findViewById(R.id.tvDaftar);
        JustifiedTextView tvDaftar2 = findViewById(R.id.tvDaftar2);
        JustifiedTextView tvDaftar3 = findViewById(R.id.tvDaftar3);
        JustifiedTextView tvDaftar4 = findViewById(R.id.tvDaftar4);
        JustifiedTextView tvDaftar5 = findViewById(R.id.tvDaftar5);
        JustifiedTextView tvDaftar6 = findViewById(R.id.tvDaftar6);
        tvJudul.setTypeface(custom_font_bold);
        tvDaftar2.setTypeface(custom_font);
        tvDaftar3.setTypeface(custom_font_bold);
        tvDaftar4.setTypeface(custom_font);
        tvDaftar5.setTypeface(custom_font_bold);
        tvDaftar6.setTypeface(custom_font);
        tvDaftar.setTypeface(custom_font_bold);
    }

    public void menuUtama(View view) {
        startActivity(new Intent(this, MenuActivity.class));
    }
}
