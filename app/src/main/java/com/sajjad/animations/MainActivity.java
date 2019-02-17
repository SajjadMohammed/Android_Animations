package com.sajjad.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView test=findViewById(R.id.test);

        Animation toRight= AnimationUtils.loadAnimation(this,R.anim.translate_from_upright);
        test.startAnimation(toRight);
    }
}