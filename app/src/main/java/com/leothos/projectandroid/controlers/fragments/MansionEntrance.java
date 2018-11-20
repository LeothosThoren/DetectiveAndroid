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
public class MansionEntrance extends Fragment {

    @BindView(R.id.open_entrance_hall)
    Button mDoorEntrance;
    private MansionHall mHallFragment = new MansionHall();
    private MansionEntrance mMansionEntrance;

    public MansionEntrance() {
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
        mHallFragment = (MansionHall) Objects.requireNonNull(getActivity()).getSupportFragmentManager()
                .findFragmentById(R.id.fragment_hall_id);

        if (mHallFragment == null) {
            mHallFragment = new MansionHall();
            getActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_hall_id, mHallFragment, "NewFragTag")
                    .addToBackStack(null)
                    .commit();
        }

//        final FragmentTransaction ft = getFragmentManager().beginTransaction();
//        ft.replace(R.id.fragment_hall_id, mHallFragment, "NewFragmentTag")
//                .addToBackStack(null)
//                .commit();
    }

    private void destroyPreviousFrag() {
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        mMansionEntrance = (MansionEntrance) Objects.requireNonNull(getActivity()).getSupportFragmentManager()
                .findFragmentById(R.id.fragment_entrance_id);
        if (mMansionEntrance != null) {
            FragmentTransaction fragmentTransaction =
                    fragmentManager.beginTransaction();
            fragmentTransaction.remove(mMansionEntrance).commit();
        }
    }

}
