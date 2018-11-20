package com.leothos.projectandroid.controlers.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leothos.projectandroid.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MansionHall extends Fragment {


    public MansionHall() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mansion_hall, container, false);
    }

}
