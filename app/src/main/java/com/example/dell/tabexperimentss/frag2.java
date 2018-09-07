package com.example.dell.tabexperimentss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class frag2 extends AppCompatActivity {

    private String select2;

    private String select;
    public StringBuffer string1, string2;

    public String op = "Output is: ";

    public EditText str21,
            str22,
            startIndex2,
            endIndex2,
            charecter2, capacity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag2);

        Intent intent = getIntent();
        TextView textView = findViewById(R.id.descript2);
        String message =
                intent.getStringExtra(TabFragment2.TAG3);
        textView.setText(message);
        select2 = intent.getStringExtra(TabFragment2.TAG4);

        str21 = (EditText) findViewById(R.id.bstr1);
        str22 = (EditText) findViewById(R.id.bstr2);
        startIndex2 = (EditText) findViewById(R.id.index2_1);
        endIndex2 = (EditText) findViewById(R.id.index2_2);
        charecter2 = (EditText) findViewById(R.id.char2);
        capacity = (EditText) findViewById(R.id.cap_len);


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

    void a() {
        string1 = new StringBuffer(str21.getText().toString());
        Toast.makeText(this, op + "The current length of StringBuffer is " + string1.length(), Toast.LENGTH_LONG).show();

    }

    void b() {

        string1 = new StringBuffer(str21.getText().toString());
        Toast.makeText(this, op + "The current capacity of StringBuffer is " + string1.capacity(), Toast.LENGTH_LONG).show();
    }

    void c() {
        string1 = new StringBuffer(str21.getText().toString());
        StringBuffer str = new StringBuffer(string1) ;
        String value = capacity.getText().toString();
        int caps = Integer.parseInt(value);
        str.ensureCapacity(caps);
        int a,b;
        Toast.makeText(this, op + "Previous StringBuffer capacity :\n " + string1.capacity() + "\n After using ensureCapacit(), new capacity of StringBuffer : \n" + str.capacity(), Toast.LENGTH_LONG).show();

    }

    void d() {
        string1 = new StringBuffer(str21.getText().toString());
        StringBuffer str = string1;
        String value = capacity.getText().toString();
        int caps = Integer.parseInt(value);
        str.setLength(caps);
        Toast.makeText(this, op + "Previous StringBuffer length :\n " + string1.length() + "\n After using setLength(), new length of StringBuffer : \n" + str.length(), Toast.LENGTH_LONG).show();

    }

    void e() {
        string1 = new StringBuffer(str21.getText().toString());
        string2 = new StringBuffer(str22.getText().toString());
        StringBuffer str = string1.append(string2);
        Toast.makeText(this, op + str, Toast.LENGTH_LONG).show();

    }

    void f() {
        string1 = new StringBuffer(str21.getText().toString());
        string2 = new StringBuffer(str22.getText().toString());
        String value = startIndex2.getText().toString();
        int caps = Integer.parseInt(value);
        StringBuffer str = string1.insert(caps, string2);
        Toast.makeText(this, op + str, Toast.LENGTH_LONG).show();

    }

    void g() {
        string1 = new StringBuffer(str21.getText().toString());
        StringBuffer str = string1.reverse();
        Toast.makeText(this, op + "Reverse : \n" + str, Toast.LENGTH_LONG).show();

    }

    void h() {
        string1 = new StringBuffer(str21.getText().toString());
        String value1 = startIndex2.getText().toString();
        int caps1 = Integer.parseInt(value1);
        String value2 = endIndex2.getText().toString();
        int caps2 = Integer.parseInt(value2);
        StringBuffer str = string1.delete(caps1, caps2);
        Toast.makeText(this, op + str, Toast.LENGTH_LONG).show();

    }

    void i() {
        string1 = new StringBuffer(str21.getText().toString());
        String value = startIndex2.getText().toString();
        int caps = Integer.parseInt(value);
        StringBuffer str = string1.deleteCharAt(caps);
        Toast.makeText(this, op + str, Toast.LENGTH_LONG).show();
    }

    void j() {
        string1 = new StringBuffer(str21.getText().toString());
        String string = str22.getText().toString();
        String value1 = startIndex2.getText().toString();
        int caps1 = Integer.parseInt(value1);
        String value2 = endIndex2.getText().toString();
        int caps2 = Integer.parseInt(value2);
        StringBuffer str = string1.replace(caps1, caps2, string);
        Toast.makeText(this, op + str, Toast.LENGTH_LONG).show();

    }

    void k(){
        string1 = new StringBuffer(str21.getText().toString());
        String value = startIndex2.getText().toString();
        int caps = Integer.parseInt(value);
        String str = string1.substring(caps);
        Toast.makeText(this, op +"The substring from specified location index is : \n"+ str, Toast.LENGTH_LONG).show();
    }
}
