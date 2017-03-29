package labolatorium_1_;

import java.util.Scanner;

public class pierwszy {

	public static void main(String[] args){

		//stworzenie obiektow danych klas pochodnych
		walec waleczek = new walec(1,1);
		kula kulka = new kula(2,4);
		pret precik = new pret (4,8);
		
		
		while(true){
		
		// wyœwietlenie menu
		System.out.println("----MENU----");
		System.out.println("Wybierz bry³ê, dla której chcesz obliczyæ moment bezw³adnoœci : ");
		System.out.println("1. WALEC");
		System.out.println("2.KULA");
		System.out.println("3.PRÊT");
		System.out.println("4.EXIT");
		
		Scanner odczyt = new Scanner(System.in); //utworzenie obiektu klasy scanner
		int wybor; // utworzenie zmiennej s³u¿¹cej w instrukcji switch
		wybor = odczyt.nextInt(); //wczytanie wartoœci z klawiatury do tej zmiennej
		
		//instrukcja switch, przelaczanie za pomoca zmiennej wybor
		
		switch(wybor){ 
		
		case 1: {
			System.out.println("Podaj wartoœæ masy walca : ");
			waleczek.setMasa(odczyt.nextInt()); // ustawienie masy 
			System.out.println("Podaj wartoœæ promienia walca : ");
			waleczek.setPromien(odczyt.nextInt()); // ustawienie promienia
			
			System.out.println(waleczek + "\n"); //wyswietlenie informacji o obiekcie

			System.out.println("Podaj wartoœæ odleg³oœci do nowej równoleg³ej osi : ");
			
			int odleglosc = odczyt.nextInt(); //ustawienie odleglosci od rownoleglej osi
			
			System.out.println("Moment bezw³adnoœci z tw.Steinera wynosi : " + waleczek.steiner(odleglosc)); //wyswietlenie momentu z tw.Steinera
			break; // wyjscie z warunkow
	
		}
		
		case 2: {
			System.out.println("Podaj wartoœæ masy kuli : ");
			kulka.setMasa(odczyt.nextInt()); // ustawienie masy 
			System.out.println("Podaj wartoœæ promienia kuli : "); // ustawienie promienia
			kulka.setPromien(odczyt.nextInt());
			
			System.out.println(kulka + "\n");

			System.out.println("Podaj wartoœæ odleg³oœci do nowej równoleg³ej osi : "); //ustawienie odleglosci od rownoleglej osi
			
			int odleglosc = odczyt.nextInt();
			
			System.out.println("Moment bezw³adnoœci z tw.Steinera wynosi : " + kulka.steiner(odleglosc)); //wyswietlenie momentu z tw.Steinera
			break; // wyjscie z warunkow
		}
		
		case 3: {
			System.out.println("Podaj wartoœæ masy prêta : "); // ustawienie masy
			precik.setMasa(odczyt.nextInt());
			System.out.println("Podaj wartoœæ d³ugoœci prêta : ");  // ustawienie d³ugoœci prêta
			precik.setDlugosc(odczyt.nextInt());
			
			System.out.println(precik + "\n");

			System.out.println("Podaj wartoœæ odleg³oœci do nowej równoleg³ej osi : "); //ustawienie odleglosci od rownoleglej osi
			
			int odleglosc = odczyt.nextInt();
			
			System.out.println("Moment bezw³adnoœci z tw.Steinera wynosi : " + precik.steiner(odleglosc)); //wyswietlenie momentu z tw.Steinera
			break; // wyjscie z warunkow
			
		}
		
		case 4: {
			
			System.out.println("Czy na pewno chcesz wyjœæ ? t/n"); // decyzja o wyjœciu
			char decyzja = odczyt.next().charAt(0); // wczytanie znaku
			
			switch (decyzja){
			
			case 't': //jeœli 't' to wychodzimy z programu
				System.exit(0);
			
			case 'n': // jeœli 'n' to mamy mo¿liwoœæ dalszego wybierania opcji
				break;
		}
		
		}
		
		default:
			System.out.println("Nie ma takiej operacji"); // nieznana operacja
		
		}
		
	}
	}
	}

		