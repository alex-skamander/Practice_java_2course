package com.company.pr11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main extends JFrame {

    private static final Random random = new Random();
    public static final int width = 800;
    public static final int height = 600;
    private static final int secret = random.nextInt(20) + 1;
    private static int count = 0;

    public Main(){
        super("Я тебя переиграю");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        JButton btn = new JButton("Жмяк");
        btn.setBounds(10, 10, 100, 50);
        JTextField minField = new JTextField("", 25);
        JOptionPane.showMessageDialog(Main.this, "Попробуй угадать число, которое я загадал :)");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int userNum = Integer.parseInt(minField.getText());
                if (userNum > 20 || userNum < 0) {
                    JOptionPane.showMessageDialog(Main.this, "От 1 до 20, шаришь? ;)");
                } else if (userNum == secret){
                    JOptionPane.showMessageDialog(Main.this, "Тебе просто повезло. Ты обидел машину :(");
                    System.exit(0);
                } else if (userNum > secret){
                    JOptionPane.showMessageDialog(Main.this,"Загаданное число меньше. Думаешь, я тебя не переиграю? :)");
                } else {
                    JOptionPane.showMessageDialog(Main.this, "Загаданное число больше. Думаешь, я тебя не уничтожу? :)");
                }
                count++;
                if (count >= 3){
                    JOptionPane.showMessageDialog(Main.this, "У тебя закончились попытки, наивный, доверчивый человек. Возвращайся, когда станешь сильнее.");
                    System.exit(0);
                }
            }
        });
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));

        panel.add(minField);
        panel.add(btn);
        setContentPane(panel);
        setSize(width, height);
        setVisible(true);
        System.out.println(secret);
    }

    public static void main(String[] args) {
        new Main();
    }
}
