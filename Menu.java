package Filmtar.Filmtar;

import java.util.ArrayList;

public class Menu {
	protected static  ArrayList <Videoanyag> lista =new ArrayList<Videoanyag>();
	protected static  void Fomenu() {
		System.out.println("[1] Film/sorozat hozz�ad�sa \n"
				+ "[2] Filmek/sorozatok list�z�sa �v/m�faj alapj�n \n"
				+ "[3] Film/sorozat t�rl�se \n"
				+ "[4] N�v szerinti keres�s \n"
				+ "[5] Ment�s �s kil�p�s\n");
	}
	protected static void AddMenu() {
		System.out.println("[1] Film hozz�ad�sa \n"
				+ "[2] Sorozat hozz�ad�sa \n"
				+ "[3] Vissza a f�men�be\n");
	}
	protected static void SearchMenu() {
		System.out.println("[1] Film keres�se \n"
				+ "[2] Sorozat keres�se \n"
				+ "[3] Vissza a f�men�be\n");
	}
	protected static void SearchByMenu() {
		System.out.println("[1] �v szerinti keres�s \n"
				+ "[2] M�faj szerinti keres�s \n"
				+ "[3] Vissza\n");
	}
	protected static void DeleteMenu() {
		System.out.println("[1] Film t�rl�se \n"
				+ "[2] Sorozat t�rl�se \n"
				+ "[3] Vissza a f�men�be\n");

	}
}
