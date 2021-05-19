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

    public String toString() {
        if(this.tipo == Tipo.PEAO)
            if(this.cor == Cor.BRANCA)
                return "P";
            else
                return "p";
        if(this.tipo == Tipo.CAVALO)
            if(this.cor == Cor.BRANCA)
                return "C";
            else
                return "c";
        if(this.tipo == Tipo.BISPO)
            if(this.cor == Cor.BRANCA)
                return "B";
            else
                return "b";
        if(this.tipo == Tipo.TORRE)
            if(this.cor == Cor.BRANCA)
                return "T";
            else
                return "t";
        if(this.tipo == Tipo.DAMA)
            if(this.cor == Cor.BRANCA)
                return "D";
            else
                return "d";
        
        if(this.cor == Cor.BRANCA)
            return "R";
        else if(this.cor == Cor.PRETA)
            return "r";

        return null;
    }
}
