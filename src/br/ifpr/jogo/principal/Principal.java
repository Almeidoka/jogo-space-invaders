package br.ifpr.jogo.principal;

import java.security.Permission;

import javax.swing.JFrame;

public class Principal extends JFrame {
    public Principal() {
        setVisible(true);
        setSize(1920, 1080);
        setTitle("Space Invaders");
        setLocationRelativeTo((null));
        setDefaultCloseOperation(ABORT);
        

    }

    public static void main(String[] args) {
        Principal principal = new Principal();
    }
}
