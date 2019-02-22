package imie.cours.java.sem2;

import java.util.Scanner;

public class testinput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("TAPE QUELQUE CHOSE BORDEL");
		String res = sc.next();
		System.out.println("T'AS DIS " + res.toUpperCase() + ", BORDEL");
		sc.close();
	}

}
