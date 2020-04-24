package com.company;

public class SuperInstrumentNowy implements InstrumentMuzyczny {

    private String nazwa;
    private int cena;
    private String dzwiek;


    public SuperInstrumentNowy(String nazwa, String dzwiek, int cena) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.dzwiek = dzwiek;
    }


    @Override
    public String getNazwa() {
        return nazwa;
    }

    @Override
    public String getDzwiek() {
        return dzwiek;
    }

    @Override
    public int getCena() {
        return cena;
    }

    @Override
    public void setCena(int price) {
        cena = price;
    }

    @Override
    public String toString() {
        return "SuperInstrumentNowy{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", dzwiek='" + dzwiek + '\'' +
                '}';
    }
}
