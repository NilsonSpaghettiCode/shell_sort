package view;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, UnsupportedLookAndFeelException 
    {
        JOptionPane.showMessageDialog(null, "Hola", "git de mrda", 3);
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        
        Scene1 windo2 = new Scene1();

        windo2.scene();
        windo2.initComponents();
        
   



        
    }
    
}
