/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textgame;

import java.util.Random;
import java.util.Scanner;

/**
 * @author lkrupa
 */

public class TextGame {

   
    public static void main(String[] args)  {
        /**
        * @param playerHP Player life
        * @param monsterHP Monster life
        */

        //zmienne odpowiadajace za ilosc zycia zawodnika i przeciwnikow;
        int playerHP= 50, monsterHP= 0, injuries= 0;
        String playerName= "", question= "1", choice= "0";
        boolean state= true;
        
        Random rand= new Random();
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Witaj obiezyswiecie w mojej grze!\n Znalezlismy Cie ledwo przytomnego.");
        
        //glowny program
        while(state){
            switch(question){
                //pytanie 1.
                case "1":
                    System.out.println("1) Powiedz nam jak sie nazywasz?");
                    playerName= sc.next();
                    question= "2";
                    break;
                    
                //pytanie 2. itp
                case "2":
                    System.out.println("\n2) Czy Twoje imie to "+ playerName + "?\n 1| tak..\n 2| nie..\n");
                    switch(sc.next()){
                        case "1":
                            question= "3";
                            break;
                        case "2":
                            question= "1";
                            System.out.println("\n\nResetowanie pamieci w toku...");
                            break;
                        default:
                            System.out.println("\nPodaj liczbe 1 albo 2. Nie inna.");
                            question= "2";
                    }
                    break;
                
                
                case "3":
                    System.out.println("\n3) Witaj "+ playerName+"! Jestes w naszym bunkrze. Na zewnatrz jest pelno stworow.. Co robisz?");
                    System.out.println("1| Ide i walcze!\n2| O co w tym wszystkim chodzi?\n3| zostaje i sie nie ruszam..\n");
                    switch(sc.next()){
                        case "1":
                            System.out.println("\nWylatujesz z pelna para na jednego z goblinow..");
                            monsterHP = rand.nextInt(10) + 1; //(od 1 do 10);
                            injuries= monsterHP - rand.nextInt(3)+1; //od 1 do 5;
                            playerHP= playerHP- injuries;
                            System.out.println("Po heroicznej walce z przywodca goblinow masz teraz "+ playerHP +" zycia");
                            System.out.println("Odniosles "+ injuries +" obrazen");
                            question= "4";
                            break;
                        case "2":
                            question= "5";
                            break;
                        case "3":
                            System.out.println("\nWalczysz z goblinami, ktore wtargnely do bunkra!");
                            monsterHP= rand.nextInt(10)+1; //(od 1 do 10);
                            injuries= monsterHP - rand.nextInt(10)+1;
                            playerHP= playerHP - injuries;
                            System.out.println("\nOtrzymales: "+ injuries +" obrazen. Pozostalo Ci: "+ playerHP +" zycia.");
                            question= "4";
                            break;
                        default:
                            System.out.println("\nPodaj liczbe 1, 2 lub 3.");
                            question= "3";
                    }
                    break;
                
                default:
                    System.out.println("\nNie ma takiego pytania");
                    System.out.println("Czy chcesz zakonczyc?\n 1|tak\n 2|nie");
                    switch(sc.next()){
                        case "1":
                            state= false;
                            break;
                        default:
                            System.out.println("\nWracasz na poczatek.");
                            state= true;
                            question= "1";
                    }
            }
        }
        
        //czyszczenie zasobow i wyjscie z programu
        System.gc();
        System.exit(0);
        
    }
    
}