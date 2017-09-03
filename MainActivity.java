package com.example.alensh.sqlitedb;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 DatabaseAdaptor dbase;
    EditText UserName;
    EditText Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserName = (EditText)findViewById(R.id.UserField);
       Password =(EditText)findViewById(R.id.PasswordField);


        dbase =  new DatabaseAdaptor(this);

    }
    public void addUser(View v){
        String uname = UserName.getText().toString();
        String pass = Password.getText().toString();


        dbase.insertData(uname,pass);




    }
}
