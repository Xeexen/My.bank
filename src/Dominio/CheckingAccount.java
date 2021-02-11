
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
        if (amt > 0 && balance - amt >= 0 - sobreGiro) {
            if (balance - amt < 0) {
                sobreGiro += balance - amt;
                balance -= amt;
                System.out.println("Usted presenta un sobregiro de: "+sobreGiro);
                if(balance <=0 ){
                    System.out.println("Su cuenta no tiene fondos");
                }
            } else {
                balance = balance - amt;
                System.out.println("Su saldo en su cuenta corriente es de: "+balance);
                r = true;
            }
        }else if (amt<=0){
            System.out.println ("Su retiro debe ser mayor a 0");
        }else if (balance + sobreGiro < amt) {
            System.out.println ("Fondos insuficientes");
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
