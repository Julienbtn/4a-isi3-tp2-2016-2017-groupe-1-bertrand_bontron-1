package tree;

import tree.visitor.*;

public class ExpressionArithmetique {
	private Noeud racine;
	
	public ExpressionArithmetique(Noeud racine){
		this.racine = racine;
	}

	public Noeud getRacine() {
		return racine;
	}

	public void afficherPostFixe() {
		System.out.println("\n postfixe:");
                this.racine.accept(new AffichagePostfixe());
		
	}

	public int calculerValeur() {
                AffichageValeur calculeurDeValeurDeNoeud = new AffichageValeur();
                this.racine.accept(calculeurDeValeurDeNoeud);
		return calculeurDeValeurDeNoeud.getValue();
	}

	public int calculerHauteur() {
                AffichageHauteur calculeurDeHauteuDeNoeud = new AffichageHauteur();
                this.racine.accept(calculeurDeHauteuDeNoeud);
		return calculeurDeHauteuDeNoeud.getHauteur();
	}
	public void afficherInFixe() {
		System.out.println("\n infixe:");
                this.racine.accept(new AffichageInfixe());
		
	}
	
}
