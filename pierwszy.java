package labolatorium_1_;

import java.util.Scanner;

public class pierwszy {

	public static void main(String[] args){

		//stworzenie obiektow danych klas pochodnych
		walec waleczek = new walec(1,1);
		kula kulka = new kula(2,4);
		pret precik = new pret (4,8);
		
		
		while(true){
		
		// wy�wietlenie menu
		System.out.println("----MENU----");
		System.out.println("Wybierz bry��, dla kt�rej chcesz obliczy� moment bezw�adno�ci : ");
		System.out.println("1. WALEC");
		System.out.println("2.KULA");
		System.out.println("3.PR�T");
		System.out.println("4.EXIT");
		
		Scanner odczyt = new Scanner(System.in); //utworzenie obiektu klasy scanner
		int wybor; // utworzenie zmiennej s�u��cej w instrukcji switch
		wybor = odczyt.nextInt(); //wczytanie warto�ci z klawiatury do tej zmiennej
		
		//instrukcja switch, przelaczanie za pomoca zmiennej wybor
		
		switch(wybor){ 
		
		case 1: {
			System.out.println("Podaj warto�� masy walca : ");
			waleczek.setMasa(odczyt.nextInt()); // ustawienie masy 
			System.out.println("Podaj warto�� promienia walca : ");
			waleczek.setPromien(odczyt.nextInt()); // ustawienie promienia
			
			System.out.println(waleczek + "\n"); //wyswietlenie informacji o obiekcie

			System.out.println("Podaj warto�� odleg�o�ci do nowej r�wnoleg�ej osi : ");
			
			int odleglosc = odczyt.nextInt(); //ustawienie odleglosci od rownoleglej osi
			
			System.out.println("Moment bezw�adno�ci z tw.Steinera wynosi : " + waleczek.steiner(odleglosc)); //wyswietlenie momentu z tw.Steinera
			break; // wyjscie z warunkow
	
		}
		
		case 2: {
			System.out.println("Podaj warto�� masy kuli : ");
			kulka.setMasa(odczyt.nextInt()); // ustawienie masy 
			System.out.println("Podaj warto�� promienia kuli : "); // ustawienie promienia
			kulka.setPromien(odczyt.nextInt());
			
			System.out.println(kulka + "\n");

			System.out.println("Podaj warto�� odleg�o�ci do nowej r�wnoleg�ej osi : "); //ustawienie odleglosci od rownoleglej osi
			
			int odleglosc = odczyt.nextInt();
			
			System.out.println("Moment bezw�adno�ci z tw.Steinera wynosi : " + kulka.steiner(odleglosc)); //wyswietlenie momentu z tw.Steinera
			break; // wyjscie z warunkow
		}
		
		case 3: {
			System.out.println("Podaj warto�� masy pr�ta : "); // ustawienie masy
			precik.setMasa(odczyt.nextInt());
			System.out.println("Podaj warto�� d�ugo�ci pr�ta : ");  // ustawienie d�ugo�ci pr�ta
			precik.setDlugosc(odczyt.nextInt());
			
			System.out.println(precik + "\n");

			System.out.println("Podaj warto�� odleg�o�ci do nowej r�wnoleg�ej osi : "); //ustawienie odleglosci od rownoleglej osi
			
			int odleglosc = odczyt.nextInt();
			
			System.out.println("Moment bezw�adno�ci z tw.Steinera wynosi : " + precik.steiner(odleglosc)); //wyswietlenie momentu z tw.Steinera
			break; // wyjscie z warunkow
			
		}
		
		case 4: {
			
			System.out.println("Czy na pewno chcesz wyj�� ? t/n"); // decyzja o wyj�ciu
			char decyzja = odczyt.next().charAt(0); // wczytanie znaku
			
			switch (decyzja){
			
			case 't': //je�li 't' to wychodzimy z programu
				System.exit(0);
			
			case 'n': // je�li 'n' to mamy mo�liwo�� dalszego wybierania opcji
				break;
		}
		
		}
		
		default:
			System.out.println("Nie ma takiej operacji"); // nieznana operacja
		
		}
		
	}
	}
	}

		