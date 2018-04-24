package com.example.ayomemilih;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EdukasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edukasi);
    }

    public void uang(View view) {
        Intent intent = new Intent(this, UangActivity.class);
        startActivity(intent);
    }

    public void sara(View view) {
        Intent intent = new Intent(this, SaraActivity.class);
        startActivity(intent);
    }

    public void hoax(View view) {
        Intent intent = new Intent(this, HoaxActivity.class);
        startActivity(intent);
    }
}
