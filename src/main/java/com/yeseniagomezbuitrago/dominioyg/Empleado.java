package com.yeseniagomezbuitrago.dominioyg;

public abstract class Empleado {

    private String nombreYesenia;

    public Empleado(String nombreYesenia) {
        this.nombreYesenia = nombreYesenia;
    }

    public abstract long calcularElSalarioGomez();

    @Override
    public String toString() {
        return "Empleado{" +
                "nombreYesenia='" + nombreYesenia + '\'' + '}';
    }


    public String getNombreYesenia() {
        return nombreYesenia;
    }

    public void setNombreYesenia(String nombreYesenia) {
        this.nombreYesenia = nombreYesenia;
    }
}

