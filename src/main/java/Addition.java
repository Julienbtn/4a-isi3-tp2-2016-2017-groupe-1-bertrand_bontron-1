public class Addition extends OperateurBinaire{
	public Addition(Noeud ng, Noeud nd) {
		super("+", ng, nd);
	}

    @Override
    public void accept(Affichage v) {
        v.visit(this);
    }


	

}
