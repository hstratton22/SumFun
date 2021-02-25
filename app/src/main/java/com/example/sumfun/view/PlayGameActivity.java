package com.example.sumfun.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sumfun.R;
import com.example.sumfun.presenter.Presenter;

public class PlayGameActivity extends AppCompatActivity {
    private Presenter presenter;
    //for playGameActivity
    private TextView first_num;
    private TextView operator;
    private TextView second_num;
    private TextView equals;
    private EditText response;
    private int rand;
    private int curLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_game);
    }
    public void displayToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}