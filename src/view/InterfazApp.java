/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.FileReaderDocument;
import model.SortFile;

/**
 *
 * @author USER
 */
public class InterfazApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        InterfazApp ia = new InterfazApp();
        ia.start();
    }
    
    public void start(){
        
        
        String ac_path="C:\\Users\\USER\\Desktop\\test.csv";
        String ext="csv";
        
        SortFile sr = new SortFile(new FileReaderDocument(ac_path, ext).getContent_file());
        
        System.out.println(sr.getContent_file());
        sr.ShellSort();
        sr.viewNumbers();
    }
    
}
