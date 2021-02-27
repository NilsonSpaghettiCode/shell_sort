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
import java.io.File;
import java.util.ArrayList;

import javax.swing.filechooser.FileNameExtensionFilter;
import model.DoubleLinkedList;
import model.FileReaderDocument;
import model.SortFile;
import model.WriteNewDocument;

public class Scene2 extends JFrame implements ActionListener {

    private JFrame frame1;
    private JDesktopPane panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8;
    private JTextArea txt1, txt2;
    private JButton btn1, btn2, btn3, btn4, btn5;
    private JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9;
    private JFileChooser file1;
    private ImageIcon icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8, icon9, icon10, icon11, icon12, icon13,
            icon14;

    private int value;

    private String url;

    private String ext;
    private File file;//File para retornar un archivo a escribir
    private SortFile limpiar;
    private FileReaderDocument frd;
    private WriteNewDocument saved_file;

    public Scene2() {

        setIconImage(new ImageIcon(getClass().getResource("Images/tasks.png")).getImage());

    }

    public void scene() // Initialize components
    {
        frame1 = new JFrame();

        frame1.setLayout(null);
        frame1.setSize(850, 750);
        frame1.setLocationRelativeTo(null);
        frame1.setResizable(false);
        frame1.setBackground(new Color(130, 130, 130));
        frame1.setDefaultCloseOperation(3);
        frame1.setVisible(true);
        value = 0;
        ext = "";
        url = "";

    }

