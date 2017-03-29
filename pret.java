package labolatorium_1_;

public class pret extends punkt_materialny {//klasa pret dziedziczy z klasy punkt_materialny
	
	private int dlugosc;
	double glowny_moment_bezwladnosci;
	
	public pret(){ //konstruktor domyslny
		
		super.setMasa(1);
		this.dlugosc=4;
	}
	
	public pret (int masa, int dlugosc){//konstruktor z parametrami
		
		super(masa);
		this.dlugosc=dlugosc;
	}

	//getter i setter do atrybutu klasy pret
	public int getDlugosc(){
		return dlugosc;
		
	}
	
	public void setDlugosc(int dlugosc){
		this.dlugosc=dlugosc;
		
	}
	
	//przes³oniêta metoda wyliczaj¹ca glówny moment bezw³adnoœci preta wzglêdem osi przechodz¹cej przez jego œrodek

	public double glowny_moment(){
		
		glowny_moment_bezwladnosci = (1.0/12.0)*super.getMasa()*Math.pow(dlugosc, 2);
		return glowny_moment_bezwladnosci;
	}
	 
	//przes³oniêta metoda wyliczaj¹ca moment bezw³adnoœci z tw.Steinera dla preta 
	
public double steiner(int odleglosc){
		
		double steiner = glowny_moment_bezwladnosci + super.getMasa()*Math.pow(odleglosc, 2);
		return steiner;
	}
	
	 public void opis(){ //opis obiektu
         
         System.out.println("Obiekt klasy pret");
         
     }
	 
	 public String toString(){ // metoda s³u¿¹ca wyœwietleniu informacji o danym obiekcie(opis, dane, wartoœæ g³ównego momentu bezw³adnoœci)
   		
   		return "Nazwa: " + getClass().getName()+ ", masa: " + super.getMasa() + ", D³ugoœæ prêta: " + dlugosc + ", G³ówny moment bezwladnoœci preta wzglêdem osi przechodz¹cej przez jego œrodek wynosi: " + glowny_moment();
   	
   	}
	 
}
