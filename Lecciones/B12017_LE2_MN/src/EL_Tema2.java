/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author alum_tes_a
 */
public class EL_Tema2 {
     public static void main(String args[])
    {
        String strCad; //Cadena de texto.
        try
        {
            InputStreamReader isr=new InputStreamReader (System.in);
            BufferedReader bur=new BufferedReader (isr);
            System.out.print("Ingrese una cadena de texto: ");
            strCad=bur.readLine();
            for (int i=0; i<strCad.length(); i++)
            {
                System.out.print(strCad.charAt(i));
                if (i<strCad.length()-1)
                    System.out.print("\n");
            }
        }
        catch (IOException e)
        {
            System.out.println("Excepción: " + e.toString());
        }
        catch (NumberFormatException e)
        {
            System.out.println("Excepción: " + e.toString());
        }
    }    
}

