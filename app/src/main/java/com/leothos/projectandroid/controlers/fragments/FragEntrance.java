package com.leothos.projectandroid.controlers.fragments;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.Button;
import android.widget.ImageView;

import com.leothos.projectandroid.R;
import com.leothos.projectandroid.controlers.fragments.dialogFragment.ItemDialogFragment;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragEntrance extends BaseFragment {

    @BindView(R.id.open_entrance_hall)
    Button mDoorEntrance;
    @BindView(R.id.item)
    ImageView itemView;

    //=====================
    // Fragment
    //=====================

    public static FragEntrance newInstance() {
        return new FragEntrance();
    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.fragment_mansion_entrance;
    }

    @Override
    protected void configureFragment() {
        itemView.setOnClickListener(v -> openItemDialog());
    }

    @Override
    protected void updateFragment() {
        mDoorEntrance.setOnClickListener(v -> configureHall());
    }

    /**
     * Configure and build a fragment inside a single activity in order to show the hall of the mansion after
     * clicking on the door
     */
    private void configureHall() {
        FragmentManager mFragmentManager = getChildFragmentManager();
        FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_id, FragHall.newInstance());
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }

    //===========
    // Action
    //===========

    private void openItemDialog() {
        ItemDialogFragment dialogFragment = new ItemDialogFragment();
        dialogFragment.show(getChildFragmentManager(), "MyCustomItemDialog");
    }
}

