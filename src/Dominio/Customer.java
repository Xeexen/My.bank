
package Dominio;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nauc
 */

public class Customer {//declaracion de variables 
    private String nombre;
    private String apellido;
    private Account account;
    private List<Account> accounts;
    private Genero genero;
    private static int count;
    private int id;


    static {
        count = 0;
    }

    public Customer() {
        nombre = "Sin nombre";
        apellido = "Sin apellido";
        genero = genero.FEMENINO;
        count++;
        id = count;
    }


    public Customer(String nombre, String apellido) {
        this.accounts = new ArrayList<>();
        this.nombre = nombre;
        this.apellido = apellido;
        genero = genero.FEMENINO;
        count++;
        id = count;
    }

    public String getNombre() { //metodo mostrar nombre de cliente
        return nombre;
    }

    public String getApellido() {//metodo mostrar apellido de cliente
        return apellido;
    }

    public void addAccount(Account acct) {
        accounts.add(acct);
    }

    public int getNumOfAccounts() {
        return accounts.size();
    }

    public Account getAccount(int index) {
        return this.accounts.get(index);
    }


    @Override
    public String toString() {
        return " " + id + " " + nombre + " " + apellido;
    }


}
