package Filmtar.Filmtar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class Commands extends Videoanyagok{
	/** A met�dus bek�ri a hozz�adni k�v�nt film adatait, 
	 * majd hozz�adja a list�hoz */
	static public void addFilm() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Adja meg a film c�m�t:");
		String title = sc.nextLine();
		
		System.out.print("Adja meg a film m�faj�t:");
		String genre = sc.nextLine();
		
		System.out.print("Adjon meg le�r�st a filmhez:");
		String descr =sc.nextLine(); 
		
		System.out.print("Adja meg a film megjelen�s�nek �v�t:");
		int year = sc.nextInt();
		
		System.out.print("Adja meg a film hossz�t (percekben):");
		int length = sc.nextInt();
		
		System.out.print("Adja meg a film korhat�r�t:");
		int age = sc.nextInt();
			
		
		lista.add(new Film(title,genre,year,length,age,descr));
	
	}
	/** A met�dus bek�ri a hozz�adni k�v�nt sorozat adatait, 
	 * majd hozz�adja a list�hoz */
	protected static void addSorozat() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Adja meg a sorozat c�m�t:");
		String title = sc.nextLine();
		
		System.out.print("Adja meg a sorozat m�faj�t:");
		String genre = sc.nextLine();
		
		System.out.print("Adja meg a sorozat megjelen�s�nek �v�t:");
		int year = sc.nextInt();
		
		System.out.println("Adja meg a r�szek sz�m�t:");
		int eps = sc.nextInt();
		
		lista.add(new Sorozat(title,genre,year,eps));
		
	
	}
	/** Ez a met�dus teszi lehet�v�, hogy a felhaszn�l� eld�ntse, 
	 * hogy filmet vagy sorozatot szeretne-e hozz�adni.*/
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
			System.out.println("Vissza�r�ny�tjuk a f�men�be ");
		}else {
			//Ide m�g �runk majd hibakezel� oszt�lyt de addig is
			System.err.println("Hib�s bemenet , vissza a f�men�be");
		}
		
	}
	
	/**Ez a met�dus v�gzi a c�m szerinti keres�st */
	protected static void searchByName() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Adja meg a keresni k�v�nt c�met: ");
		String n = sc.nextLine();
		
		Collections.sort(lista, new NameComparator());
		
		for (int i=0; i<lista.size();i++) {
			if (lista.get(i).getCim().contains(n)) {
				System.out.println(lista.get(i));
			}
		}
		
	}
	
	/** Az �v/m�faj alapj�n val� keres�s haszn�latakor ez a met�dus teszi lehet�v�,
	 * hogy a felhaszn�l� eld�ntse, hogy filmet vagy sorozatot akar keresni. */
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
			System.out.println("Vissza�r�ny�tjuk a f�men�be \n");
		}
		else {
			//Ide m�g �runk majd hibakezel� oszt�lyt de addig is
			System.err.println("Hib�s bemenet , vissza a f�men�be \n");
		}
		
	}
	
	/**Az �v/m�faj szerinti keres�st v�gz� met�dus, abban az esetben, ha a felhaszn�l� 
	 * filmet szeretne keresni. */
	protected static void searchFilm() {
		Scanner sc = new Scanner(System.in);
		
		SearchByMenu();
		String cmd = sc.nextLine();
		
		if (cmd.equals("1")) {
			System.out.print("Adja meg a keresni k�v�nt �vsz�mot: ");
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
			System.out.print("Adja meg a keresni k�v�nt m�fajt: ");
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
			System.out.println("Vissza�r�ny�tjuk a f�men�be \n");
		}
		else {
			//Ide m�g �runk majd hibakezel� oszt�lyt de addig is
			System.err.println("Hib�s bemenet , vissza a f�men�be");
		}
		
	}
	
	/**Az �v/m�faj szerinti keres�st v�gz� met�dus, abban az esetben, ha a felhaszn�l� 
	 * sorozatot szeretne keresni. */
	protected static void searchSorozat() {
		Scanner sc = new Scanner(System.in);
		
		SearchByMenu();
		String cmd = sc.nextLine();
		
		if (cmd.equals("1")) {
			System.out.print("Adja meg a keresni k�v�nt �vsz�mot: ");
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
			System.out.print("Adja meg a keresni k�v�nt m�fajt: ");
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
			System.out.println("Vissza�r�ny�tjuk a f�men�be \n");
		}
		else {
			//Ide m�g �runk majd hibakezel� oszt�lyt de addig is
			System.err.println("Hib�s bemenet , vissza a f�men�be");
		}

	}
	
	protected static void removeByTitle() throws Exception {
		Scanner sc = new Scanner(System.in);
		int cnt=0;
		
		System.out.print("Adja meg a t�r�lni k�v�nt m� c�m�t: ");
		String t = sc.nextLine();
		
		for (int i=0;i<lista.size();i++) {
			if (lista.get(i).getCim().contains(t)) {
				System.out.println(lista.get(i));
				cnt++;
			}
		}
		int n;
		if (cnt==0) {
			System.err.println("Hiba, ilyen c�m nem tal�lhat�!");
		}
		
		else if(cnt>0) {
			System.out.print("Adja meg a t�r�lni k�v�nt m� sorsz�m�t: ");
			try {
				 n = sc.nextInt();
			
				
			}catch(Exception e){
				throw new Exception(); //Ez k�s�bb m�smilyen Exception lesz majdcsak most ne hisztizzen neked
			}
			if (n<0 & n>lista.size()) {
				lista.remove(lista.get(n-1));
			}
			
			
		}
		
	}
	
	
}
