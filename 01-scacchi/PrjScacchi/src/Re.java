public class Re extends Pedina {

    public Re(int riga, int colonna) {
        super(riga, colonna, "♔");
    }

    @Override
    public String getInfo() {
        return "Re in (" + riga + ", " + colonna + ")";
    }

    // Una sola casella in qualsiasi direzione
    @Override
    protected boolean mossaValida(int dr, int dc) {
        return Math.abs(dr) <= 1 && Math.abs(dc) <= 1;
    }
}
