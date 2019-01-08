package com.wibudev.gerakmelingkar.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.uncopt.android.widget.text.justify.JustifiedTextView;
import com.wibudev.gerakmelingkar.R;

public class TutorialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/font.ttf");
        Typeface custom_font_bold = Typeface.createFromAsset(getAssets(),  "fonts/fontBold.ttf");
        JustifiedTextView tvTutorial = findViewById(R.id.tvDaftarPustaka);
        JustifiedTextView tvDaftar = findViewById(R.id.tvDaftar);
        JustifiedTextView tvDaftar2 = findViewById(R.id.tvDaftar2);
        JustifiedTextView tvDaftar3 = findViewById(R.id.tvDaftar3);
        JustifiedTextView tvDaftar4 = findViewById(R.id.tvDaftar4);
        tvTutorial.setTypeface(custom_font_bold);
        tvDaftar2.setTypeface(custom_font);
        tvDaftar3.setTypeface(custom_font);
        tvDaftar4.setTypeface(custom_font);
        tvDaftar.setTypeface(custom_font);
    }

    public void menuUtama(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
