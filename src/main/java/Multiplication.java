public class Multiplication extends OperateurBinaire{

    public Multiplication( Noeud ng, Noeud nd) {
            super("*", ng, nd);
    }

	
    @Override
    public void accept(Affichage v) {
        v.visit(this);
    }

}
