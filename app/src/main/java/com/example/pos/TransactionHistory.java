package com.example.pos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TransactionHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_history);
    }

    public void dashboardUser(View view) {
        Intent intent = new Intent(this, DashboardUser.class);
        startActivity(intent);
    }

    public void transaction(View view) {
        Intent intent = new Intent(this, Transaction.class);
        startActivity(intent);
    }
}