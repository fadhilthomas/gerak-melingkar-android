package com.wibudev.gerakmelingkar.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.uncopt.android.widget.text.justify.JustifiedTextView;
import com.wibudev.gerakmelingkar.R;

public class Materi3Activity extends AppCompatActivity {

    private JustifiedTextView tvJudul;
    private JustifiedTextView tvSoal1;
    private JustifiedTextView tvSoal2;
    private JustifiedTextView tvBahas2;
    private JustifiedTextView tvSoal3;
    private JustifiedTextView tvBahas3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi3);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/font.ttf");
        Typeface custom_font_bold = Typeface.createFromAsset(getAssets(),  "fonts/fontBold.ttf");
        tvJudul = findViewById(R.id.tvJudul);
        tvSoal1 = findViewById(R.id.tvSoal1);
        tvSoal2 = findViewById(R.id.tvSoal2);
        tvBahas2 = findViewById(R.id.tvBahas2);
        tvSoal3 = findViewById(R.id.tvSoal3);
        tvBahas3 = findViewById(R.id.tvBahas3);
        tvJudul.setTypeface(custom_font_bold);
        tvSoal1.setTypeface(custom_font);
        tvSoal2.setTypeface(custom_font);
        tvBahas2.setTypeface(custom_font);
        tvSoal3.setTypeface(custom_font);
        tvBahas3.setTypeface(custom_font);
    }

    public void menuUtama(View view) {
        startActivity(new Intent(this, MateriActivity.class));
    }
}
