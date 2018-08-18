package com.wibudev.gerakmelingkar.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.wibudev.gerakmelingkar.R;

public class MateriActivity extends AppCompatActivity {

    private TextView tvJudul;
    private TextView tvMateri;
    private TextView tvMateri2;
    private TextView tvMateri3;
    private TextView tvMateri4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/font.ttf");
        Typeface custom_font_bold = Typeface.createFromAsset(getAssets(),  "fonts/fontBold.ttf");
        tvJudul = findViewById(R.id.tvJudul);
        tvMateri = findViewById(R.id.tvMateri);
        tvMateri2 = findViewById(R.id.tvMateri2);
        tvMateri3 = findViewById(R.id.tvMateri3);
        tvMateri4 = findViewById(R.id.tvMateri4);
        tvJudul.setTypeface(custom_font_bold);
        tvMateri.setTypeface(custom_font);
        tvMateri2.setTypeface(custom_font);
        tvMateri3.setTypeface(custom_font);
        tvMateri4.setTypeface(custom_font);
    }

    public void menuUtama(View view) {
        startActivity(new Intent(this, MenuActivity.class));
    }

    public void materi1(View view) {
        startActivity(new Intent(this, Materi1Activity.class));
    }

    public void materi2(View view) {
        startActivity(new Intent(this, Materi2Activity.class));
    }

    public void materi3(View view) {
        startActivity(new Intent(this, Materi3Activity.class));
    }

    public void videoPembelajaran(View view) {
        startActivity(new Intent(this, VideoActivity.class));
    }
}
