
package Reportes;

import Dominio.Bank;

public class ReporteCliente {
    public void generarReport() {
        System.out.println("Reportes de clientes");
        System.out.println("=======================");
        for (int i = 0; i < Bank.getNumClientes(); i++) {
            System.out.println("Cliente: " + Bank.getCustomer(i));
        }
    }
}
