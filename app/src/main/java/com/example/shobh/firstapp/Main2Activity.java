package com.example.shobh.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ans=findViewById(R.id.answer);
        int id = getIntent().getIntExtra("answ",0);
        //Integer answer1=getIntent().getIntExtra("ans",0);

        ans.setText(String.valueOf(id));
    }
}
