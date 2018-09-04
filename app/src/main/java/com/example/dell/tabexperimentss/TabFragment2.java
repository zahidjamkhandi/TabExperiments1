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
public class TabFragment2 extends Fragment implements View.OnClickListener {

    public static final int TEXT_REQUEST = 1;
    public String description;
    public String select;
    private View view;
    public static final String TAG3 = "com.example.android.tabexperiments2.frag1.extra.MESSAGE";
    public static final String TAG4 = "select program2";
    private Button bfrlength,bfrcapacity,bfrensure,bfrsetlength,bfrappend,bfrinsert,bfrreverse,bfrdelete,bfrdeletechar,bfrreplace,bfrsubstring;


    public TabFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.tab_fragment2, container, false);

        bfrlength=(Button)view.findViewById(R.id.sb1);
        bfrlength.setOnClickListener(this);

        bfrcapacity=(Button)view.findViewById(R.id.sb2);
        bfrcapacity.setOnClickListener(this);

        bfrensure=(Button)view.findViewById(R.id.sb3);
        bfrensure.setOnClickListener(this);

        bfrsetlength=(Button)view.findViewById(R.id.sb4);
        bfrsetlength.setOnClickListener(this);

        bfrappend=(Button)view.findViewById(R.id.sb5);
        bfrappend.setOnClickListener(this);

        bfrinsert=(Button)view.findViewById(R.id.sb6);
        bfrinsert.setOnClickListener(this);

        bfrreverse=(Button)view.findViewById(R.id.sb7);
        bfrreverse.setOnClickListener(this);

        bfrdelete=(Button)view.findViewById(R.id.sb8);
        bfrdelete.setOnClickListener(this);

        bfrdeletechar=(Button)view.findViewById(R.id.sb9);
        bfrdeletechar.setOnClickListener(this);

        bfrreplace=(Button)view.findViewById(R.id.sb10);
        bfrreplace.setOnClickListener(this);

        bfrsubstring=(Button)view.findViewById(R.id.sb11);
        bfrsubstring.setOnClickListener(this);


        return view;
    }

    public void launchfrag1() {
        Intent intent = new Intent(getActivity(), frag2.class);
        intent.putExtra(TAG3, description);
        intent.putExtra(TAG4, select);
        startActivity(intent);
    }

    public void length(View view) {
        description = getString(R.string.lenght_f2);
        select = "a";
        launchfrag1();

    }

    public void capacity(View view) {
        description = getString(R.string.capacity_f2);
        select = "b";
        launchfrag1();

    }

    public void ensurecapacity(View view) {
        description = getString(R.string.ensurecapacity_f2);
        select = "c";
        launchfrag1();

    }

    public void setlength(View view) {
        description = getString(R.string.setlength_f2);
        select = "d";
        launchfrag1();

    }

    public void Append(View view) {
        description = getString(R.string.append_f2);
        select = "e";
        launchfrag1();

    }

    public void Insert(View view) {
        description = getString(R.string.insert_f2);
        select = "f";
        launchfrag1();

    }

    public void Reverse(View view) {
        description = getString(R.string.reverse_f2);
        select = "g";
        launchfrag1();

    }

    public void Delete(View view) {
        description = getString(R.string.delete_f2);
        select = "h";
        launchfrag1();

    }

    public void deletecharat(View view) {
        description = getString(R.string.deletecharat_f2);
        select = "i";
        launchfrag1();

    }

    public void Replace(View view) {
        description = getString(R.string.replace_f2);
        select = "j";
        launchfrag1();

    }

    public void Substrings(View view) {
        description = getString(R.string.substring_f2);
        select = "k";
        launchfrag1();

    }


    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch (id){
            case R.id.sb1:length(view);
            break;

            case R.id.sb2:capacity(view);
                break;

            case R.id.sb3:ensurecapacity(view);
                break;

            case R.id.sb4:setlength(view);
                break;

            case R.id.sb5:Append(view);
                break;

            case R.id.sb6:Insert(view);
                break;

            case R.id.sb7:Reverse(view);
                break;

            case R.id.sb8:Delete(view);
                break;

            case R.id.sb9:deletecharat(view);
                break;
            case R.id.sb10:Replace(view);
                break;

            case R.id.sb11:Substrings(view);
                break;

        }


    }
}
