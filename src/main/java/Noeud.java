public interface Noeud {
    
    void accept(Affichage v);
    /*
    default void accept(Visitor v)
    {
        v.visit(this);
    }
    */
	
}
