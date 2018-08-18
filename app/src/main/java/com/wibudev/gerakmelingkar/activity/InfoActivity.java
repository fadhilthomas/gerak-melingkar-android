package com.wibudev.gerakmelingkar.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.uncopt.android.widget.text.justify.JustifiedTextView;
import com.wibudev.gerakmelingkar.R;

public class InfoActivity extends AppCompatActivity {

    private JustifiedTextView tvBiodata;
    private JustifiedTextView tvNama;
    private JustifiedTextView tvNpm;
    private JustifiedTextView tvJurusan;
    private JustifiedTextView tvFakultas;
    private JustifiedTextView tvUniversitas;
    private JustifiedTextView tvNamaIsi;
    private JustifiedTextView tvNpmIsi;
    private JustifiedTextView tvJurusanIsi;
    private JustifiedTextView tvFakultasIsi;
    private JustifiedTextView tvUniversitasIsi;
    private JustifiedTextView tvUniversitasIsi2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/font.ttf");
        Typeface custom_font_bold = Typeface.createFromAsset(getAssets(),  "fonts/fontBold.ttf");
        tvBiodata = findViewById(R.id.tvBiodata);
        tvNama = findViewById(R.id.tvNama);
        tvNpm = findViewById(R.id.tvNpm);
        tvJurusan = findViewById(R.id.tvJurusan);
        tvFakultas = findViewById(R.id.tvFakultas);
        tvUniversitas = findViewById(R.id.tvUniversitas);
        tvNamaIsi = findViewById(R.id.tvNamaIsi);
        tvNpmIsi = findViewById(R.id.tvNpmIsi);
        tvJurusanIsi = findViewById(R.id.tvJurusanIsi);
        tvFakultasIsi = findViewById(R.id.tvFakultasIsi);
        tvUniversitasIsi = findViewById(R.id.tvUniversitasIsi);
        tvUniversitasIsi2 = findViewById(R.id.tvUniversitasIsi2);
        tvBiodata.setTypeface(custom_font_bold);
        tvNama.setTypeface(custom_font);
        tvNpm.setTypeface(custom_font);
        tvJurusan.setTypeface(custom_font);
        tvFakultas.setTypeface(custom_font);
        tvUniversitas.setTypeface(custom_font);
        tvNamaIsi.setTypeface(custom_font);
        tvNpmIsi.setTypeface(custom_font);
        tvJurusanIsi.setTypeface(custom_font);
        tvFakultasIsi.setTypeface(custom_font);
        tvUniversitasIsi.setTypeface(custom_font);
        tvUniversitasIsi2.setTypeface(custom_font);
    }

    public void menuUtama(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
