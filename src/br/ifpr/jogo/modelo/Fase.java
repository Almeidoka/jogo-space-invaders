package br.ifpr.jogo.modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

//toda classe em java herda da classe Object direta ou indiretamente
public class Fase extends JPanel implements ActionListener {
    private Personagem personagem;
    private Image imagemDeFundo;
    private Timer timer;
    private static final int DESLOCAMENTO = 3;

    public Fase() {
        setFocusable(true);
        setDoubleBuffered(true);
        ImageIcon carregando = new ImageIcon(
                "arquivos\\template.png");
        this.imagemDeFundo = carregando.getImage();

        this.personagem = new Personagem();
        this.personagem.carregar();
        addKeyListener(new TecladoAdapter());
        timer = new Timer(5, this);
        timer.start();
    }

    public void paint(Graphics g) {
        Graphics2D graficos = (Graphics2D) g;
        graficos.drawImage(this.imagemDeFundo, 0, 0, null);
        graficos.drawImage(personagem.getImagemPersonagem(), personagem.getPosicaoX(), personagem.getPosicaoY(), this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        personagem.update();
        repaint();
    }

    private class TecladoAdapter extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            personagem.keyPressed(e);
        }

        public void keyReleased(KeyEvent e) {
            personagem.keyReleased(e);
        }
    }
}