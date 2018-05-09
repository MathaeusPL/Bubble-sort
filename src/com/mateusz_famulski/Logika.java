package com.mateusz_famulski;

import java.util.Random;
import java.util.Scanner;

class Logika {

     private Random rand = new Random();
     private Scanner scan = new Scanner(System.in);
     private int x;

      int[] tab (int tabSize, int randomRange){
        int tab1[] = new int[tabSize];
        for (int i = 0; i <tabSize ; i++){
            tab1[i] = rand.nextInt(randomRange);
        }
        return tab1;
     }

      void tabShow (int [] tabx) {
         for (int i: tabx){
             System.out.print(i+" ,");
         }
     }

     void bubbleSort (int[] tabA){
         boolean repeat = true;
         int storage;
         while (repeat){
             repeat=false;
             for (int i = 0; i<tabA.length-1; i++){
                 if (tabA[i]>tabA[i+1]){
                     storage=tabA[i];
                     tabA[i]=tabA[i+1];
                     tabA[i+1]=storage;
                     repeat=true;
                 }
             }
         }
     }
      int number (String txt) {
          System.out.println(txt);
          boolean isOk=true;
          do {
              try {
                  x = scan.nextInt();
                  if (x<2){
                      System.out.println("Wprowadzono niedozwoloną cyfrę!");
                      continue;
                  }
                  isOk=false;
          }  catch (Exception exception){
                  System.out.println("Wprowadzono nieprawidłową wartość!");
                  isOk=true;
                  scan.nextLine();
              }
          } while (isOk);
          return x;
     }

      boolean quit(){
         System.out.println("\n\nCo teraz chcesz zrobić?\n5 - zaczynamy od nowa !\n10 - kończymy !");
         int x;
          do {
              x=number("");
              if (x==5){
                  return true;
              } else if (x==10){
                  return false;
              }
              System.out.println("Wprowadzono nieprawidłową wartość !");
          }
         while (2>1);


     }
}
