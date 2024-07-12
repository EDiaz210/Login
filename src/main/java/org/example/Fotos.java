package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fotos {
    public JPanel foto;
    private JButton regresar;
    private JLabel img1;
    private JLabel img2;
    private JLabel img3;
    private JLabel img4;
    private JPanel Img2;

    public Fotos() {

        ImageIcon img = new ImageIcon("src/f.jpg");
        img = new ImageIcon(img.getImage().getScaledInstance(350, 300, java.awt.Image.SCALE_SMOOTH));
        img1.setIcon(img);


        ImageIcon imt = new ImageIcon("src/fa.jpg");
        imt = new ImageIcon(imt.getImage().getScaledInstance(350, 300, java.awt.Image.SCALE_SMOOTH));
        img2.setIcon(imt);

        ImageIcon imc = new ImageIcon("src/gym.jfif");
        imc = new ImageIcon(imc.getImage().getScaledInstance(350, 300, java.awt.Image.SCALE_SMOOTH));
        img3.setIcon(imc);

        ImageIcon ima = new ImageIcon("src/p.jpg");
        ima = new ImageIcon(ima.getImage().getScaledInstance(350, 300, java.awt.Image.SCALE_SMOOTH));
        img4.setIcon(ima);

        regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame fp = new JFrame();
                fp.setContentPane(new  Biografia().bio);
                fp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                fp.setSize(750,700);
                fp.setVisible(true);
                ((JFrame) SwingUtilities.getWindowAncestor(regresar)).dispose();
            }
        });
    }
}
