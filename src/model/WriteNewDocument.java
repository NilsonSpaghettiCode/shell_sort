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
import java.util.Collections;
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
    
    public java.lang.String Guardar2(File archivo, String documento){
       String mensaje=null;
        try {
            salida=new FileOutputStream(archivo);
            byte[] bycsv=documento.getBytes();
            salida.write(bycsv);
            mensaje="Archivo Guardar";
            
        } catch (Exception e) {
        }
        return mensaje;
    }
           public void String(){
               try {
                            select.setFileSelectionMode(JFileChooser.FILES_ONLY);
                            select.showSaveDialog(null);
                            
                            ArrayList num = new ArrayList(); 
                              select.showSaveDialog(null);
                             archivo = select.getSelectedFile();
                             FileWriter nam = new FileWriter(archivo);
                             Collections.sort(num);
                             for (int i = 0; i<num.size(); i++){
                             
                                    nam.write(num.get(i) + "\n ");
               }
                             
                   nam.close();
                            
                            
               } catch (Exception e) {
               }
          
           }
}
