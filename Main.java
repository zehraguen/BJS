import java.util.*;

public class Main
{
	static List<Schueler> meineList = new List<Schueler>();
	
	
	
	public static void main(String[] args)
	{
		Scanner meinScanner = new Scanner(System.in);
	
	
	
		while(true)
		{
			System.out.println("Bundesjugendspiele");
			System.out.println("------------------");
			System.out.println();
			System.out.println("1. Schueler anlegen");
			System.out.println("2. Schueler anzeigen");
			System.out.println("3. Ergebnisse eintragen");
			System.out.println("4. Ergebnisse anzeigen");
			System.out.println("5. Programm beenden");
			System.out.println();
			System.out.println("Waehle einen Menuepunkt aus.");
			System.out.println();
			int eingabe = meinScanner.nextInt();
			System.out.println();
	
	
	
			if (eingabe == 1)
			{
				SchuelerAnlegen();
			}
			if (eingabe == 2)
			{
				SchuelerAnzeigen();
			}
			if (eingabe == 3)
			{
				ErgebnisseEintragen();
			}
			if (eingabe == 4)
			{
				ErgebnisseAnzeigen();
			}
			if (eingabe == 5)
			{
				System.out.println("Das Programm wurde beendet");
				System.exit(0);
			}
		}
	}
	
	
	
	public static void SchuelerAnlegen()
	{
		Scanner meinScanner = new Scanner(System.in);
		System.out.println("Schueler anlegen");
		System.out.println("----------------");
		System.out.println();
		
		System.out.println("Vorname: ");
		String vorname = meinScanner.next();
		System.out.println();
		
		System.out.println("Nachname: ");
		String nachname = meinScanner.next();
		System.out.println();
		
		System.out.println("Geschlecht(w/m/d): ");
		String geschlecht = meinScanner.next();
		System.out.println();
		
		System.out.println("Alter: ");
		int alter = meinScanner.nextInt();
		System.out.println();
		
		System.out.println("Klasse: ");
		String klasse = meinScanner.next();
		System.out.println();
	
	
	
		Schueler schueler = new Schueler(vorname, nachname, klasse, geschlecht, alter);
		meineList.append(schueler);
	
	
		System.out.println();
		System.out.println("Der Schueler mit dem Namen "+schueler.getVorname()+" "+schueler.getNachname()+" wurde eingetragen.");
	}
	
	
	
	public static void SchuelerAnzeigen()
	{
		System.out.println("Die folgenden Schueler sind gespeichert:");
		System.out.println("----------------------------------------");
		System.out.println();
		System.out.println("Vorname | Nachname | Sprung | Wurf | Lauf");
		System.out.println();
		meineList.toFirst();
		
		while(meineList.hasAccess())
		{
			Schueler aktuellerSchueler = meineList.getContent();
			System.out.println(aktuellerSchueler.getVorname()+" | "+aktuellerSchueler.getNachname()+" | "+aktuellerSchueler.getSprung()+" | "+aktuellerSchueler.getLauf()+" | "+aktuellerSchueler.getWurf());
			meineList.next();
		}
		System.out.println();
	}
	
	
	public static void ErgebnisseEintragen()
	{
		Scanner meinScanner = new Scanner(System.in);
		System.out.println("Ergebnisse eintragen");
		System.out.println("--------------------");
		System.out.println();
		System.out.println("1.Weitsprung");
		System.out.println("2.Lauf");
		System.out.println("3.Wurf");
		System.out.println();
		System.out.println("Waehle einen Menuepunkt aus.");
		System.out.println();
		int eingabe = meinScanner.nextInt();
		System.out.println();

		if (eingabe == 1)
		{
			weitsprung();
		}
		if (eingabe == 2)
		{
			sprint();
		}
		if (eingabe == 3)
		{
			wurf();
		}
	}
	
	public static void ErgebnisseAnzeigen()
	{
		System.out.println("Welche Disziplin soll nun sortiert werden?");
        System.out.println("");
        System.out.println("1. Weitsprung");
        System.out.println("2. Sprint");
        System.out.println("3. Weitwurf");
        System.out.println("");
        Scanner mS = new Scanner(System.in);
        int eingabe = mS.nextInt();
        
        if(eingabe == 1)
        {
            sortiereSprung(); //Insertionsort
        }
        
        else if(eingabe == 2)
        {
            sortiereSprint(); // Bubblesort
        }
        
        else if(eingabe == 3)
        {
            sortiereWurf(); // Selectionsort
        }
        else
        {
            
        }
	}
	
	public static void weitsprung()
	{
		Scanner mS = new Scanner(System.in);
		System.out.println("Die folgenden Schueler sind nun beim Weitsprung");
		System.out.println();
		meineList.toFirst();
		
	 	while(meineList.hasAccess())
	 	{
	 		Schueler aS = meineList.getContent();
	 		System.out.println(aS.getVorname()+" "+aS.getNachname());
	          
	 		System.out.println();
	 		System.out.println("Welche Weite wurde erreicht?");
	 		System.out.println();
	 		double weite = mS.nextDouble();
	 		aS.setSprung(weite);
	 		System.out.println();
	          
	 		meineList.next();
	 	}
	 	System.out.println();
	  } 
	
	public static void sprint()
	{
		Scanner mS = new Scanner(System.in);
		System.out.println("Die folgenden Schueler sind nun beim Sprint");
		System.out.println();
		meineList.toFirst();
		
	 	while(meineList.hasAccess())
	 	{
	 		Schueler aS = meineList.getContent();
	 		System.out.println(aS.getVorname()+" "+aS.getNachname());
	          
	 		System.out.println();
	 		System.out.println("Welche Zeit wurde erreicht?");
	 		System.out.println();
	 		double zeit = mS.nextDouble();
	 		aS.setSprung(zeit);
	 		System.out.println();
	          
	 		meineList.next();
	 	}
	 	System.out.println();
	}
	
	public static void wurf()
	{
		Scanner mS = new Scanner(System.in);
		System.out.println("Die folgenden Schueler sind nun beim Wurf");
		System.out.println();
		meineList.toFirst();
		
	 	while(meineList.hasAccess())
	 	{
	 		Schueler aS = meineList.getContent();
	 		System.out.println(aS.getVorname()+" "+aS.getNachname());
	          
	 		System.out.println();
	 		System.out.println("Welche Weite wurde erreicht?");
	 		System.out.println();
	 		double weite = mS.nextDouble();
	 		aS.setSprung(weite);
	 		System.out.println();
	          
	 		meineList.next();
	 	}
	 	System.out.println();
	} 
	
	public static void sortiereSprung()
    {
		List<Schueler> sotierteList = new List<Schueler>();
		meineList.toFirst();
		
		while(!meineList.isEmpty())
		{
	 		Schueler aS = meineList.getContent();
	 		sotierteList.toFirst();
	 		while(sotierteList.hasAccess() && aS.getSprung( ) > sotierteList.getContent().getSprung())
	 		{
	 			sotierteList.next();
	 		}
	 		sotierteList.insert(aS);
	 		meineList.remove();
		}
		
		//sotierteList.toFirst();
		
		meineList = sotierteList;
		//while(!sotierteList.isEmpty())
		//{
		//	meineList.append(sotierteList.getContent());
		//	sotierteList.remove();
		//}
		
    } 
    
    public static void sortiereSprint()
    {
    	
    }
    
    public static void sortiereWurf()
    {
    	
    }

}