package ro.sdaacademy.javafundamentals.Week3.OOP;

public class ObiectDinCamara {
    protected String continut;

    public String getContinut() { return continut;}

    public void setContinut(String continut) { this.continut = continut; }

   public void afisare(){ System.out.println("Obiecte din camara +" +continut); }
    }
