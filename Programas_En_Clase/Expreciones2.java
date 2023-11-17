public class Expreciones2 {
	public static void main(String[] args) {
		double Expresion1= 2*8/2/2-22*4/8-(100+25)/Math.pow(5,2);
		double Expresion2= (2*16/Math.pow(2,3)-4)+32-(125/5/5+3);
		boolean Expresion3= 12 >= 12|8>4&22<21;
		boolean Expresion4= (12 >= 12|8>4)&22<21;
		boolean Expresion5= 1+8*(12-3+9/(9-Math.pow(4,5)+7))>2.8*2&&Math.pow(3,4)==100-19;
		int a = 100, b = -12, c = 4000, d = 5, e = 0;
		boolean Expresion6= (a+b*c+e)<=e*d*b&(c/a+e-d)<e+d-c+b*a;
		boolean V= true;
		boolean F= false;
		boolean Expresion7= V||(F&&(V||!(F||(V&&V))));  
		boolean Expresion8=  F||1==Math.pow(Math.pow(2,3)/4,0)&&!(Math.pow(2, -1) < 0);

		System.out.println("EVALUACION DE EXPRESIONES");
		System.out.println("==============================");
		// 
		System.out.println("Expresion 1: \n2 * 8 / 2 / 2 - 22 * 4 / 8 - (100+25) / 5^2\nResultado: "+ Expresion1);
		System.out.println("Expresion 2: \n(2 * 16 / 2^3 -4) + 32 - (125 / 5 / 5 + 3)\nResultado: "+ Expresion2);
		System.out.println("Expresion 3: \n 12 >= 12 OR 8 > 4 AND 22 < 21\nResultado: "+ Expresion3);
		System.out.println("Expresion 4: \n(12 >= 12 OR 8 > 4) AND 22 < 21\nResultado:"+ Expresion4);
		System.out.println("Expresion 5: \n1 + 8 * (12 - 3 + 9 / (9 - 4^5) + 7) > 2.8 * 2 AND 3^4 = 100 - 19\nResultado: "+Expresion5);
		System.out.println("Expresion 6: \n(a + b * c + e) <= e * d * b AND (c / a + e - d) < e + d - c + b * a, donde: a es 100, b es -12, c es 4000, d es 5, e es 0\nResultado:\n"+ Expresion6);
		System.out.println("Expresion 7: \nV or F and(V or not(F or V and V))\nResultado: " + Expresion7);
		System.out.println("Expresion 8: \nFalso OR 1=(2^3/4)^0 AND NOT(2 ^ -1 < 0)\nResultado: "+ Expresion8);
		
	}
}