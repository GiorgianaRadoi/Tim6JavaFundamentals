package ro.sdaacademy.javafundamentals.Week3.OOP;

public class Camara {

    private Stelaj[] stelaje;// definim camara Declarare
    // prin constructor spunem cat de mare e/ modelam camara

    public Camara(int nrStelaje) {
        stelaje = new Stelaj[nrStelaje]; // creem locuri ptr stelaje/ Instantiere

        for (int i = 0; i < nrStelaje; i++) {
            stelaje[i] = new Stelaj(); // creeere stelaj si punere in locul lui / Initializare
        }
    }

    // creem camara prin managerCamara
    public void afisare() {
        System.out.println("Afisare camara");

        for (int i = 0; i < stelaje.length; i++) {
            System.out.println("Stelaj" + i);
            stelaje[i].afisare();
        }
    }

    public boolean isEmpty(){
        boolean empty = true;
        for (Stelaj st:stelaje)
            empty = empty && st.isEmpty();
        return empty;
    }

    public boolean adauga(Borcan borcan) {
        for(Stelaj st : stelaje) {
            // if(!st.isFull())
            if(st.adaugare(borcan))
                return true;
        }
        return false;
    }

    public boolean adauga(Sticla sticla) {
        for(Stelaj st : stelaje) {
            // if(!st.isFull())
            if(st.adaugare(sticla))
                return true;
        }
        return false;
    }
}




