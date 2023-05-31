package br.ifpr.jogo.modelo;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.KeyEvent;
public class Personagem {
    private int posicaoX;
    private int posicaoY;
    private int deslocamentoX;
    private int deslocamentoY;
    private Image imagemPersonagem;
    private int larguraImagem;
    private int alturaImagem;
    public Personagem(){
        this.posicaoX=0;
        this.posicaoY=0;
        
    }
    public void carregar(){
        ImageIcon carregar = new ImageIcon("C:\\Users\\gusta\\Documents\\workspace-eclipse\\jogo-space-invaders\\src\\br\\ifpr\\jogo\\arquivos\\psg_1.png");
        this.imagemPersonagem = carregar.getImage();
        this.alturaImagem=this.imagemPersonagem.getWidth(null);
        this.larguraImagem=this.imagemPersonagem.getHeight(null);
    }

    public void update(){
        posicaoX += deslocamentoX;
        posicaoY += deslocamentoY;
        
    }
    public void keyPressed(KeyEvent tecla){
        int movimentacao = tecla.getKeyCode();
        if(movimentacao == KeyEvent.VK_W){
            setDeslocamentoY(-3);
        }
        if(movimentacao == KeyEvent.VK_S){
            setDeslocamentoY(3);
        }
        if(movimentacao == KeyEvent.VK_A){
            setDeslocamentoX(-3);
        }
        if(movimentacao == KeyEvent.VK_D){
            setDeslocamentoX(3);
        }

    }
    public void keyReleased(KeyEvent tecla){
        int movimentacao = tecla.getKeyCode();
        if(movimentacao == KeyEvent.VK_W){
            setDeslocamentoY(0);
        }
        if(movimentacao == KeyEvent.VK_S){
            setDeslocamentoY(0);
        }
        if(movimentacao == KeyEvent.VK_A){
            setDeslocamentoX(0);
        }
        if(movimentacao == KeyEvent.VK_D){
            setDeslocamentoX(0);
        }

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
