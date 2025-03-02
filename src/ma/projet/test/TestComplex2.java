package ma.projet.test;

import ma.projet.bean.Complex;
import ma.projet.bean.Reel;

public class TestComplex2 {
	public static void main(String[] args) {
		Complex c1 = new Complex(2, 3);
		Complex c2 = new Complex(1, 4);
		
		Complex c3 = c1.plus(c2);
		Complex c4 = c1.moins(c2);
		
		Reel r1 = new Reel(4);
		Reel r2 = new Reel(7);
		
		Reel r3 = r1.plus(r2);
		Reel r4 = r1.moins(r2);
		
		System.out.println(" c1 : " + c1.affiche2() + " ,c2 : " + c2.affiche2() + " ,c3 : " + c3.affiche2() + " ,c4 : " + c4.affiche2());
		System.out.println(" r1 : " + r1.affiche2() + " ,r2 : " + r2.affiche2() + " ,r3 : " + r3.affiche2() + " ,r4 : " + r4.affiche2());
	}
}
