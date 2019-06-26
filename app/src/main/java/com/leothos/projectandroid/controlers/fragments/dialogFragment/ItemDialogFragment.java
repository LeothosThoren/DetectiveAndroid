package com.leothos.projectandroid.controlers.fragments.dialogFragment;


import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import com.leothos.projectandroid.R;
import com.leothos.projectandroid.base.BaseFragment;
import com.leothos.projectandroid.models.ItemObject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class ItemDialogFragment extends DialogFragment implements View.OnClickListener, BaseFragment.PickItemObject {

    // Widget
    @BindView(R.id.item_description)
    TextView description;
    @BindView(R.id.item_leave_button)
    Button leaveButton;
    @BindView(R.id.item_take_button)
    Button takeButton;
    @BindView(R.id.item_picture_detail)
    ImageView itemPicture;
    // var
    private ItemObject mItemObject;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_item_dialog, container, false);
        ButterKnife.bind(this, view);
        getDialog().setTitle(getString(R.string.dialog_title));


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

    @Override
    public void onResume() {
        // Get existing layout params for the window
        if (getDialog().getWindow() != null) {
            ViewGroup.LayoutParams params = getDialog().getWindow().getAttributes();
            params.width = WindowManager.LayoutParams.MATCH_PARENT;
            params.height = WindowManager.LayoutParams.MATCH_PARENT;
            getDialog().getWindow().setAttributes((android.view.WindowManager.LayoutParams) params);

            super.onResume();
        }
    }

    //**********
    // Action
    //*********

    @Override
    public void pickItem(ItemObject itemObject) {
        Log.d("DEBUG", "pickItem: " + itemObject.getItemDescription());

    }

}
