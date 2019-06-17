package com.example.parkingmanagerapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = findViewById(R.id.toolbar);
        Button registerBtn = findViewById(R.id.registerBtn);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SwitchToRegistrationPage();
            }
        });
    }

    @Override
    public void onBackPressed()
    {
        switchToMainActivity();
    }

    private void switchToMainActivity() {

        Intent activityChangeIntent = new Intent(LoginActivity.this, MainActivity.class);
        LoginActivity.this.startActivity(activityChangeIntent);
    }

    public void SwitchToRegistrationPage() {

        Intent activityChangeIntent = new Intent(LoginActivity.this, RegistrationActivity.class);

//        activityChangeIntent.putExtra("Phnum",phone.getText().toString());
//        activityChangeIntent.putExtra("fcmToken",fcmToken);

        // currentContext.startActivity(activityChangeIntent);

        LoginActivity.this.startActivity(activityChangeIntent);
    }

}
