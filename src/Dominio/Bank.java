
package Dominio;

public class Bank {


    private static Customer[] clientes;
    private static int numClientes;

    static {
        clientes = new Customer[3];
        numClientes = 0;
    }
    //Metodo Cosntructor

    /**
     *
     */
    //Usamos el metodo constructor para inicializar 
    private Bank() {

    }

    /**
     * @param f
     * @param l
     */
    // Metodo para agregar un cliente
    public static void newClient(String f, String l) {
        int i = numClientes++;

        //redimencion de matriz
        if (numClientes > clientes.length) {
            Customer[] aux = clientes;
            clientes = new Customer[numClientes];
            System.arraycopy(aux, 0, clientes, 0, aux.length);//metodo de copia de array de origen a array de destino
        }

        clientes[i] = new Customer(f, l);

    }

    // metodo pra modificar un elemento de la matriz
    public static void modificar(int numClientes, String f, String l) {

        clientes[numClientes] = new Customer(f, l);
    }

    //metodo para eliminar un elemento de la matriz
    public static void eliminar(int posicion) {
        Customer[] aux = clientes;
        Customer[] aux1 = clientes;


        numClientes--;
        clientes = new Customer[numClientes];
        if (posicion == 0) {
            System.arraycopy(aux, 1, clientes, 0, numClientes);

        } else if (posicion == numClientes) {
            System.arraycopy(aux, 0, clientes, 0, numClientes);
        } else {
            numClientes--;
            System.arraycopy(aux, 0, clientes, 0, numClientes);
            System.arraycopy(aux1, numClientes, aux, 0, numClientes = 1);

        }

    }

    //metodo pra imprimir la matriz 

    public static String imprimir() {
        String lista = "";
        for (int i = 0; i < getNumClientes(); i++) {
            Customer cliente = getCustomer(i);
            lista += "cliente[" + (i) + "]" + cliente.getNombre() + " " + cliente.getApellido() + "\r\n";
        }
        return lista;

    }

    //metodo para mostrar o leer número de clientes
    public static int getNumClientes() {
        return numClientes;

    }

    public static Customer getCustomer(int index) {
        return clientes[index];


    }


}

