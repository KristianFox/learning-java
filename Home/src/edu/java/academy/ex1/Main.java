package edu.java.academy.ex1;

import edu.java.academy.ex1.lqlq.PrimeNumbers;
import edu.java.academy.ex1.models.SuperHero;

public class Main {

	public static void main(String[] args) {
		SuperHero batman1 = new SuperHero("Batman", new String[]{"Rich", "Intelligence"});
		SuperHero batman2 = new SuperHero("Batman", new String[]{"Rich", "Intelligence"});

		SuperHero superman = new SuperHero("Superman", new String[]{
				"Flying", "Super strength"
		});
		//batman1.fightWith(superman);
		//System.out.println(batman1.equals(batman2));
		batman1.setName("Gosho");

		batman1.setName(null);




	}
}
