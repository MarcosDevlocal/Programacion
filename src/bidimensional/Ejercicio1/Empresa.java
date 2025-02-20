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
public class Empresa {

    static Empleado empleados[];

    public void inicializarEmpleados() {
        int nEmpleados = Numeros.UtilidadesNumeros.pedirNumeroEntero("Introduzca el numero de empleados que tiene la empresa", 0);
        empleados = new Empleado[nEmpleados];
    }

    public void cargarDatos() {
        for (int pos = 0; pos < empleados.length; pos++) {
            String nombre = Stringc.UtilidadesString.pedirString("Introduzca el nombre del empleado:  " + pos);
            Fecha fAlta = Stringc.UtilidadesString.pedirFecha("Introduzca la fecha de alta de:  " + nombre);
            int numeroHijos = Numeros.UtilidadesNumeros.pedirNumeroEntero("Introduzca el numeor de hijos del empleado:  " + nombre, 0);
            
        }
    }

}
