package tree;

import tree.visitor.Affichage;

public class Addition extends OperateurBinaire{
	public Addition(Noeud ng, Noeud nd) {
		super("+", ng, nd);
	}

    @Override
    public void accept(Affichage visiteur) {
        visiteur.visit(this);
    }
	

}
