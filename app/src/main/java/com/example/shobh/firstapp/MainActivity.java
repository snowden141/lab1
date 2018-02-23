package com.example.shobh.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.view.View.X;


public class MainActivity extends AppCompatActivity {

    Button b1, b2;
    float value1, value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.button2);
        b2 = findViewById(R.id.button3);

        final EditText a1 = findViewById(R.id.a1);
        final EditText a2 = findViewById(R.id.a2);

        final EditText res1  = findViewById(R.id.a3);

        final EditText res  = findViewById(R.id.a3);
        final String[] str = {null};

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Integer.parseInt( a1.getText().toString().trim());
                value2 = Integer.parseInt( a2.getText().toString().trim());
                int sum = (int) (value1 + value2);
                res.setText(sum + "");
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("answ",sum);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Integer.parseInt( a1.getText().toString().trim());
                value2 = Integer.parseInt( a2.getText().toString().trim());
                int diff = (int) (value1 - value2);
                res1.setText(diff + "");
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("answ",diff);
                startActivity(i);
            }
        });
    }
}
