package com.yeseniagomezbuitrago.dominioyg;

public class Promotor extends Empleado {

    private int volantesRepartidosYesenia;
    private long valorVolanteYesenia;
    private int comprasVolanteYesenia;

    public Promotor(String nombreYesenia, int volantesRepartidosYesenia, long valorVolanteYesenia, int comprasVolanteYesenia) {
        super(nombreYesenia);
        this.volantesRepartidosYesenia = volantesRepartidosYesenia;
        this.valorVolanteYesenia = valorVolanteYesenia;
        this.comprasVolanteYesenia = comprasVolanteYesenia;
    }


    @Override
    public long calcularElSalarioGomez() {
        long salarioTotal = (long) (valorVolanteYesenia * volantesRepartidosYesenia + 15000 * comprasVolanteYesenia);
        return salarioTotal;
    }


    @Override
    public String toString() {
        return "Promotor{" + "volantesRepartidosYesenia=" + volantesRepartidosYesenia + ", valorVolanteYesenia=" + valorVolanteYesenia +
                ", comprasVolanteYesenia=" + comprasVolanteYesenia +
                '}';
    }


    public int getVolantesRepartidosYesenia() {
        return volantesRepartidosYesenia;
    }

    public long getValorVolanteYesenia() {
        return valorVolanteYesenia;
    }

    public int getComprasVolanteYesenia() {
        return comprasVolanteYesenia;
    }


    public void setVolantesRepartidosYesenia(int volantesRepartidosYesenia) {
        this.volantesRepartidosYesenia = volantesRepartidosYesenia;
    }

    public void setValorVolanteYesenia(long valorVolanteYesenia) {
        this.valorVolanteYesenia = valorVolanteYesenia;
    }

    public void setComprasVolanteYesenia(int comprasVolanteYesenia) {
        this.comprasVolanteYesenia = comprasVolanteYesenia;
    }
}



