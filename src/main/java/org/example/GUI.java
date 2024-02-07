package org.example;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GUI implements ActionListener {
    private int count = 0;
    JFrame frame;
    JPanel panel;
    JLabel label;
    JLabel label2;


    public GUI() {
        frame = new JFrame();
        //frame.setSize(500, 500);
        frame.setPreferredSize(new Dimension(800,900));

        JButton button = new JButton();
        button.setMargin(new Insets(0,0,5,0));//topleftbotright

        Border blackline = BorderFactory.createLineBorder(Color.BLACK);
        label = new JLabel("Number of Clicks: 0", SwingConstants.CENTER);
        label2 = new JLabel("test");
        label2.setSize(1,1);
        label.setBorder(blackline);
        label2.setBorder(blackline);
        //label.setPreferredSize(new Dimension(1,1));
        button.addActionListener(this);
        Icon icon = new ImageIcon("src\\main\\java\\org\\example\\img\\newCookie.png");


        button.setIcon(icon);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);


        panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        panel.setLayout(new GridLayout(2,1));
        panel.add(label);
        panel.add(label2);
        panel.add(button);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Cookie Clicker");
        frame.pack();
        frame.setVisible(true);
    }

    public static void WindowStart(){
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
