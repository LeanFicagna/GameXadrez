package testes;

import tabuleiro.Tabuleiro;
import pecas.*;
import testes.TestCheck;

public class TestCheck {

    public TestCheck() {

    }

    static public boolean testCheck(Tabuleiro tabuleiro, int vez) {
        Peca peca;
        if(vez % 2 == 1) {
            for(int i = 0; i < tabuleiro.getTabuleiro().length; i++) {
                for(int j = 0; j < tabuleiro.getTabuleiro()[0].length; j++) {
                    if(tabuleiro.getPeca(i, j).toString() == "R") {
                        peca = tabuleiro.getPeca(i, j);
                    }
                }
            }

            for(int i = 0; i < tabuleiro.getTabuleiro().length; i++) {
                for(int j = 0; j < tabuleiro.getTabuleiro()[0].length; j++) {
                    if(tabuleiro.getPeca(i, j).getCor() == Cor.PRETA) {
                        //if( IsValidMove.isValid(tabuleiro.getPeca(i, j), 1, 1))
                        //    return true;
                    }
                }
            }
        } else {
            for(int i = 0; i < tabuleiro.getTabuleiro().length; i++) {
                for(int j = 0; j < tabuleiro.getTabuleiro()[0].length; j++) {
                    if(tabuleiro.getPeca(i, j).toString() == "r") {
                        peca = tabuleiro.getPeca(i, j);
                    }
                }
            }

            for(int i = 0; i < tabuleiro.getTabuleiro().length; i++) {
                for(int j = 0; j < tabuleiro.getTabuleiro()[0].length; j++) {
                    if(tabuleiro.getPeca(i, j).getCor() == Cor.PRETA) {

                    }
                }
            }
        }
        return false;
    }
}
