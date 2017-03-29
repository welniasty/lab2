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
	
	//przes�oni�ta metoda wyliczaj�ca gl�wny moment bezw�adno�ci preta wzgl�dem osi przechodz�cej przez jego �rodek

	public double glowny_moment(){
		
		glowny_moment_bezwladnosci = (1.0/12.0)*super.getMasa()*Math.pow(dlugosc, 2);
		return glowny_moment_bezwladnosci;
	}
	 
	//przes�oni�ta metoda wyliczaj�ca moment bezw�adno�ci z tw.Steinera dla preta 
	
public double steiner(int odleglosc){
		
		double steiner = glowny_moment_bezwladnosci + super.getMasa()*Math.pow(odleglosc, 2);
		return steiner;
	}
	
	 public void opis(){ //opis obiektu
         
         System.out.println("Obiekt klasy pret");
         
     }
	 
	 public String toString(){ // metoda s�u��ca wy�wietleniu informacji o danym obiekcie(opis, dane, warto�� g��wnego momentu bezw�adno�ci)
   		
   		return "Nazwa: " + getClass().getName()+ ", masa: " + super.getMasa() + ", D�ugo�� pr�ta: " + dlugosc + ", G��wny moment bezwladno�ci preta wzgl�dem osi przechodz�cej przez jego �rodek wynosi: " + glowny_moment();
   	
   	}
	 
}
