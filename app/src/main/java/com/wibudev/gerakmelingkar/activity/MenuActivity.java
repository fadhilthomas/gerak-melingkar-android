package com.wibudev.gerakmelingkar.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.wibudev.gerakmelingkar.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/font.ttf");
        TextView tvPendahuluan = findViewById(R.id.tvPendahuluan);
        TextView tvMateri = findViewById(R.id.tvMateri);
        TextView tvEvaluasi = findViewById(R.id.tvEvaluasi);
        TextView tvDaftarPustaka = findViewById(R.id.tvDaftarPustaka);
        tvPendahuluan.setTypeface(custom_font);
        tvMateri.setTypeface(custom_font);
        tvEvaluasi.setTypeface(custom_font);
        tvDaftarPustaka.setTypeface(custom_font);
    }

    public void daftarPustaka(View view) {
        startActivity(new Intent(this, DaftarPustakaActivity.class));
    }

    public void menuUtama(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void pendahuluan(View view) {
        startActivity(new Intent(this, PendahuluanActivity.class));
    }

    public void video(View view) {
        startActivity(new Intent(this, VideoActivity.class));
    }

    public void evaluasi(View view) {
        startActivity(new Intent(this, EvaluasiMenuActivity.class));
    }

    public void materi(View view) {
        startActivity(new Intent(this, MateriActivity.class));
    }
}
