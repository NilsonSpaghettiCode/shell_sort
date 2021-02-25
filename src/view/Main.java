package view;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, UnsupportedLookAndFeelException 
    {
        
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        
        Scene1 windo2 = new Scene1();

        windo2.scene();
        windo2.initComponents();
        
   



        
    }
    
}
