package com.wibudev.gerakmelingkar.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.uncopt.android.widget.text.justify.JustifiedTextView;
import com.wibudev.gerakmelingkar.R;

public class Materi1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi1);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/font.ttf");
        Typeface custom_font_bold = Typeface.createFromAsset(getAssets(),  "fonts/fontBold.ttf");
        JustifiedTextView tvJudul = findViewById(R.id.tvJudul);
        JustifiedTextView tvSoal1 = findViewById(R.id.tvSoal1);
        JustifiedTextView tvSoal2 = findViewById(R.id.tvSoal2);
        JustifiedTextView tvBahas2 = findViewById(R.id.tvBahas2);
        JustifiedTextView tvSoal4 = findViewById(R.id.tvSoal4);
        JustifiedTextView tvBahas4 = findViewById(R.id.tvBahas4);
        JustifiedTextView tvBahas5 = findViewById(R.id.tvBahas5);
        JustifiedTextView tvBahas6 = findViewById(R.id.tvBahas6);
        JustifiedTextView tvBahas7 = findViewById(R.id.tvBahas7);
        JustifiedTextView tvBahas8 = findViewById(R.id.tvBahas8);
        JustifiedTextView tvBahas9 = findViewById(R.id.tvBahas9);
        JustifiedTextView tvBahas10 = findViewById(R.id.tvBahas10);
        JustifiedTextView tvBahas11 = findViewById(R.id.tvBahas11);
        JustifiedTextView tvBahas12 = findViewById(R.id.tvBahas12);
        JustifiedTextView tvBahas13 = findViewById(R.id.tvBahas13);
        JustifiedTextView tvSub1 = findViewById(R.id.tvSub1);
        JustifiedTextView tvSub2 = findViewById(R.id.tvSub2);
        JustifiedTextView tvSub3 = findViewById(R.id.tvSub3);
        JustifiedTextView tvSub4 = findViewById(R.id.tvSub4);
        JustifiedTextView tvSub5 = findViewById(R.id.tvSub5);
        tvJudul.setTypeface(custom_font_bold);
        tvSoal1.setTypeface(custom_font);
        tvSoal2.setTypeface(custom_font);
        tvBahas2.setTypeface(custom_font);
        tvSoal4.setTypeface(custom_font);
        tvBahas4.setTypeface(custom_font);
        tvBahas5.setTypeface(custom_font);
        tvBahas6.setTypeface(custom_font);
        tvBahas7.setTypeface(custom_font);
        tvBahas8.setTypeface(custom_font);
        tvBahas9.setTypeface(custom_font);
        tvBahas10.setTypeface(custom_font);
        tvBahas11.setTypeface(custom_font);
        tvBahas12.setTypeface(custom_font);
        tvBahas13.setTypeface(custom_font);
        tvSub1.setTypeface(custom_font);
        tvSub2.setTypeface(custom_font);
        tvSub3.setTypeface(custom_font);
        tvSub4.setTypeface(custom_font);
        tvSub5.setTypeface(custom_font);
    }

    public void menuUtama(View view) {
        startActivity(new Intent(this, MateriActivity.class));
    }
}
