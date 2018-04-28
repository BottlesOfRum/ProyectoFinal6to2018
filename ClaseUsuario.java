package com.chens.basedatos;

/**
 * Created by 43037376 on 27/4/2018.
 */

public class ClaseUsuario {
    private Integer id;
    private String nombre;

    public ClaseUsuario(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
