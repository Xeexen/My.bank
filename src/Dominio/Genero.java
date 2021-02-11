
package Dominio;


public enum Genero {
    MASCULINO("M"), FEMENINO("F");
    private final String abrev;

    private Genero(String abrev) {
        this.abrev = abrev;
    }

    public String getAbrev() {
        return abrev;
    }
}

