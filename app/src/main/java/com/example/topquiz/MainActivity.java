package com.example.topquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private TextView mGreet;
    private TextView mAskName;
    private EditText mNameIn;
    private Button mPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGreet = (TextView)findViewById(R.id.activity_main_greet_text);
        mAskName = (TextView)findViewById(R.id.activity_main_ask_name_text);
        mNameIn = (EditText)findViewById(R.id.avtivity_main_name_input);
        mPlay = (Button)findViewById(R.id.activity_main_play_btn);

        mPlay.setEnabled(false);
        mNameIn.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mPlay.setEnabled(s.toString().length()!=0);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        mPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
