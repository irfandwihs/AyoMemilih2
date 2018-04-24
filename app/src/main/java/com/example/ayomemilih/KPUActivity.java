package com.example.ayomemilih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KPUActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kpu);
    }

    public void rekap(View view) {
        Intent intent = new Intent(this, RekapActivity.class);
        startActivity(intent);
    }

    public void tahap(View view) {
        Intent intent = new Intent(this, TahapActivity.class);
        startActivity(intent);
    }
}
