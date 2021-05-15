package pecas;

public class Peca {

    private int x;
    private int y;
    private final Cor cor;
    private final Tipo tipo;

    public Peca(int x, int y, Cor cor, Tipo tipo) {
        this.x = x;
        this.y = y;
        this.cor = cor;
        this.tipo = tipo;
    }

    public void goMover(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Tipo getTipo() {
        return tipo;
    }

    public Cor getCor() {
        return cor;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
}
