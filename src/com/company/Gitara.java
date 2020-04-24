package com.company;

public class Gitara implements InstrumentMuzyczny {

    private String nazwa;
    private int cena;
    private String dzwiek;

    public Gitara(String nazwa, String dzwiek, int cena) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.dzwiek = dzwiek;
    }


    @Override
    public String toString() {
        return "Gitara{" +
                "nazwa='" + nazwa + '\'' +
                ", dzwiek='" + dzwiek + '\'' +
                ", cena=" + cena +
                " dla gitary " +
                '}';
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
}
