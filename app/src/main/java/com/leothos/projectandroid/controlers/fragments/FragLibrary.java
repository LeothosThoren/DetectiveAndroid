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
public class FragLibrary extends BaseFragment {

    @BindView(R.id.button_library)
    Button mFromLibraryToHall;


    public FragLibrary() {
        // Required empty public constructor
    }

    @Override
    protected int getFragmentLayout() {
        return R.layout.fragment_frag_library;
    }

    @Override
    protected void configureFragment() {

    }

    @Override
    protected void updateFragment() {
        mFromLibraryToHall.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_fragLibrary_to_fragHall));
    }
}
