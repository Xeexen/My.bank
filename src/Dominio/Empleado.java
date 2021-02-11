
package Dominio;

public class Empleado {
    protected String nombre;
    protected String apellido;

    public Empleado() {
        this("sin nombre ", "sin apellido");
    }

    /**
     * @param nombre
     * @param apellido
     */
    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getDetalle() {
        return this.nombre + this.apellido;
    }

    @Override
    public boolean equals(Object o) {
        boolean respuesta = false;
        if (o != null && o instanceof Empleado) {
            Empleado e = (Empleado) o;
            if (this.nombre.equals(e.nombre)) {
                respuesta = true;
            }
        }
        return respuesta;
    }
}
