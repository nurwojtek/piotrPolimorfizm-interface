package com.company;

public class Trabka implements InstrumentMuzyczny {
    private int iloscKaratow;
    private String nazwa;
    private int cena;
    private String dzwiek;

    public Trabka(String nazwa, String dzwiek, int cena, int iloscKaratow) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.dzwiek = dzwiek;
        this.iloscKaratow = iloscKaratow;
    }

    public int getIloscKaratow() {
        return iloscKaratow;
    }

    //  public void setIloscKaratow(int iloscKaratow) {
    //       this.iloscKaratow = iloscKaratow;
    //   }


    @Override
    public String toString() {
        return "Trabka " +
                "iloscKaratow=" + iloscKaratow +
                ", nazwa='" + nazwa + "\n    " +
                ", dzwiek='" + dzwiek + "\n    " +
                ", cena trabki =" + cena +
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
