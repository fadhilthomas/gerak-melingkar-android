package com.wibudev.gerakmelingkar.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.uncopt.android.widget.text.justify.JustifiedTextView;
import com.wibudev.gerakmelingkar.R;

public class PembahasanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembahasan);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/font.ttf");
        Typeface custom_font_bold = Typeface.createFromAsset(getAssets(),  "fonts/fontBold.ttf");
        JustifiedTextView tvJudul = findViewById(R.id.tvJudul);
        JustifiedTextView tvSoal1 = findViewById(R.id.tvSoal1);
        JustifiedTextView tvBahas1 = findViewById(R.id.tvBahas1);
        JustifiedTextView tvSoal2 = findViewById(R.id.tvSoal2);
        JustifiedTextView tvBahas2 = findViewById(R.id.tvBahas2);
        JustifiedTextView tvSoal3 = findViewById(R.id.tvSoal3);
        JustifiedTextView tvBahas3 = findViewById(R.id.tvBahas3);
        JustifiedTextView tvSoal4 = findViewById(R.id.tvSoal4);
        JustifiedTextView tvBahas4 = findViewById(R.id.tvBahas4);
        JustifiedTextView tvSoal5 = findViewById(R.id.tvSoal5);
        JustifiedTextView tvBahas5 = findViewById(R.id.tvBahas5);
        JustifiedTextView tvSoal6 = findViewById(R.id.tvSoal6);
        JustifiedTextView tvBahas6 = findViewById(R.id.tvBahas6);
        JustifiedTextView tvSoal7 = findViewById(R.id.tvSoal7);
        JustifiedTextView tvBahas7 = findViewById(R.id.tvBahas7);
        JustifiedTextView tvSoal8 = findViewById(R.id.tvSoal8);
        JustifiedTextView tvBahas8 = findViewById(R.id.tvBahas8);
        JustifiedTextView tvSoal9 = findViewById(R.id.tvSoal9);
        JustifiedTextView tvBahas9 = findViewById(R.id.tvBahas9);
        JustifiedTextView tvSoal10 = findViewById(R.id.tvSoal10);
        JustifiedTextView tvBahas10 = findViewById(R.id.tvBahas10);
        tvJudul.setTypeface(custom_font_bold);
        tvSoal1.setTypeface(custom_font);
        tvBahas1.setTypeface(custom_font);
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
        tvSoal9.setTypeface(custom_font);
        tvBahas9.setTypeface(custom_font);
        tvSoal10.setTypeface(custom_font);
        tvBahas10.setTypeface(custom_font);
    }

    public void menuUtama(View view) {
        startActivity(new Intent(this, MenuActivity.class));
    }
}
