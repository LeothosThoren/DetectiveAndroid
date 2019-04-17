package com.leothos.projectandroid.controlers.fragments.dialogFragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.leothos.projectandroid.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class ItemDialogFragment extends DialogFragment implements View.OnClickListener {

    @BindView(R.id.item_description)
    TextView description;
    @BindView(R.id.item_leave_button)
    Button leaveButton;
    @BindView(R.id.item_take_button)
    Button takeButton;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_item_dialog, container, false);
        ButterKnife.bind(this, view);
        takeButton.setOnClickListener(this);
        leaveButton.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.item_leave_button:
                Toast.makeText(getContext(), "Leave button pressed", Toast.LENGTH_SHORT).show();
                getDialog().dismiss();
                break;
            case R.id.item_take_button:
                Toast.makeText(getContext(), "Take button pressed", Toast.LENGTH_SHORT).show();
                getDialog().dismiss();
                break;
        }
    }
}
