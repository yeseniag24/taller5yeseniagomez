package com.yeseniagomezbuitrago.aplicacionyg;

import com.yeseniagomezbuitrago.dominioyg.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Empleado> empleadosYesenia = new ArrayList<>();


        Directo Juan = new Directo("Juan",4840000);
        Vendedor Julian = new Vendedor("Julian",2050000,45510000);
        Freelance Johanna = new Freelance("Johanna",71000,89);
        Vendedor Carolina = new Vendedor("Carolina",980000,35989000);
        Promotor Pedro = new Promotor("Pedro",1200,300,62);
        Directo David = new Directo("David",3975000);
        Freelance Gustavo = new Freelance("Gustavo",42500,65);


        empleadosYesenia.add(Juan);
        empleadosYesenia.add(Julian);
        empleadosYesenia.add(Johanna);
        empleadosYesenia.add(Carolina);
        empleadosYesenia.add(Pedro);
        empleadosYesenia.add(David);
        empleadosYesenia.add(Gustavo);


        Nomina nomina = new Nomina(empleadosYesenia);


        // salarios de cada empleado
        System.out.println("El salario de "+Juan.getNombreYesenia()+ " es: $"+Juan.calcularElSalarioGomez()+
                " Como empleado Directo");
        System.out.println("El salario de "+Julian.getNombreYesenia()+ " es: $"+Julian.calcularElSalarioGomez()+
                " como Vendedor");
        System.out.println("El salario de "+Johanna.getNombreYesenia()+ " es: $"+Johanna.calcularElSalarioGomez()+
                " como empleado Freelance");
        System.out.println("El salario de "+Carolina.getNombreYesenia()+ " es: $"+Carolina.calcularElSalarioGomez()+
                " como Vendedor");
        System.out.println("El salario de "+Pedro.getNombreYesenia()+ " es: $"+Pedro.calcularElSalarioGomez()+
                " como Promotor");
        System.out.println("El salario de "+David.getNombreYesenia()+ " es: $"+David.calcularElSalarioGomez()+
                " como empleado Directo");
        System.out.println("El salario de "+Gustavo.getNombreYesenia()+ " es: $"+Gustavo.calcularElSalarioGomez()+
                " como empleado Freelance");
        
    }
}

