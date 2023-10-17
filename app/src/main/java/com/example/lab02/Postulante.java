package com.example.lab02;

import java.io.Serializable;

public class Postulante implements Serializable {
    private String dni;
    private String apellidoMaterno;
    private String nombres;
    private String fechaNacimiento;
    private String colegio;
    private String carrera;

    // Constructor
    public Postulante(String dni, String apellidoMaterno, String nombres, String fechaNacimiento, String colegio, String carrera) {
        this.dni = dni;
        this.apellidoMaterno = apellidoMaterno;
        this.nombres = nombres;
        this.fechaNacimiento = fechaNacimiento;
        this.colegio = colegio;
        this.carrera = carrera;
    }

    // Getters
    public String getDni() {
        return dni;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getColegio() {
        return colegio;
    }

    public String getCarrera() {
        return carrera;
    }
}