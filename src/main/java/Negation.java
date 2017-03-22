public class Negation extends OperateurUnaire{
    public Negation(Noeud n) {
            super("-", n);
    }

        
    @Override
    public void accept(Affichage v) {
        v.visit(this);
    }
}
