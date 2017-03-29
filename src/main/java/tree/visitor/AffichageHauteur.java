/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree.visitor;

import tree.Addition;
import tree.Constante;
import tree.Multiplication;
import tree.Negation;
import tree.OperateurBinaire;
import tree.OperateurUnaire;

/**
 *
 * @author Podoko
 */
public class AffichageHauteur implements Affichage{
    
    private int hauteur = 0;
    
    public int getHauteur(){
        return hauteur;
    }
    
    private void visit(OperateurUnaire operateur){
        operateur.getOpG().accept(this);
        hauteur++;
    }

    private void visit(OperateurBinaire operateur){
        int profondeurDroite;
        operateur.getOpD().accept(this);
        profondeurDroite = hauteur;
        operateur.getOpG().accept(this);
        hauteur = Integer.max(hauteur, profondeurDroite) + 1;
    }
    
    @Override
    public void visit(Constante constante) {
        hauteur = 1;
    }

    @Override
    public void visit(Negation negation) {
        this.visit((OperateurUnaire) negation);
    }

    @Override
    public void visit(Addition addition) {
        this.visit((OperateurBinaire) addition);
    }

    @Override
    public void visit(Multiplication multiplication) {
        this.visit((OperateurBinaire) multiplication);
    }
    
}
