package com.leothos.projectandroid.controlers.fragments;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.Button;

import com.leothos.projectandroid.R;
import com.leothos.projectandroid.base.BaseFragment;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragEntrance extends BaseFragment {

    @BindView(R.id.open_entrance_hall)
    Button mDoorEntrance;

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
        Fragment frag = new FragHall();
        FragmentManager fm = getActivity().getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_id, frag);
        ft.addToBackStack(null);
        ft.commit();
    }
}

