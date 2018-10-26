package controller;
import util.Teclado;
public class LacoTesteInicio {
	public static void main(String[] args) {
		int r, x, i;
		i = 1;
		x = Teclado.lerInt("Digite um numero: ");
		while(i <= 5) {
			//x = Teclado.lerInt("Digite um numero: ");
			r = x * 3;
			System.out.println(r);
			//i = i + 1;
			--i;
		}
	}

}
