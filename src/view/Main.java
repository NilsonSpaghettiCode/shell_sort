package view;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    private Scene1 main;

    public Main() {

        main = new Scene1();
        main.scene();
        main.initComponents();;
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        Main app = new Main();

    }

}
