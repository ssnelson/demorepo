package com.example.james.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.TextView;

public class CharacterCreation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_creation);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainMenu.EXTRA_MESSAGE);

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(name);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_character_creation);
        layout.addView(textView);
    }
}
