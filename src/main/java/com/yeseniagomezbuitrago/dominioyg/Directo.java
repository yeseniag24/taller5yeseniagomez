package com.yeseniagomezbuitrago.dominioyg;


public class Directo extends Empleado {

    private long salarioYesenia;

    public Directo(String nombreYesenia, long salarioYesenia) {
        super(nombreYesenia);
        this.salarioYesenia = salarioYesenia;
    }

    @Override
    public long calcularElSalarioGomez() {
        long salarioTotal = salarioYesenia - calcularSaludGomez() - calcularPensionGomez();
        return salarioTotal;
    }


    @Override
    public String toString() {
        return "Directo{" +
                "salarioYesenia=" + salarioYesenia +
                '}';
    }

    public long calcularSaludGomez() {
        return (long) (salarioYesenia * 0.05);
    }

    public long calcularPensionGomez() {
        return (long) (salarioYesenia * 0.065);
    }

    public long getSalarioYesenia() {
        return salarioYesenia;
    }

    public void setSalarioYesenia(long salarioYesenia) {
        this.salarioYesenia = salarioYesenia;
    }
}
