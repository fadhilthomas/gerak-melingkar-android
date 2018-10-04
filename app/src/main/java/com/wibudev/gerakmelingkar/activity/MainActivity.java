package com.wibudev.gerakmelingkar.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.wibudev.gerakmelingkar.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/font.ttf");
        TextView tvMenu = findViewById(R.id.tvMenu);
        TextView tvTutorial = findViewById(R.id.tvTutorial);
        TextView tvInfo = findViewById(R.id.tvInfo);
        tvMenu.setTypeface(custom_font);
        tvTutorial.setTypeface(custom_font);
        tvInfo.setTypeface(custom_font);
    }

    public void menu(View view) {
        startActivity(new Intent(this, MenuActivity.class));
    }

    public void info(View view) {
        startActivity(new Intent(this, InfoActivity.class));
    }

    public void tutorial(View view) {
        startActivity(new Intent(this, TutorialActivity.class));
    }
}
