package com.example.pos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void dashboardUser(View view) {
        Intent intent = new Intent(this, DashboardUser.class);
        startActivity(intent);
    }

    public void editProfile(View view) {
        Intent intent = new Intent(this, EditProfile.class);
        startActivity(intent);
    }
}