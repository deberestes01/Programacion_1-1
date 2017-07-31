/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes.edu.ec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author alum_tes_a
 */
public class B22017_Ej01_06 {
    public static void main (String args[])
    {
        int intPosTra, intNueSueTra; // posicion del trabajador, nuevo sueldo
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
        try
        {
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader bur= new BufferedReader(isr);
            System.out.println("Ingrese la posicion del trabajador");
            intPosTra= Integer.parseInt(bur.readLine());
            System.out.println("Ingrese el nuevo sueldo del trabajador");
            intNueSueTra=Integer.parseInt(bur.readLine());
            // Cambiar el sueldo en el arreglo
            intSueTra[intPosTra]= intNueSueTra;
        //Leer el arreglo
            for (int i=0; i<intSueTra.length; i++)
            {
              intSueTot+=intSueTra[i];
            }
            System.out.println("Sueldo Total:" +intSueTot);
    
        }
        catch(IOException e)
        {
             System.out.println("Excepcion:" +e.toString());
        }
        
    }
}
