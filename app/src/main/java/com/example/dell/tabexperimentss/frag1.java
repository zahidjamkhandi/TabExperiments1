package com.example.dell.tabexperimentss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class frag1 extends AppCompatActivity {

    private String select;
    public String string1, string2;
    public String op = "Output : ";

    public EditText str11,
            str12,
            startIndex1,
            endIndex1,
            character1,
            character12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag1);
        Intent intent = getIntent();
        TextView textView = findViewById(R.id.descript1);
        String message =
                intent.getStringExtra(TabFragment1.TAG1);
        textView.setText(message);
        select = intent.getStringExtra(TabFragment1.TAG2);

        str11 = (EditText) findViewById(R.id.str1);
        str12 = (EditText) findViewById(R.id.str2);
        startIndex1 = (EditText) findViewById(R.id.index1_1);
        endIndex1 = (EditText) findViewById(R.id.index1_2);
        character1 = (EditText) findViewById(R.id.char1);
        character12 = (EditText) findViewById(R.id.char12);


    }


    public void output(View view) {

        switch (select) {

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

            case "l":
                l();

                break;

            case "m":
                m();

                break;

            case "n":
                n();

                break;

            case "o":
                o();

                break;

        }
    }

    void a() {
        string1 = str11.getText().toString();
        int i = string1.length();
        Toast.makeText(this, op + "The string length is " + i, Toast.LENGTH_LONG).show();
    }

    void b() {
        string1 = str11.getText().toString();
        string2 = str12.getText().toString();
        String string = string1 + " " + (string2);
        Toast.makeText(this, op + string, Toast.LENGTH_LONG).show();
    }

    void c() {
        string1 = str11.getText().toString();
        String value = startIndex1.getText().toString();
        int finalvalue = Integer.parseInt(value);
        char abc = string1.charAt(finalvalue);
        Toast.makeText(this, op + abc, Toast.LENGTH_LONG).show();

    }

    void d() {
        string1 = str11.getText().toString();
        string2 = str12.getText().toString();
        boolean result = string1.equals(string2);
        if (result = true) {
            Toast.makeText(this, op + "Both the strings are equal", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, op + "Both strings are not equal", Toast.LENGTH_LONG).show();
        }
    }

    void e() {
        string1 = str11.getText().toString();
        string2 = str12.getText().toString();
        boolean result = string1.equalsIgnoreCase(string2);
        if (result = true) {
            Toast.makeText(this, op + "Both the strings are equal(case ignored)", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, op + "Both strings are not equal", Toast.LENGTH_LONG).show();
        }
    }

    void f() {
        string1 = str11.getText().toString();
        String value1 = startIndex1.getText().toString();
        int start = Integer.parseInt(value1);
        String value2 = endIndex1.getText().toString();
        int end = Integer.parseInt(value2);
        char target[] = new char[end - start];
        string1.getChars(start, end, target, 0);
        Toast.makeText(this, op + target, Toast.LENGTH_LONG).show();

    }

    void g() {

        string1 = str11.getText().toString();
        String value1 = startIndex1.getText().toString();
        byte[] bytes = string1.getBytes();
        Toast.makeText(this, op + bytes, Toast.LENGTH_LONG).show();

    }

    void h() {
        string1 = str11.getText().toString();
        string2 = str12.getText().toString();
        int result = string1.compareTo(string2);
        if (result == 0) {
            Toast.makeText(this, op + "Both the strings are equal", Toast.LENGTH_LONG).show();
        } else if (result < 0) {
            Toast.makeText(this, op + "String1(invoking string) is less than String2", Toast.LENGTH_LONG).show();
        } else if (result > 0) {
            Toast.makeText(this, op + "String1(invoking string) is greater than String2", Toast.LENGTH_LONG).show();
        }
    }

    void i() {
        string1 = str11.getText().toString();
        String value = character1.getText().toString();
        int result = string1.indexOf(value);
        if (result == -1) {
            Toast.makeText(this, op + "No such occurances found in the main string", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, op + "The position of the first occurance of given char is: " + result, Toast.LENGTH_LONG).show();
        }

    }

    void j() {
        string1 = str11.getText().toString();
        String value = character1.getText().toString();
        int result = string1.lastIndexOf(value);
        if (result == -1) {
            Toast.makeText(this, op + "No such occurances found in the main string", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, op + "The position of the last occurance of given char is: " + result, Toast.LENGTH_LONG).show();
        }
    }

    void k() {
        string1 = str11.getText().toString();
        String value1 = startIndex1.getText().toString();
        int start = Integer.parseInt(value1);
        String value2 = endIndex1.getText().toString();
        int end = Integer.parseInt(value2);
        String sub = string1.substring(start, end);
        Toast.makeText(this, op + "The substring is " + sub, Toast.LENGTH_LONG).show();

    }

    void l() {

        string1 = str11.getText().toString();
        String str = string1.trim();
        Toast.makeText(this, op + "string after applying trim() " + str, Toast.LENGTH_LONG).show();

    }

    void m() {
        string1 = str11.getText().toString();
        String value1 = character1.getText().toString();
        String value2 = character12.getText().toString();
        String newstr = string1.replace(value1, value2);
        if (newstr == string1) {
            Toast.makeText(this, op + "No match found for given old <char or substring>", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, op + "Old string :" + string1 + "\n New string after applying replace():\n" + newstr, Toast.LENGTH_LONG).show();
        }
    }

    void n() {
        string1 = str11.getText().toString();
        String str=string1.toLowerCase();
        Toast.makeText(this, op + str , Toast.LENGTH_LONG).show();

    }

    void o(){
        string1 = str11.getText().toString();
        String str=string1.toUpperCase();
        Toast.makeText(this, op + str , Toast.LENGTH_LONG).show();
    }


}
