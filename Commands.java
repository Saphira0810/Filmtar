package Filmtar.Filmtar;

import java.util.ArrayList;
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
}
