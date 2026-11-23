public class Alfiere extends Pedina {

    public Alfiere(int riga, int colonna) {
        super(riga, colonna, "♗");
    }

    @Override
    public String getInfo() {
        return "Alfiere in (" + riga + ", " + colonna + ")";
    }

    // Solo in diagonale: stesso spostamento in righe e colonne
    @Override
    protected boolean mossaValida(int dr, int dc) {
        return Math.abs(dr) == Math.abs(dc);
    }
}