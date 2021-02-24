package view;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Scene1 extends JFrame implements ActionListener
{
    private JFrame frame1;
    private JDesktopPane pane1, pane2, pane3, panel4, panel5, panel6, panel7;
    private JTextArea txt1, txt2;
    private JButton but1, but2, but3;
    private JLabel labe1, labe2, labe3, labe4, label5, label6, label7, label8;
    private JFileChooser file1;
    private ImageIcon ico1, ico2, ico3, ico4, icon5, icon6, icon7, icon8, icon9, icon10, icon11, icon12;

    public Scene1() {

        setIconImage(new ImageIcon(getClass().getResource("Images/tasks.png")).getImage());


    }

    public void scene() // Initialize components
    {
        frame1 = new JFrame();
        
        frame1.setLayout(null);
        frame1.setSize(413, 711);
        frame1.setLocationRelativeTo(null);
        frame1.setResizable(false);
        frame1.setBackground(new Color(130, 130, 130));
        frame1.setDefaultCloseOperation(3);
        frame1.setVisible(true);

    }

    public void initComponents()
    {

        // Panels
        // ====================================================================================================

        
        
        pane1 = new JDesktopPane();
        pane1.setBounds(18, 370, 358, 293);
        pane1.setBackground(Color.white);
        pane1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED)));
        pane1.setLayout(null);
        add(pane1);
        frame1.add(pane1);

        pane2 = new JDesktopPane();
        pane2.setBounds(10, 10, 375, 658);
        pane2.setBackground(Color.lightGray);
        pane2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED)));
        pane2.setLayout(null);
        add(pane2);
        frame1.add(pane2);

        pane3 = new JDesktopPane();
        pane3.setBounds(10,10, 355, 340);
        pane3.setBackground(Color.white);
        pane3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED)));
        pane3.setLayout(null);
        add(pane3);
        pane2.add(pane3);

        // Labels
        // ====================================================================================================

        










        // Buttons
        // ====================================================================================================

        String buttonfont = "Segoe UI";

        but1 = new JButton("Start");
        but1.setBounds(35, 110, 292, 77);
        but1.setFont(new Font(buttonfont, 0, 16));
        but1.addActionListener(this);
        add(but1);
        pane1.add(but1);

        but2 = new JButton("About");
        but2.setBounds(35, 210, 292, 32);
        but2.setFont(new Font(buttonfont, 0, 16));
        but2.addActionListener(this);
        add(but2);
        pane1.add(but2);

        but3 = new JButton("User guide");
        but3.setBounds(35, 250, 292, 32);
        but3.setFont(new Font(buttonfont, 0, 16));
        but3.addActionListener(this);
        add(but3);
        pane1.add(but3);

        // Label
        // ====================================================================================================

        labe1 = new JLabel("Numeric File");
        labe1.setFont(new Font(buttonfont, 1, 36));
        labe1.setBounds(80,10,300,60);
        add(labe1);
        pane1.add(labe1);

        labe2 = new JLabel("Converter");
        labe2.setFont(new Font(buttonfont, 1, 36));
        labe2.setBounds(95,40,300,60);
        add(labe2);
        pane1.add(labe2);


        // Image Label
        // ====================================================================================================
        ico1 = new ImageIcon(getClass().getResource("Images/logo2.png"));
        labe3 = new JLabel();
        labe3.setBounds(25,10,300,300);
        ico2 = new ImageIcon(ico1.getImage().getScaledInstance(labe3.getWidth(), labe3.getHeight(), Image.SCALE_DEFAULT));
        labe3.setIcon(ico2);
        add(labe3);
        pane3.add(labe3);

    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == but1) 
        {
            Scene2 window = new Scene2();
            window.scene();
            window.initComponents();
            frame1.setVisible(false);

        } else if(e.getSource() == but2)
        {





           

      


            JOptionPane.showMessageDialog(null, "Button 2 is working", "test", JOptionPane.INFORMATION_MESSAGE);
        }

        else if(e.getSource() == but3)
        {










            JOptionPane.showMessageDialog(null, "Button 2 is working", "test", JOptionPane.INFORMATION_MESSAGE);

        }

        

    }
    


    
}
