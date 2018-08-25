package com.dsp.code.apidsp.dominio;

import java.io.Serializable;

public abstract class Persona implements Serializable {
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String dni;
    private EstadoUsuario estado;
}
