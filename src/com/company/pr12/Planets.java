package com.company.pr12;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListDataListener;

public class Planets {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                ComboBoxFrame frame = new ComboBoxFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });

    }

}
class ComboBoxFrame extends JFrame {
    public ComboBoxFrame() {
        setTitle("Planets");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        faceCombo = new JComboBox(); // выпадающее меню
        faceCombo.setEditable(true);
        faceCombo.addItem("MERCURY");
        faceCombo.addItem("VENUS");
        faceCombo.addItem("EARTH");
        faceCombo.addItem("MARS");
        faceCombo.addItem("JUPITER");
        faceCombo.addItem("SATURN");
        faceCombo.addItem("URANUS");
        faceCombo.addItem("NEPTUNE");
        JOptionPane.showMessageDialog(ComboBoxFrame.this,"Привет! Введи массу в текстовое поле, чтобы узнать гравитацию планеты.");
        faceCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                Planet planet = Planet.valueOf((String)faceCombo.getSelectedItem());
                double n = new Double(jTextField.getText());

                JOptionPane.showMessageDialog(ComboBoxFrame.this,"Гравитация планеты = " +planet.surfaceWeight(n));
            }
        });

        JPanel comboPanel = new JPanel();
        jTextField = new JTextField(10);
        comboPanel.add(jTextField);
        comboPanel.add(faceCombo);

        add(comboPanel, BorderLayout.CENTER);
    }
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 300;

    private JComboBox faceCombo;
    private JLabel label;
    private static final int DEFAULT_SIZE = 12;
    private JTextField jTextField;
}
enum Planet {
    MERCURY (3.303e+23, 2.4397e6),
    VENUS   (4.869e+24, 6.0518e6),
    EARTH   (5.976e+24, 6.37814e6),
    MARS    (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27,   7.1492e7),
    SATURN  (5.688e+26, 6.0268e7),
    URANUS  (8.686e+25, 2.5559e7),
    NEPTUNE (1.024e+26, 2.4746e7);

    private final double mass;   // в килограммах
    private final double radius; // в метрах
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    private double mass() { return mass; }
    private double radius() { return radius; }

    public static final double G = 6.67300E-11;  // гравитационная постоянная

    double surfaceGravity() {
        return G * mass / (radius * radius);
    }
    double surfaceWeight(double otherMass) {
        return otherMass * surfaceGravity();
    }

}
