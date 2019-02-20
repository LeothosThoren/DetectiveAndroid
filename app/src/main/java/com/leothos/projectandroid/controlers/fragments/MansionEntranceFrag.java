package com.leothos.projectandroid.controlers.fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.leothos.projectandroid.R;

import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class MansionEntranceFrag extends Fragment {

    @BindView(R.id.open_entrance_hall)
    Button mDoorEntrance;
    private MansionHallFrag mHallFragment = new MansionHallFrag();
    private MansionEntranceFrag mMansionEntranceFrag;

    public MansionEntranceFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mansion_entrance, container, false);
        ButterKnife.bind(this, view);
        mDoorEntrance.setOnClickListener(v -> {
                    destroyPreviousFrag();
                    configureAndShowMansionHallFragment();
                }
        );

        return view;
    }

    /**
     * Configure and build a fragment inside a single activity in order to show the hall of the mansion after
     * clicking on the door
     */
    private void configureAndShowMansionHallFragment() {
        mHallFragment = (MansionHallFrag) Objects.requireNonNull(getActivity()).getSupportFragmentManager()
                .findFragmentById(R.id.fragment_hall_id);

        if (mHallFragment == null) {
            mHallFragment = new MansionHallFrag();
            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_hall_id, mHallFragment, "NewFragTag")
                    .commit();
        }

//        final FragmentTransaction ft = getFragmentManager().beginTransaction();
//        ft.replace(R.id.fragment_hall_id, mHallFragment, "NewFragmentTag")
//                .addToBackStack(null)
//                .commit();
    }

    private void destroyPreviousFrag() {
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        mMansionEntranceFrag = (MansionEntranceFrag) Objects.requireNonNull(getActivity()).getSupportFragmentManager()
                .findFragmentById(R.id.fragment_entrance_id);
        if (mMansionEntranceFrag != null) {
            FragmentTransaction fragmentTransaction =
                    fragmentManager.beginTransaction();
            fragmentTransaction.remove(mMansionEntranceFrag).commit();
        }
    }

}
