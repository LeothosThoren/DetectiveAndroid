package com.leothos.projectandroid.controlers.fragments;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.leothos.projectandroid.R;
import com.leothos.projectandroid.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragHall extends BaseFragment {


    public static FragHall newInstance() {
        return new FragHall();
    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.fragment_mansion_hall;
    }

    @Override
    protected void configureFragment() {

    }

    @Override
    protected void updateFragment() {


    }

    private void configureNextRoom(Fragment frag) {
        FragmentManager fm = getActivity().getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_id, frag);
        ft.addToBackStack(null);
        ft.commit();
    }

}
