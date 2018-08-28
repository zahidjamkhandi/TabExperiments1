package com.example.dell.tabexperimentss;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class frag1 extends AppCompatActivity{

    private String select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag1);
        Intent intent = getIntent();
        TextView textView=findViewById(R.id.descript1);
        String message =
                intent.getStringExtra(TabFragment1.TAG1);
        textView.setText(message);
        select=intent.getStringExtra(TabFragment1.TAG2);

    }


}
