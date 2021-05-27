package jogo;

import pecas.Cor;
import pecas.Peca;
import pecas.Tipo;
import tabuleiro.Tabuleiro;

public class Init {
    public Init() {

    }

    public static void init(Tabuleiro tabuleiro) {
        // Init Pretas
        tabuleiro.setPeca(new Peca(0, 0, Cor.PRETA, Tipo.TORRE));
        tabuleiro.setPeca(new Peca(1, 0, Cor.PRETA, Tipo.CAVALO));
        tabuleiro.setPeca(new Peca(2, 0, Cor.PRETA, Tipo.BISPO));
        tabuleiro.setPeca(new Peca(3, 0, Cor.PRETA, Tipo.DAMA));
        tabuleiro.setPeca(new Peca(4, 0, Cor.PRETA, Tipo.REI));
        tabuleiro.setPeca(new Peca(5, 0, Cor.PRETA, Tipo.BISPO));
        tabuleiro.setPeca(new Peca(6, 0, Cor.PRETA, Tipo.CAVALO));
        tabuleiro.setPeca(new Peca(7, 0, Cor.PRETA, Tipo.TORRE));
        for(int i = 0; i < 8; i++) {
            tabuleiro.setPeca(new Peca(i, 1, Cor.PRETA, Tipo.PEAO));
        }
        
        tabuleiro.setPeca(new Peca(0, 7, Cor.BRANCA, Tipo.TORRE));
        tabuleiro.setPeca(new Peca(1, 7, Cor.BRANCA, Tipo.CAVALO));
        tabuleiro.setPeca(new Peca(2, 7, Cor.BRANCA, Tipo.BISPO));
        tabuleiro.setPeca(new Peca(3, 7, Cor.BRANCA, Tipo.DAMA));
        tabuleiro.setPeca(new Peca(4, 7, Cor.BRANCA, Tipo.REI));
        tabuleiro.setPeca(new Peca(5, 7, Cor.BRANCA, Tipo.BISPO));
        tabuleiro.setPeca(new Peca(6, 7, Cor.BRANCA, Tipo.CAVALO));
        tabuleiro.setPeca(new Peca(7, 7, Cor.BRANCA, Tipo.TORRE));
        for(int i = 0; i < 8; i++) {
            tabuleiro.setPeca(new Peca(i, 6, Cor.BRANCA, Tipo.PEAO));
        }
    }
}
