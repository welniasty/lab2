package labolatorium_1_;

	public class punkt_materialny {  //klasa, z kt�rej b�dzimey powo�ywa� obiekty
	  private int masa; // pole okre�laj�ce mas� naszego punktu materialnego
	  
      public int getMasa(){ // akcesor (getter)
      
    	  return masa;
      }
      
      public void setMasa(int m){ //mutator (setter)
    	  
    	  masa=m;	  
      }

      
      public punkt_materialny(){ // konstruktor domyslny - przypisuje warto�� masy r�wn� 0

      }

      public punkt_materialny(int podana_masa){ // konstruktor z parametrem 

      masa=podana_masa;
      }
         
      public double glowny_moment(){ //metoda dotyczaca glownego momentu bezwladnosci - moment ten jest domy�lnie r�wny 0
          
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
      
      	public String toString(int dlugosc){ // metoda s�u��ca wy�wietleniu informacji o danym obiekcie(opis, dane, warto�� g��wnego momentu bezw�adno�ci)
      		
      		return "Nazwa: " + getClass().getName()+ ", masa: " + masa + ", G��wny moment bezwladnosci jest r�wny " +glowny_moment() + ", Moment bezwladnosci z tw. Steinera: " + steiner(dlugosc);
      	
      	}
	}

