package com.example.challengesmodule7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.challengesmodule7.BatteryChallenge.BatteryActivity;
import com.example.challengesmodule7.CameraChallenge.CameraApiActivity;
import com.example.challengesmodule7.CollapsingTooldbar.CollapsingToolbar;
import com.example.challengesmodule7.CustomDatePicker.CustomDatePicker;
import com.example.challengesmodule7.Hobby.HobbyActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickChallenge1(View view) {
        Intent intent = new Intent(this, HobbyActivity.class);
        startActivity(intent);
    }

    public void onClickChallenge2(View view) {
        Intent intent = new Intent(this, BatteryActivity.class);
        startActivity(intent);
    }

    public void onClickChallenge3(View view) {
    }

    public void onClickChallenge4(View view) {
        Intent intent = new Intent(this, CustomDatePicker.class);
        startActivity(intent);
    }

    public void onClickChallenge5(View view) {
        Intent intent = new Intent(this, CollapsingToolbar.class);
        startActivity(intent);
    }

    public void onClickChallenge6(View view) {
        Intent intent = new Intent(this, CameraApiActivity.class);
        startActivity(intent);
    }
}
