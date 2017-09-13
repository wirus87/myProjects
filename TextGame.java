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
                    }
                    break;
                
                case "4":
                    System.out.println("\n4) Przypadkowo natrafiles na miecz jednego z goblinow, ale uslyszales dziwny szelest. Co robisz?");
                    System.out.println("1| Podnosze miecz.\n2| Chowam sie za pobliskim murkiem i czekam.\n3| Pytam sie kto to.\n");
                    switch(sc.next()){
                        case "1":
                            System.out.println("\nPodnoszac miecz poczules przyplyw mocy.");
                            playerHP= playerHP+ 10;
                            System.out.println("Otrzymales dodatkowo 10pktow zdrowia. Teraz masz: "+ playerHP +"pktow zycia");
                            System.out.println("Przy okazji zobaczyles ze to byl tylko maly przestraszony krolik, ktory sobie pokical dalej.");
                            question= "5";
                            break;
                        case "2":
                            System.out.println("To tylko maly kroliczek... ktory rzucil Ci sie do gardla bo myslal ze sie na Niego czaisz... ;)");
                            System.out.println("Tracisz 10pktow zycia");
                            playerHP= playerHP- 10;
                            question= "5";
                            break;
                        case "3":
                            System.out.println("\nZ krzakow wychodzi maly kroliczek, ktory z przerazona minka ucieka od Ciebie.");
                            question= "5";
                            break;
                        default:
                            System.out.println("\nPodaj liczbe 1, 2 lub 3.");
                    }
                    break;
                    
                case "5":
                    System.out.println("\n5) Ludzie podchodza do Ciebie blizej. Jestesmy ocalalymi po najezdzie tych dziwnych stworow. Potrzebujemy meznych wojow do walki z nimi takich jak Ty..");
                    System.out.println("1| Walcze!!\n2| chowasz sie\n");
                    switch(sc.next()){
                        case "1":
                            System.out.println("\nRzucasz mieczem w glowe goblina zombie.");
                            monsterHP = rand.nextInt(10) + 1;
                            injuries= monsterHP + rand.nextInt(35)+1; //dodatkowy modyfikator obrazen;
                            if (injuries > playerHP){
                                System.out.println("\nNiestety minales jego glowe! przegrales..");
                                state= false;
                            } else {
                                System.out.println("\nMiecz trafil do celu. Zabiles przywodce.. zabijajac go reszta pieszchla. Wygrales");
                                state= false;
                            }
                            break;
                        case "2":
                            System.out.println("\nCala horda goblinow zombie wparowuje i zabija wszystkich po kolei w koncu trafiajac na Ciebie");
                            monsterHP = rand.nextInt(10) + 1; 
                            injuries= monsterHP + rand.nextInt(35)+1; //dodatkowy modyfikator obrazen;
                            if (injuries > playerHP){
                                System.out.println("\nNiestety podczas walki umarles..\nNastepnym razem wiecej odwagi!");
                                state= false;
                            } else {
                                System.out.println("\nJakims cudem pokonales gobliny! Dziekujemy za dzielna walke");
                                state= false;
                            }
                            break;
                        default:
                            System.out.println("\nPodaj liczbe 1, 2 lub 3.");
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