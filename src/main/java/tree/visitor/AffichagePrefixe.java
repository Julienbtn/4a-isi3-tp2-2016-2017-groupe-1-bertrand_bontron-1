package tree.visitor;


import tree.*;

class AffichagePrefixe implements Affichage {


    @Override
    public void visit(Constante constante) {
        System.out.print(constante.getValeur());
    }

    @Override
    public void visit(Negation negation) {
        System.out.print(negation.getOp());
        negation.getOpG().accept(this);
    }

    @Override
    public void visit(Addition addition) {
        System.out.print(addition.getOp());
        addition.getOpG().accept(this);
        addition.getOpD().accept(this);
    }

    @Override
    public void visit(Multiplication multiplication) {
        System.out.print(multiplication.getOp());
        multiplication.getOpG().accept(this);
        multiplication.getOpD().accept(this);
    }
    
}
