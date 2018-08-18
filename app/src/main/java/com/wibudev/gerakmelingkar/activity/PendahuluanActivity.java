package com.wibudev.gerakmelingkar.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.uncopt.android.widget.text.justify.JustifiedTextView;
import com.wibudev.gerakmelingkar.R;

public class PendahuluanActivity extends AppCompatActivity {

    private JustifiedTextView tvJudul;
    private JustifiedTextView tvDaftar;
    private JustifiedTextView tvDaftar2;
    private JustifiedTextView tvDaftar3;
    private JustifiedTextView tvDaftar4;
    private JustifiedTextView tvDaftar5;
    private JustifiedTextView tvDaftar6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendahuluan);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/font.ttf");
        Typeface custom_font_bold = Typeface.createFromAsset(getAssets(),  "fonts/fontBold.ttf");
        tvJudul = findViewById(R.id.tvJudul);
        tvDaftar = findViewById(R.id.tvDaftar);
        tvDaftar2 = findViewById(R.id.tvDaftar2);
        tvDaftar3 = findViewById(R.id.tvDaftar3);
        tvDaftar4 = findViewById(R.id.tvDaftar4);
        tvDaftar5 = findViewById(R.id.tvDaftar5);
        tvDaftar6 = findViewById(R.id.tvDaftar6);
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
