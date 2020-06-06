package com.radius.celercash;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class InvestorProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investor_profile);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent data = getIntent();
        String FullName = data.getStringExtra("name");
        String Email = data.getStringExtra("email");
        String PhoneNumber = data.getStringExtra("phone");

        TextView fname = findViewById(R.id.fname);
        TextView fphone = findViewById(R.id.fphone);
        TextView femail = findViewById(R.id.femail);

        fname.setText(FullName);
        fphone.setText(PhoneNumber);
        femail.setText(Email);

    }

}
