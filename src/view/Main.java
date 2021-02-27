package view;

import java.util.ArrayList;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.DoubleLinkedList;
import model.FileReaderDocument;

import model.Nodo;
import model.SortFile;

public class Main {

    private Scene1 main;

    public Main() {

        main = new Scene1();
        main.scene();
        main.initComponents();;
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, UnsupportedLookAndFeelException {

//        Nodo num1 = new Nodo(7);
//        Nodo num2 = new Nodo(6);
//        Nodo num3 = new Nodo(5);
//        Nodo num4 = new Nodo(4);
//        Nodo num5 = new Nodo(3);
//        Nodo num6 = new Nodo(2);
//        Nodo num7 = new Nodo(1);
//
//        DoubleLinkedList lista = new DoubleLinkedList();
//        lista.AddFirst(num1);// 0
//        lista.AddFirst(num2);// 1
//        lista.AddFirst(num3);// 2
//        lista.AddFirst(num4);// 3
//        lista.AddFirst(num5);// 4 
//        lista.AddFirst(num6);// 5
//        lista.AddFirst(num7);// 6

        //lista.ViewNumbers();
//        String url = "C:\\Users\\USER\\Desktop\\zTesteos\\Numeros.txt";
//        
//        FileReaderDocument file = new FileReaderDocument(url);
//        
//        
//        DoubleLinkedList lista = file.ReadFile();
//        
//        lista.ViewNumbers();
//        System.out.println("Yap");

    //10000000
    //2147483647

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        Main app = new Main();
    }

}
