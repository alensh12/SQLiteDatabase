package com.example.alensh.sqlitedb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
 DbHelper dbase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       dbase =  new DbHelper(this);
        dbase.getWritableDatabase();
    }
}
