/*
 * Ten program nalezy do Lukasza Krupy.
 * Mozna kopiowac kod zrodlowy ale nie odpowiadam za jego stan.
 * Jesli macie propozycje co do zmian albo propozycje pracy to prosze pisac :)
 * lukasz.krupa87@gmail.com
 */
package textgame;

/**
 *
 * @author mozig
 */
public class Uzbrojenie {
    private String nazwaBroni; //w zaleznosci jaka bron bedzie trzymac to taki mod ataku bedzie mial.
    private int modAtaku;   //modyfikator ataku- jak duzo wiecej obrazen bedzie zadawac;
    private int silaAtaku;  //sila ataku- maxymalne obrazenia jakie moze zadac;

	public Uzbrojenie() {
    	this.nazwaBroni= "cosik";
    	this.modAtaku= 1;
    	this.silaAtaku= 2;
    }
    
    public Uzbrojenie(String nazwaBroni,int modAtaku, int silaAtaku) {
        this.nazwaBroni = nazwaBroni;
        this.modAtaku = modAtaku;
        this.silaAtaku = silaAtaku;
    }

    public String getNazwaBroni() {
        return nazwaBroni;
    }

    public void setNazwaBroni(String nazwaBroni) {
        this.nazwaBroni = nazwaBroni;
    }

    public int getModAtaku() {
        return modAtaku;
    }

    public void setModAtaku(int modAtaku) {
        this.modAtaku = modAtaku;
    }
    
    public int getSilaAtaku() {
		return silaAtaku;
	}

	public void setSilaAtaku(int silaAtaku) {
		this.silaAtaku = silaAtaku;
	}
    
    
}
