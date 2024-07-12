package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Biografia {
    public JPanel bio;
    private JButton hobbies;
    private JLabel Foto;
    private JTextArea bio1;
    private JTextArea bio2;


    public Biografia() {

        ImageIcon img = new ImageIcon("src/Yo.jpeg");
        img = new ImageIcon(img.getImage().getScaledInstance(300, 325, java.awt.Image.SCALE_SMOOTH));
        Foto.setIcon(img);

        hobbies.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame pj = new JFrame("Hobbies");
                pj.setContentPane(new Fotos().foto);
                pj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                pj.setSize(725, 700);
                pj.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(hobbies)).dispose();
            }
        });
    }
}
