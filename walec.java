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
	
		
		//przes³oniêta metoda wyliczaj¹ca glówny moment bezw³adnoœci walca
	public double glowny_moment(){
       
		glowny_moment_bezwladnosci = 0.5*(super.getMasa())*Math.pow(promien, 2);
       return glowny_moment_bezwladnosci;
	}

	//przes³oniêta metoda wyliczaj¹ca moment bezw³adnoœci z tw.Steinera dla walca
	
	public double steiner(int odleglosc){
		
		double steiner = glowny_moment_bezwladnosci + super.getMasa()*Math.pow(odleglosc, 2);
		return steiner;
	}
	
	
	 public void opis(){ //opis obiektu
         
         System.out.println("Obiekt klasy walec");
         
     }
	
	 	 public String toString(){ // metoda s³u¿¹ca wyœwietleniu informacji o danym obiekcie(opis, dane, wartoœæ g³ównego momentu bezw³adnoœci)
   		
   		return "Nazwa: " + getClass().getName()+ ", masa: " + super.getMasa() + ", Promieñ walca:  " + promien + ", G³ówny moment bezwladnoœci walca jest równy: " + glowny_moment();
   	
   	}
	 
}
