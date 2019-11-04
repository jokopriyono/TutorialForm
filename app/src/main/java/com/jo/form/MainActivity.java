package com.jo.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtUsername;
    private EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMasuk = findViewById(R.id.btn_masuk);
        edtUsername = findViewById(R.id.edt_username);
        edtPassword = findViewById(R.id.edt_password);

        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validasiLogin();
            }
        });
    }

    private void validasiLogin() {
        String username = edtUsername.getText().toString().trim();
        String password = edtPassword.getText().toString().trim();

        if (!username.equals("joko")) {
            Toast.makeText(this, "Username bukan joko", Toast.LENGTH_SHORT).show();
        } else if (!password.equals("priyono")) {
            Toast.makeText(this, "Password salah", Toast.LENGTH_SHORT).show();
        } else {
            Intent i = new Intent(MainActivity.this, HitungActivity.class);
            startActivity(i);
        }
    }
}
