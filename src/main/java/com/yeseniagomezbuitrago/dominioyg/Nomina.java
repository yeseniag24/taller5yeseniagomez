package com.yeseniagomezbuitrago.dominioyg;

import java.util.ArrayList;

public class Nomina {

    private ArrayList<Empleado> empleadosYesenia;

    public  Nomina(ArrayList<Empleado> empleados) {
        this.empleadosYesenia = new ArrayList<>();
    }


    public void calcularNominaGomez() {
        for (Empleado empleado : empleadosYesenia) {
            double salario = empleado.calcularElSalarioGomez();
            System.out.println("El salario que corresponde a " + empleado.getNombreYesenia() + " es: $" + salario);
        }
    }



    public void listarDirectosGomez() {
        System.out.println("Empleados con contrato Directo: ");
        for (Empleado empleado : empleadosYesenia) {
            if (empleado instanceof Directo) {
                System.out.println(empleado.getNombreYesenia());
            }
        }
    }



    public void listarFreelanceGomez() {
        System.out.println("Empleados ocasionales o Freelance: ");
        for (Empleado empleado : empleadosYesenia) {
            if (empleado instanceof Freelance) {
                System.out.println(empleado.getNombreYesenia());
            }
        }
    }



    public void listarPromotoresGomez() {
        System.out.println("Empleados Promotores: ");
        for (Empleado empleado : empleadosYesenia) {
            if (empleado instanceof Promotor) {
                System.out.println(empleado.getNombreYesenia());
            }
        }
    }


    public ArrayList<Empleado> getEmpleadosYesenia() {
        return empleadosYesenia;
    }

    public void setEmpleadosYesenia(ArrayList<Empleado> empleadosYesenia) {
        this.empleadosYesenia = empleadosYesenia;
    }
}
