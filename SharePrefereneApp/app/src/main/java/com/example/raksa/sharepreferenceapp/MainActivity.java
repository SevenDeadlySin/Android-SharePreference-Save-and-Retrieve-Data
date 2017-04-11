package com.example.raksa.sharepreferenceapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextFullName , editTextProfession;
    TextView textViewPersonName , textViewProfession;
    LinearLayout pageLayout;
    Switch switchChangePageColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFullName = (EditText) findViewById(R.id.editTextFullName);
        editTextProfession = (EditText) findViewById(R.id.editTextProfession);
        textViewPersonName = (TextView) findViewById(R.id.textViewPersonName);
        textViewProfession = (TextView) findViewById(R.id.textViewProfession);
        pageLayout = (LinearLayout) findViewById(R.id.pageLayout);
        switchChangePageColor = (Switch) findViewById(R.id.switchChangePageColor);


    }

    public void onSaveButton(View view) {


        //get the input from the view..
        String fullName = editTextFullName.getText().toString();
        String profession = editTextProfession.getText().toString();

        // get the reference to the the activity level SharePreference file...
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);

        //get access to the editor interface for performing some task...(Put the data or edit)
        SharedPreferences.Editor editor = sharedPreferences.edit();
        //put the data to the SharedPreference..
        editor.putString("FULLNAME",fullName);
        editor.putString("PROFESSION",profession);
        editor.putInt("PRO_ID",516);
        editor.apply();/// Can use commit(); method too.. but commit() will return the boolean..

    }

    public void onLoadButton(View view) {

        //get the reference to the activity level SharePreference file...
        SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);

        //get data from sharedPreferences
        String personFullName = sharedPreferences.getString("FULLNAME","N/A"); //defaut value for String is N/A
        String profession = sharedPreferences.getString("PROFESSION","N/A");
        int profile_id = sharedPreferences.getInt("PRO_ID",0); //default value for int is 0

        textViewPersonName.setText(personFullName);
        textViewProfession.setText(profession+": "+profile_id);

    }

    public void OnOpenSecondActivityButton(View view) {
    }
}
