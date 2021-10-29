package com.example.pos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
    }

    public void dashboardUser(View view) {
        Intent intent = new Intent(this, DashboardUser.class);
        startActivity(intent);
    }

    public void paymentConfirmation(View view) {
        Intent intent = new Intent(this, PaymentConfirmation.class);
        startActivity(intent);
    }
}