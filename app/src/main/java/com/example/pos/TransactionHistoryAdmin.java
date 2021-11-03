package com.example.pos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TransactionHistoryAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_history_admin);
    }

    public void detailTransactionHistory(View view) {
        Intent intent = new Intent(this, DetailTransactionHistory.class);
        startActivity(intent);
    }

    public void dashboardAdmin(View view) {
        Intent intent = new Intent(this, DashboardAdmin.class);
        startActivity(intent);
    }
}