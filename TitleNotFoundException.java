package Filmtar.Filmtar;

public class TitleNotFoundException extends Exception{
	public String getMessage() {return "Ilyen címû mû nem szerepel a nyilvántartásban!";}

}
