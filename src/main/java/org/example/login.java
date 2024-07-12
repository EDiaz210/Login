package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
    public JPanel p1;
    private JTextField correo;
    private JTextField pass;
    private JButton login;

    public login() {
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(correo.getText().equals("elkin04diaz@gmail.com") && pass.getText().equals("elkin0979")) {
                    JOptionPane.showMessageDialog(null, "Inicio de sesión correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    JFrame fr = new JFrame("Biografía");
                    fr.setContentPane(new Biografia().bio);
                    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    fr.setSize(725, 700);
                    fr.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Las credenciales son incorrectas", "Notificación", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
