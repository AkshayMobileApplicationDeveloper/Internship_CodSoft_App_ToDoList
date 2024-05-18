package com.example.todolist.Utils;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.security.PrivateKey;

public class DataBaseHandler extends SQLiteOpenHelper {
    private static final int VERSION =1;
    private static final String DB_Name="ToDoListDataBase";
    private static final String  DB_TableName="ToDoListDataBase_Table";
    private static final String  ID="id";
    private static final String  TASK="Task";
    private static final String  STATUS="Status";
    private static final String  DISCRIPTON="Discription";

    private static final String Create_To_Do_Table= "CREATE TABLE"+DB_TableName+"("+ID+"INTEGER PRIMARY KEY AUTOINCEREMENT ,"
            +TASK+"TEXT,"+DISCRIPTON+"Task Discription ,"+STATUS+"INTEGER)";


    private SQLiteDatabase db;

    public DataBaseHandler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public DataBaseHandler(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version, @Nullable DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    public DataBaseHandler(@Nullable Context context, @Nullable String name, int version, @NonNull SQLiteDatabase.OpenParams openParams) {
        super();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P)
            super(context, name, version, openParams);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
