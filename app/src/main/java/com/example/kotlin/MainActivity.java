package com.example.kotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.kotlin.jetpack.JetpackActivity;
import com.example.kotlin.jetpack.lifecycle.LifeCycleActivity;
import com.example.kotlin.jetpack.livedata.LiveDataActivity;
import com.example.kotlin.jetpack.viewmodel.ViewModelActivity;
import com.example.kotlin.jetpack.viewmodel.ViewModelActivity2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onJetpack(View v) {
        startActivity(new Intent(this, JetpackActivity.class));
    }

    public void onViewModel(View v) {
        startActivity(new Intent(this, ViewModelActivity.class));
    }

    public void onViewModel2(View v) {
        startActivity(new Intent(this, ViewModelActivity2.class));
    }

    public void onLiveData(View v) {
        startActivity(new Intent(this, LiveDataActivity.class));
    }
}