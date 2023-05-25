package br.ifpr.jogo.modelo;

import javax.swing.ImageIcon;
import java.awt.Image;
public class Personagem {
    private int posicaoX;
    private int posicaoY;
    private int deslocamentoX;
    private int deslocamentoY;
    private Image imagemPersonagem;
    private int larguraImagem;
    private int alturaImagem;
    public Personagem(){
        this.posicaoX=960;
        this.posicaoY=540;
        
    }
    public void carregar(){
        ImageIcon carregar = new ImageIcon("C:\\Users\\Aluno\\Desktop\\jogo-space-invaders-main\\src\\br\\ifpr\\jogo\\arquivos\\nave.jpg");
        this.imagemPersonagem = carregar.getImage();
        this.alturaImagem=this.imagemPersonagem.getWidth(null);
        this.larguraImagem=this.imagemPersonagem.getHeight(null);
    }

  

    public int getPosicaoX() {
        return this.posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return this.posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    public int getDeslocamentoX() {
        return this.deslocamentoX;
    }

    public void setDeslocamentoX(int deslocamentoX) {
        this.deslocamentoX = deslocamentoX;
    }

    public int getDeslocamentoY() {
        return this.deslocamentoY;
    }

    public void setDeslocamentoY(int deslocamentoY) {
        this.deslocamentoY = deslocamentoY;
    }

    public Image getImagemPersonagem() {
        return this.imagemPersonagem;
    }

    public void setImagemPersonagem(Image imagemPersonagem) {
        this.imagemPersonagem = imagemPersonagem;
    }

    public int getLarguraImagem() {
        return this.larguraImagem;
    }

    public void setLarguraImagem(int larguraImagem) {
        this.larguraImagem = larguraImagem;
    }

    public int getAlturaImagem() {
        return this.alturaImagem;
    }

    public void setAlturaImagem(int alturaImagem) {
        this.alturaImagem = alturaImagem;
    }


}
