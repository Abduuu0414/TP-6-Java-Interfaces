package ma.projet.bean;

import ma.projet.inter.IAffichage;
import ma.projet.inter.IOperation;
import ma.projet.abst.Affichage;

public class Reel extends Affichage implements IAffichage, IOperation<Reel>{
	
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
		return new Reel(this.x + o.getReel());
	}

	@Override
	public String affiche() {
		return String.format("%.0f", x);
	}


	@Override
	public String affiche2() {
		return String.format("%.0f", x);
	}

	
}
