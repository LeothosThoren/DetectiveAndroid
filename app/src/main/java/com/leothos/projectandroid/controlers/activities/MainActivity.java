package com.leothos.projectandroid.controlers.activities;

import android.content.Intent;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.leothos.projectandroid.R;
import com.leothos.projectandroid.base.BaseActivity;

import butterknife.BindView;

public class MainActivity extends BaseActivity {

    @BindView(R.id.button_skip_layout)
    CardView mButtonSkip;
    @BindView(R.id.screen_splash_text)
    TextView mTextView;

    @Override
    protected int getActivityLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void configureActivity() {
        mButtonSkip.setOnClickListener(v -> startMenuActivity());
    }

    private void animateTextView() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_intro_text);
        mTextView.startAnimation(animation);
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.animateTextView();
        startMenuAutomatically();
    }

    private void startMenuAutomatically() {
        Handler handler = new Handler();
        handler.postDelayed(this::startMenuActivity, 20000);
    }

    private void startMenuActivity() {
        Intent intent = new Intent(MainActivity.this, MenuActivity.class);
        this.startActivity(intent);
        finish();
    }

}
