package com.leothos.projectandroid;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CardView mButtonSkip;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialisation
        mButtonSkip = (CardView) findViewById(R.id.button_skip_layout);
        mTextView = (TextView) findViewById(R.id.screen_splash_text);
        //Methods
        mButtonSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startMenuActivity();
            }
        });
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
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startMenuActivity();
            }
        }, 20000);
    }

    private void startMenuActivity() {
        Intent intent = new Intent(MainActivity.this, MenuActivity.class);
        this.startActivity(intent);
    }

}
