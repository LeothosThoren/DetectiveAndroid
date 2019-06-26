package com.leothos.projectandroid.controlers.fragments;


import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

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
        mDoorEntrance.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_fragEntrance_to_fragHall));
    }


}

