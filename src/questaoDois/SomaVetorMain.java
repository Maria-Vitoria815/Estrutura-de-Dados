package questaoDois;
import java.util.Scanner;

public class SomaVetorMain {
	
	public static void main(String[] args) {
		
		int vetor[] = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite 10 números para preencher o vetor:");
		
		for (int contador = 0; contador < 10; contador++) {
            vetor[contador] = scanner.nextInt();
		}
		
		scanner.close();
	      
		int soma = SomaVetorObjeto.calcularSoma(vetor);

   
        System.out.println("A soma dos números é: " + soma);

        
	}
		
		
	}


