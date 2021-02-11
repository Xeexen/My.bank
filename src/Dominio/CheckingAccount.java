
package Dominio;

public class CheckingAccount extends Account {

    private double sobreGiro;

    public CheckingAccount(double balance) {
        super(balance);

    }

    public CheckingAccount(double balance, double sobreGiro) {
        super(balance);

        this.sobreGiro = sobreGiro;
    }


    @Override
    public boolean retiro(double amt) {
        boolean r = false;
        if (amt <= 0 || amt + this.sobreGiro > balance + this.sobreGiro) {
            System.out.println("Fondos Insuficientes!");
        } else {
            balance = (balance + this.sobreGiro) - amt;
            r = true;
        }
        return r;
    }

    @Override
    public boolean deposito(double amt) {
        boolean r = false;
        if (amt < 1) {
            System.out.println("Valor no valdo!");
        } else {
            balance = balance + amt;
            r = true;
        }
        return r;
    }


}
