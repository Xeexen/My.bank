
package Dominio;

public abstract class Account {
    protected double balance;

    public Account() {

    }

    /**
     * @param balance
     */

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public abstract boolean deposito(double amt);

    public abstract boolean retiro(double amt);

}
