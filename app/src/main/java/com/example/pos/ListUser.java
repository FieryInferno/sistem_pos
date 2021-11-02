package com.example.pos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_user);
    }

    public void dashboardAdmin(View view) {
        Intent intent = new Intent(this, DashboardAdmin.class);
        startActivity(intent);
    }

    public void detailUser(View view) {
        Intent intent = new Intent(this, DetailUser.class);
        startActivity(intent);
    }
}