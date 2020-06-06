package com.radius.celercash;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.Gravity.CENTER;

public class Register extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button reg = findViewById(R.id.button4);
        reg.setOnClickListener(this);
        TextView signin = findViewById(R.id.textView3);
        signin.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        EditText passwordfield = findViewById(R.id.pass);
        EditText email = findViewById(R.id.email);
        EditText studentID = findViewById(R.id.studID);
        Spinner spinner = findViewById(R.id.spinner_register);
        switch (id)
        {
            case R.id.button4:
                if (
                                (!email.getText().toString().isEmpty())
                        &&
                                !studentID.getText().toString().isEmpty()
                )
                {
                    Toast.makeText(getApplicationContext(),
                            "Your details have been submitted for review",Toast.LENGTH_SHORT)
                            .show();
                    startActivity(new Intent(Register.this, CelerCash.class));
                }
                else{
                    Toast.makeText(getApplicationContext(),
                            "Invalid/Incomplete details! Please verify",
                            Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.textView3:
                startActivity(new Intent(Register.this,CelerCash.class));
                break;

        }
    }
}
