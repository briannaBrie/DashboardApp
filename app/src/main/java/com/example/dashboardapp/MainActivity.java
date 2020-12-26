package com.example.dashboardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.imgv_add) ImageView add;
    @BindView(R.id.imgv_home) ImageView home;
    @BindView(R.id.imgv_quiz) ImageView quiz;
    @BindView(R.id.imgv_results) ImageView results;
    @BindView(R.id.imgv_schedule) ImageView schedule;
    @BindView(R.id.imgv_search) ImageView search;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);


    }
}