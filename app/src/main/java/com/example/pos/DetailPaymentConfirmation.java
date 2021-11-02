package com.example.pos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DetailPaymentConfirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_payment_confirmation);
    }

    public void listPaymentConfirmation(View view) {
        Intent intent = new Intent(this, ListPaymentConfirmation.class);
        startActivity(intent);
    }
}