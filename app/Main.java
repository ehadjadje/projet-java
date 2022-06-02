package app;

import java.util.Scanner;

public class Main {

	// represente la methode principale d'entree / sortie de notre app
	// il ne peut y avoir qu'une methode [...] main(String[] args) dans une appli
	public static void main(String[] args) {
//		System.out.println("hello world");
//		
//	    
//	    for (int index =0; index<=10 ;index++)
//	       	if (index % 2 == 0) System.out.println(index);
//	 
//	    
//	    Ecrire un programme java qui demande à l’utilisateur de saisir 
//	    un nombre entier et de lui afficher que le nombre est pair ou 
//	    impair selon la valeur tapée
	    
//	    Scanner saisie = new Scanner(System.in);
//	    
//	    while(true)
//	    {
//	    System.out.print("saisir un nombre : (0 pour quitter)");
//	    int nombre = saisie.nextInt() ;
//	    if 	( nombre == 0) break;
//	    if (nombre % 2 == 0)
//	    		{
//		    System.out.println("nombre pair");
//	    		}
//	    else
//	    {
//	    	System.out.println("nombre impair");
//	    	
//	    }
//	    
//	    }
//	    System.out.println("au revoir");
//	    
	    
//	    Demandez trois nombres de l'utilisateur et affichez le plus grand nombre.
/*	    Scanner saisie = new Scanner(System.in);
	    int plusGrand=0;
    	System.out.println("saisir 3 nombres");
    	int nombre1 = saisie.nextInt() ;
    	int nombre2 = saisie.nextInt() ;
    	int nombre3 = saisie.nextInt() ;
    	
    	
    	if (nombre1 > nombre2 && nombre1 > nombre3) plusGrand = nombre1;
    	if (nombre2 > nombre1 && nombre2 > nombre3) plusGrand = nombre2;
    	if (nombre3 > nombre1 && nombre3 > nombre2) plusGrand = nombre3;
    	
   	if (nombre1 > nombre2)
    		plusGrand = nombre1;
    	else
    		plusGrand = nombre2;
    	
    	if (plusGrand < nombre3)
    		plusGrand = nombre3;
	    
    	System.out.println("plusgrand = " + plusGrand);
*/
	    
//
//	    Écrire un programme Java pour convertir des minutes en un certain nombre d'années et de jours
    	
/*    	Scanner saisie = new Scanner(System.in);
    	
    	int heures, jours;
    	int  annee;
    	double minutesParAnnee = 60 * 24 * 365;
    	
    	System.out.println("saisir les minutes");
    	double minutes = saisie.nextDouble() ;
    	
    	annee = (int) ( minutes / minutesParAnnee);
    	jours = (int) ((minutes /60 /24) % 365);
    	
    	System.out.println("annee = " + annee);
    	System.out.println("jour = " + jours);
    */
//
//	    Ecrire un programme pour que pour un cours du dollar donné (et qui ne change pas pendantl’exécution du programme), on puisse convertir en euro. 
//	    Prévoyez un moyen d’arrêter l’exécution du programme.
		float dollarEuro = 0.9335F;
		float conversion=0;
		Scanner saisie = new Scanner(System.in);
		
		while (true)
		{
			
	    	System.out.println("saisir une valeur en dollar (0 pour quitter)");
	    	int valeur = saisie.nextInt() ;
	    	if (valeur == 0) break;
	    	conversion = valeur * dollarEuro;
	    	
	    	System.out.println("valeur en euro : " + conversion);
		}
			
				
			saisie.close();	

	    	System.out.println("au revoir");


	}
	
	

}
