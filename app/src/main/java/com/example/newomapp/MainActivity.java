package com.example.newomapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText textview;
    private EditText textview2;
    public static final String EXTRA = "com.example.newomapp.extra.name";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textview = findViewById(R.id.editTextTextPersonName);
        textview2 = findViewById(R.id.editTextNumber);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = textview.getText().toString();
                String s = textview2.getText().toString();
                int password = Integer.parseInt(s);

                if (password == 1234 && name.equals("omhedau") ){
                    Toast.makeText(MainActivity.this, "login successfully", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    String temp = textview.getText().toString();
                    intent.putExtra(EXTRA,temp);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this, "incorrect password", Toast.LENGTH_SHORT).show();
                }
                
                
                
            }
        });



    }
}