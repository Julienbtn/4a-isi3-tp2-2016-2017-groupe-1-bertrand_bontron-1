package tree;


import tree.visitor.Affichage;

public class Negation extends OperateurUnaire{
    public Negation(Noeud noeud) {
            super("-", noeud);
    }

        
    @Override
    public void accept(Affichage visiteur) {
        visiteur.visit(this);
    }
}
