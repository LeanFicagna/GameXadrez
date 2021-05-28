import tabuleiro.*;
import testes.IsValidMove;
import jogo.*;
import pecas.Cor;
import pecas.Peca;

import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leanderson Ficagna
 */
public class Ui {

    static final Scanner scanner = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.flush();
        Tabuleiro tabuleiro = new Tabuleiro();
        Init.init(tabuleiro);
        
        boolean jogo = true;
        int vez = 1;

        while(jogo) {
            String temp;
            System.out.println("Round: " + vez);
            printTabuleiro(tabuleiro);
            System.out.print("Mover peça: ");
            temp = scanner.nextLine();
            int x = (int)temp.toUpperCase().charAt(0) - 65, y = (int)temp.charAt(1) - 47;

            System.out.print("Para: ");
            temp = scanner.nextLine();
            int l = (int)temp.toUpperCase().charAt(0) - 65, c = (int)temp.charAt(1) - 47;
            try {
                Peca peca = Tabuleiro.getPeca(x, y);
                System.out.println(IsValidMove.isValid(peca, l, c));
                if(IsValidMove.isValid(peca, l, c) && ((peca.getCor() == Cor.BRANCA && vez % 2 == 1) || (peca.getCor() == Cor.PRETA && vez % 2 == 0)))
                    tabuleiro.movePeca(peca, l, c);
            } catch(BordaException e) {
                System.err.println("erro: " + e);
            }
            vez++;
        }
    }
    
    public static void printTabuleiro(Tabuleiro tabuleiro) {
        for(int i = 0; i < tabuleiro.getTabuleiro().length; i++) {
            System.out.print((i+1) + " ");
            for(int j = 0; j < tabuleiro.getTabuleiro()[0].length; j++) {
                System.out.print(Tabuleiro.getPeca(j, i) != null? Tabuleiro.getPeca(j, i).toString() + " ": "  ");
            }
            System.out.println();
        }
        System.out.println("  A B C D E F G H");
    }
}
