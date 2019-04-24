package om;
import java.util.Scanner;
public class Calcul {
	private int a;
	private int b;
	public Calcul() {
		this.setA(((int)(Math.random()*(9))));
		this.setB(((int)(Math.random()*(9))));
	}

	public int operationCalcul(int rand){
		int somme = getA() + getB();
		System.out.println(somme);
		int diff  = getA() - getB();
		System.out.println(diff);
		if (rand == 1) {
			while(somme > 10) {
				a = (int)(Math.random()*(9));
				b = (int)(Math.random()*(9));
				somme = getA() + getB();
			}
			return somme;
		}
		else {
			while(diff < 0) {
				a = (int)(Math.random()*(9));
				b = (int)(Math.random()*(9));
				diff = getA() - getB();
			}
			return diff;
		}
	}
	public String afficherCalcul(int rand) {
		if (rand == 1) {
			//return this.getA() + " + " + this.getB();
			return " + ";
		}
		else {
			//return this.getA() + " - " + this.getB();
			return " - ";
		}
	}
	
	public int proposerResultat(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Propose une r�ponse !");
		int j = sc.nextInt();
		sc.close();
		return j;
	}
	public boolean estIlJuste(int c, int r){
		return r == c;
	}
	/*public String afficherResultat(String str){
		int r = Integer.parseInt(str);
		String text = "Vous avez propos� " + r;
		return text;
	}*/
	public String afficherResultat(boolean b){
		if (b == true) {
			return("Bonne R�ponse");
		}
		else {
			return("Mauvaise R�ponse");
		}
	}
	public void afficherResultatDeux(boolean b, int r){
		if (b == true) {
			System.out.println("Bonne R�ponse");
		}
		else {
			System.out.println("Mauvaise R�ponse");
			System.out.println("La r�ponse est " + r);
		}
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}