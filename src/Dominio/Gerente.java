/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 * @author UWU
 */
public class Gerente extends Empleado {
    private String departamento;


    @Override
    public String getDetalle() {
        return super.getDetalle() + this.departamento;
    }

    public Gerente() {
        this("Sin nombre ", "Sin apellido ", "Sin departamento");
    }

    public Gerente(String nombre, String apellido, String departamento) {
        super(nombre, apellido);
        this.departamento = departamento;
    }

    public boolean equals(Object o) {
        boolean valor = false;
        if (o != null && o instanceof Gerente) {
            Gerente e = (Gerente) o;
            if (this.nombre.equals(e.nombre) && this.apellido.equals(e.apellido) && this.departamento.equals(e.departamento)) {
                valor = true;
            }
        }
        return valor;

    }
}
