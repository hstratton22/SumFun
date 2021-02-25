package com.example.sumfun.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.sumfun.R;
import com.example.sumfun.presenter.Presenter;

public class MainActivity extends AppCompatActivity {
    private Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter= new Presenter(this);

    }

}