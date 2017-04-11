package com.example.raksa.sharepreferenceapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView fullName , profession;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        fullName = (TextView) findViewById(R.id.textViewPersonName);
        profession = (TextView) findViewById(R.id.textViewProfession);

    }

    public void onClearButton(View view) {

    }

    public void onRemoveButton(View view) {
    }

    public void onLoadButton(View view) {

        SharedPreferences sharedPreferences = getSharedPreferences(getPackageName()+"USER_PROFILE", Context.MODE_PRIVATE);
        String sfullname = sharedPreferences.getString("FULLNAME1","N/A");
        String sprofession = sharedPreferences.getString("PROFESSION1","N/A");
        int sprofileID = sharedPreferences.getInt("PRO_ID1",0);

        fullName.setText(sfullname);
        profession.setText(sprofession+" :"+sprofileID);

    }
}
