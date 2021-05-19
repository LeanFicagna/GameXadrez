package tabuleiro;

import pecas.Peca;

public class Tabuleiro {

    private static Peca[][] tabuleiro = new Peca[8][8];

    public Tabuleiro() {
    }
    
    public void movePeca(Peca peca, int x, int y) {
        tabuleiro[peca.getX()][peca.getY()] = null;
        peca.goMover(x, y);
        tabuleiro[x][y] = peca;
    }

    public void removePeca(int x, int y) {
        tabuleiro[x][y] = null;
    }
    
    public void setPeca(Peca peca) {
        tabuleiro[peca.getX()][peca.getY()] = peca;
    }

    public static Peca getPeca(int x, int y) {
        return tabuleiro[x][y];
    }
    
    public Peca[][] getTabuleiro() {
        return tabuleiro;
    }
    
    public static void isBorda(int x, int y) throws BordaException {
        if(x < 0 || x > 7 || y < 0 || y > 7)
            throw new BordaException();
    }
}
