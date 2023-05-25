package br.ifpr.jogo.modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
//toda classe em java herda da classe Object direta ou indiretamente
public class Fase extends JPanel{
    private Personagem personagem;
    private Image imagemDeFundo;

    public Fase() {
        ImageIcon carregando = new ImageIcon("C:\\Users\\Aluno\\Desktop\\jogo-space-invaders-main\\src\\br\\ifpr\\jogo\\arquivos\\fundo.jpg");
        this.imagemDeFundo = carregando.getImage();

        this.personagem = new Personagem();
        this.personagem.carregar();
    }
    public void paint(Graphics g){
        Graphics2D graficos = (Graphics2D)g;
        graficos.drawImage(this.imagemDeFundo, 0, 0,null);
        //graficos.drawImage(this.personagem.getImagemPersonagem(), null, ALLBITS, ABORT);
    }
}