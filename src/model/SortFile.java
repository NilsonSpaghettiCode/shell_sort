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
public class SortFile {

    private String content_file;
    private ArrayList numbers;

    private int number_of_elements; //Es el numero de elementos recibidos para analisar
    private DoubleLinkedList list;

    //Constructores
    public SortFile(DoubleLinkedList list) {
        this.list = list;
        numbers = new ArrayList();
    }

    public SortFile() {
    }

    //Metodos
    @Deprecated
    public void addNumbers() {

        //this.content_file = content_file.replaceAll("[a-zA-Z]", ""); //Elimina cualquier caracter a exepcion de los enteros
        String[] numbers_old = this.content_file.split(" "); //Separa una string que es retornada si esta es dividida por un espacio " "

        for (int i = 0; i < numbers_old.length; i++) {

            try {
                String number_string = numbers_old[i];

                double numero = Double.valueOf(number_string);

                numbers.add(numero);

            } catch (NumberFormatException e) {

            }
        }

        this.number_of_elements = numbers.size();

    }

    public ArrayList ShellSort() {
        this.addNumbers();

        int gap = numbers.size() / 2; //Intervalo o espacio

        while (gap > 0) {
            for (int i = gap; i < numbers.size(); i++) {
                double temp = (double) numbers.get(i);
                int index = i;
                while (index >= gap && (double) numbers.get(index - gap) > temp) {
                    numbers.set(index, numbers.get(index - gap));
                    index = index - gap;

                }
                numbers.set(index, temp);

            }
            gap = gap / 2;
        }

        return numbers;
    }

    public DoubleLinkedList ShellSort(DoubleLinkedList list) {
        this.list = list;
        long gap = this.list.getN() / 2;
        while (gap > 0) {

            for (long i = gap; i <= this.list.getN(); i++) {
                long tempo = this.list.getNumber(i);
                long index = i;
               
                while (index >= gap && this.list.getNumber(index - gap) > tempo) {
                    this.list.setNumber(index, this.list.getNumber(index - gap));
                    index -= gap;
                }

                this.list.setNumber(index, tempo);

            }

            gap = gap / 2;

        }

        return this.list;
    }


    public ArrayList ShellSort(ArrayList listx) {
        
        numbers = listx;
        
        int gap = numbers.size() / 2; //Intervalo o espacio

        while (gap > 0) {
            for (int i = gap; i < numbers.size(); i++) {
                double temp = (double) numbers.get(i);
                int index = i;
                while (index >= gap && (double) numbers.get(index - gap) > temp) {
                    numbers.set(index, numbers.get(index - gap));
                    index = index - gap;

                }
                numbers.set(index, temp);

            }
            gap = gap / 2;
        }

        return numbers;
    }

    public DoubleLinkedList getList() {
        return list;
    }

    public void setList(DoubleLinkedList list) {
        this.list = list;
    }
    
    public void viewNumbers() {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println((double) numbers.get(i));
        }
    }

    public int getNumber_of_elements() {
        return number_of_elements;
    }

    public void setNumber_of_elements(int number_of_elements) {
        this.number_of_elements = number_of_elements;
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
