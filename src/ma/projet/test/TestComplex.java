package ma.projet.test;

import ma.projet.bean.Complex;
import ma.projet.bean.Reel;

public class TestComplex {
	public static void main(String[] args) {
		Complex c1 = new Complex(2, 3);
		Complex c2 = new Complex(1, 4);
		
		Complex c3 = c1.plus(c2);
		Complex c4 = c1.moins(c2);
		
		Reel r1 = new Reel(4);
		Reel r2 = new Reel(7);
		
		Reel r3 = r1.plus(r2);
		Reel r4 = r1.moins(r2);
		
        double r1PlusVariadic = r1.plus(3, 5, 2.5); // 4 + 3 + 5 + 2.5 = 14.5
        double r1MoinsVariadic = r1.moins(1, 2, 0.5); // 4 - 1 - 2 - 0.5 = 0.5
		
		System.out.println(" c1 : " + c1.affiche() + " ,c2 : " + c2.affiche() + " ,c3 : " + c3.affiche() + " ,c4 : " + c4.affiche());
		System.out.println(" r1 : " + r1.affiche() + " ,r2 : " + r2.affiche() + " ,r3 : " + r3.affiche() + " ,r4 : " + r4.affiche());
		
		System.out.println("r1.plus(3, 5, 2.5) = " + r1PlusVariadic);
        System.out.println("r1.moins(1, 2, 0.5) = " + r1MoinsVariadic);
	}
}
