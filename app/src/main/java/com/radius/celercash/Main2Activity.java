package com.radius.celercash;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public void onClick(final View view) {
        int id = view.getId();
        EditText studID = findViewById(R.id.enterID);
        EditText pass = findViewById(R.id.enterPIN);
        switch (id)
        {
            case R.id.enter:
                if (
                        ( studID.getText().toString().equals("LG180")
                            || studID.getText().toString().trim().equals("LG180")
                        )
                        &&
                                pass.getText().toString().equals("1234")
                )
                {
                    Toast.makeText(getApplicationContext(),
                            "Loading User Info",
                            Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Main2Activity.this, CelerCash.class));
                }
                else if (studID.getText().toString().equals("LG737")
                &&
                    pass.getText().toString().equals("5555"))
                {
                    Toast.makeText(getApplicationContext(),
                            "Loading User Info",
                            Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Main2Activity.this, CelerCash.class));
                }
                else Toast.makeText(getApplicationContext(),
                            "Invalid User Credentials!",
                            Toast.LENGTH_SHORT).show();
                break;

            case R.id.pay_fab:
                final AlertDialog.Builder dialogpay = new AlertDialog.Builder(this);
                dialogpay.setTitle("Enter amount to Pay");

                final EditText input = new EditText(Main2Activity.this);
                input.setInputType(InputType.TYPE_CLASS_NUMBER);
                input.setHint("Amount in cedis");
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
                input.setLayoutParams(lp);
                dialogpay.setView(input);
                dialogpay.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (input.getText().toString().isEmpty())
                        {
                            Toast.makeText(getApplicationContext(),
                                    "Amount not specified. Cancelling...",Toast.LENGTH_SHORT)
                                    .show();
                        }
                        else if (input.getText().toString().length() < 2){
                            Toast.makeText(getApplicationContext(), "Please await confirmation",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                dialogpay.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialogpay.show();
                break;

            case R.id.add_fab:

                final AlertDialog.Builder dialog = new AlertDialog.Builder(this);
                dialog.setTitle("Enter amount");

                final EditText inputloan = new EditText(Main2Activity.this);
                inputloan.setInputType(InputType.TYPE_CLASS_NUMBER);
                inputloan.setHint("Amount in cedis");
                LinearLayout.LayoutParams lpg = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.MATCH_PARENT);
                inputloan.setLayoutParams(lpg);
                dialog.setView(inputloan);
                dialog.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if (inputloan.getText().toString().isEmpty())
                        {
                            Toast.makeText(getApplicationContext(),
                                    "Amount not specified. Cancelling...",Toast.LENGTH_SHORT)
                                    .show();
                        }
                        else if (inputloan.getText().toString().length() < 2 ){
                            Toast.makeText(getApplicationContext(), "Please wait for confirmation",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.show();


                break;
        }
    }
}
