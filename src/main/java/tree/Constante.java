package tree;


import tree.visitor.Affichage;

public class Constante implements Noeud{
    private int valeur;
    public Constante(int valeur){
            this.valeur = valeur;
    }
    public int getValeur(){return valeur;}
	

    @Override
    public void accept(Affichage visiteur) {
        visiteur.visit(this);
    }

}
