
package Test;

import Dominio.Account;
import Dominio.Bank;
import Dominio.CheckingAccount;
import Dominio.Customer;
import Dominio.SavingsAccount;

public class TestAccount {


    public static void main(String[] args) {
        // TODO code application ogic here

        Customer customer;
        Account account;
        SavingsAccount interes = new SavingsAccount();

        Bank.newClient("Andres", "Masapanta");
        customer = Bank.getCustomer(0);
        customer.addAccount(new SavingsAccount(100.00, 10.00));//CUENTA DE AHORROS

        Bank.newClient("Orlando", "Mendieta");
        customer = Bank.getCustomer(1);
        customer.addAccount(new CheckingAccount(100.00, 10.00));// CUENTA CORRIENTE


        customer = Bank.getCustomer(1);
        account = customer.getAccount(0);
        System.out.println("");
        System.out.println("CLIENTE: " + customer
                + " Saldo disponible en cuenta corriente: "
                + account.getBalance());

        System.out.println("Cliente: " + customer + " Retiro: 150.00");

        account.retiro(150.00);

        System.out.println("Cliente: " + customer + " Retiro: 22.50");
        System.out.println(" ");

        account.deposito(22.50);

        System.out.println("Cliente: " + customer + " Retiro: 147.62");

        account.retiro(147.62);

        System.out.println("Cliente: " + customer + " Retiro: 470.00");

        account.retiro(470.00);

        System.out.println("Cliente: " + customer + " Tiene un saldo de: " + account.getBalance());
        System.out.println("");


        customer = Bank.getCustomer(0);
        account = customer.getAccount(0);


        System.out.println(" ");
        System.out.println("CLIENTE: " + customer + " Saldo disponible en cuenta ahorros " + account.getBalance());

        System.out.println("Cliente: " + customer + " Retiro: 150.00");
        account.retiro(150.00);
        System.out.println("Cliente: " + customer + " Depsito: 22.50");
        account.deposito(22.50);
        System.out.println("Cliente: " + customer + " Retiro: 147.62");
        account.retiro(147.62);
        System.out.println("Cliente: " + customer + " Retiro: 470.00");
        account.deposito(470.00);
        System.out.println("Cliente: " + customer + " Tiene un saldo de: " + account.getBalance());

        System.out.println("Tiene un interes de: " + interes.calculoInteres());

    }

}
