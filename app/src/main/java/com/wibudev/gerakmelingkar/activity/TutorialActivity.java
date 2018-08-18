package com.wibudev.gerakmelingkar.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.uncopt.android.widget.text.justify.JustifiedTextView;
import com.wibudev.gerakmelingkar.R;

public class TutorialActivity extends AppCompatActivity {

    private JustifiedTextView tvTutorial;
    private JustifiedTextView tvDaftar;
    private JustifiedTextView tvDaftar2;
    private JustifiedTextView tvDaftar3;
    private JustifiedTextView tvDaftar4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/font.ttf");
        Typeface custom_font_bold = Typeface.createFromAsset(getAssets(),  "fonts/fontBold.ttf");
        tvTutorial= findViewById(R.id.tvDaftarPustaka);
        tvDaftar = findViewById(R.id.tvDaftar);
        tvDaftar2 = findViewById(R.id.tvDaftar2);
        tvDaftar3 = findViewById(R.id.tvDaftar3);
        tvDaftar4 = findViewById(R.id.tvDaftar4);
        tvTutorial.setTypeface(custom_font_bold);
        tvDaftar2.setTypeface(custom_font);
        tvDaftar3.setTypeface(custom_font);
        tvDaftar4.setTypeface(custom_font);
        tvDaftar.setTypeface(custom_font);
    }

    public void menuUtama(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
