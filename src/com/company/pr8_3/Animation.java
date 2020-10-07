package com.company.pr8_3;

import javax.swing.*;
import java.io.File;

public class Animation {

    public static void main(String[] args) throws InterruptedException {

        String root = "src\\com\\company\\pr8_3\\Animation\\";

        File folder = new File(root);
        File[] files = folder.listFiles();
        System.out.println(files[0].getName());

        if (files != null) {
            JFrame frame = new JFrame();
            frame.setSize(1000, 1000);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            int x = 0;

            frame.setVisible(true);

            while (true) {
                frame.getContentPane().removeAll();
                frame.add(new JLabel(new ImageIcon(root + files[x].getName())));
                frame.pack();
                frame.setVisible(true);
                x++;
                if (x >= files.length)
                    x = 0;
                Thread.sleep(40);
            }

        }
    }
}
