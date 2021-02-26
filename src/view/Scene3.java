/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Nilson Vargas
 */
public class Scene3 extends JFrame implements ActionListener {

    private JButton btn_back;
    private JDesktopPane main_pane;

    private JLabel name1, name2, name3, name4, name5;
    private JLabel namep1, namep2, namep3, namep4, namep5;
    private ImageIcon icon1, icon2, icon3, icon4, icon5, icon7, icon8, icon9, icon6, icon10;

    private JLabel d1, d2, d3, d4, d5;

    public Scene3() {

        this.setLayout(null);
        this.setSize(450, 650);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setBackground(new Color(130, 130, 130));
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        this.initComponents();
        this.setTitle("About US");
    }

    public void initComponents() {
        icon1 = new ImageIcon(getClass().getResource("Images/image1.png"));
        icon2 = new ImageIcon(getClass().getResource("Images/image2.png"));
        icon3 = new ImageIcon(getClass().getResource("Images/image3.png"));
        icon4 = new ImageIcon(getClass().getResource("Images/image4.png"));
        icon5 = new ImageIcon(getClass().getResource("Images/image5.png"));

        name1 = new JLabel();
        name2 = new JLabel();
        name3 = new JLabel();
        name4 = new JLabel();
        name5 = new JLabel();

        namep1 = new JLabel("Nilson Vargas");
        namep2 = new JLabel("Edwin Becerra");
        namep3 = new JLabel("Anderson Pedroza");
        namep4 = new JLabel("Oscar Leiva");
        namep5 = new JLabel("Andres Lugo");

        namep1.setBounds(200, 10, 200, 100);
        namep2.setBounds(200, 115, 200, 100);
        namep3.setBounds(200, 230, 200, 100);
        namep4.setBounds(200, 345, 200, 100);
        namep5.setBounds(200, 460, 200, 100);
        
        
        namep1.setFont(new Font("Verdana", 1, 16));
        namep2.setFont(new Font("Verdana", 1, 16));
        namep3.setFont(new Font("Verdana", 1, 16));
        namep4.setFont(new Font("Verdana", 1, 16));
        namep5.setFont(new Font("Verdana", 1, 16));
        
        namep1.setBackground(Color.WHITE);
        
        
        
        name1.setBounds(10, 10, 100, 100);
        name2.setBounds(10, 115, 100, 100);
        name3.setBounds(10, 230, 100, 100);
        name4.setBounds(10, 345, 100, 100);
        name5.setBounds(10, 460, 100, 100);
        
        

        icon6 = new ImageIcon((icon1.getImage().getScaledInstance(name1.getWidth(), name1.getHeight(), Image.SCALE_DEFAULT)));
        icon7 = new ImageIcon((icon2.getImage().getScaledInstance(name1.getWidth(), name1.getHeight(), Image.SCALE_DEFAULT)));
        icon8 = new ImageIcon((icon3.getImage().getScaledInstance(name1.getWidth(), name1.getHeight(), Image.SCALE_DEFAULT)));
        icon9 = new ImageIcon((icon4.getImage().getScaledInstance(name1.getWidth(), name1.getHeight(), Image.SCALE_DEFAULT)));
        icon10 = new ImageIcon((icon5.getImage().getScaledInstance(name1.getWidth(), name1.getHeight(), Image.SCALE_DEFAULT)));

        name1.setIcon(icon6);
        name2.setIcon(icon7);
        name3.setIcon(icon8);
        name4.setIcon(icon9);
        name5.setIcon(icon10);

        add(name1);
        add(name2);
        add(name3);
        add(name4);
        add(name5);

        btn_back = new JButton("Back");
        btn_back.setBounds(10, 575, 100, 30);

        main_pane = new JDesktopPane();
        main_pane.setSize(449, 649);
        main_pane.setBackground(Color.gray);

        main_pane.add(btn_back);
        main_pane.add(name1);
        main_pane.add(name2);
        main_pane.add(name3);
        main_pane.add(name4);
        main_pane.add(name5);

        main_pane.add(namep1);
        main_pane.add(namep2);
        main_pane.add(namep3);
        main_pane.add(namep4);
        main_pane.add(namep5);

        //Events buttons
        btn_back.addActionListener(this);

        this.add(main_pane);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn_back) {

            this.setVisible(false);
            Scene1 scene1 = new Scene1();

        }

    }

}
