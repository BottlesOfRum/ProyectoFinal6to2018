package com.chens.basedatos;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Datos extends AppCompatActivity {
    CheckBox Deporte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        Deporte= (CheckBox)findViewById(R.id.deporte);

    }
    public void Guardar (View vista){
        guardar();

    }

    private void guardar() {
        InteresesUsuarioSQLite conn =new InteresesUsuarioSQLite(this,"bd usuarios", null ,1);

        SQLiteDatabase db = conn.getWritableDatabase();

        ContentValues valor= new ContentValues();
        valor.put(funciones.CAMPO_DEPORTE,Deporte.isChecked());



        db.close();
    }

}
