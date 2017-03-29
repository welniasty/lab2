package labolatorium_1_;

	public class punkt_materialny {  //klasa, z której bêdzimey powo³ywaæ obiekty
	  private int masa; // pole okreœlaj¹ce masê naszego punktu materialnego
	  
      public int getMasa(){ // akcesor (getter)
      
    	  return masa;
      }
      
      public void setMasa(int m){ //mutator (setter)
    	  
    	  masa=m;	  
      }

      
      public punkt_materialny(){ // konstruktor domyslny - przypisuje wartoœæ masy równ¹ 0

      }

      public punkt_materialny(int podana_masa){ // konstruktor z parametrem 

      masa=podana_masa;
      }
         
      public double glowny_moment(){ //metoda dotyczaca glownego momentu bezwladnosci - moment ten jest domyœlnie równy 0
          
          double glowny_moment_bezwladnosci=0;
        //  System.out.println("Glowny moment bezwladnosci jest rowny " + glowny_moment_bezwladnosci);
          return glowny_moment_bezwladnosci;
      }
      
      public double steiner(int dlugosc){ //metoda liczaca moment bezwladnosci z tw.Steinera 
          
          double steiner= masa*dlugosc*dlugosc;
          return steiner;
      }
          
      public void opis(){ //opis obiektu
          
          System.out.println("Punkt materialny");
          
      }
      
      	public String toString(int dlugosc){ // metoda s³u¿¹ca wyœwietleniu informacji o danym obiekcie(opis, dane, wartoœæ g³ównego momentu bezw³adnoœci)
      		
      		return "Nazwa: " + getClass().getName()+ ", masa: " + masa + ", G³ówny moment bezwladnosci jest równy " +glowny_moment() + ", Moment bezwladnosci z tw. Steinera: " + steiner(dlugosc);
      	
      	}
	}

