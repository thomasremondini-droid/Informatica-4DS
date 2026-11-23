public class Cavallo extends Pedina {

    public Cavallo(int riga, int colonna) {
        super(riga, colonna, "♘");
    }

    @Override
    public String getInfo() {
        return "Cavallo in (" + riga + ", " + colonna + ")";
    }

    // Movimento "a L": (1,2) oppure (2,1) in valore assoluto -> prodotto = 2
    @Override
    protected boolean mossaValida(int dr, int dc) {
        return Math.abs(dr) * Math.abs(dc) == 2; //Math.abs per valore assoluto
    }
}