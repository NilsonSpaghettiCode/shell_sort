/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class SortFile 
{
    private String content_file;
    private ArrayList numbers;

    public SortFile(String content_file) {
        this.content_file = content_file;
        numbers = new ArrayList();
    }
    
    
    public void addNumbers()
    {
        
       this.content_file = content_file.replaceAll("[a-zA-Z]", ""); //Elimina cualquier caracter a exepcion de los enteros
       
       String[] numbers_old = this.content_file.split(" "); //Separa una string que es retornada si esta es dividida por un espacio " "
      
        for (int i = 0; i < numbers_old.length; i++) {
            
            try {
                double numero = Double.parseDouble(numbers_old[i]);
                numbers.add(numero);
            } catch (Exception e) {
                
            }
        }
         
    }
    
    public void ShellSort()
    {
    
    }
    
    public void viewNumbers()
    {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println((double)numbers.get(i));
        }
    }
    

    public ArrayList getNumbers() {
        return numbers;
    }

    public void setNumbers(ArrayList numbers) {
        this.numbers = numbers;
    }
    
    public String getContent_file() {
        return content_file;
    }

    public void setContent_file(String content_file) {
        this.content_file = content_file;
    }
    
    
    
}
