package com.wibudev.gerakmelingkar.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.wibudev.gerakmelingkar.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/font.ttf");
        TextView tvMenu = findViewById(R.id.tvMenu);
        TextView tvTutorial = findViewById(R.id.tvTutorial);
        tvMenu.setTypeface(custom_font);
        tvTutorial.setTypeface(custom_font);
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

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Tekan sekali lagi untuk keluar", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
}