    public void initComponents() {

        // Input panel config
        // ====================================================================================================
        panel1 = new JDesktopPane();
        panel1.setBounds(20, 30, 300, 650);
        panel1.setBackground(Color.white);
        panel1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED)));
        panel1.setLayout(null);
        add(panel1);
        panel1.setVisible(true);
        frame1.add(panel1);

        // Output panel config
        // ====================================================================================================
        panel2 = new JDesktopPane();
        panel2.setBounds(510, 30, 300, 650);
        panel2.setBackground(Color.white);
        panel2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED)));
        panel2.setLayout(null);
        add(panel2);
        frame1.add(panel2);

        // Label Title Panel config
        // ====================================================================================================
        panel3 = new JDesktopPane();
        panel3.setBounds(10, 10, 280, 85);
        panel3.setBackground(Color.white);
        panel3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED)));
        add(panel3);
        panel3.setLayout(null);
        panel1.add(panel3);
        panel4 = new JDesktopPane();
        panel4.setBounds(10, 10, 280, 85);
        panel4.setBackground(Color.white);
        panel4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED)));
        add(panel4);
        panel4.setLayout(null);
        panel2.add(panel4);

        // Button panel config
        // ====================================================================================================
        panel5 = new JDesktopPane();
        panel5.setBounds(325, 360, 180, 320);
        panel5.setBackground(Color.white);
        panel5.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED)));
        panel5.setLayout(null);
        panel5.setVisible(true);
        frame1.add(panel5);

        // Green and Red Button Config
        // ====================================================================================================
        icon5 = new ImageIcon(getClass().getResource("Images/ra.png"));
        label5 = new JLabel();
        label5.setBounds(10, 80, 40, 40);
        icon6 = new ImageIcon(
                icon5.getImage().getScaledInstance(label5.getWidth(), label5.getHeight(), Image.SCALE_DEFAULT));
        label5.setIcon(icon6);
        add(label5);
        panel5.add(label5);

        icon7 = new ImageIcon(getClass().getResource("Images/ga.png"));
        label6 = new JLabel();
        label6.setBounds(130, 80, 40, 40);
        icon8 = new ImageIcon(
                icon7.getImage().getScaledInstance(label5.getWidth(), label5.getHeight(), Image.SCALE_DEFAULT));
        label6.setIcon(icon8);
        add(label6);
        panel5.add(label6);
        label6.setVisible(false);

        icon9 = new ImageIcon(getClass().getResource("Images/arrow.png"));
        label7 = new JLabel();
        label7.setBounds(130, 80, 40, 40);
        icon10 = new ImageIcon(
                icon9.getImage().getScaledInstance(label5.getWidth(), label5.getHeight(), Image.SCALE_DEFAULT));
        label7.setIcon(icon10);
        add(label7);
        panel5.add(label7);

        icon11 = new ImageIcon(getClass().getResource("Images/arrow1.png"));
        label8 = new JLabel();
        label8.setBounds(10, 80, 40, 40);
        icon12 = new ImageIcon(
                icon11.getImage().getScaledInstance(label5.getWidth(), label5.getHeight(), Image.SCALE_DEFAULT));
        label8.setIcon(icon12);
        add(label8);
        panel5.add(label8);

        // Text Area panel config
        // ====================================================================================================
        panel6 = new JDesktopPane();
        panel6.setBounds(10, 100, 280, 540);
        panel6.setBackground(Color.lightGray);
        panel6.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED)));
        panel6.setLayout(null);
        panel1.add(panel6);
        panel7 = new JDesktopPane();
        panel7.setBounds(10, 100, 280, 540);
        panel7.setBackground(Color.lightGray);
        panel7.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED)));
        panel7.setLayout(null);
        panel2.add(panel7);

        // Buttons
        // ====================================================================================================
        String buttonfont = "Segoe UI";

        btn1 = new JButton("Sort");
        btn1.setBounds(10, 10, 160, 50);
        btn1.setFont(new Font(buttonfont, 0, 16));
        btn1.addActionListener(this);
        add(btn1);
        panel5.add(btn1);
        btn2 = new JButton("Back");
        btn2.setBounds(10, 200, 160, 50);
        btn2.setFont(new Font(buttonfont, 0, 16));
        btn2.addActionListener(this);
        add(btn2);
        panel5.add(btn2);
        btn3 = new JButton("Exit");
        btn3.setBounds(10, 260, 160, 50);
        btn3.setFont(new Font(buttonfont, 0, 16));
        btn3.addActionListener(this);
        add(btn3);
        panel5.add(btn3);
        btn4 = new JButton("Select File");
        btn4.setBounds(10, 140, 160, 50);
        btn4.setFont(new Font(buttonfont, 0, 16));
        btn4.addActionListener(this);
        add(btn4);
        panel5.add(btn4);

        // TextArea
        // ====================================================================================================
        txt1 = new JTextArea(15, 3);
        txt1.setLineWrap(true);
        txt1.setBounds(10, 10, 260, 520);
        txt1.setEditable(false);
        add(txt1);
        panel6.add(txt1);
        txt2 = new JTextArea();
        txt2.setBounds(10, 10, 260, 520);
        txt2.setEditable(false);
        add(txt2);
        panel7.add(txt2);

        // Title labels config
        // =========================================================================================================
        icon1 = new ImageIcon(getClass().getResource("Images/folder.png"));
        label3 = new JLabel();
        label3.setBounds(150, 10, 68, 68);
        icon2 = new ImageIcon(
                icon1.getImage().getScaledInstance(label3.getWidth(), label3.getHeight(), Image.SCALE_DEFAULT));
        label3.setIcon(icon2);
        add(label3);
        panel3.add(label3);

        icon3 = new ImageIcon(getClass().getResource("Images/folder2.png"));
        label4 = new JLabel();
        label4.setBounds(190, 10, 70, 70);
        icon4 = new ImageIcon(
                icon3.getImage().getScaledInstance(label4.getWidth(), label4.getHeight(), Image.SCALE_DEFAULT));
        label4.setIcon(icon4);
        add(label4);
        panel4.add(label4);

        label1 = new JLabel("Input");
        label1.setBounds(10, 13, 200, 60);
        label1.setFont(new Font(buttonfont, 1, 45));
        add(label1);
        panel3.add(label1);
        label2 = new JLabel("Output");
        label2.setBounds(10, 13, 200, 60);
        label2.setFont(new Font(buttonfont, 1, 45));
        add(label2);
        panel4.add(label2);

        // Title labels config
        // =========================================================================================================
        icon13 = new ImageIcon(getClass().getResource("Images/data-transfer.png"));
        label9 = new JLabel();
        label9.setBounds(340, 40, 150, 150);
        icon14 = new ImageIcon(
                icon13.getImage().getScaledInstance(label9.getWidth(), label9.getHeight(), Image.SCALE_DEFAULT));
        label9.setIcon(icon14);
        add(label9);
        frame1.add(label9);

        panel8 = new JDesktopPane();
        panel8.setBounds(325, 280, 180, 70);
        panel8.setBackground(Color.white);
        panel8.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED)));
        panel8.setLayout(null);
        add(panel8);
        frame1.add(panel8);

        // Set Options JFileChooser
        // =========================================================================================================
        file1 = new JFileChooser();
        file1.setFileFilter(new FileNameExtensionFilter("Files txt  (*.txt)", "txt"));
        file1.setFileFilter(new FileNameExtensionFilter("Files csv  (*.csv)", "csv"));

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn1) {
            String x = txt1.getText();
            if (x.equals("")) {
                JOptionPane.showMessageDialog(null, "There is no operations to do", "Window",
                        JOptionPane.ERROR_MESSAGE);

            } else {

                label6.setVisible(true);
                label5.setVisible(false);

                btn5 = new JButton("Save");
                btn5.setVisible(true);

                btn5.setBounds(10, 10, 160, 50);
                btn2.setFont(new Font("Segoe UI", 0, 18));
                btn5.addActionListener(this);
                add(btn5);
                panel8.add(btn5);
                limpiar.ShellSortX();

                String txt_order = "";

                ArrayList numbers_order_tempo = limpiar.getNumbers();

                for (int i = 0; i < numbers_order_tempo.size(); i++) {
                    if ((i % 5) == 0) {
                        txt_order = txt_order + String.format("%.1f", numbers_order_tempo.get(i)) + "\n";
                    } else {
                        txt_order = txt_order + String.format("%.1f", numbers_order_tempo.get(i)) + " ";
                    }

                }
                txt2.setText(txt_order);

            }
        } //Back
        else if (e.getSource() == btn2) {

            Scene1 windo2 = new Scene1();

            windo2.scene();
            frame1.setVisible(false);
            windo2.initComponents();

        } //Salir
        else if (e.getSource() == btn3) {
            System.exit(0);
        } //Boton select file input
        else if (e.getSource() == btn4) {

            txt1.setText("");
            txt2.setText("");

            label6.setVisible(false);
            label5.setVisible(true);

            this.value = file1.showOpenDialog(this);

            if (this.getState() == JFileChooser.APPROVE_OPTION) {
                try {
                    url = file1.getSelectedFile().getAbsolutePath();

                    limpiar = new SortFile();
                    frd = new FileReaderDocument(url);
                    DoubleLinkedList list = frd.ReadFile();
                    System.out.println("Leido");
                    DoubleLinkedList x = limpiar.ShellSort(list);
                    System.out.println("Ordenado");
                    
                    String txt = "";
                    for (int i = 0; i < 100; i++)
                    {
                        txt = txt + list.getNumber(i);
                        
                    }
                    
                    txt1.setText(txt);
                    



                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, "No file has been selected", "Window", JOptionPane.ERROR_MESSAGE);
                }

            }

        } else if (e.getSource() == btn5) {
            File data = file1.getSelectedFile();
            value = file1.showSaveDialog(null);

            if (value == JFileChooser.APPROVE_OPTION) {
                ext = ((FileNameExtensionFilter) file1.getFileFilter()).getExtensions()[0];

                url = file1.getSelectedFile().getAbsolutePath() + "." + ext;

                file = new File(url);

                saved_file = new WriteNewDocument(file, limpiar.getNumbers(), ext);
                saved_file.Save();

            } else {
                JOptionPane.showMessageDialog(null, "No file selected");

            }

            btn5.setVisible(false);

        }

    }

}
