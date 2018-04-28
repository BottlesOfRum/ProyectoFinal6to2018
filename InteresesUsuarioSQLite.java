package com.chens.basedatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by 43037376 on 27/4/2018.
 */

public class InteresesUsuarioSQLite extends SQLiteOpenHelper {

    //Creamos una variable que contendra la sentencia SQL de Creacion de la tabla
     final String sql ="CREATE TABLA usuarios (id INTEGER , nombre TEXT)";
    public InteresesUsuarioSQLite(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // si no existe BD se ejecuta automaticamente
        // para generar un BD por desde esta clase
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Actualiza la BD si es que tiene otra version
        db.execSQL("DROP TABLE IF EXIST usuarios");
        onCreate(db);


    }
}
