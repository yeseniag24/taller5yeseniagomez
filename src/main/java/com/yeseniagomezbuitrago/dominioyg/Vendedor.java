package com.yeseniagomezbuitrago.dominioyg;

public final class Vendedor extends Directo {

    private long ventasDelMesYesenia;


    public Vendedor(String nombreYesenia, long salarioYesenia, long ventasDelMesYesenia) {
        super(nombreYesenia, salarioYesenia);
        this.ventasDelMesYesenia = ventasDelMesYesenia;
    }


    @Override
    public long calcularElSalarioGomez() {
        long salarioTotal = super.calcularElSalarioGomez() + calcularComisionGomez();
        return salarioTotal;
    }


    @Override
    public String toString() {
        return "Vendedor{" + "ventasDelMesYesenia=" + ventasDelMesYesenia + '}';
    }

    public Long calcularComisionGomez() {
        if (ventasDelMesYesenia > 1000000) {
            return (long) (ventasDelMesYesenia * 0.035);
        } else {
            return (long) (ventasDelMesYesenia * 0.04);
        }
    }


    public long getVentasDelMesYesenia() {
        return ventasDelMesYesenia;
    }

    public void setVentasDelMesYesenia(long ventasDelMesYesenia) {
        this.ventasDelMesYesenia = ventasDelMesYesenia;
    }
}
