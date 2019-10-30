package com.alfi.mobileprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PesanActivity extends AppCompatActivity {

    TextView shows;
    String pesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);
        shows = findViewById(R.id.tv_shows);

        pesan = getIntent().getStringExtra("pesan");
        shows.setText(pesan);
    }
}
