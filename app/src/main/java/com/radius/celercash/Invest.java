package com.radius.celercash;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Invest extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invest);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id)
        {
            case R.id.submit_button:

                EditText surname = findViewById(R.id.surname);
                EditText firstname = findViewById(R.id.firstname);
                EditText age = findViewById(R.id.age);
                EditText email = findViewById(R.id.email_invest);
                EditText phone = findViewById(R.id.phonenumber);

                if (
                    surname.getText().toString().isEmpty()
                    ||
                    firstname.getText().toString().isEmpty()
                    ||
                    age.getText().toString().isEmpty()
                    ||
                    email.getText().toString().isEmpty()
                    ||
                    phone.getText().toString().isEmpty()
                )
                {
                    Toast.makeText(getApplicationContext(),
                            "Please complete the form before submission",
                            Toast.LENGTH_LONG).show();
                }
                else Toast.makeText(getApplicationContext(),"Submitting info",
                        Toast.LENGTH_SHORT).show();

                Intent send = new Intent(Invest.this,InvestorProfile.class);
                send.putExtra("name",surname.getText().toString() + " " + firstname.getText().toString());
                send.putExtra("email",email.getText().toString());
                send.putExtra("phone",phone.getText().toString());
                startActivity(send);

                break;
        }
    }
}
