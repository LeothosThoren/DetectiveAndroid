package com.leothos.projectandroid.controlers.activities;

import android.support.v4.app.Fragment;

import com.leothos.projectandroid.R;
import com.leothos.projectandroid.controlers.fragments.FragEntrance;
import com.leothos.projectandroid.controlers.fragments.dialogFragment.CustomDialogFragment;

public class GameActivity extends BaseActivity {

    //var
    private FragEntrance mFragEntrance;

    @Override
    protected int getActivityLayout() {
        return R.layout.activity_main_game;
    }

    @Override
    protected void configureActivity() {
        configureFragChange();
    }


    //============================
    // Fragment methods
    //============================

    /**
     * Configure and build a fragment inside a single activity in order to show the entrance of the mansion
     * the door is clickable
     */
    private void configureFragChange() {

        if (mFragEntrance == null) mFragEntrance = FragEntrance.newInstance();
        displayFragment(mFragEntrance);
    }

    protected void displayFragment(Fragment fragment) {
        if (!fragment.isVisible())
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_id, fragment).commit();
    }

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
