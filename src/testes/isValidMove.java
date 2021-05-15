package testes;

import pecas.Cor;
import pecas.Peca;
import pecas.Tipo;
import tabuleiro.Tabuleiro;

public class isValidMove {

    public isValidMove() {
    }
    
    public static boolean isValid(Peca peca, int x, int y) {
        if(Tabuleiro.getPeca(x, y) == null)
            if(peca.getTipo() == Tipo.PEAO)
                return Peao(peca, x, y);
        else
    }
    
    public static boolean Peao(Peca peca, int x, int y) {
        try {
            Tabuleiro.isBorda(x, y);
            if(peca.getCor() == Cor.BRANCA) {
                if(peca.getY() == 7) {
                    if((peca.getX() == x-1 || peca.getX() == x-2) && peca.getY() == y) {
                        return true;
                    }
                } else if(peca.getX() == x-1 && peca.getY() == y) {
                    return true;
                }
            } else if(peca.getCor() == Cor.PRETA) {
                if(peca.getY() == 1) {
                    if((peca.getX() == x+1 || peca.getX() == x+2) && peca.getY() == y) {
                        return true;
                    }
                } else if(peca.getX() == x+1 && peca.getY() == y) {
                    return true;
                }
            }
        } catch() {
            
        }
        return false;
    }
}
