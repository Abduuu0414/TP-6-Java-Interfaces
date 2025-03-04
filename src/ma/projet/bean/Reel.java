package ma.projet.bean;

import ma.projet.inter.IAffichage;
import ma.projet.inter.IOperation;
import ma.projet.abst.Affichage;

public class Reel extends Affichage implements IAffichage, IOperation<Reel> {

    protected double x;

    public Reel(double x) {
        this.x = x;
    }

    public double getReel() {
        return x;
    }

    public void setReel(double x) {
        this.x = x;
    }

    @Override
    public Reel plus(Reel o) {
        return new Reel(this.x + o.getReel());
    }

    @Override
    public Reel moins(Reel o) {
        return new Reel(this.x - o.getReel());
    }

    public double plus(double... x) {
        double somme = this.x;
        for (double valeur : x) {
            somme += valeur;
        }
        return somme;
    }

    public double moins(double... x) {
        double resultat = this.x;
        for (double valeur : x) {
            resultat -= valeur;
        }
        return resultat;
    }

    @Override
    public String affiche() {
        return String.format("%.2f", x);
    }

    @Override
    public String affiche2() {
        return String.format("%.2f", x);
    }
}
