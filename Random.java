/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random;

/**
 *
 * @author lkrupa
 */
public class Random {

    public int Combat(int playerHP, int beastHP){
        //Random rand = new Random();
            while(beastHP>0 || playerHP>0){
                
                //atakuje gracz
                beastHP -= (int) (Math.random() * 5)+1;
                System.out.println("bestia ma:"+beastHP);
                if(beastHP <= 0){
                    System.out.println("Bestia zginela");
                    break;
                }
                
                //atakuje potwor
                playerHP -= (int) (Math.random() * 5)+1;
                System.out.println("gracz ma:"+playerHP+"\n");
                if(playerHP <= 0){
                    System.out.println("Zginales.. Naucz sie walczyc");
                    break;
                }
            }
            return playerHP;
    }
    
    public static void main(String[] args) {
        Random test= new Random();
        int player= test.Combat(50, 30);
        System.out.println("Twoje zycie jest rowne= "+player);
    }
    
}
