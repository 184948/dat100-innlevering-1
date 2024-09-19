package no.hvl.dat100;

import java.util.Scanner;

public class O2 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Skriv inn din bruttoinntekt: ");
		
		double bruttoinntekt = scanner.nextDouble();
		double trinnskatt = 0;
		
		if(bruttoinntekt > 1350000) {
			trinnskatt = (bruttoinntekt - 1350000) * 0.176;
			bruttoinntekt = 1350000;
			
		} else if(bruttoinntekt > 937901) {
			trinnskatt = (bruttoinntekt - 937901) * 0.166;
			bruttoinntekt = 937901;
			
		} else if(bruttoinntekt > 670000) {
			trinnskatt = (bruttoinntekt - 670000) * 0.136;
			bruttoinntekt = 670000;
			
		} else if(bruttoinntekt > 292850) {
			trinnskatt = (bruttoinntekt - 292850) * 0.04;
			bruttoinntekt = 292850;
			
		} else if( bruttoinntekt > 208050) {
			trinnskatt = (bruttoinntekt - 208050) * 0.017;
			bruttoinntekt = 208050;
			
		} else {
			System.out.println("Ingen Trinnskatt");
		}
		
		System.out.println("Trinnskatt i kr: " + trinnskatt);
	}

}
