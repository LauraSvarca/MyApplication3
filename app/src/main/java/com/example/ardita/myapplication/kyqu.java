package com.example.ardita.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.widget.*;
public class kyqu extends AppCompatActivity implements AdapterView.OnItemSelectedListener, OnClickListener {

    String[] Drejtimi = { "Shkenca natyrore", "Shkenca shoqerore", "Mjeksia", "Shkolla teknike" };
    CheckBox matematike,fizike,biologji,gjuheshqipe,gjuheangleze,kimi;
    Button vazhdo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kyqu);
        Spinner spin = (Spinner) findViewById(R.id.Spinner);
        spin.setOnItemSelectedListener(this);
        addListenerOnButtonClick();
        vazhdo.setOnClickListener(this);

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,Drejtimi);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);
    }

    private void addListenerOnButtonClick() {
        matematike=(CheckBox)findViewById(R.id.lenda1);
        fizike=(CheckBox)findViewById(R.id.lenda2);
        biologji=(CheckBox)findViewById(R.id.lenda3);
        gjuheshqipe=(CheckBox)findViewById(R.id.lenda4);
        gjuheangleze=(CheckBox)findViewById(R.id.lenda5);
        kimi=(CheckBox)findViewById(R.id.lenda6);
        vazhdo=(Button)findViewById(R.id.vazhdo);

    }


    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {
        Toast.makeText(getApplicationContext(),Drejtimi[position] ,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.vazhdo:

                startActivity(new Intent(this, info.class));
                break;
        }
    }
}
