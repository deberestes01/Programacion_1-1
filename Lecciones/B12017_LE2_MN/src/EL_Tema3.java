
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alum_tes_a
 */
public class EL_Tema3 
{
     public static void main(String args [])
    {
        String strCed, strPricar;// Cedula Primer Caracter
        
        try
        {       // entrada de datos por teclado InputStreamReader
            InputStreamReader isr=new InputStreamReader (System.in);
            BufferedReader bur=new BufferedReader(isr);
            System.out.print("Ingrese su identificación");
            //leo o capturo lo que escribi 
            strCed=bur.readLine();
             strPricar=String.valueOf(strCed.charAt(0));
             if("01234567879".indexOf(strPricar)==-1)
             {
                System.out.println(" Error. La cedula debe empezar con un numero ");  
              
             }
             else
             {
                 if(strCed.length()==10)
                 System.out.println(" Usted tiene una cédula " + strCed );  
               
             else
                     
                 System.out.println("Usted tiene RUC " + strCed );  
               
             
             
        }
        }
        catch (IOException e)
        {
            System.out.println("Exception: " + e.toString());       
        }
        catch (NumberFormatException e)
        {
            System.out.println("Exception: " + e.toString());    
        }
    }
}
