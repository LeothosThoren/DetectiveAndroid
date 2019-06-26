package com.leothos.projectandroid.controlers.activities;

import com.leothos.projectandroid.R;
import com.leothos.projectandroid.base.BaseActivity;
import com.leothos.projectandroid.controlers.fragments.dialogFragment.CustomDialogFragment;

public class GameActivity extends BaseActivity {

    //var
    // private FragEntrance mFragEntrance;

    @Override
    protected int getActivityLayout() {
        return R.layout.activity_main_game;
    }

    @Override
    protected void configureActivity() {
        // configureFragChange();
    }


    //============================
    // Fragment methods
    //============================


    //==========================
    // Menu handler
    //==========================

    /**
     * The idea is to open a menu from every stage of the game
     */
    private void openOptionMenu() {
        CustomDialogFragment dialogFragment = new CustomDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "MyCustomDialog");
    }

    @Override
    public void onBackPressed() {
        openOptionMenu();
    }

}
