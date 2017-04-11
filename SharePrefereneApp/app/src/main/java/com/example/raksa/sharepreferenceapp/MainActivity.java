package com.example.raksa.sharepreferenceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editTextFullName , editTextPassword;
    TextView textViewPersonName , textViewProfession;
    LinearLayout pageLayout;
    Switch switchChangePageColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFullName = (EditText) findViewById(R.id.editTextFullName);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        textViewPersonName = (TextView) findViewById(R.id.textViewPersonName);
        textViewProfession = (TextView) findViewById(R.id.textViewProfession);
        pageLayout = (LinearLayout) findViewById(R.id.pageLayout);
        switchChangePageColor = (Switch) findViewById(R.id.switchChangePageColor);


    }

    public void onSaveButton(View view) {
    }

    public void onLoadButton(View view) {
    }

    public void OnOpenSecondActivityButton(View view) {
    }
}
