package personnages;

public class Village {
	private static final int nbVillageoisMaximum = 100;

	private String nom;
	private Chef chef;

	private int nbVillageois = 0;
	private Gaulois[] villageois;

	public Village(int nbVillageoisMaximum) {
		villageois = new Gaulois[nbVillageoisMaximum];

	}

	public Village(String nom) {
		this.nom = nom;
	}

	public void setchef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < nbVillageoisMaximum) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
		}
	}

	public Gaulois trouverHabitant(int nbVillageois) {
		return villageois[nbVillageois];
	}

	public void afficherVillageois() {
		if (nbVillageois==0){
			System.out.println("Il n'y a aucun villageois");
		}else{
			Systel.out.println("Dans le village du chef"+ chef.getNom() +"vivent les legendaires Gaulois:";
			for (int i =0 ; i<nbVillageois; i++){
				Systel.out.println("-" + villageois[i].getNom();}
		}
	}

	public static void main(String[] arg) {
		Village villageIrreductible = new Village(30);
		// Gaulois gaulois = villageIrreductible.trouverHabitant(30);
		// }
		// on a un ArrayIndexoutofBoundsException ca veut dire que il a pas de place il
		// faudrais ajouter des conditions pour respecter
		// l'emplacement dans la liste .

		Chef abraracourcix = new Chef(" Abraracourcix", 6, villageIrreductible);
		Gaulois asterix = new Gaulois("Asterix", 8);
		villageIrreductible.ajouterHabitant(asterix);
		Gaulois obelix = new Gaulois("Obelix", 25);
		villageIrreductible.ajouterHabitant(obelix);

		// Gaulois gaulois = villageIrreductible.trouverHabitant(1);
		// System.out.println(gaulois);
		// on obtient null car 1 est l'emplacement 0 dans la liste quand le village est
		// initialise
	}
}
