public interface Affichage {
    
    void visit(Constante constante);
    void visit(Negation negation);
    void visit(Addition addition);
    void visit(Multiplication multiplication);
    
}
