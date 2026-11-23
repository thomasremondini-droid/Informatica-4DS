public class Regina extends Pedina {

    public Regina(int riga, int colonna) {
        super(riga, colonna, "♕");
    }

    @Override
    public String getInfo() {
        return "Regina in (" + riga + ", " + colonna + ")";
    }

    // Torre + Alfiere
    @Override
    protected boolean mossaValida(int dr, int dc) {
        return dr == 0 || dc == 0 || Math.abs(dr) == Math.abs(dc);
    }
}
