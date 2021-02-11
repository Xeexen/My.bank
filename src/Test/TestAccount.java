
package Test;

import Dominio.Account;
import Dominio.Bank;
import Dominio.CheckingAccount;
import Dominio.Customer;
import Dominio.SavingsAccount;

public class TestAccount {


    public static void main(String[] args) {
        // TODO code application ogic here

        Customer cliente;
        Account cuenta;

        Bank.newClient("Andres", "Masapanta");
        cliente = Bank.getCustomer(0);
        cliente.addAccount(new SavingsAccount(100.00, 10.00) {
        });
        cuenta = cliente.getAccount(0);
        SavingsAccount interes = (SavingsAccount) cliente.getAccount(0);

        System.out.println("Cuenta Ahorros");
        System.out.println("Cliente: " + cliente + "\n Su saldo en su cuenta de ahorros es de: " + cuenta.getBalance());

        System.out.println("Cliente: " + cliente + "\n Retiro: 75.00");
        cuenta.retiro(75);
        System.out.println("Cliente: " + cliente + "\n Deposito: 25.00");
        cuenta.deposito(25.00);
        System.out.println("Cliente: " + cliente + "\n Su saldo en su cuenta de ahorros es de: "    + cuenta.getBalance());
        System.out.println(interes.calculoInteres());

        Bank.newClient("Orlando", "Mendieta");
        cliente = Bank.getCustomer(1);
        cliente.addAccount(new CheckingAccount(100.00, 10.00));
        cuenta = cliente.getAccount(0);

        System.out.println("\nCuenta Corriente");
        System.out.println("Cliente: " + cliente + "\n Su saldo en su cuenta corriente es de: " + cuenta.getBalance());

        System.out.println("Cliente: " + cliente + "\n Retiro: 20.00");
        cuenta.retiro(20);
        System.out.println("Cliente: " + cliente + "\n Retiro: 85.00");
        cuenta.retiro(85);
        System.out.println("Cliente: " + cliente + "\n Deposito: 25.00");
        cuenta.deposito(25.00);
    }

}
