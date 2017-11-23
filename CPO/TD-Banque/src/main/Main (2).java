package main;

import model.Compte;
import model.CompteCourant;

public final class Main{
	
	public static void main(String[] args){
		Compte c1 = new CompteCourant("John Doe", 1500.0d);
		Compte c2 = new CompteCourant("Jack Bauer");

		double retrait = c1.withDraw(900.0d);
		double nouveauSolde = c2.deposit(1000000.0d);

		System.out.println(c1);
		System.out.println(c2.toString());

	}
}