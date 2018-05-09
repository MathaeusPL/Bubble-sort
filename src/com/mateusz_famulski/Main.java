package com.mateusz_famulski;

/**
 * Program sortuje pseudolosowe liczby.
 * Zakres liczb podaje użytkowni.
 * Projekt zawiera się w dwóch klasach Main oraz Logika.
 * Program testowany na poprawnych danych wejściowych nie ujawnił błędów.Zastosowano obsługę wyjątków w przypadku
 * wprowadzenia przez użytkownika błędnego rodzaju danych w tym zbyt małego zakresu losowanych liczb oraz zbyt małej ich ilości do sortowania.
 * Przetestowano program przy błędnych danych - program dobrze obsługuje błędy.
 * Program pisany w IntelliJ IDEA na Windows 10. Wersja javy "1.8.0_144".
 *
 *  @author Mateusz Famulski
 *  @version 0.1
 */

public class Main {

    public static void main(String[] args) {

        Logika sort = new Logika();

        do {
            int [] tab = sort.tab(sort.number("Ilu elementową tworzymy tablicę? : "),
                    sort.number("Generujemy liczby pseudolosowe od 0 do:  ")+1);
            System.out.println("Wylosowane elementy tablicy: ");
            sort.tabShow(tab);
            sort.bubbleSort(tab);
            System.out.println("\n\nEfekt sortowania: ");
            sort.tabShow(tab);

        } while (sort.quit());

    }
    }
