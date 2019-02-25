package com.leothos.projectandroid.controlers.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.leothos.projectandroid.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class CustomDialogFragment extends DialogFragment implements View.OnClickListener {

    @BindView(R.id.map)
    Button mMapButton;
    @BindView(R.id.items)
    Button mItemsButton;
    @BindView(R.id.exit)
    Button mExitButton;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_custom_dialog, container, false);
        ButterKnife.bind(this, view);

        mMapButton.setOnClickListener(this);
        mItemsButton.setOnClickListener(this);
        mExitButton.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.map:
                Toast.makeText(getContext(), "Show map", Toast.LENGTH_SHORT).show();
                break;
            case R.id.items:
                Toast.makeText(getContext(), "Show items", Toast.LENGTH_SHORT).show();
                break;
            case R.id.exit:
                Toast.makeText(getContext(), "Show exit", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
