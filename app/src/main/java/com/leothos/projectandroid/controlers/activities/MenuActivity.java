package com.leothos.projectandroid.controlers.activities;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.leothos.projectandroid.R;

import butterknife.BindView;

public class MenuActivity extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.menu_play_button)
    Button mPlayButton;
    @BindView(R.id.menu_continue_button)
    Button mContinueButton;


    @Override
    protected int getActivityLayout() {
        return R.layout.activity_menu;
    }

    @Override
    protected void configureActivity() {
        this.init();
    }

    private void init() {
        mPlayButton.setOnClickListener(this);
        mContinueButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.menu_play_button:
                this.startGame();
                break;
            case R.id.menu_continue_button:
                //Todo
                Toast.makeText(this, "No data for now!", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    private void startGame() {
        Intent i = new Intent(this, GameActivity.class);
        startActivity(i);
    }
}
