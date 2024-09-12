package Receita;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Informa_Dados extends JFrame implements ActionListener {
    Dados_Contribuinte receita = new Dados_Contribuinte();

    JLabel L1, L2, L3, L4, L5;
    JButton B1;
    JTextField T1, T2, T3, T4;
    JCheckBox C1, C2;

    boolean j1, j2;
    String a, b, c, d;

    public Informa_Dados() {
        setTitle("Protótipo de Engenharia de Software III");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setBackground(new Color(200, 200, 200));
        getContentPane().setLayout(new GridLayout(6, 2));

        L1 = new JLabel("Identificação");
        L1.setForeground(Color.blue);
        L1.setFont(new Font(" ", Font.BOLD, 14));

        L2 = new JLabel("CPF (Se pessoa física)");
        L2.setForeground(Color.blue);
        L2.setFont(new Font(" ", Font.BOLD, 14));

        L3 = new JLabel("CNPJ (Se pessoa jurídica)");
        L3.setForeground(Color.blue);
        L3.setFont(new Font(" ", Font.BOLD, 14));

        L4 = new JLabel("Cartão");
        L4.setForeground(Color.blue);
        L4.setFont(new Font(" ", Font.BOLD, 14));

        L5 = new JLabel(" ");
        L5.setForeground(Color.gray);

        T1 = new JTextField();
        T1.setBackground(Color.white);
        T1.setForeground(Color.black);

        T2 = new JTextField();
        T2.setBackground(Color.white);
        T2.setForeground(Color.black);

        T3 = new JTextField();
        T3.setBackground(Color.white);
        T3.setForeground(Color.black);

        T4 = new JTextField();
        T4.setBackground(Color.white);
        T4.setForeground(Color.black);

        C1 = new JCheckBox("Pessoa Física");
        C2 = new JCheckBox("Pessoa Jurídica");

        B1 = new JButton("Leitura de dados");
        B1.setBackground(Color.white);
        B1.setForeground(Color.blue);
        B1.addActionListener(this);

        getContentPane().add(L1);
        getContentPane().add(T1);
        getContentPane().add(L2);
        getContentPane().add(T2);
        getContentPane().add(L3);
        getContentPane().add(T3);
        getContentPane().add(L4);
        getContentPane().add(T4);
        getContentPane().add(C1);
        getContentPane().add(C2);
        getContentPane().add(B1);
        getContentPane().add(L5);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == B1) {
            a = T1.getText();
            b = T2.getText();
            c = T3.getText();
            d = T4.getText();
            j1 = C1.isSelected();
            j2 = C2.isSelected();
            informaDados();
        }
    }

    public void informaDados() {
        receita.setNome(a);
        receita.setCPF(b);
        receita.setCNPJ(c);
        receita.setCartao(d);

        System.out.println("Identificação do contribuinte: " + receita.getNome());
        System.out.println("Cartão do contribuinte ou empresa: " + receita.getCartao());
        if (j1) {
            System.out.println("CPF do contribuinte: " + receita.getCPF());
        }
        if (j2) {
            System.out.println("CNPJ do contribuinte: " + receita.getCNPJ());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Informa_Dados());
    }
}

