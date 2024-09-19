package no.hvl.dat100;

import java.util.Scanner;

public class O3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Skriv inn et positivt heltall: ");
		int n = scanner.nextInt();
		
		if(n <= 0) {
			System.out.println("Tall er ikke akseptert");
		
	  } else {
		  int fakultet = 1;
		  
		  for (int i = 1; i <= n; i++) {
			  fakultet *= i;
		  }
		  System.out.println(n + "! = " + fakultet);
	  }
		scanner.close();
	}

}
