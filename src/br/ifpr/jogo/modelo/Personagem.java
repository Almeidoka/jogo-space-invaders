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
    private int velocidadeDeDeslocamente = 3;

    /* Criação de constante */
    private static final int POSICAO_INICIAL_X = 100;
    private static final int POSICAO_INICIAL_Y = 100;

    public Personagem() {
        this.posicaoX = POSICAO_INICIAL_X;
        this.posicaoY = POSICAO_INICIAL_Y;
        this.velocidadeDeDeslocamente = velocidadeDeDeslocamente;

    }

    public void carregar() {
        ImageIcon carregar = new ImageIcon(
                "arquivos\\psg_1.png");
        this.imagemPersonagem = carregar.getImage();
        this.alturaImagem = this.imagemPersonagem.getWidth(null);
        this.larguraImagem = this.imagemPersonagem.getHeight(null);
    }

    public void update() {

        if (posicaoX < 1) {
            this.posicaoX = posicaoX + 3;
        } else if (posicaoX > 480) {
            this.posicaoX = posicaoX - 3;
        } else if (posicaoY < 1) {
            this.posicaoX = posicaoX + 3;
        } else if (posicaoY > 300) {
            this.posicaoX = posicaoX - 3;
        } else {
            this.posicaoX += this.deslocamentoX;
            this.posicaoY += this.deslocamentoY;
        }

    }

    public void keyPressed(KeyEvent tecla) {
        int movimentacao = tecla.getKeyCode();
        if (movimentacao == KeyEvent.VK_W || movimentacao == KeyEvent.VK_UP) {
            this.deslocamentoY -= velocidadeDeDeslocamente;
        }
        if (movimentacao == KeyEvent.VK_S || movimentacao == KeyEvent.VK_DOWN) {
            this.deslocamentoY += velocidadeDeDeslocamente;
        }
        if (movimentacao == KeyEvent.VK_A || movimentacao == KeyEvent.VK_LEFT) {
            this.deslocamentoX -= velocidadeDeDeslocamente;
        }
        if (movimentacao == KeyEvent.VK_D || movimentacao == KeyEvent.VK_RIGHT) {
            this.deslocamentoX += velocidadeDeDeslocamente;
        }

    }

    public void parar(KeyEvent tecla) {
        int movimentacao = tecla.getKeyCode();
        if (movimentacao == KeyEvent.VK_W || movimentacao == KeyEvent.VK_UP) {
            this.deslocamentoY = 0;
        }
        if (movimentacao == KeyEvent.VK_S || movimentacao == KeyEvent.VK_DOWN) {
            this.deslocamentoY = 0;
        }
        if (movimentacao == KeyEvent.VK_A || movimentacao == KeyEvent.VK_LEFT) {
            this.deslocamentoX = 0;
        }
        if (movimentacao == KeyEvent.VK_D || movimentacao == KeyEvent.VK_RIGHT) {
            this.deslocamentoX = 0;
        }

    }

    public void keyReleased(KeyEvent tecla) {
        int movimentacao = tecla.getKeyCode();
        if (movimentacao == KeyEvent.VK_W || movimentacao == KeyEvent.VK_UP) {
            setDeslocamentoY(0);
        }
        if (movimentacao == KeyEvent.VK_S || movimentacao == KeyEvent.VK_DOWN) {
            setDeslocamentoY(0);
        }
        if (movimentacao == KeyEvent.VK_A || movimentacao == KeyEvent.VK_LEFT) {
            setDeslocamentoX(0);
        }
        if (movimentacao == KeyEvent.VK_D || movimentacao == KeyEvent.VK_RIGHT) {
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
