/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos_Planos;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class fecha {
     
    public static String fe ;
    
    static{
    
    Calendar fecha = new GregorianCalendar();
    
    String dia = Integer.toString(fecha.get(Calendar.DATE));
    String mes = Integer.toString(fecha.get(Calendar.MONTH)+ 1);
    String año = Integer.toString(fecha.get(Calendar.YEAR));
    
    fe = dia + "-" + mes + "-" + año;
    }
}
