public class Main {
    private static void testa(Pedina p, int r, int c) {
        System.out.println(p.getInfo() + " -> (" + r + ", " + c + "): "
                + (p.puoMuoversi(r, c) ? "consentito" : "non consentito"));
    }

    private static void sposta(Scacchiera s, Pedina p, int r, int c) {
        System.out.println(p.getInfo() + " -> (" + r + ", " + c + "): "
                + (s.muovi(p, r, c) ? "spostata" : "mossa non valida"));
    }

    public static void main(String[] args) {
        Scacchiera scacchiera = new Scacchiera();

        // Setup standard (1 giocatore)
        Pedina[] pezzi = {
                new Torre(7, 0), new Cavallo(7, 1), new Alfiere(7, 2), new Regina(7, 3),
                new Re(7, 4), new Alfiere(7, 5), new Cavallo(7, 6), new Torre(7, 7)
        };
        Pedone[] pedoni = new Pedone[Scacchiera.SIZE];
        for (int c = 0; c < Scacchiera.SIZE; c++) {
            pedoni[c] = new Pedone(6, c);
        }

        //posiziono pezzi
        for (Pedina p : pezzi) {
            scacchiera.posiziona(p);
        }
        //posiziono pedoni
        for (Pedina p : pedoni) {
            scacchiera.posiziona(p);
        }

        System.out.println("Scacchiera iniziale:");
        scacchiera.stampa();

        // Test dei movimenti (solo controllo, nessuno spostamento)
        System.out.println("\n---------------Test dei movimenti---------------");
        testa(pedoni[4], 5, 4);
        testa(pedoni[4], 4, 4);
        testa(pedoni[4], 3, 4);
        testa(pezzi[0], 3, 0);   // torre
        testa(pezzi[0], 5, 2);
        testa(pezzi[1], 5, 2);   // cavallo
        testa(pezzi[1], 5, 1);
        testa(pezzi[2], 4, 5);   // alfiere
        testa(pezzi[2], 5, 2);
        testa(pezzi[3], 3, 7);   // regina
        testa(pezzi[3], 5, 4);
        testa(pezzi[4], 6, 4);   // re
        testa(pezzi[4], 5, 4);

        // Spostamenti veri e nuova scacchiera
        System.out.println("\n---------------Spostamenti---------------");
        sposta(scacchiera, pedoni[4], 4, 4);
        sposta(scacchiera, pezzi[6], 5, 5);
        sposta(scacchiera, pezzi[5], 4, 2);
        sposta(scacchiera, pezzi[0], 5, 0);   // torre: mossa non valida

        System.out.println("\nScacchiera dopo gli spostamenti:");
        scacchiera.stampa();
    }

}