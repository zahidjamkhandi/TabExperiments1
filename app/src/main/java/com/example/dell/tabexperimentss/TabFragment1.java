package com.example.dell.tabexperimentss;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment1 extends Fragment implements View.OnClickListener{

    public static final int TEXT_REQUEST = 1;
    public String description;
    public String select;
    public static final String TAG1="com.example.android.tabexperiments1.frag1.extra.MESSAGE";
    public static final String TAG2="select program";
    private Button strLength,strConcat,strCharAt,strEquals,strEqualsignore,strGetchars,strGetbytes,strCompare,strIndex,strLastindex,strSubstring,strTrim,strReplace,strLwr,strUpr;
    private View view;
    public TabFragment1() {
        // Required empty public constru
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.tab_fragment1, container, false);

        strLength=(Button)view.findViewById(R.id.b1);
        strLength.setOnClickListener(this);

        strConcat=(Button)view.findViewById(R.id.b2);
        strConcat.setOnClickListener(this);

        strCharAt=(Button)view.findViewById(R.id.b3);
        strCharAt.setOnClickListener(this);

        strEquals=(Button)view.findViewById(R.id.b5);
        strEquals.setOnClickListener(this);

        strEqualsignore=(Button)view.findViewById(R.id.b6);
        strEqualsignore.setOnClickListener(this);

        strGetchars=(Button)view.findViewById(R.id.b7);
        strGetchars.setOnClickListener(this);

        strGetbytes=(Button)view.findViewById(R.id.b8);
        strGetbytes.setOnClickListener(this);

        strCompare=(Button)view.findViewById(R.id.b9);
        strCompare.setOnClickListener(this);

        strIndex=(Button)view.findViewById(R.id.b10);
        strIndex.setOnClickListener(this);

        strLastindex=(Button)view.findViewById(R.id.b11);
        strLastindex.setOnClickListener(this);

        strSubstring=(Button)view.findViewById(R.id.b12);
        strSubstring.setOnClickListener(this);

        strTrim=(Button)view.findViewById(R.id.b13);
        strTrim.setOnClickListener(this);

        strReplace=(Button)view.findViewById(R.id.b14);
        strReplace.setOnClickListener(this);

        strLwr=(Button)view.findViewById(R.id.b15);
        strLwr.setOnClickListener(this);

        strUpr=(Button)view.findViewById(R.id.b16);
        strUpr.setOnClickListener(this);

        return view;

    }

    public void launchfrag1() {
        Intent intent = new Intent(getActivity(), frag1.class);
        intent.putExtra(TAG1, description);
        intent.putExtra(TAG2,select);
        startActivity(intent);
    }


    public void stringlength(View view){
        description=getString(R.string.stringlength_f1);
        select="a";
        launchfrag1();

    }


    public void stringconcatenate(View view){
        description=getString(R.string.stringconcatenate_f1);
        select="b";
        launchfrag1();
    }

    public void char_at(View view){
        description=getString(R.string.char_at_f1);
        select="c";
        launchfrag1();

    }


    public void Equals(View view){
        description=getString(R.string.equals_f1);
        select="d";
        launchfrag1();
    }

    public void equalsignorecase(View view){
        description=getString(R.string.eqalsignorecase_f1);
        select="e";
        launchfrag1();
    }

    public void get_chars(View view){
        description=getString(R.string.getchars_f1);
        select="f";
        launchfrag1();

    }

    public void getbytes(View view){
        description=getString(R.string.getbytes_f1);
        select="g";
        launchfrag1();

    }

    public void compareto(View view){
        description=getString(R.string.compareto_f1);
        select="h";
        launchfrag1();
    }

    public void indexof(View view){
        description=getString(R.string.indexof_f1);
        select="i";
        launchfrag1();
    }

    public void lastindexof(View view){
        description=getString(R.string.lastindexof_f1);
        select="j";
        launchfrag1();
    }

    public void substring(View view){
        description=getString(R.string.substring_f1);
        select="k";
        launchfrag1();
    }

    public void trim(View view){
        description=getString(R.string.trtim_f1);
        select="l";
        launchfrag1();
    }

    public void replace(View view){
        description=getString(R.string.replace_f1);
        select="m";
        launchfrag1();
    }

    public void tolowercase(View view){
        description=getString(R.string.tolowercase_f1);
        select="n";
        launchfrag1();
    }

    public void touppercase(View view){
        description=getString(R.string.touppercase_f1);
        select="o";
        launchfrag1();
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch (id){
            case R.id.b1:stringlength(view);
            break;

            case R.id.b2:stringconcatenate(view);
                break;

            case R.id.b3:char_at(view);
                break;

            case R.id.b5:Equals(view);
                break;

            case R.id.b6:equalsignorecase(view);
                break;

            case R.id.b7:get_chars(view);
                break;

            case R.id.b8:getbytes(view);
                break;

            case R.id.b9:compareto(view);
                break;

            case R.id.b10:indexof(view);
                break;

            case R.id.b11:lastindexof(view);
                break;

            case R.id.b12:substring(view);
                break;

            case R.id.b13:trim(view);
                break;

            case R.id.b14:replace(view);
                break;

            case R.id.b15:tolowercase(view);
                break;

            case R.id.b16:touppercase(view);
                break;
        }

    }
}
