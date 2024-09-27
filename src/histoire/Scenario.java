package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix);

		Romain minus = new Romain("minus", 6);

		asterix.parler("Bonjour a tous");

		minus.parler("GAU..GAGAU");

		asterix.frapper(minus);

		minus.parler("Aie");

		minus.parler("j'abandonne");

	}

}
