package org.eclipse.main;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

	// cmd eclipse
	// commenter/decommenter : CTRL + shilt + C
	// indenter : CTRL + shilt + F

	// Represente la methode principale, d'entree / sortie de notre programme
	// Il ne peut y avoir qu'une methode [...] main(String[] args) dans une
	// application
	public static void main(String[] args) {

		System.out.print("Hello print() !");
		System.out.println("Hello ... !");
		System.out.println("Hello println() !");

		String hello = "Hello";
		System.out.println(hello);

		int x = 5;
		System.out.println(x);
		Integer y = 6;
		System.out.println(y);

		System.out.println("------------------------------------------------------------------");

		// Classe String

		// replace(old,new) : permet de remplacer toute occurrence de la chaıne old
		// dans la chaıne courante par new et retourne la nouvelle chaıne
		String str = "bonjour les bons jours";
		String str2 = str.replace("jour", "soir");
		System.out.println(str2);

		System.out.println("------------------------------------------------------------------");

		// indexOf(x) : retourne l’indice de la premiere occurrence de la valeur de x
		// dans la chaıne, -1 sinon.
		Integer position1 = str.indexOf("bon");
		System.out.println(position1); // Affiche 0

		int position2 = str.indexOf("bon", 3);
		System.out.println(position2); // Affiche 12

		Integer z = 2;
		String str3 = z.toString();
		System.out.println(str3); // Affiche "2"

		int v = 2;
		String str4 = ((Integer) v).toString();
		System.out.println(str4); // Affiche "2"

		int w = 4;
		String str5 = Integer.toString(w);
		System.out.println(str5);

		System.out.println("------------------------------------------------------------------");

		// Pas besoin de convertir un type primitif vers son type Objet / Wrapper
		Integer n = 2;
		int m = n;
		System.out.println(m);

		int k = 3;
		Integer j = k;
		System.out.println(j);

		System.out.println("------------------------------------------------------------------");

		// Post-incrementation
		int i = 2;
		int f = i += 2; // => i = i + 2

		System.out.println(i); // Affiche 4
		System.out.println(f); // Affiche 2

		// Pre-incrementation
		int a = 2;
		int b = ++a;

		System.out.println(a); // Affiche 3
		System.out.println(b); // Affiche 3

		System.out.println("------------------------------------------------------------------");

		System.out.println("bon" + " " + "jour");

		int num1 = 3;
		int num2 = 5;
		int result = num1 + num2;
		System.out.println(result);

		System.out.println("------------------------------------------------------------------");

		// Variables JAVA

		float floatNum = 4.95f;
		System.out.println(floatNum);

		char myChar = 'F';
		System.out.println(myChar);

		boolean bool = true;
		System.out.println(bool);

		int num3 = 100000;
		System.out.println(num3);

		long numLong = 1000000000L;
		System.out.println(numLong);

		double dble = 100.99d;
		System.out.println(dble);

		System.out.println("------------------------------------------------------------------");

		// Scanner permet à un utilisateur d’écrire une valeur et au programme de lire
		// cette valeur

//		try (Scanner scanner = new Scanner(System.in)) {
//
//			System.out.println("Veuillez saisir un premier entier, svp ?");
//			int n1 = scanner.nextInt();
//
//			System.out.println("Veuillez saisir un second entier, svp ?");
//			int n2 = scanner.nextInt();
//
//			int res = n1 + n2;
//			System.out.printf("la somme de %d et de %d vaut %d\n", n1, n2, res);
//
//			scanner.close();
//
//		} catch (Exception e) {
//			System.out.println("Veuillez rentrer un nombre, svp !");
//		}

//		try (Scanner scanner2 = new Scanner(System.in)) {
//			// while(true) -> boucle infinie
//			// sort de la boucle a l appel du break, cad, quand les conditions sont vraies
//			while (true) {
//				System.out.println("Entrez votre nom:");
//				String nom = scanner2.nextLine();
//				System.out.println("Entrez votre mot de passe:");
//				String password = scanner2.nextLine();
//				if (nom.equals("Wick") && password.equals("1234")) {
//					// Sort de la boucle while
//					break;
//				}
//			}
//			System.out.println("Hello John");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		System.out.println("------------------------------------------------------------------");

		int n4 = 3;

		if (n4 > 0) {
			System.out.println(n4 + "est strictement positif");
		} else if (n4 < 0) {
			System.out.println(n4 + "est strictement negatif");
		} else {
			System.out.println(n4 + "est strictement null");
		}

		String str6 = "one";

		switch (str6) {
		case "one":
			System.out.println("un");
			break;
		case "two":
			System.out.println("deux");
			break;
		case "three":
			System.out.println("trois");
			break;
		default:
			System.out.println("autre");
		}

		int u = 0;

		// Boucle while : a chaque iteration on teste si la condition est
		// vraie avant d’acceder aux traitements
		while (u < 5) {
			System.out.println(u);
			u++;
		}

		int q = 0;

		// La Boucle do ... while execute le bloc au moins une fois ensuite
		// elle verifie la condition
		do {
			System.out.println(q);
			q++;
		} while (q < 5);

		for (int index = 0; index < 5; index++) {
			System.out.println(index);
		}

		// Appel de la methode statique
//		exo2();
//		exo3();
//
//		Main main = new Main();
//		main.exo1();
		
		System.out.println("------------------------------------------------------------------");

//		String[] sports = new String[3];
		
//		sports[0] = "Judo";
//		sports[1] = "Tennis";
//		sports[2] = "Foot";
		
//		String[] sports = new String[] { "Judo", "Tennis", "Foot" }; // Taille 3 Fixe
		
		// tableau statique
		String[] sports = { "Judo", "Tennis", "Foot" }; // Taille 3 Fixe
		
		for (String sport : sports) {
			System.out.println(sport);
		}
		
		System.out.println(sports[1]);
		
		// Collection dynamique
		List<String> names = Arrays.asList("Tom", "Jerry", "Donald");
		
		for(int l = 0; l < names.size(); l++ ) {
			System.out.println(names.get(l));
		}
		
		for (String name : names) {
			System.out.println(name);
		}
		
		names.forEach((name) -> System.out.println(name));
		
	}

	// Creation d'une methode simple representant une serie d'instruction,
	// n'echangeant pas d'informations avec le programme
	// Une methode non statique est une methode qui utilise une nouvelle instance d'objet, ici Main
	public void exo1() {
		// Ecrire un code Java qui permet d’afficher les nombres pairs compris entre 0
		// et 10. (value % 2 == 0)
		for (int nu = 0; nu < 10; nu += 2) {
			System.out.println(nu);
		}
	}

	// Creation d'une methode simple representant une serie d'instruction,
	// n'echangeant pas d'informations avec le programme
	// une methode statique est une methode qui n'as pas d'instance, cad, qu'elles
	// peuvent etre utilisee sans instancier un objet de la classe, ici Main
	public static void exo2() {
		// Ecrire un programme java qui demande à l’utilisateur de saisir
		// un nombre entier et de lui afficher que le nombre est pair ou
		// impair selon la valeur tapé
		Scanner in = new Scanner(System.in);
		try {
			System.out.print("Input number: ");
			int input = in.nextInt();
			if (input % 2 == 0) {
				System.out.println("Number is odd");
			} else {
				System.out.println("Number is even");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void exo3() {
		Scanner scanner2 = new Scanner(System.in);
		try {

			System.out.print("Input the 1st number: ");
			int num1 = scanner2.nextInt();
			System.out.print("Input the 2nd number: ");
			int num2 = scanner2.nextInt();
			System.out.print("Input the 3rd number: ");
			int num3 = scanner2.nextInt();

			// avec la classe Math.max
			int num = Math.max(num1, num2);
			num = Math.max(num, num3);

			System.out.println("The greatest :" + num);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void exo4() {
		// Écrire un programme Java pour convertir des minutes en un certain nombre
		// d'années et de jours
		double minutesInYear = 60 * 24 * 365;
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number of minutes: ");
		double min = input.nextDouble();
		long years = (long) (min / minutesInYear);
		int days = (int) (min / 60 / 24) % 365;
		System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
	}

	public static void exo5() {
		// Ecrire un programme pour que pour un cours du dollar donné (et qui ne change
		// pas pendant l’exécution du programme),
		// on puisse convertir en euro.
		// Prévoyez un moyen d’arrêter l’exécution du programme.
		double euros, dollar;
		double cours;
		String choix;
		Scanner in = new Scanner(System.in);
		try {
			do {
				System.out.println("Cours du dollar(valeur de 1 dollar)?");
				cours = in.nextDouble();
				System.out.println("Somme en dollar ?");
				dollar = in.nextDouble();
				euros = dollar * cours;
				System.out.println("La somme en euros:" + euros);
				System.out.println("Voulez-vous quitter" + "(tapez q pour quitter)");
				choix = in.next();
			} while (choix == "q");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
