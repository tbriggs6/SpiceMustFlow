package com.tbriggs6.spicemustflow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tbriggs6.spicemustflow.data.SimpleDataModel;

public class MainActivity extends AppCompatActivity {

    SimpleDataModel dataModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}