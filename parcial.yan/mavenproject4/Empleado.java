/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject4;

/**
 *
 * @author Biblioteca
 */
public class Empleado extends Persona {
    private String nombreCargo;
    private double salario;
    private String jefeInmediato;
    private int añosExperiencia;

    public Empleado(String nombre, String apellido, String direccion, String telefono, int edad, String email, double salario1, String jefeInmediato, int añosExperiencia1, String nombreCargo1) {
        super(nombre, apellido, direccion, telefono, edad, email);
        this.salario = salario;
        this.jefeInmediato = jefeInmediato;
        this.añosExperiencia = añosExperiencia;
        this.nombreCargo = calcularCargo(); 
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
        this.nombreCargo = calcularCargo(); 
    }

    public String getJefeInmediato() {
        return jefeInmediato;
    }

    public void setJefeInmediato(String jefeInmediato) {
        this.jefeInmediato = jefeInmediato;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
        this.nombreCargo = calcularCargo(); 
    }

    private String calcularCargo() {
        if (salario >= 5000000 && añosExperiencia >= 5 && (getEdad() >= 25 && getEdad() <= 45)) {
            return "Senior";
        } else if (salario >= 900000 && salario <= 1200000 && añosExperiencia >= 1 && añosExperiencia <= 2 &&
                (getEdad() >= 18 && getEdad() <= 22)) {
            return "Junior";
        } else {
            return "No definido";
        }
    }
    
    public String toString() {
        return super.toString() + " Empleado{" +
                "nombreCargo='" + nombreCargo + '\'' +
                ", salario=" + salario +
                ", jefeInmediato='" + jefeInmediato + '\'' +
                ", añosExperiencia=" + añosExperiencia +
                '}';
    }
}
