package com.chens.basedatos;

import android.widget.CheckBox;

/**
 * Created by 43037376 on 27/4/2018.
 */

public class ClaseUsuario {
    private String nombre;
    private CheckBox deporte ;

    public ClaseUsuario(String nombre, CheckBox deporte) {
        this.nombre = nombre;
        this.deporte = deporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CheckBox getDeporte() {
        return deporte;
    }

    public void setDeporte(CheckBox deporte) {
        this.deporte = deporte;
    }
}
