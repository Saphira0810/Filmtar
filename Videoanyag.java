package Filmtar.Filmtar;

abstract class Videoanyag {
	private String cim; 
	private String mufaj; //kisbet�vel  megadva
	private int ev;
	
	public Videoanyag(String cim, String mufaj, int ev) {
		this.cim=cim; this.mufaj=mufaj; this.ev=ev;
	}
	
	public String getCim() {return cim;}
	public int getEv() {return ev;}
	public String getMufaj() {return mufaj;}
	
	public void setCim(String c){cim=c;}
	public void setEv(int e) {ev=e;}
	public void setMufaj(String m) {mufaj=m;}
	
	abstract public String toFajlba();
	
	

	/*
	 * Amikor k�s�bb l�trehozod a Sorozatban is a toFajlba t�r�ld itt a return-t 
	 * �s �ll�tsd �t abstractra ezt
	 */
}
