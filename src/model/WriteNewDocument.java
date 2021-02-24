/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class WriteNewDocument {
    JFileChooser select = new  JFileChooser();
    File archivo;
    FileOutputStream salida;
    
    
    public String Guardar(File archivo, String documento) {
        String mensaje=null;
        try {
                    salida=new FileOutputStream(archivo);
                    byte[] bytxt=documento.getBytes();
                    salida.write(bytxt);
                    mensaje="Archivo Guardar";
            
        } catch (Exception e) {
        }
            return mensaje;

}
          
}
