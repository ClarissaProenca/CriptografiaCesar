package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;

import static org.example.Criptografia.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Criptografia Vitor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JTextField inputTexto = new JTextField();
        JTextField criptografar = new JTextField();
        JTextField descriptografar = new JTextField();
        descriptografar.setEditable(false);

        inputTexto.setFont((new Font("Arial", Font.PLAIN, 30)));
        criptografar.setFont((new Font("Arial", Font.PLAIN, 30)));
        descriptografar.setFont((new Font("Arial", Font.PLAIN, 30)));

        JLabel label1 = new JLabel("Texto");
        label1.setFont((new Font("Arial", Font.BOLD, 30)));
        JLabel label2 = new JLabel("Criptografar");
        label2.setFont((new Font("Arial", Font.BOLD, 30)));
        JLabel label3 = new JLabel("Descriptografar");
        label3.setFont((new Font("Arial", Font.BOLD, 30)));

        panel.add(label1);
        panel.add(inputTexto);
        panel.add(label2);
        panel.add(criptografar);
        panel.add(label3);
        panel.add(descriptografar);

        String[] buttonLabels = {"Criptografar", "Descriptografar"};

        for(String label : buttonLabels){
            JButton button = new JButton(label);
            button.setFont((new Font("Arial", Font.PLAIN, 30)));
            panel.add(button);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String texto,textoDes, resultado = "";
                    int hash = 3;
                    texto = inputTexto.getText();
                    textoDes = criptografar.getText();
                    List<Character> codigo = new ArrayList<>();
                    List<Character> codigoReverso = new ArrayList<>();

                    if(label.equals("Criptografar")){
                        resultado = Criptografar(resultado, hash, codigo, texto);
                        criptografar.setText(resultado);
                    } else if(label.equals("Descriptografar")){
                        resultado = Descriptografar(resultado, hash, codigoReverso, textoDes);
                        descriptografar.setText(resultado);
                    }
                }
            });
        }

        frame.add(panel);
        frame.setVisible(true);

    }
}