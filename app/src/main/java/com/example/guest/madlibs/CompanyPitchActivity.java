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

public class CompanyPitchActivity extends AppCompatActivity {

    @Bind(R.id.generateButton) Button mGenerateButton;
    @Bind(R.id.companyText) EditText mCompanyText;
    @Bind(R.id.offeringText) EditText mOfferingText;
    @Bind(R.id.audienceText) EditText mAudienceText;
    @Bind(R.id.problemText) EditText mProblemText;
    @Bind(R.id.secretWeaponText) EditText mSecretWeaponText;
    @Bind(R.id.titleText) TextView mTitleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_pitch);

        ButterKnife.bind(this);

        Typeface haydenBrush = Typeface.createFromAsset(getAssets(), "fonts/HaydonBrush_PERSONAL_USE.ttf");
        mTitleText.setTypeface(haydenBrush);

        mGenerateButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                if(mCompanyText.getText().toString().trim().equals("")){
                    mCompanyText.setError("Field required");
                } else if(mOfferingText.getText().toString().trim().equals("")){
                    mOfferingText.setError("Field required");
                } else if(mAudienceText.getText().toString().trim().equals("")){
                    mAudienceText.setError("Field required");
                } else if(mProblemText.getText().toString().trim().equals("")){
                    mProblemText.setError("Field required");
                } else if(mSecretWeaponText.getText().toString().trim().equals("")){
                    mSecretWeaponText.setError("Field required");
                } else {
                    String company = mCompanyText.getText().toString();
                    String offering = mOfferingText.getText().toString();
                    String audience = mAudienceText.getText().toString();
                    String problem = mProblemText.getText().toString();
                    String secretWeapon = mSecretWeaponText.getText().toString();
                    Intent intent = new Intent(CompanyPitchActivity.this, ResultsActivity.class);
                    intent.putExtra("company", company);
                    intent.putExtra("offering", offering);
                    intent.putExtra("audience", audience);
                    intent.putExtra("problem", problem);
                    intent.putExtra("secretWeapon", secretWeapon);
                    startActivity(intent);
                }
            }
        });
    }
}
