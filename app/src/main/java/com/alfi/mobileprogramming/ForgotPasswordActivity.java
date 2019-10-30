package com.alfi.mobileprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ForgotPasswordActivity extends AppCompatActivity {

    EditText txt_telepon;
    String telepon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        txt_telepon = findViewById(R.id.txt_telepon);
        if(txt_telepon.getText().toString().isEmpty()) txt_telepon.setError("Maaf tidak boleh kosong.");
    }

    public void LupaPassword(View view){
        telepon = txt_telepon.getText().toString();
        if (!telepon.isEmpty() ){
            if (telepon.equals("085294754647")){
                Toast.makeText(ForgotPasswordActivity.this, "Password telah dikirim ke nomor telepon.", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(ForgotPasswordActivity.this, "Nomor telepon salah.", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(ForgotPasswordActivity.this, "Maaf tidak boleh kosong.", Toast.LENGTH_SHORT).show();
        }
    }
}
