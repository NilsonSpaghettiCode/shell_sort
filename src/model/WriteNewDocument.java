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
 * @author  Alucarddos      oscar.leiva@uniminuto.edu.co
 */
public class WriteNewDocument {

    JFileChooser select = new JFileChooser();
    File archive;
    FileOutputStream exit;

    public String Save(File archive, String document) {
        String message = null;
        try {
            exit = new FileOutputStream(archive);
            byte[] bytxt = document.getBytes();
            exit.write(bytxt);
            message = "Archivo Guardar";

        } catch (Exception e) {
        }
        return message;

    }

    public java.lang.String Save2(File archive, String document) {
        String message = null;
        try {
            exit = new FileOutputStream(archive);
            byte[] bycsv = document.getBytes();
            exit.write(bycsv);
            message = "Archivo Guardar";

        } catch (Exception e) {
        }
        return message;
    }

    public void String() {
        try {
            select.setFileSelectionMode(JFileChooser.FILES_ONLY);
            select.showSaveDialog(null);

            ArrayList num = new ArrayList();
            select.showSaveDialog(null);
            archive = select.getSelectedFile();
            FileWriter nam = new FileWriter(archive);
            for (int i = 0; i < num.size(); i++) {

                nam.write(num.get(i) + "\n ");
            }

            nam.close();

        } catch (Exception e) {
        }

    }
}
