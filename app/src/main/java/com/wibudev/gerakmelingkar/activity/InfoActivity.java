package com.wibudev.gerakmelingkar.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.uncopt.android.widget.text.justify.JustifiedTextView;
import com.wibudev.gerakmelingkar.R;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/font.ttf");
        Typeface custom_font_bold = Typeface.createFromAsset(getAssets(),  "fonts/fontBold.ttf");
        JustifiedTextView tvBiodata = findViewById(R.id.tvBiodata);
        JustifiedTextView tvNama = findViewById(R.id.tvNama);
        JustifiedTextView tvNpm = findViewById(R.id.tvNpm);
        JustifiedTextView tvJurusan = findViewById(R.id.tvJurusan);
        JustifiedTextView tvFakultas = findViewById(R.id.tvFakultas);
        JustifiedTextView tvUniversitas = findViewById(R.id.tvUniversitas);
        JustifiedTextView tvPembimbing1 = findViewById(R.id.tvPembimbing1);
        JustifiedTextView tvPembimbing2 = findViewById(R.id.tvPembimbing2);
        JustifiedTextView tvPembimbing1Isi = findViewById(R.id.tvPembimbing1Isi);
        JustifiedTextView tvPembimbing2Isi = findViewById(R.id.tvPembimbing2Isi);
        JustifiedTextView tvNamaIsi = findViewById(R.id.tvNamaIsi);
        JustifiedTextView tvNpmIsi = findViewById(R.id.tvNpmIsi);
        JustifiedTextView tvJurusanIsi = findViewById(R.id.tvJurusanIsi);
        JustifiedTextView tvFakultasIsi = findViewById(R.id.tvFakultasIsi);
        JustifiedTextView tvUniversitasIsi = findViewById(R.id.tvUniversitasIsi);
        tvBiodata.setTypeface(custom_font_bold);
        tvNama.setTypeface(custom_font);
        tvNpm.setTypeface(custom_font);
        tvJurusan.setTypeface(custom_font);
        tvFakultas.setTypeface(custom_font);
        tvUniversitas.setTypeface(custom_font);
        tvPembimbing1.setTypeface(custom_font);
        tvPembimbing2.setTypeface(custom_font);
        tvPembimbing1Isi.setTypeface(custom_font);
        tvPembimbing2Isi.setTypeface(custom_font);
        tvNamaIsi.setTypeface(custom_font);
        tvNpmIsi.setTypeface(custom_font);
        tvJurusanIsi.setTypeface(custom_font);
        tvFakultasIsi.setTypeface(custom_font);
        tvUniversitasIsi.setTypeface(custom_font);
    }

    public void menuUtama(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
