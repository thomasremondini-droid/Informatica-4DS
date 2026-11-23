public class Pedone extends Pedina {

    public Pedone(int riga, int colonna) {
        super(riga, colonna, "♙");
    }

    @Override
    public String getInfo() {
        return "Pedone in (" + riga + ", " + colonna + ")";
    }

    // Il giocatore è in basso quindi per andare in alto va verso righe più piccole
    // Dalla riga di partenza (6) può fare anche due passi
    @Override
    protected boolean mossaValida(int dr, int dc) {
        return dc == 0 && (dr == -1 || (riga == 6 && dr == -2));
    }
}