package com.example.challengesmodule7.CustomDatePicker;

import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.challengesmodule7.R;

public class CustomDatePicker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_date_picker);
    }

    public void onClickPickDate(View view) {
        DialogFragment newFragment = new CustomDatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "DatePicker");
    }
}
