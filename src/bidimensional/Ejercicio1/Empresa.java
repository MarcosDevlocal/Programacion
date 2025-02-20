/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bidimensional.Ejercicio1;

/**
 *
 * @author twden
 */
public class Empresa {
    static Empleado empleados[];
    
    public void inicializarEmpleados(){
        int nEmpleados = Numeros.UtilidadesNumeros.pedirNumeroEntero("Introduzca el numero de empleados que tiene la empresa", 0);
        empleados = new Empleado [nEmpleados];
    }
    
    
}
