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
            if (peca != null)
                return true;
        if (peca.getTipo() == Tipo.PEAO)
            return Peao(peca, x, y);
        if (peca.getTipo() == Tipo.CAVALO)
            return Cavalo(peca, x, y);
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

    public static boolean Cavalo(Peca peca, int x, int y) throws BordaException {
        Tabuleiro.isBorda(x, y);
        if (peca.getCor() == Cor.BRANCA) {
            if (peca.getX() == x + 2 && peca.getY() == y - 1) {
                return true;
            } else if (peca.getX() == x + 2 && peca.getY() == y + 1) {
                return true;
            } else if (peca.getX() == x + 1 && peca.getY() == y + 2) {
                return true;
            } else if (peca.getX() == x + 1 && peca.getY() == y - 2) {
                return true;
            }  else if (peca.getX() == x - 1 && peca.getY() == y - 2) {
                return true;
            } else if (peca.getX() == x - 1 && peca.getY() == y + 2) {
                return true;
            } else if (peca.getX() == x - 2 && peca.getY() == y + 1) {
                return true;
            } else if (peca.getX() == x - 2 && peca.getY() == y - 1) {
                return true;
            }
        } else if (peca.getCor() == Cor.PRETA) {
            
            if (peca.getX() == x + 2 && peca.getY() == y - 1) {
                return true;
            } else if (peca.getX() == x + 2 && peca.getY() == y + 1) {
                return true;
            } else if (peca.getX() == x + 1 && peca.getY() == y + 2) {
                return true;
            } else if (peca.getX() == x + 1 && peca.getY() == y - 2) {
                return true;
            }  else if (peca.getX() == x - 1 && peca.getY() == y - 2) {
                return true;
            } else if (peca.getX() == x - 1 && peca.getY() == y + 2) {
                return true;
            } else if (peca.getX() == x - 2 && peca.getY() == y + 1) {
                return true;
            } else if (peca.getX() == x - 2 && peca.getY() == y - 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean Bispo(Peca peca, int x, int y) throws BordaException {
        Tabuleiro.isBorda(x, y);
        for(int i = 1; i < 8; i++) {
            if(peca.getX() == x + i && peca.getY() == y + i) {
               return true; 
            } else if(peca.getX() == x + i && peca.getY() == y - i) {
                return true; 
            } else if(peca.getX() == x - i && peca.getY() == y + i) {
                return true; 
            } else if(peca.getX() == x - i && peca.getY() == y - i) {
                return true; 
            }
        }
        return false;
    }

    public static boolean Torre(Peca peca, int x, int y) throws BordaException {
        Tabuleiro.isBorda(x, y);
        for(int i = 1; i < 8; i++) {
            if(peca.getX() == x + i && peca.getY() == y) {
               return true; 
            } else if(peca.getX() == x - i && peca.getY() == y) {
                return true; 
            } else if(peca.getX() == x && peca.getY() == y - i) {
                return true; 
            } else if(peca.getX() == x && peca.getY() == y + i) {
                return true; 
            }
        }
        return false;
    }

    public static boolean Dama(Peca peca, int x, int y) throws BordaException {
        Tabuleiro.isBorda(x, y);
        return Bispo(peca, x, y) && Torre(peca, x, y);
    }

    public static boolean Rei(Peca peca, int x, int y) throws BordaException {
        Tabuleiro.isBorda(x, y);
        if(peca.getX() == x + 1 || peca.getY() == y + 1 || peca.getX() == x - 1 || peca.getY() == y - 1)
            return true;
        return false;
    }
}
