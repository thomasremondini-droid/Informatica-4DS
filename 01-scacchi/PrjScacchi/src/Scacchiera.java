/**
 * Matrice 8x8 di Elemento. Non sa nulla dei tipi concreti di pedina:
 * per stampare chiama solo disegna() (polimorfismo).
 */
public class Scacchiera {
    public static final int SIZE = 8; //Static = comune a tutte le istanze (condiviso) Final = non può essere cambiato
    private static final String VUOTA = "_";

    private final Pedina[][] griglia = new Pedina[SIZE][SIZE]; //Final = grandezza fissa non cambia

    // La posizione la decide l'elemento stesso (getRiga/getColonna)
    public void posiziona(Pedina e) {
        griglia[e.getRiga()][e.getColonna()] = e;
    }

    // sposta pedina e cancella dove era se mossa valida. Vado a darla direttamente
    public boolean muovi(Pedina p, int r, int c) {
        if (!p.puoMuoversi(r, c)) {
            return false;
        }
        griglia[p.getRiga()][p.getColonna()] = null;   // svuota la vecchia cella
        p.setPosizione(r, c);
        griglia[r][c] = p;                             // occupa la nuova
        return true;
    }

    public void stampa() {
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                Pedina e = griglia[r][c];
                System.out.print((e == null ? VUOTA : e.disegna()) + " ");
            }
            System.out.println(); //Andiamo a capo dopo aver finito le colonne (nuova riga)
        }
    }
}
