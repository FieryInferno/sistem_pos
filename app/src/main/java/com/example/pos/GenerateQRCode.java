package com.example.pos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class GenerateQRCode extends AppCompatActivity {

    private EditText dataEdt;
    private Button generateQrBtn;
    private String KEY_NAME = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_qrcode);


        dataEdt = findViewById(R.id.input_nama_barang);
        generateQrBtn = findViewById(R.id.generateQRCode);

        generateQrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(dataEdt.getText().toString())) {
                    Toast.makeText(GenerateQRCode.this, "Masukan nama barang", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(GenerateQRCode.this, ViewQRCode.class);
                    intent.putExtra(KEY_NAME, dataEdt.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }

    public void dashboardAdmin(View view) {
        Intent intent = new Intent(this, DashboardAdmin.class);
        startActivity(intent);
    }


}