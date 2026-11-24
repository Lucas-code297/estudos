package ex002;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaSwing extends JFrame {

    public TelaSwing() {
        setTitle("Meu Primeiro Swing");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(null);
        
        JLabel lblMensagem = new JLabel("Aperte o botão!");
        lblMensagem.setBounds(250, 80, 350, 50);
        lblMensagem.setFont(new Font("Arial", Font.BOLD, 28));

        JButton btnClick = new JButton("Clique em mim");
        btnClick.setBounds(250, 200, 200, 50);
        btnClick.setFont(new Font("Arial", Font.PLAIN, 18));

        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblMensagem.setText("Olá, mundo!");
            }
        });

        add(lblMensagem);
        add(btnClick);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSwing().setVisible(true);
            }
        });
    }
}
