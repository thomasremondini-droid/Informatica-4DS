public class Pedina {
    protected int riga;
    protected int colonna;
    protected String simbolo;

    public Pedina(int riga, int colonna, String simbolo) {
        this.riga = riga;
        this.colonna = colonna;
        this.simbolo = simbolo;
    }

    //ridefiniscono metodi interfaccia
    public String disegna() {
        return simbolo;
    }

   //Va ovverridato nelle sottoclassi per la pedina specifica
    public String getInfo() {
        return "Pedina in (" + riga + ", " + colonna + ")";
    }

    public int getRiga() {
        return riga;
    }

    public int getColonna() {
        return colonna;
    }

    //se spostata nuova r e c
    public void setPosizione(int riga, int colonna) {
        this.riga = riga;
        this.colonna = colonna;
    }

    public boolean puoMuoversi(int r, int c) { //controlla se dove la cella di arrivo eista
        if (r < 0 || r >= Scacchiera.SIZE || c < 0 || c >= Scacchiera.SIZE) {
            return false;
        }
        if (r == riga && c == colonna) {
            return false;
        }
        return mossaValida(r - riga, c - colonna);
    }

    // return false se non è una pedina specifica. se lo è fornisce di quanto si sposta la pedina
    protected boolean mossaValida(int dr, int dc) {
        return false;
    }
}