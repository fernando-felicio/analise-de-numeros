package analiseNumerica;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número que será analisado:");
		int X = sc.nextInt();
		int qtdImpar = 0;
		
		for (int numeroImpar = 0; numeroImpar < X; numeroImpar ++) {
			if (numeroImpar %2 != 0) {
				qtdImpar += 1;
				System.out.println(numeroImpar);				
			}			
		}
		System.out.printf("O número analisado foi o %d%nA quantidade de números impar é de: %d",X, qtdImpar);

		
	}

}
