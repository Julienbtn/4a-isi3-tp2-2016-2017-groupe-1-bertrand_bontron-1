package tree.visitor;

import tree.Addition;
import tree.Constante;
import tree.Multiplication;
import tree.Negation;


public class AffichageValeur implements Affichage{
    
    int valeur =0;

    @Override
    public void visit(Constante constante) {
        valeur = constante.getValeur();
           
    }

    @Override
    public void visit(Negation negation) {
        
    }

    @Override
    public void visit(Addition addition) {  
        
    }

    @Override
    public void visit(Multiplication multiplication) {
        
    }
    
}
