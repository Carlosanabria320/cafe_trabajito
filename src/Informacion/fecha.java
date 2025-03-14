/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Informacion;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Carlos Sanabria
 */
public class fecha {

    public static String fe;

    static {

        Calendar fecha1 = new GregorianCalendar();

        String dia = Integer.toString(fecha1.get(Calendar.DATE));
        String mes = Integer.toString(fecha1.get(Calendar.MONTH) + 1);
        String año = Integer.toString(fecha1.get(Calendar.YEAR));

        fe = dia + "-" + mes + "-" + año;
    }

    
}
