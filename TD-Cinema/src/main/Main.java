package main;

import java.util.logging.Logger;

import model.dec.SalleCinemaItf;
import model.fact.SalleCinemaFactory;

public final class Main {
	private static final Logger LOG = Logger.getLogger(Main.class.getCanonicalName());

	public static void main (String[] args) {
		SalleCinemaFactory cf = new SalleCinemaFactory();
		SalleCinemaItf s1 = cf.createSalleCinema("VIJAY", 2000, 15.0d);
		SalleCinemaItf s2 = cf.createSalleCinema("AZERTY", 100, 155.0d);
		System.out.println(s1);
		s1.vendrePlace();
		System.out.println(s1);
	}

}
