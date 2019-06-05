package com.leothos.projectandroid.base;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leothos.projectandroid.models.ItemObject;

import butterknife.ButterKnife;


public abstract class BaseFragment extends Fragment {

    public BaseFragment() {
    }

    protected abstract int getFragmentLayout();

    protected abstract void configureFragment();

    protected abstract void updateFragment();


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(this.getFragmentLayout(), container, false);
        ButterKnife.bind(this, view);

        this.configureFragment();
        this.updateFragment();

        return view;
    }


    public interface implementClickOnButton {
        void changeRoom();
    }

    public interface PickItemObject {
        void pickItem(ItemObject itemObject);
    }

}