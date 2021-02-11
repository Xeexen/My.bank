
package Dominio;

public class SavingsAccount extends Account {
    private double montoInteres;
    private double TASA_INTERES;

    public SavingsAccount() {

    }

    public SavingsAccount(double balance, double montoInteres) {
        super(balance);
        this.montoInteres = montoInteres;
    }


    /**
     * @param amt
     * @return
     */
    @Override
    public boolean deposito(double amt) {
        boolean r = false;
        if (amt <= 0) {
            System.out.println("Su deposito debe ser mayor a 0");
        } else {
            balance = balance + amt;
            r = true;
        }
        return r;
    }

    /**
     * @param amt
     * @return
     */
    @Override
    public boolean retiro(double amt) {
        boolean r = false;
        if (amt <= 0) {
            System.out.println("Su retiro debe ser mayor a 0");
        } else if (balance < amt) {
            System.out.println("Fondos insuficientes");
        } else {
            balance = balance - amt;
            r = true;
        }
        return r;
    }

    public double calculoInteres() {
        return balance;

    }

}

