package com.example.guest.madlibs;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Bind(R.id.companyPitchButton) Button mCompanyPitchButton;
    @Bind(R.id.otherButton) Button mOtherButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        mCompanyPitchButton.setOnClickListener(this);
        mOtherButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        if(v == mCompanyPitchButton){
            Intent intent = new Intent(MainActivity.this, CompanyPitchActivity.class);
            startActivity(intent);
        }
        if(v == mOtherButton){
            Intent intent = new Intent(MainActivity.this, OtherActivity.class);
            startActivity(intent);
        }
    }
}
