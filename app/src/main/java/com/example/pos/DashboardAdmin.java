package com.example.pos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_admin);
    }

    public void listUser(View view) {
        Intent intent = new Intent(this, ListUser.class);
        startActivity(intent);
    }

    public void paymentConfirmation(View view) {
        Intent intent = new Intent(this, ListPaymentConfirmation.class);
        startActivity(intent);
    }

    public void generateQRCode(View view) {
        Intent intent = new Intent(this, GenerateQRCode.class);
        startActivity(intent);
    }

    public void transactionHistory(View view) {
        Intent intent = new Intent(this, TransactionHistoryAdmin.class);
        startActivity(intent);
    }
}