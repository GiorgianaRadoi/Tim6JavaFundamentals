package ro.sdaacademy.javafundamentals.Week3.OOP;

public class Stelaj {

    private Raft[] rafturi = new Raft[]{
            // initializare si instantiere fara constructor cu fixed size 4 rafturi
            new Raft(),
            new Raft(),
            new Raft(),
            new Raft(),
    };



    public void afisare() {
        for (int i = 0; i < rafturi.length; i++) {
            rafturi[i].afisare();
        }

    }
    public boolean isEmpty() {
        boolean empty = true;
        for (Raft raft : rafturi)
            empty = empty && raft.isEmpty();
        return empty;
    }

    public boolean adaugare(ObiectDinCamara obiect) {
        for(Raft raft : rafturi) {
            //if(!raft.isFull())
            if(raft.adauga(obiect))
                return true;
        }
        return false;
    }
}
