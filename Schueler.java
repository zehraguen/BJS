
import java.util.*;

public class Schueler
{

	String nachname;
	String vorname;
	String klasse;
	double wurf;
	double lauf;
	double sprung;
	String geschlecht;
	int alter;
	int gesamtergebnis;
	String urkunde;

	public Schueler (String pVorname, String pNachname, String pKlasse, String pGeschlecht, int pAlter)
	{
		vorname = pVorname;
		nachname = pNachname;
		klasse = pKlasse;
		geschlecht = pGeschlecht;
		alter = pAlter;
	}
	
	//get
	public String getVorname()
	{
		return vorname;
	} 
	
	public String getNachname()
	{
		return nachname;
	}
	
	public String getKlasse()
	{
		return klasse;
	}
	
	public String getGeschlecht()
	{
		return geschlecht;
	}
	
	public int getAlter()
	{
		return alter;
	}
	
	public double getLauf()
	{
		return lauf;
	}
	
	public double getWurf()
	{
		return wurf;
	}
	
	public double getSprung()
	{
		return sprung;
	}
	
	
	//set
	public void setLauf(double pLauf)
	{
		lauf = pLauf;
	}
	
	public void setWurf(double pWurf)
	{
		wurf = pWurf;
	}
	
	public void setSprung(double pSprung)
	{
		sprung = pSprung;
	}
}