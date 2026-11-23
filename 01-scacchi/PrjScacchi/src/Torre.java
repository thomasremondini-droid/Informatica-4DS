public class Torre extends Pedina {

    public Torre(int riga, int colonna) {
        super(riga, colonna, "♖");
    }

    @Override
    public String getInfo() {
        return "Torre in (" + riga + ", " + colonna + ")";
    }

    // Solo in orizzontale o in verticale
    @Override
    protected boolean mossaValida(int dr, int dc) {
        return dr == 0 || dc == 0;
    }
}
