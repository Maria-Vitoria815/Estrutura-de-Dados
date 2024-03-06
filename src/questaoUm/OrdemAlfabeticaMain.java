package questaoUm;
import java.util.Arrays;
import java.util.Scanner;

public class OrdemAlfabeticaMain {

	public static void main(String[] args) {
		
		String nomes[]= new String[10];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite 10 nomes para colocá-los em ordem alfabética: ");
        for (int contador = 0; contador < 10; contador++) {
            nomes[contador] = scanner.nextLine();
        }
        scanner.close();
        
        OrdemAlfabeticaObjeto nomesDoVetor = new OrdemAlfabeticaObjeto(nomes);
        nomesDoVetor.ordenarNomes();
        nomesDoVetor.imprimir();

    
    }
	
}
