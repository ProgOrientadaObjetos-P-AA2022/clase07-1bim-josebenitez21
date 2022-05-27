/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Profesor;
import paquete1.Calificacion;

/**
 *
 * @author reroes
 */
public class ManejoArrayList3 {

    public static void main(String[] args) {

        Calificacion c1 = new Calificacion(9, "Quimica");
        Calificacion c2 = new Calificacion(10, "Lenguaje");

        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");

        // Arreglo
        System.out.println("-----------------------------");

        // ArrayList
        ArrayList<Calificacion> cal1 = new ArrayList<>();
        c1.establecerProfesor(prof2);
        c2.establecerProfesor(prof2);
        cal1.add(c1);
        cal1.add(c2);

        for (int i = 0; i < cal1.size(); i++) {
            //Nombre del profesor
            //Nombre de la materia
            //La nota 

            //Profesor p = profesores2.get(i);
            System.out.printf("%s - %s - %.2f\n",
                    cal1.get(i).obtenerProfesor().obtenerNombre(),
                    cal1.get(i).obtenerNombreMateria(),
                    cal1.get(i).obtenerNota());
        }

    }
}
