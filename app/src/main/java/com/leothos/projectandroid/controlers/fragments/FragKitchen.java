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
public class FragKitchen extends BaseFragment {

    @BindView(R.id.button_kitchen)
    Button mFromKitchenToHall;


    public FragKitchen() {
        // Required empty public constructor
    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.fragment_frag_kitchen;
    }

    @Override
    protected void configureFragment() {

    }

    @Override
    protected void updateFragment() {
        // Go back to the hall
        mFromKitchenToHall.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_fragKitchen_to_fragHall));
    }
}
