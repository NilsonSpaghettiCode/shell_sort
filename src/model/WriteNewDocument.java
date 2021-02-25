/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFileChooser;

/**
 *
 * @author Alucarddos oscar.leiva@uniminuto.edu.co
 */
public class WriteNewDocument {

    JFileChooser select = new JFileChooser();
    private File archive;
    private ArrayList number_file;
    private String ext;

    public WriteNewDocument(File archive, ArrayList numbers_file, String ext) {
        this.archive = archive;
        this.number_file = number_file;
        this.ext = ext;
    }

    public File getArchive() {
        return archive;
    }

    public void setArchive(File archive) {
        this.archive = archive;
    }

    public void Save() {
        try {

            BufferedWriter exit = new BufferedWriter(new FileWriter(this.archive));

            if (this.getExt().equalsIgnoreCase("csv")) {
                for (int i = 0; i < this.number_file.size(); i++) {
                    exit.write((String) number_file.get(i) + ";");
                }

            } else {
                for (int i = 0; i < this.number_file.size(); i++) {
                    if ((i % 5) == 0) {
                        exit.write((String) number_file.get(i) + "\n");
                    } else {
                        exit.write((String) number_file.get(i) + " ");
                    }
                }
            }
        } catch (Exception e) {
        }

    }

    public ArrayList getNumber_file() {
        return number_file;
    }

    public void setNumber_file(ArrayList number_file) {
        this.number_file = number_file;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

}
