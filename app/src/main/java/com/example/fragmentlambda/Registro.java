package com.example.fragmentlambda;

public class Registro {
    private String nombre;
    private String apellidos;
    private String correo;
    private String celular;
    private String usuario;
    private String contrasena;

    public Registro(String nombre, String apellidos, String correo, String celular, String usuario, String contrasena) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.celular = celular;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCelular() {
        return celular;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }
}