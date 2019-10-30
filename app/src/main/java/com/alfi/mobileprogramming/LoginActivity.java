package com.alfi.mobileprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText txt_telepon, txt_password;
    String telepon, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txt_telepon = findViewById(R.id.txt_telepon);
        txt_password = findViewById(R.id.txt_password);

        if(txt_telepon.getText().toString().isEmpty()) txt_telepon.setError("Maaf tidak boleh kosong.");
        if(txt_password.getText().toString().isEmpty()) txt_telepon.setError("Maaf tidak boleh kosong.");

    }

    public void Login(View view){
        telepon = txt_telepon.getText().toString();
        password = txt_password.getText().toString();
        if (!telepon.isEmpty() && !password.isEmpty()){
            if (telepon.equals("085294754647") && password.equals("1Sampai9!") ){
                Intent i = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(i);
            }else{
                Toast.makeText(LoginActivity.this, "Nomor telepon atau password salah.", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(LoginActivity.this, "Maaf tidak boleh kosong.", Toast.LENGTH_SHORT).show();
        }
    }

    public void ForgotPassword(View view){
        Intent i = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
        startActivity(i);
    }
}
