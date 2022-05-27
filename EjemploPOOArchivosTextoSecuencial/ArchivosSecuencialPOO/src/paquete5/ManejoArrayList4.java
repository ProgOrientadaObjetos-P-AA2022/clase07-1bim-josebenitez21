/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Profesor;
import paquete1.Calificacion;
import paquete1.Empresa;

/**
 *
 * @author reroes
 */
public class ManejoArrayList4 {

    public static void main(String[] args) {

        Empresa e1 = new Empresa("Ecolac", "Loja");
        Empresa e2 = new Empresa("ILE", "Loja");
        Empresa e3 = new Empresa("Monterrey", "Loja");

        System.out.println("-----------------------------");

        ArrayList<Empresa> emp1 = new ArrayList<>();
        emp1.add(e1);
        emp1.add(e2);
        emp1.add(e3);
        for (int i = 0; i < emp1.size(); i++) {

            System.out.printf("-%s - %s\n ", 
                    emp1.get(i).obtenerNombre(),
                    emp1.get(i).obtenerCiudad());

        }

    }
}
