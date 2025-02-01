package es.gestion.empleado.app.miapp.model;

/**
 * @author materancode
 * @version 1.0.0
 */
public class Programa {
    public static void main(String[] args) {
        Empleado desarrollador = new Desarrollador("G58584N", "Silvia", 25, 3000.0);
        Empleado diseñador = new Diseniador("H56489P", "Anastasia", 35, 2500.0);
        Empleado gerente = new Gerente("U845697L", "Krhirs", 33, 5000.0);

        System.out.println("Empleado: Desarrollador");
        System.out.println(desarrollador);
        System.out.println("Salario Final: " + desarrollador.calcularSalarioFinal());
        System.out.println();

        System.out.println("Empleado: Diseñador");
        System.out.println(diseñador);
        System.out.println("Salario Final: " + diseñador.calcularSalarioFinal());
        System.out.println();

        System.out.println("Empleado: Gerente");
        System.out.println(gerente);
        System.out.println("Salario Final: " + gerente.calcularSalarioFinal());
    }
    
}