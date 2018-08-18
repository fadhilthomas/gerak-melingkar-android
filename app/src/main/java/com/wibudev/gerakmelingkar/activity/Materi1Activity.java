package com.wibudev.gerakmelingkar.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.uncopt.android.widget.text.justify.JustifiedTextView;
import com.wibudev.gerakmelingkar.R;

public class Materi1Activity extends AppCompatActivity {

    private JustifiedTextView tvJudul;
    private JustifiedTextView tvSoal1;
    private JustifiedTextView tvSoal2;
    private JustifiedTextView tvBahas2;
    private JustifiedTextView tvSoal3;
    private JustifiedTextView tvBahas3;
    private JustifiedTextView tvSoal4;
    private JustifiedTextView tvBahas4;
    private JustifiedTextView tvSoal5;
    private JustifiedTextView tvBahas5;
    private JustifiedTextView tvSoal6;
    private JustifiedTextView tvBahas6;
    private JustifiedTextView tvSoal7;
    private JustifiedTextView tvBahas7;
    private JustifiedTextView tvSoal8;
    private JustifiedTextView tvBahas8;
    private JustifiedTextView tvBahas9;
    private JustifiedTextView tvBahas10;
    private JustifiedTextView tvBahas11;
    private JustifiedTextView tvBahas12;
    private JustifiedTextView tvBahas13;
    private JustifiedTextView tvSub1;
    private JustifiedTextView tvSub2;
    private JustifiedTextView tvSub3;
    private JustifiedTextView tvSub4;
    private JustifiedTextView tvSub5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi1);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/font.ttf");
        Typeface custom_font_bold = Typeface.createFromAsset(getAssets(),  "fonts/fontBold.ttf");
        tvJudul = findViewById(R.id.tvJudul);
        tvSoal1 = findViewById(R.id.tvSoal1);
        tvSoal2 = findViewById(R.id.tvSoal2);
        tvBahas2 = findViewById(R.id.tvBahas2);
        tvSoal3 = findViewById(R.id.tvSoal3);
        tvBahas3 = findViewById(R.id.tvBahas3);
        tvSoal4 = findViewById(R.id.tvSoal4);
        tvBahas4 = findViewById(R.id.tvBahas4);
        tvSoal5 = findViewById(R.id.tvSoal5);
        tvBahas5 = findViewById(R.id.tvBahas5);
        tvSoal6 = findViewById(R.id.tvSoal6);
        tvBahas6 = findViewById(R.id.tvBahas6);
        tvSoal7 = findViewById(R.id.tvSoal7);
        tvBahas7 = findViewById(R.id.tvBahas7);
        tvSoal8 = findViewById(R.id.tvSoal8);
        tvBahas8 = findViewById(R.id.tvBahas8);
        tvBahas9 = findViewById(R.id.tvBahas9);
        tvBahas10 = findViewById(R.id.tvBahas10);
        tvBahas11 = findViewById(R.id.tvBahas11);
        tvBahas12 = findViewById(R.id.tvBahas12);
        tvBahas13 = findViewById(R.id.tvBahas13);
        tvSub1 = findViewById(R.id.tvSub1);
        tvSub2 = findViewById(R.id.tvSub2);
        tvSub3 = findViewById(R.id.tvSub3);
        tvSub4 = findViewById(R.id.tvSub4);
        tvSub5 = findViewById(R.id.tvSub5);
        tvJudul.setTypeface(custom_font_bold);
        tvSoal1.setTypeface(custom_font);
        tvSoal2.setTypeface(custom_font);
        tvBahas2.setTypeface(custom_font);
        tvSoal3.setTypeface(custom_font);
        tvBahas3.setTypeface(custom_font);
        tvSoal4.setTypeface(custom_font);
        tvBahas4.setTypeface(custom_font);
        tvSoal5.setTypeface(custom_font);
        tvBahas5.setTypeface(custom_font);
        tvSoal6.setTypeface(custom_font);
        tvBahas6.setTypeface(custom_font);
        tvSoal7.setTypeface(custom_font);
        tvBahas7.setTypeface(custom_font);
        tvSoal8.setTypeface(custom_font);
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
