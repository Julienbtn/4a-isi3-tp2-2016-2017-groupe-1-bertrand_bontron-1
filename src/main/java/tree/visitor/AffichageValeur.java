package tree.visitor;

import tree.Addition;
import tree.Constante;
import tree.Multiplication;
import tree.Negation;


public class AffichageValeur implements Affichage{
    
    int valeur = 0;
    
    
    public int getValue(){
        return valeur;
    }

    @Override
    public void visit(Constante constante) {
        valeur = constante.getValeur();
           
    }

    @Override
    public void visit(Negation negation) {
        negation.getOpG().accept(this);
        valeur = - valeur;
    }

    @Override
    public void visit(Addition addition) {  
        int valDroite;
        addition.getOpD().accept(this);
        valDroite = valeur;
        addition.getOpG().accept(this);
        valeur += valDroite;
    }

    @Override
    public void visit(Multiplication multiplication) {
        int valDroite;
        multiplication.getOpD().accept(this);
        valDroite = valeur;
        multiplication.getOpG().accept(this);
        valeur *= valDroite;
    }
    
}
