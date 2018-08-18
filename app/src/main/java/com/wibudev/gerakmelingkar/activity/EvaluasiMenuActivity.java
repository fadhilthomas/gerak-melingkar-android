package com.wibudev.gerakmelingkar.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.wibudev.gerakmelingkar.R;

public class EvaluasiMenuActivity extends AppCompatActivity {

    private TextView tvJudul;
    private TextView tvMenu;
    private TextView tvMenu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluasi_menu);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/font.ttf");
        Typeface custom_font_bold = Typeface.createFromAsset(getAssets(),  "fonts/fontBold.ttf");
        tvJudul = findViewById(R.id.tvJudul);
        tvMenu = findViewById(R.id.tvMenu);
        tvMenu2 = findViewById(R.id.tvMenu2);
        tvMenu2.setTypeface(custom_font);
        tvMenu.setTypeface(custom_font);
        tvJudul.setTypeface(custom_font_bold);
    }

    public void latihan(View view) {
            startActivity(new Intent(this, EvaluasiAwalActivity.class));
    }

    public void menuUtama(View view) {
            startActivity(new Intent(this, MenuActivity.class));
    }

    public void pembahasan(View view) {startActivity(new Intent(this, PembahasanActivity.class));
    }
}
