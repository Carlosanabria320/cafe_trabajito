/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Informacion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class archivos {

    public static void generar_archivo(String Nombre_Archivo, String Cadena) {
        FileWriter u = null;
        try {

            File F = new File(Nombre_Archivo);

            if (!F.exists()) {
                F.createNewFile();
            }

            u = new FileWriter(F);
            u.write(Cadena);

        } catch (IOException ex) {

            Logger.getLogger(archivos.class.getName()).log(Level.SEVERE, "Error al crear o escribir en el archivo", ex);

        } finally {

            if (u != null) {
                try {
                    u.close();
                } catch (IOException ex) {

                    Logger.getLogger(archivos.class.getName()).log(Level.SEVERE, "Error al cerrar el archivo", ex);
                }
            }
        }
    }
}
