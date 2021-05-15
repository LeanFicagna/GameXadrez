package tabuleiro;

public class BordaException extends Exception {

    public BordaException() {
        super("Esta posição não existe");
    }
}
