package Filmtar.Filmtar;

import java.util.ArrayList;

public class Menu {
	protected static  ArrayList <Videoanyag> lista =new ArrayList<Videoanyag>();
	protected static  void Fomenu() {
		System.out.println("[1] Film/sorozat hozzáadása \n"
				+ "[2] Filmek/sorozatok listázása év/mûfaj alapján \n"
				+ "[3] Film/sorozat törlése \n"
				+ "[4] Név szerinti keresés \n"
				+ "[5] Mentés és kilépés\n");
	}
	protected static void AddMenu() {
		System.out.println("[1] Film hozzáadása \n"
				+ "[2] Sorozat hozzáadása \n"
				+ "[3] Vissza a fõmenübe\n");
	}
	protected static void SearchMenu() {
		System.out.println("[1] Film keresése \n"
				+ "[2] Sorozat keresése \n"
				+ "[3] Vissza a fõmenübe\n");
	}
	protected static void SearchByMenu() {
		System.out.println("[1] Év szerinti keresés \n"
				+ "[2] Mûfaj szerinti keresés \n"
				+ "[3] Vissza\n");
	}
	protected static void DeleteMenu() {
		System.out.println("[1] Film törlése \n"
				+ "[2] Sorozat törlése \n"
				+ "[3] Vissza a fõmenübe\n");

	}
}
