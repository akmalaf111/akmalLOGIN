package com.alfi.mobileprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnpindah;
    EditText txtpesan;
    EditText txtnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnpindah = findViewById(R.id.btn_pesan);
        txtpesan = findViewById(R.id.txt_pesan);
        txtnomor = findViewById(R.id.txt_nomor);

        btnpindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent or link activity
                //startActivity(new Intent(MainActivity.this, DashboardActivity.class));
                Pesan(v);
            }
        });
    }

    //Explicit Intent
    public void Pesan(View view){
        if (!txtpesan.getText().toString().isEmpty()){
            Intent i = new Intent(MainActivity.this, PesanActivity.class);
            i.putExtra("pesan", txtpesan.getText().toString());
            startActivity(i);
        }else{
            Toast.makeText(MainActivity.this, "Maaf tidak boleh kosong", Toast.LENGTH_SHORT).show();
        }
    }

    //Implicit Intent
    public void Telpon(View view) {
        if (!txtnomor.getText().toString().isEmpty()){
            String nmr = txtnomor.getText().toString() ;
            Intent intent = new Intent(Intent. ACTION_DIAL);
            intent.setData(Uri. fromParts("tel",nmr,null));
            startActivity(intent);
        }else{
            Toast.makeText(MainActivity.this, "Maaf tidak boleh kosong", Toast.LENGTH_SHORT).show();
        }
    }

    public void Browsing(View view) {
        String url = "https://blog.alfi-gusman.web.id" ;
        Intent intent = new Intent(Intent. ACTION_VIEW);
        intent.setData(Uri. parse(url));
        startActivity(intent);
    }

}
