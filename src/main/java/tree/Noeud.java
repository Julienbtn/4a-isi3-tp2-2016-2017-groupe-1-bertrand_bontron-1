package tree;


import tree.visitor.Affichage;

public interface Noeud {
    
    void accept(Affichage visiteur);
    /*
    default void accept(Visitor v)
    {
        v.visit(this);
    }
    */
	
}
