package tree;


import tree.visitor.Affichage;

public class Multiplication extends OperateurBinaire{

    public Multiplication( Noeud ng, Noeud nd) {
            super("*", ng, nd);
    }

	
    @Override
    public void accept(Affichage visiteur) {
        visiteur.visit(this);
    }

}
