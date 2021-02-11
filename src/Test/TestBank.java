package Test;

import Dominio.Bank;
import Dominio.Customer;
import Reportes.ReporteCliente;

public class TestBank {
    public static void main(String[] args) {


        Bank.newClient("Andres", "Masapanta");//crea nuevo cliente
        Bank.newClient("Orlando", "Mendieta");//crea nuevo cliente
        Bank.newClient("Martin", "Mendez");//crea nuevo cliente

        System.out.println(Bank.getNumClientes());
        System.out.println(Bank.imprimir());
        Bank.modificar(2, "Steven ", "Masapanta");
        Bank.eliminar(2);

        System.out.println("===============");
        System.out.println("Imprimir");
        Bank.imprimir();
        System.out.println(Bank.imprimir());
        System.out.println("=======================");
        System.out.println("Reporte");
        System.out.println();
        ReporteCliente report = new ReporteCliente();
        report.generarReport();


    }
}
