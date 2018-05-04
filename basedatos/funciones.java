package com.chens.basedatos;

import android.widget.CheckBox;

/**
 * Created by 43037376 on 4/5/2018.
 */

public class funciones {
    //Constante de los campos
    public static final String TABLA_USUARIO="usuario";
    public static final String CAMPO_DEPORTE="deporte";
    public static final String CAMPO_NOMBRE="nombre";

    public static final String sql ="CREATE TABLE"+TABLA_USUARIO+"("+CAMPO_DEPORTE+" CHECKBOX , "+CAMPO_NOMBRE+" TEXT)";
}
