package com.example.challengesmodule7.BatteryChallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.challengesmodule7.R;

public class BatteryActivity extends AppCompatActivity {

    private int mCount;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery);
        initView();

    }

    private void initView() {
        mImageView = findViewById(R.id.imageView_battery);
    }

    public void onClickMinus(View view) {
        if (mCount > 0) {

            mCount -= 1;

            switch (mCount) {
                case 0:
                    mImageView.setImageLevel(0);
                    break;
                case 1:
                    mImageView.setImageLevel(1);
                    break;
                case 2:
                    mImageView.setImageLevel(2);
                    break;
                case 3:
                    mImageView.setImageLevel(3);
                    break;
                case 4:
                    mImageView.setImageLevel(4);
                    break;
                case 5:
                    mImageView.setImageLevel(5);
                    break;
                case 6:
                    mImageView.setImageLevel(6);
                    break;
            }
        }
    }

    public void onClickPlus(View view) {
        if (mCount < 6) {

            mCount += 1;

            switch (mCount) {
                case 0:
                    mImageView.setImageLevel(0);
                    break;
                case 1:
                    mImageView.setImageLevel(1);
                    break;
                case 2:
                    mImageView.setImageLevel(2);
                    break;
                case 3:
                    mImageView.setImageLevel(3);
                    break;
                case 4:
                    mImageView.setImageLevel(4);
                    break;
                case 5:
                    mImageView.setImageLevel(5);
                    break;
                case 6:
                    mImageView.setImageLevel(6);
                    break;
            }
        }

    }
}
