package com.wibudev.gerakmelingkar.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.uncopt.android.widget.text.justify.JustifiedTextView;
import com.wibudev.gerakmelingkar.R;

public class EvaluasiAwalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluasi_awal);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/font.ttf");
        Typeface custom_font_bold = Typeface.createFromAsset(getAssets(),  "fonts/fontBold.ttf");
        JustifiedTextView tvJudul = findViewById(R.id.tvJudul);
        JustifiedTextView tvMenu = findViewById(R.id.tvMenu);
        TextView tvMenu2 = findViewById(R.id.tvMenu2);
        tvMenu2.setTypeface(custom_font);
        tvMenu.setTypeface(custom_font);
        tvJudul.setTypeface(custom_font_bold);
    }

    public void menuUtama(View view) {
        startActivity(new Intent(this, MenuActivity.class));
    }

    public void mulai(View view) {
        startActivity(new Intent(this, EvaluasiActivity.class));
    }
}
