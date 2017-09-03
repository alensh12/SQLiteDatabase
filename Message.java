package com.example.alensh.sqlitedb;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

/**
 * Created by alensh on 9/3/17.
 */

public class Message {
 public static void message(Context context,String message){
     Toast.makeText(context,message,Toast.LENGTH_LONG).show();
 }
}
