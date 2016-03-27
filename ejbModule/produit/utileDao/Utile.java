package produit.utileDao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Stack;

public class Utile {

	/**
	 * Cette méthode permet de récupérer une chaine de caractères en MINUSCULE
	 * les espaces vides avant et apres la chaine ont ete supprimes
	 * @param chaine de caracteres
	 * @return une chaine de caractères exploitable
	 * @author Youcef B.
	 */
	public static String nettoyerChaineToutEnMinuscule(String chaine)
	{
		String resultat = "";
		
		if((chaine == null)||(chaine == "")||(chaine == " "))
		{
			System.out.println("la chaine etait a null - on lui affecte \"\" ");
		}
		else
		{		
			resultat = chaine.toLowerCase().trim();
		}
		
		return resultat;
	}
	
	
	/**
	 * Cette méthode permet de récupérer une chaine de caractères
	 * les espaces vides avant et apres la chaine ont ete supprimes
	 * @param chaine de caracteres
	 * @return une chaine de caractères exploitable
	 * @author Youcef B.
	 */

	public static String nettoyerChaine(String chaine)
	{
		String resultat = "";
		
		if((chaine == null)||(chaine == "")||(chaine == " "))
		{
			System.out.println("la chaine etait a null - on lui affecte \"\" ");
		}
		else
		{			
			resultat = chaine.trim();
		}
		
		return resultat;
	}
	
	/**
	 * methode qui permet de generer un chiffre entre 0 et 1000000
	 * @return un entier
	 */
	//methode qui genere un chiffre entre o et 1000000
	public static int genererId()
	{
		int nbreGenere = 0;
		
		Random random = new Random();
		nbreGenere = random.nextInt(1000000000);
		
		return nbreGenere;
	}
	
	/**
	 * transforme une chaine de caracteres representant une date au format dd/MM/yyyy
	 * en objet de type Date
	 * @param dateEnString est une chaine de caracteres
	 * @return une date de type Date
	 */
	public static Date transformeStringEnDate(String dateEnString)
	{
		Date date = null;
				
		dateEnString = nettoyerChaine(dateEnString);		
		
		try 
		{
			date = new SimpleDateFormat("dd/MM/yyyy").parse(dateEnString);
		} 
		catch (ParseException e) {
			//TODO envoye un message d'erreur dans le navigateur (il faudra creer une page jsp)
			System.out.println("La transformation de la chaine de caracteres en Date a echoue");
			e.printStackTrace();
		}
				
		return date;
	}
	
	public static String transformeStringDateEnStringDate(String dateEnString)
	{
		String stringDate = "";
		//String s1 = "2014/12/03";
		
		String[] splitChaine = null;
				
		splitChaine = dateEnString.split("-");
		
		Stack<String> s = new Stack<String>();
		
		for(int i=0; i<splitChaine.length; i++)
		{
			//System.out.println(splitChaine[i]);
			s.push(splitChaine[i]);
			
		}
		
		stringDate = s.pop() + "/" + s.pop() + "/" + s.pop();
		
		return stringDate;
	}

	/**
	 * transforme un Objet Date en chaine de caracteres
	 * @param date est un objet Date
	 * @return une chaine de caracteres exploitable (ex : 23/11/2015)
	 */
	public static String transformeDateEnString(Date date)
	{
		String resultat = "";
		
		if(date == null)
		{
			//TODO  envoye un message d'erreur dans le navigateur (il faudra creer une page jsp)
			System.out.println("absence de date - la chaine retournee est vide");
		}
		else
		{
			resultat = new SimpleDateFormat("dd/MM/yyyy",Locale.getDefault()).format(date);
//			resultat = Utile.nettoyerChaine(resultat);
		}
				
		return resultat;
	}
	
	/**
	 * retourne la date d'aujourd'hui sous la forme yyyy-mm-dd (2015/11/22)
	 * @return date du jour
	 */
	public static LocalDate dateDAujourdhui()
	{
		LocalDate ld = LocalDate.now();
		return ld;
	}
	
	/**
	 * retourne la date d'aujourd'hui sous la forme 22/11/15 et sous forme de chaine de caracteres
	 * @return date du jour
	 */
	public static String dateCourteDAujourdhui()
	{
		LocalDate l1 = LocalDate.now();
		String dateCourte = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(l1);
		
		return dateCourte;
	}
	
	/**
	 * methode qui renvoie une date complete sous forme de chaine de caracteres 
	 * (lundi 23 novembre 2015)
	 * @param stringDate date de la forme 23/11/2015
	 * @return une date sous forme de chaine de caracteres
	 */
	public static String dateCompleteEnString(String stringDate)
	{
		String resultat = "";		
		Date date =null;
		/**
		 *  Choix de la langue
		 */
		Locale locale = Locale.getDefault();
		
		/** 2. Construction du DateFormat en choisiant un format :
		 * FULL = lundi 23 novembre 2015
		 */
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
		try 
		{
			date = new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
			resultat = dateFormat.format(date);
		} 
		catch (ParseException e) 
		{
			//TODO  envoye un message d'erreur dans le navigateur (il faudra creer une page jsp)
			System.out.println("L'objet Date n'a pas pu etre instancié");
			e.printStackTrace();
		}
		catch (NullPointerException npex) 
		{
			//TODO  envoye un message d'erreur dans le navigateur (il faudra creer une page jsp)
			System.out.println("Erreur date - la chaine envoye en parametre vaut null");
			npex.printStackTrace();
		}
		return resultat;
	}
	
	/**
	 * transforme un objet date en localdate
	 * @param date
	 * @return une date de la forme yyyy-mm-dd
	 */
	public static LocalDate maDateEnLocalDate(Date date)
	{
		Instant instant = Instant.ofEpochMilli(date.getTime());
		LocalDate res = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
		
		return res;
	}
	
	/**
	 * transforme une chaine de caracateres de la forme dd/mm/yyyy en objet Localdate de la forme
	 * yyyy-mm-dd
	 * @param stringDate chaine de caracateres de la forme dd/mm/yyyy
	 * @return une date yyyy-mm-dd
	 */
	public static LocalDate stringEnLocalDate(String stringDate)
	{
		Date date = Utile.transformeStringEnDate(stringDate);
		Instant instant = Instant.ofEpochMilli(date.getTime());
		LocalDate res = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
		
		return res;
	}


}
