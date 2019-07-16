/*
 * Ten program nalezy do Lukasza Krupy;
 * Mozna kopiowac kod zrodlowy ale nie odpowiadam za jego stan;
 * Jesli macie propozycje co do zmian albo propozycje pracy to prosze pisac :);
 * lukasz.krupa87@gmail.com;
 */
package textgame;

/**
 *
 * @author mozig
 */
public class Player {
    //klasa odpowiedzialna za Bohatera, ktorym bedziemy kierowac - modyfikator ataku, punkty zycia itp;
    
    //polaczenie kilku plikow (kilku klas) w jednym projekcie- dobrego zle poczatki ;);
    private String nazwa;
    private int modAtaku =0;
    private int silaAtaku =0;
    private int HP= 0;
    
    public Player() {
        this.nazwa= "nieznany Zenon";
        this.HP = 60;
        this.modAtaku = 1;
        this.silaAtaku = 10;
    }
    
    public Player(String imie, int HP, int modAtaku, int silaAtaku) {
        this.nazwa = imie;
        this.HP = HP;
        this.modAtaku = modAtaku;
        this.silaAtaku = silaAtaku;
    }
    
    public int AtakBohatera(int hpPotwora){
        hpPotwora -= (int) (Math.random()* this.getSilaAtaku() + this.getModAtaku());
        if (hpPotwora <= 0){
            System.out.println("Bestia zginela");
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * @return the nazwa
     */
    public String getNazwa() {
        return nazwa;
    }

    /**
     * @param nazwa the nazwa to set
     */
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    /**
     * @return the modAtaku
     */
    public int getModAtaku() {
        return modAtaku;
    }

    /**
     * @param modAtaku the modAtaku to set
     */
    public void setModAtaku(int modAtaku) {
        this.modAtaku = modAtaku;
    }

    /**
     * @return the silaAtaku
     */
    public int getSilaAtaku() {
        return silaAtaku;
    }

    /**
     * @param silaAtaku the silaAtaku to set
     */
    public void setSilaAtaku(int silaAtaku) {
        this.silaAtaku = silaAtaku;
    }

    /**
     * @return the HP
     */
    public int getHP() {
        return HP;
    }

    /**
     * @param HP the HP to set
     */
    public void setHP(int HP) {
        this.HP = HP;
    }
}
