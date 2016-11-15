package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ResultsActivity extends AppCompatActivity {

    @Bind(R.id.madLibs) TextView mMadLibText;
    @Bind(R.id.tryAgainButton) Button mTryAgainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Intent intent = getIntent();

        ButterKnife.bind(this);

        String person = intent.getStringExtra("person");
        String action = intent.getStringExtra("action");
        String when = intent.getStringExtra("when");

        String company = intent.getStringExtra("company");
        String offering = intent.getStringExtra("offering");
        String audience = intent.getStringExtra("audience");
        String problem = intent.getStringExtra("problem");
        String secretWeapon = intent.getStringExtra("secretWeapon");

        if(person == null && action == null && when == null) {
            mMadLibText.setText("My company, " + company + " , is developing " + offering + " to help " + audience + " " + problem + " with " + secretWeapon + ".");
        } else{
            mMadLibText.setText(person + "will " + action + " " + when + ".");
        }

        mTryAgainButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent (ResultsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
