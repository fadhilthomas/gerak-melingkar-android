package com.wibudev.gerakmelingkar.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.uncopt.android.widget.text.justify.JustifiedTextView;
import com.wibudev.gerakmelingkar.R;

public class Materi2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi2);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/font.ttf");
        Typeface custom_font_bold = Typeface.createFromAsset(getAssets(),  "fonts/fontBold.ttf");
        JustifiedTextView tvJudul = findViewById(R.id.tvJudul);
        JustifiedTextView tvSoal1 = findViewById(R.id.tvSoal1);
        JustifiedTextView tvSoal2 = findViewById(R.id.tvSoal2);
        JustifiedTextView tvSoal3 = findViewById(R.id.tvSoal3);
        JustifiedTextView tvSoal4 = findViewById(R.id.tvSoal4);
        JustifiedTextView tvSoal5 = findViewById(R.id.tvSoal5);
        JustifiedTextView tvSoal6 = findViewById(R.id.tvSoal6);
        JustifiedTextView tvSoal7 = findViewById(R.id.tvSoal7);
        JustifiedTextView tvSoal8 = findViewById(R.id.tvSoal8);
        tvSoal3 = findViewById(R.id.tvSoal3);
        tvJudul.setTypeface(custom_font_bold);
        tvSoal1.setTypeface(custom_font);
        tvSoal2.setTypeface(custom_font);
        tvSoal3.setTypeface(custom_font);
        tvSoal4.setTypeface(custom_font);
        tvSoal5.setTypeface(custom_font);
        tvSoal6.setTypeface(custom_font);
        tvSoal7.setTypeface(custom_font);
        tvSoal8.setTypeface(custom_font);
    }

    public void menuUtama(View view) {
        startActivity(new Intent(this, MateriActivity.class));
    }
}
