package tree.visitor;


import tree.Negation;
import tree.Multiplication;
import tree.Constante;
import tree.Addition;

public class AffichageInfixe implements Affichage {

    @Override
    public void visit(Constante constante) {
        System.out.print(constante.getValeur());
    }

    @Override
    public void visit(Negation negation) {
        System.out.print("(" + negation.getOp());
        negation.getOpG().accept(this);
        System.out.print(")");
    }

    @Override
    public void visit(Addition addition) {
        addition.getOpG().accept(this);
        System.out.print(addition.getOp());
        addition.getOpD().accept(this);
    }

    @Override
    public void visit(Multiplication multiplication) {
        multiplication.getOpG().accept(this);
        System.out.print(multiplication.getOp());
        multiplication.getOpD().accept(this);
    }
    
}
