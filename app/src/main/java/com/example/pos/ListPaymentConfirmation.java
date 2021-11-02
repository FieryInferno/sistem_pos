package com.example.pos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListPaymentConfirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_payment_confirmation);
    }

    public void dashboardUser(View view) {
        Intent intent = new Intent(this, DashboardUser.class);
        startActivity(intent);
    }

    public void detailPaymentConfirmation(View view) {
        Intent intent = new Intent(this, DetailPaymentConfirmation.class);
        startActivity(intent);
    }
}