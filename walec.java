package labolatorium_1_;

public class walec extends punkt_materialny { //klasa walec dziedziczy z klasy punkt_materialny
	
	private int promien;
	double glowny_moment_bezwladnosci;
	
	public walec(){ //konstruktor domyslny
		super.setMasa(1);
		this.promien=2;
	}
	
	public walec(int masa, int promien){ //konstruktor z parametrami
		super(masa); //odwolanie do dziedziczonego parametru
		this.promien=promien;
	}
	//gettery i settery do atrybutw klasy walec
	public int getPromien(){
		return promien;
	}
	
	public void setPromien(int promien){
		
		this.promien=promien;
	}
	
		
		//przes�oni�ta metoda wyliczaj�ca gl�wny moment bezw�adno�ci walca
	public double glowny_moment(){
       
		glowny_moment_bezwladnosci = 0.5*(super.getMasa())*Math.pow(promien, 2);
       return glowny_moment_bezwladnosci;
	}

	//przes�oni�ta metoda wyliczaj�ca moment bezw�adno�ci z tw.Steinera dla walca
	
	public double steiner(int odleglosc){
		
		double steiner = glowny_moment_bezwladnosci + super.getMasa()*Math.pow(odleglosc, 2);
		return steiner;
	}
	
	
	 public void opis(){ //opis obiektu
         
         System.out.println("Obiekt klasy walec");
         
     }
	
	 	 public String toString(){ // metoda s�u��ca wy�wietleniu informacji o danym obiekcie(opis, dane, warto�� g��wnego momentu bezw�adno�ci)
   		
   		return "Nazwa: " + getClass().getName()+ ", masa: " + super.getMasa() + ", Promie� walca:  " + promien + ", G��wny moment bezwladno�ci walca jest r�wny: " + glowny_moment();
   	
   	}
	 
}
