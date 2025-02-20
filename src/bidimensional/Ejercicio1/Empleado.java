/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bidimensional.Ejercicio1;

import Fecha.Fecha;

/**
 *
 * @author twden
 */
public class Empleado {
    private String nombre;
    private Fecha fAlta;
    private int numeroHijos;

    public Empleado(String nombre, Fecha fAlta, int numeroHijos) {
        this.nombre = nombre;
        this.fAlta = fAlta;
        this.numeroHijos = numeroHijos;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getfAlta() {
        return fAlta;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }
    
    
}
