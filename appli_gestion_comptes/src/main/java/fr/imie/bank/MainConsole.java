package main.java.fr.imie.bank;


import java.util.Scanner;


public class MainConsole {

	public static void main(String[] args) {
		
		Scanner scNav = new Scanner(System.in);
		
		System.out.println("Console de gestion de comptes");
		System.out.println("   ");
		
		boolean endLoop = false;
		
		while (endLoop != true) {
			Operation.displayOptions();
			
			String choice = scNav.nextLine();
			
			switch (choice) {
			case "1":
				Operation.createUser();
				break;
			case "2":
				Operation.createAccount();
				break;
			case "3":
				Operation.associateAccount();
				break;
			case "4":
				Operation.deleteUser();
				break;
			case "5":
				Operation.deleteAccount();
				break;
			case "6":
				Operation.closeConsole(endLoop);
				break;
			default:
				System.out.println("erreur, choix invalide");
			}
			
			if (endLoop != true) {
				System.out.println("   ");
				System.out.println("retour au menu principal");
				System.out.println("   ");
			}
			
		}
		
		scNav.close();
		System.out.println("exécution terminée");
	}

}
