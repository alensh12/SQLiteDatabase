package com.example.alensh.sqlitedb;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Message;


/**
 * Created by alensh on 9/3/17.
 */

public class DbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "AlenshDB.db";
    private static final String TABLE_NAME = "AlenshTable";
    private static final int DATABASE_Version = 1;
    private static final String UID = "_id";
    private static final String NAME = "Name";
    private static final String SqlCreate = "CREATE TABLE" + TABLE_NAME + "" +
            "(" + UID + "INTERGER AUTOINCREMENT PRIMARY KEY"
            + NAME + "VARCHAR2(225))";
    private static final String SqlUpdate = "DROP TABLE" + TABLE_NAME + " IF EXIST";
    private Context con;

    public DbHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_Version);
            this.con = context;
            com.example.alensh.sqlitedb.Message.message(con,"Constructor called");

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        try {
            db.execSQL(SqlCreate);
            com.example.alensh.sqlitedb.Message.message(con,"table create");
        }
        catch (SQLException e) {
            com.example.alensh.sqlitedb.Message.message(con,""+e);

        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SqlUpdate);
        onCreate(db);
    }
}
