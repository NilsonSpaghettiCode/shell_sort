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
//
//        Nodo num1 = new Nodo(31123);
//        Nodo num2 = new Nodo(6456);
//        Nodo num3 = new Nodo(456);
//        Nodo num4 = new Nodo(456);
//        Nodo num5 = new Nodo(456);
//        Nodo num6 = new Nodo(2456);
//        Nodo num7 = new Nodo(145654);
//
//        DoubleLinkedList lista = new DoubleLinkedList();
//        lista.AddFirst(num1);// 0
//        lista.AddFirst(num2);// 1
//        lista.AddFirst(num3);// 2
//        lista.AddFirst(num4);// 3
//        lista.AddFirst(num5);// 4 
//        lista.AddFirst(num6);// 5
//        lista.AddFirst(num7);// 6
//
//        lista.ViewNumbers();
//        String url = "C:\\Users\\USER\\Desktop\\zTesteos\\NumerosMedio.txt";
//        
//
//        SortFile fs = new SortFile();
//        DoubleLinkedList lista_ordenada = fs.ShellSort(new FileReaderDocument(url).ReadFile());
//        lista_ordenada.ViewNumbers();
//        
//        SortFile test = new SortFile();
//        DoubleLinkedList xd = test.ShellSort(lista);
//        xd.ViewNumbers();


    //10000000
    //2147483647

    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    Main app = new Main();
    }

}
