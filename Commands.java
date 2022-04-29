package Filmtar.Filmtar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class Commands extends Videoanyagok{
	/** A metódus bekéri a hozzáadni kívánt film adatait, 
	 * majd hozzáadja a listához */
	static public void addFilm() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Adja meg a film címét:");
		String title = sc.nextLine();
		
		System.out.print("Adja meg a film mûfaját:");
		String genre = sc.nextLine();
		
		System.out.print("Adjon meg leírást a filmhez:");
		String descr =sc.nextLine(); 
		
		System.out.print("Adja meg a film megjelenésének évét:");
		int year = sc.nextInt();
		
		System.out.print("Adja meg a film hosszát (percekben):");
		int length = sc.nextInt();
		
		System.out.print("Adja meg a film korhatárát:");
		int age = sc.nextInt();
			
		
		lista.add(new Film(title,genre,year,length,age,descr));
	
	}
	/** A metódus bekéri a hozzáadni kívánt sorozat adatait, 
	 * majd hozzáadja a listához */
	protected static void addSorozat() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Adja meg a sorozat címét:");
		String title = sc.nextLine();
		
		System.out.print("Adja meg a sorozat mûfaját:");
		String genre = sc.nextLine();
		
		System.out.print("Adja meg a sorozat megjelenésének évét:");
		int year = sc.nextInt();
		
		System.out.println("Adja meg a részek számát:");
		int eps = sc.nextInt();
		
		lista.add(new Sorozat(title,genre,year,eps));
		
	
	}
	/** Ez a metódus teszi lehetõvé, hogy a felhasználó eldöntse, 
	 * hogy filmet vagy sorozatot szeretne-e hozzáadni.*/
	protected static void addChoice() {
		Scanner sc = new Scanner(System.in);
		
		String cmd = sc.nextLine();
		if (cmd.equals("1")) {
			addFilm();
		}
		else if (cmd.equals("2")) {
			addSorozat();
		}
		else if (cmd.equals("3")) {
			System.out.println("Visszaírányítjuk a fõmenübe ");
		}else {
			//Ide még írunk majd hibakezelõ osztályt de addig is
			System.err.println("Hibás bemenet , vissza a fõmenübe");
		}
		
	}
	
	/**Ez a metódus végzi a cím szerinti keresést */
	protected static void searchByName() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Adja meg a keresni kívánt címet: ");
		String n = sc.nextLine();
		
		Collections.sort(lista, new NameComparator());
		
		for (int i=0; i<lista.size();i++) {
			if (lista.get(i).getCim().contains(n)) {
				System.out.println(lista.get(i));
			}
		}
		
	}
	
	/** Az év/mûfaj alapján való keresés használatakor ez a metódus teszi lehetõvé,
	 * hogy a felhasználó eldöntse, hogy filmet vagy sorozatot akar keresni. */
	protected static void searchChoice() {
		Scanner sc = new Scanner(System.in);
		
		//SearchMenu();
		String cmd = sc.nextLine();
		
		if (cmd.equals("1")) {
			searchFilm();
		}
		else if (cmd.equals("2")) {
			searchSorozat();
		}
		else if (cmd.equals("3")) {
			System.out.println("Visszaírányítjuk a fõmenübe \n");
		}
		else {
			//Ide még írunk majd hibakezelõ osztályt de addig is
			System.err.println("Hibás bemenet , vissza a fõmenübe \n");
		}
		
	}
	
	/**Az év/mûfaj szerinti keresést végzõ metódus, abban az esetben, ha a felhasználó 
	 * filmet szeretne keresni. */
	protected static void searchFilm() {
		Scanner sc = new Scanner(System.in);
		
		SearchByMenu();
		String cmd = sc.nextLine();
		
		if (cmd.equals("1")) {
			System.out.print("Adja meg a keresni kívánt évszámot: ");
			int e = sc.nextInt();
			
			Collections.sort(lista,new NameComparator());
			
			for (int i=0;i<lista.size();i++) {
				if (lista.get(i).getClass().toString().equals("class Filmtar.Filmtar.Film")) {
					if (lista.get(i).getEv()==e) {
						System.out.println(lista.get(i));
					}
				}
			}
		}
		else if (cmd.equals("2")) {
			System.out.print("Adja meg a keresni kívánt mûfajt: ");
			String m = sc.nextLine();
			
			Collections.sort(lista,new NameComparator());
			
			for (int i=0;i<lista.size();i++) {
				if (lista.get(i).getClass().toString().equals("class Filmtar.Filmtar.Film")) {
					if (lista.get(i).getMufaj().equals(m)) {
						System.out.println(lista.get(i));
					}
				}
			}
		}
		else if (cmd.equals("3")) {
			System.out.println("Visszaírányítjuk a fõmenübe \n");
		}
		else {
			//Ide még írunk majd hibakezelõ osztályt de addig is
			System.err.println("Hibás bemenet , vissza a fõmenübe");
		}
		
	}
	
	/**Az év/mûfaj szerinti keresést végzõ metódus, abban az esetben, ha a felhasználó 
	 * sorozatot szeretne keresni. */
	protected static void searchSorozat() {
		Scanner sc = new Scanner(System.in);
		
		SearchByMenu();
		String cmd = sc.nextLine();
		
		if (cmd.equals("1")) {
			System.out.print("Adja meg a keresni kívánt évszámot: ");
			int e = sc.nextInt();
			
			Collections.sort(lista,new NameComparator());
			
			for (int i=0;i<lista.size();i++) {
				if (lista.get(i).getClass().toString().equals("class Filmtar.Filmtar.Sorozat")) {
					if (lista.get(i).getEv()==e) {
						System.out.println(lista.get(i));
					}
				}
			}
		}
		else if (cmd.equals("2")) {
			System.out.print("Adja meg a keresni kívánt mûfajt: ");
			String m = sc.nextLine();
			
			Collections.sort(lista,new NameComparator());
			
			for (int i=0;i<lista.size();i++) {
				if (lista.get(i).getClass().toString().equals("class Filmtar.Filmtar.Sorozat")) {
					if (lista.get(i).getMufaj().equals(m)) {
						System.out.println(lista.get(i));
					}
				}
			}
		}
		else if (cmd.equals("3")) {
			System.out.println("Visszaírányítjuk a fõmenübe \n");
		}
		else {
			//Ide még írunk majd hibakezelõ osztályt de addig is
			System.err.println("Hibás bemenet , vissza a fõmenübe");
		}

	}
	
	protected static void removeByTitle() throws Exception {
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		
		System.out.print("Adja meg a törölni kívánt mû címét: ");
		String t = sc.nextLine();
		
		for (int i=0;i<lista.size();i++) {
			if (lista.get(i).getCim().contains(t)) {
				System.out.println(lista.get(i));
				cnt++;
			}
		}
		int n;
		if (cnt==0) {
			System.err.println("Hiba, ilyen cím nem található!");
		}
		
		else if(cnt>0) {
			System.out.print("Adja meg a törölni kívánt mû sorszámát: ");
			try {
				 n = sc.nextInt();
			
				
			}catch(Exception e){
				throw new Exception(); //Ez késõbb másmilyen Exception lesz majdcsak most ne hisztizzen neked
			}
			if (n<0 & n>lista.size()) {
				lista.remove(lista.get(n-1));
			}
			
			
		}
		
	}
	
	
}
