package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        double zmienna;

        InstrumentMuzyczny gitaraZosi = new Gitara("rozowa", "trrrGitaraGra", 1000);
        InstrumentMuzyczny zlotaTrabka = new Trabka("zlotaTrabka", "trutututu", 1000000, 24);

        InstrumentMuzyczny nowySuperIns = new SuperInstrumentNowy("nazwanowegoSuper", "przepiękny dziwk", 11);

        List<InstrumentMuzyczny> listaInstrumentow = new ArrayList<>();

        listaInstrumentow.add(gitaraZosi);
        listaInstrumentow.add(zlotaTrabka);
        listaInstrumentow.add(nowySuperIns);

        zmienCeny(listaInstrumentow);

        wypiszDzwieki(listaInstrumentow);

        System.out.print("\n\n");
        wypiszToString(listaInstrumentow);

        zmienna = gitaraZosi.PI;
        System.out.println("zmienna = " + zmienna);

    }

    private static void wypiszToString(List<InstrumentMuzyczny> listaInstrumentow) {
        for (int i = 0; i < listaInstrumentow.size(); i++) {
            System.out.println(" instrunt nr " + (i + 1));
            System.out.println(listaInstrumentow.get(i).toString());
        }
    }

    private static void zmienCeny(List<InstrumentMuzyczny> listaInstrumentow) {
        for (int i = 0; i < listaInstrumentow.size(); i++) {
            if (listaInstrumentow.get(i) instanceof Gitara)  // jeśli obiekt jest gitarą to do ceny dodaj 20%
            {
                listaInstrumentow.get(i).setCena((int) (listaInstrumentow.get(i).getCena() * 1.2));
            }
        }
    }

    private static void wypiszDzwieki(List<InstrumentMuzyczny> listaInstrumentow) {
        System.out.printf("W metodzie wypisz dzwieki\n");
        for (int i = 0; i < listaInstrumentow.size(); i++) {
            System.out.println(listaInstrumentow.get(i).getDzwiek());
        }
        System.out.printf("Koniec wypsz dzwiek");
    }
}
