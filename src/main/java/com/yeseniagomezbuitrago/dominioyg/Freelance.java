package com.yeseniagomezbuitrago.dominioyg;

public class Freelance extends Empleado{


    private int horasTrabajadasYesenia;
    private long valorHoraYesenia;


    public Freelance(String nombreYesenia, long valorHoraYesenia, int horasTrabajadasYesenia) {
        super(nombreYesenia);
        this.valorHoraYesenia = valorHoraYesenia;
        this.horasTrabajadasYesenia = horasTrabajadasYesenia;
    }


    @Override
    public long calcularElSalarioGomez() {
        return valorHoraYesenia * horasTrabajadasYesenia;
    }

    @Override
    public String toString() {
        return "Freelance{" +
                "valorHoraYesenia=" + valorHoraYesenia + ", horasTrabajadasYesenia=" + horasTrabajadasYesenia + '}';
    }

    public long getValorHoraYesenia() {
        return valorHoraYesenia;
    }

    public int getHorasTrabajadasYesenia() {
        return horasTrabajadasYesenia;
    }


    public void setValorHoraYesenia(long valorHoraYesenia) {
        this.valorHoraYesenia = valorHoraYesenia;
    }

    public void setHorasTrabajadasYesenia(int horasTrabajadasYesenia) {
        this.horasTrabajadasYesenia = horasTrabajadasYesenia;
    }
}
