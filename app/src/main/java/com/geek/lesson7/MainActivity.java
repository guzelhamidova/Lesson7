package com.geek.lesson7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText email;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.buttonPanel);
        email = findViewById(R.id.et_email);
        password = findViewById(R.id.password);


        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!email.getText().toString().equals("") &&
                        !password.getText().toString().equals("")) {
                    button.setBackground(getResources().getDrawable(R.drawable.but));
                }
                else {
                    button.setEnabled(true);
                }
            }
        });

        password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!email.getText().toString().equals("") &&
                        !password.getText().toString().equals("")) {
                    button.setBackground(getResources().getDrawable(R.drawable.but));
                } else {
                    button.setBackground(getResources().getDrawable(R.drawable.button));
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().toString().equals("") || password.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Пожалуйста ввидите данные!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Добро пожаловать!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}