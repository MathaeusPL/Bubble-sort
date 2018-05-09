package com.mateusz_famulski;

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
