package com.NITK.Apoorva.EventManager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class profile extends AppCompatActivity {
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    public void set(View view)

    {
        EditText s= (EditText) findViewById(R.id.name_field);
        name = s.getText().toString();
        TextView meow = (TextView) findViewById(R.id.name);
        meow.setText(name);
    }
}
