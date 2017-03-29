package labolatorium_1_;


public class pierwszy_podstawowe_zadanie {

	public static void main(String[] args){

		//stworzenie obiektow danych klas pochodnych
		walec waleczek = new walec(1,1);
		kula kulka = new kula(2,4);
		pret precik = new pret (4,8);
		punkt_materialny punkt = new punkt_materialny(2);
		System.out.println(punkt.toString(5));
		System.out.println(waleczek);
		System.out.println(kulka);
		System.out.println(precik);

		System.out.println("\n");
		//stworzenie tablicy, która umo¿liwia przechowywanie obiektow typu walec
		
		walec [] tab_wal = new walec[5];
		
		for(int i=0; i<tab_wal.length; i++){ //petla sluzaca do przypisania odpowiednim miejscom tablicy nowo stworzne obiekty typu walec i wyswietlenia informacji o nich
			
		tab_wal[i] = new walec(i,i);
		System.out.println(i + " " + tab_wal[i]);
			
		}
		System.out.println("\n");
		//stworzenie tablicy, która umo¿liwia przechowywanie obiektow typu kula

		
		kula [] tab_kul = new kula[5];
		
		for(int i=0; i<tab_kul.length; i++){//petla sluzaca do przypisania odpowiednim miejscom tablicy nowo stworzne obiekty typu kula i wyswietlenia infrmacji o nich
			
		tab_kul[i] = new kula(i,i);
		System.out.println(i + " " + tab_kul[i]);
			
		}
	System.out.println("\n");

		//stworzenie tablicy, która umo¿liwia przechowywanie obiektow typu pret
pret [] tab_pre = new pret[5];
		
				



for(int i=0; i<tab_pre.length; i++){//petla sluzaca do przypisania odpowiednim miejscom tablicy nowo stworzne obiekty typu pret i wyswietlania informacji o nich
			
		tab_pre[i] = new pret(i,i);
		System.out.println(i + " " + tab_pre[i]);
			
		}
		System.out.println("\n");
				
	for(int i=0; i<tab_wal.length; i++){ //petla sluzaca do wyœwietlania wartoœci momentów bezw³adnoœci walca wzglêdem osi oddalonej o t¹ sam¹ odleg³oœæ dla wszystkich obiektów tej tablicy
					
		System.out.println("Moment bezw³adnoœci z tw.Steinera dla walca " + i + " wynosi: " + tab_wal[i].steiner(5));
					
		}
		System.out.println("\n");
				
				
		for(int i=0; i<tab_kul.length; i++){ //petla sluzaca do wyœwietlania wartoœci momentów bezw³adnoœci kuli wzglêdem osi oddalonej o t¹ sam¹ odleg³oœæ dla wszystkich obiektów tej tablicy
					
		System.out.println("Moment bezw³adnoœci z tw.Steinera dla kuli "  + i + " wynosi: "+ tab_kul[i].steiner(10));
					
			}
		System.out.println("\n");
				
				
		for(int i=0; i<tab_pre.length; i++){ //petla sluzaca do wyœwietlania wartoœci momentów bezw³adnoœci preta wzglêdem osi oddalonej o t¹ sam¹ odleg³oœæ dla wszystkich obiektów tej tablicy
				
		System.out.println("Moment bezw³adnoœci z tw.Steinera dla prêta " + i + " wynosi: " + tab_pre[i].steiner(7));
			
		}
				
				
				
}
}


