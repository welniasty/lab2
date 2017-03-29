package labolatorium_1_;

public class kula extends punkt_materialny {//klasa kula dziedziczy z klasy punkt_materialny

		private int promien;
		double glowny_moment_bezwladnosci;
						
		public kula(){ //konstruktor domyslny
			super.setMasa(1);
			this.promien=2;
		}
		
		public kula (int masa, int promien){//konstruktor z parametrami
			super(masa);
			this.promien=promien;
			
		}
		 
		//getter i setter do atrybutu klasy kula
		public int getPromien(){
			return promien;
		}
		
		public void setPromien(int promien){
			this.promien=promien;
		}
		

		//przes³oniêta metoda wyliczaj¹ca glówny moment bezw³adnoœci kuli

		public double glowny_moment(){
			
		 glowny_moment_bezwladnosci = (2.0/5.0)*super.getMasa()*Math.pow(promien, 2);
			return glowny_moment_bezwladnosci;
			
		}
		
		//przes³oniêta metoda wyliczaj¹ca moment bezw³adnoœci z tw.Steinera dla kuli
		
		public double steiner(int odleglosc){
			
			double steiner = glowny_moment_bezwladnosci + super.getMasa()*Math.pow(odleglosc, 2);
			return steiner;
		}
		
		 public void opis(){ //opis obiektu
	          
	          System.out.println("Punkt klasy kula");
	          
	      }
		
		 public String toString(){ // metoda s³u¿¹ca wyœwietleniu informacji o danym obiekcie(opis, dane, wartoœæ g³ównego momentu bezw³adnoœci)
	      		
	      		return "Nazwa: " + getClass().getName()+ ", masa: " + super.getMasa() + ", Promieñ kuli:  " + promien + ", G³ówny moment bezwladnoœci kuli jest równy: " + glowny_moment();
	      	
	      	}
		 
}
