package com.example.kotlin.normal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kotlin.R;
import com.example.kotlin.normal.lambda.LambdaActivity;
import com.example.kotlin.normal.late.LateActivity;
import com.example.kotlin.normal.logic.LogicActivity;
import com.example.kotlin.normal.npe.NpeActivity;
import com.example.kotlin.normal.obj.ObjActivity;
import com.example.kotlin.normal.standard.StandardActivity;
import com.example.kotlin.normal.var1.FunActivity;
import com.example.kotlin.normal.var1.VarActivity;

public class KotlinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotlin);
    }

    public void onVar(View v) {
        startActivity(new Intent(this, VarActivity.class));
    }

    public void onFun(View v) {
        startActivity(new Intent(this, FunActivity.class));
    }

    public void onLogic(View v) {
        startActivity(new Intent(this, LogicActivity.class));
    }

    public void onObj(View v) {
        startActivity(new Intent(this, ObjActivity.class));
    }

    public void onLambda(View v) {
        startActivity(new Intent(this, LambdaActivity.class));
    }

    public void onNpe(View v) {
        startActivity(new Intent(this, NpeActivity.class));
    }

    public void onStandard(View v) {
        startActivity(new Intent(this, StandardActivity.class));
    }

    public void onLate(View v) {
        startActivity(new Intent(this, LateActivity.class));
    }

}