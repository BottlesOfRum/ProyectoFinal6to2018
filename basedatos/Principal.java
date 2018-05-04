package com.chens.basedatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        InteresesUsuarioSQLite conn =new InteresesUsuarioSQLite(this,"bd usuarios", null ,1);
    }

    public void configurar (View OtraAct) {
        Intent pagConfig;
        pagConfig = new Intent(Principal.this, Datos.class);
        startActivity(pagConfig);

    }

}
