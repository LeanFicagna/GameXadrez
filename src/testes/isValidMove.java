package testes;

import pecas.Cor;
import pecas.Peca;
import pecas.Tipo;
import tabuleiro.BordaException;
import tabuleiro.Tabuleiro;

public class IsValidMove {

    public IsValidMove() {
    }

    public static boolean isValid(Peca peca, int x, int y) throws BordaException {
        if (Tabuleiro.getPeca(x, y) == null)
            if(peca != null)
                return true;
                if (peca.getTipo() == Tipo.PEAO)
                    return Peao(peca, x, y);
        return false;
    }

    public static boolean Peao(Peca peca, int x, int y) throws BordaException {
        Tabuleiro.isBorda(x, y);
        if (peca.getCor() == Cor.BRANCA) {
            if (peca.getY() == 7) {
                if ((peca.getX() == x - 1 || peca.getX() == x - 2) && peca.getY() == y) {
                    return true;
                }
            } else if (peca.getX() == x - 1 && peca.getY() == y) {
                return true;
            }
        } else if (peca.getCor() == Cor.PRETA) {
            if (peca.getY() == 1) {
                if ((peca.getX() == x + 1 || peca.getX() == x + 2) && peca.getY() == y) {
                    return true;
                }
            } else if (peca.getX() == x + 1 && peca.getY() == y) {
                return true;
            }
        }
        return false;
    }
}
