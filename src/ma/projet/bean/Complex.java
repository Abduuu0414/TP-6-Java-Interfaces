package ma.projet.bean;

import ma.projet.inter.IAffichage;
import ma.projet.inter.IOperation;
import ma.projet.abst.Affichage;

public class Complex extends Affichage implements IAffichage, IOperation<Complex>{

	protected double im;
	protected double re;
	
	public Complex(double im, double re) {
		this.im = im;
		this.re = re;
	}

	public double getIm() {
		return im;
	}

	public double getRe() {
		return re;
	}

	public void setIm(double im) {
		this.im = im;
	}

	public void setRe(double re) {
		this.re = re;
	}

	@Override
	public Complex plus(Complex o) {
		return new Complex(this.re + o.getRe(), this.im + o.getIm());
	}

	@Override
	public Complex moins(Complex o) {
		return new Complex(this.re - o.getRe(), this.im - o.getIm());
	}

	@Override
	public String affiche() {
		if (this.im > 0)
			return (String.format("%.0f", this.re) + " + " + String.format("%.0f", this.im) + "i");
		else if (this.im < 0)
			return (String.format("%.0f", this.re) + " - " + String.format("%.0f", -this.im) + "i");
		else
			return (String.format("%.0f", this.re) + "");
	}

	@Override
	public String affiche2() {
		if (this.im > 0)
			return (String.format("%.0f", this.re) + " + " + String.format("%.0f", this.im) + "i");
		else if (this.im < 0)
			return (String.format("%.0f", this.re) + " - " + String.format("%.0f", -this.im) + "i");
		else
			return (String.format("%.0f", this.re) + "");
	}
	
	
	
}
