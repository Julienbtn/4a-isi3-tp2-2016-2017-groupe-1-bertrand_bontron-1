public class Constante implements Noeud{
    private int valeur;
    public Constante(int v){
            valeur = v;
    }
    public int getValeur(){return valeur;}
	

    @Override
    public void accept(Affichage v) {
        v.visit(this);
    }

}
