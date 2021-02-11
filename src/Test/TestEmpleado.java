package Test;

import Dominio.Empleado;
import Dominio.Gerente;

public class TestEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];

        empleados[0] = new Empleado("Orlando ", "Mendieta");
        empleados[1] = new Gerente("Andres ", "Masapanta", "Departamento 1");
        empleados[2] = new Empleado("Orlando ", "Mendieta");
        empleados[3] = new Gerente("Andres", "Masapanta", "Departamento 1");

        System.out.println("" + empleados[0].getDetalle());
        System.out.println("" + empleados[1].getDetalle());
        System.out.println("" + empleados[2].getDetalle());

        if (empleados[0] == empleados[2]) {
            System.out.println("Empleados iguales ==");
        } else
            System.out.println("No son iguales ==");
        if (empleados[0].equals(empleados[2])) {
            System.out.println("Empleados iguales equals");
        } else
            System.out.println("No son iguales equals");

        if (empleados[1] == empleados[3]) {
            System.out.println("Empleados iguales ==");
        } else
            System.out.println("No son iguales ==");
        if (empleados[1].equals(empleados[3])) {
            System.out.println("Empleados iguales equals");
        } else
            System.out.println("No son iguales equals");
    }

}
