package com.example.dell.tabexperimentss;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment2 extends Fragment implements View.OnClickListener{

    public static final int TEXT_REQUEST = 1;
    public String description;
    public String select;
    private View view;
    public static final String TAG1="com.example.android.tabexperiments2.frag1.extra.MESSAGE";
    public static final String TAG2="select program";



    public TabFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.tab_fragment2, container, false);


        return view;
    }

    public void launchfrag1() {
        Intent intent = new Intent(getActivity(), frag1.class);
        intent.putExtra(TAG1,description);
        intent.putExtra(TAG2,select);
        startActivity(intent);
    }

    public void length(View view){
        description=getString(R.string.lenght_f2);
        select="p";
        launchfrag1();

    }

    public void capacity(View view){
        description=getString(R.string.capacity_f2);
        select="q";
        launchfrag1();

    }

    public void ensurecapacity(View view){
        description=getString(R.string.ensurecapacity_f2);
        select="r";
        launchfrag1();

    }

    public void setlength(View view){
        description=getString(R.string.setlength_f2);
        select="s";
        launchfrag1();

    }

    public void Append(View view){
        description=getString(R.string.append_f2);
        select="t";
        launchfrag1();

    }

    public void Insert(View view){
        description=getString(R.string.insert_f2);
        select="u";
        launchfrag1();

    }

    public void Reverse(View view){
        description=getString(R.string.reverse_f2);
        select="v";
        launchfrag1();

    }

    public void Delete(View view){
        description=getString(R.string.delete_f2);
        select="w";
        launchfrag1();

    }

    public void deletecharat(View view){
        description=getString(R.string.deletecharat_f2);
        select="x";
        launchfrag1();

    }

    public void Replace(View view){
        description=getString(R.string.replace_f2);
        select="y";
        launchfrag1();

    }

    public void Substrings(View view){
        description=getString(R.string.substring_f2);
        select="z";
        launchfrag1();

    }


    @Override
    public void onClick(View view) {
        int id=view.getId();


    }
}
