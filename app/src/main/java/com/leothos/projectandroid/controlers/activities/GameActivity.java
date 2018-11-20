package com.leothos.projectandroid.controlers.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.leothos.projectandroid.R;
import com.leothos.projectandroid.controlers.fragments.MansionEntrance;
import com.leothos.projectandroid.controlers.fragments.MansionHall;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GameActivity extends AppCompatActivity {


    //var
    private MansionEntrance mEntranceFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);
        ButterKnife.bind(this);

        //handle the click to show the right fragment
        this.configureAndShowMansionEntranceFragment();

    }


    /**
     * Configure and build a fragment inside a single activity in order to show the entrance of the mansion
     * the door is clickable
     * */
    private void configureAndShowMansionEntranceFragment() {
        mEntranceFragment = (MansionEntrance) getSupportFragmentManager().findFragmentById(R.id.fragment_entrance_id);
        if (mEntranceFragment == null) {
            mEntranceFragment = new MansionEntrance();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_entrance_id, mEntranceFragment)
                    .commit();
        }
    }


}
