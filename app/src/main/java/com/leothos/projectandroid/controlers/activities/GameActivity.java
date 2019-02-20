package com.leothos.projectandroid.controlers.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;

import com.leothos.projectandroid.R;
import com.leothos.projectandroid.controlers.fragments.CustomDialogFragment;
import com.leothos.projectandroid.controlers.fragments.MansionEntranceFrag;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GameActivity extends AppCompatActivity {

    //Widget
    @BindView(R.id.option_button)
    CardView mCardViewOptionButton;

    //var
    private MansionEntranceFrag mEntranceFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_game);
        ButterKnife.bind(this);

        //handle the click to show the right fragment
        this.configureAndShowMansionEntranceFragment();
        this.mCardViewOptionButton.setOnClickListener(v -> openOptionMenu());

    }


    /**
     * Configure and build a fragment inside a single activity in order to show the entrance of the mansion
     * the door is clickable
     */
    private void configureAndShowMansionEntranceFragment() {
        mEntranceFragment = (MansionEntranceFrag) getSupportFragmentManager().findFragmentById(R.id.fragment_entrance_id);
        if (mEntranceFragment == null) {
            mEntranceFragment = new MansionEntranceFrag();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_entrance_id, mEntranceFragment)
                    .commit();
        }
    }

    /**
     * The idea is to open a menu from every stage of the game
     */
    private void openOptionMenu() {
        CustomDialogFragment dialogFragment = new CustomDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "MyCustomDialog");
    }

}
