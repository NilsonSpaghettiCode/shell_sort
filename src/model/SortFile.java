/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author USER
 */
public class SortFile {

    private String content_file;
    private ArrayList numbers;

    private Double[] numbers_in_order;
    private int number_of_elements; //Es el numero de elementos recibidos para analisar

    //Constructores
    public SortFile(String content_file) {
        this.content_file = content_file;
        numbers = new ArrayList();
    }

    //Metodos
    public void addNumbers() {

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

    public ArrayList ShellSort() {
        this.addNumbers();
        this.number_of_elements = numbers.size();
        numbers_in_order = new Double[number_of_elements];
        
        int gap = numbers.size()/2; //Intervalo o espacio

        while (gap > 0) {            
            for (int i = gap; i < numbers.size(); i++) {
                double temp = (double)numbers.get(i);
                int index = i;
                while (index >= gap && (double)numbers.get(index - gap) > temp)
                {
                    numbers.set(index, numbers.get(index-gap));
                    index = index - gap;
                    
                }
                numbers.set(index, temp);
            
            }
            gap = gap/2; 
        }
            
        return numbers;
    }

    public void viewNumbers() {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println((double) numbers.get(i));
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
