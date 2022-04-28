package Filmtar.Filmtar;

import java.util.ArrayList;
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
}
