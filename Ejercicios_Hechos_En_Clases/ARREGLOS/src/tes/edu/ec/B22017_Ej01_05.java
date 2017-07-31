/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes.edu.ec;

/**
 *
 * @author alum_tes_a
 */
public class B22017_Ej01_05 {
    public static void main (String args[])
    {
        //Declarar y definir el tamaño del arreglo
        int intSueTra[]=new int[6]; // Sueldo de trabajadores
        int intSueTot=0; //Sueldo total
        //Asignar valores al arreglo
        intSueTra[0]=500;
        intSueTra[1]=360;
        intSueTra[2]=450;
        intSueTra[3]=700;
        intSueTra[4]=600;
        intSueTra[5]=800;
        
        //Leer el arreglo
            for (int intSueTra1: intSueTra)
        {
              intSueTot+=intSueTra1;
        }
            System.out.println("Sueldo Total:" +intSueTot);
    }
    
}
