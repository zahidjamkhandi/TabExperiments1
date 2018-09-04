package com.example.dell.tabexperimentss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class frag2 extends AppCompatActivity {

    private String select2;

    private String select;
    public StringBuffer string1, string2;

    public String op="Output is: ";

    public EditText str21,
            str22,
            startIndex2,
            endIndex2,
            charecter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag2);

        Intent intent = getIntent();
        TextView textView=findViewById(R.id.descript2);
        String message =
                intent.getStringExtra(TabFragment2.TAG3);
        textView.setText(message);
        select2=intent.getStringExtra(TabFragment2.TAG4);

        str21 = (EditText) findViewById(R.id.bstr1);
        str22 = (EditText) findViewById(R.id.bstr2);
        startIndex2 = (EditText) findViewById(R.id.index2_1);
        endIndex2 = (EditText) findViewById(R.id.index2_2);
        charecter2 = (EditText) findViewById(R.id.char2);


    }

    public void output2(View view) {



        switch (select2) {

            case "a":
                a();

                break;

            case "b":
                b();

                break;

            case "c":
                c();

                break;

            case "d":
                d();

                break;

            case "e":
                e();

                break;

            case "f":
                f();

                break;

            case "g":
                g();

                break;

            case "h":
                h();

                break;

            case "i":
                i();

                break;

            case "j":
                j();

                break;

            case "k":
                k();

                break;
        }

    }

    void a(){
        string1= new StringBuffer(str21.getText().toString());
        Toast.makeText(this,op+"The current length of StringBuffer is "+string1.length(),Toast.LENGTH_LONG).show();

    }

    void b(){

        string1= new StringBuffer(str21.getText().toString());
        Toast.makeText(this,op+"The current capacity of StringBuffer is "+string1.capacity(),Toast.LENGTH_LONG).show();
    }

    void c(){

    }
}
