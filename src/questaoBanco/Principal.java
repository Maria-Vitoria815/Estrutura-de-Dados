package questaoBanco;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CadastrarConta cadastro = new CadastrarConta();

		while (true) {
			System.out.println("\n\n");
			System.out.println("1. Adicionar Conta");
			System.out.println("2. Listar Contas");
			System.out.println("3. Procurar Conta");
			System.out.println("4. Sair");
			System.out.print("\nEscolha uma opção: ");
			int opcao = scanner.nextInt();

			switch (opcao) {
			
			case 1:
				System.out.print("\nDigite o nome da conta: ");
				String nome = scanner.next();
				System.out.print("Digite o valor da conta: ");
				double valor = scanner.nextDouble();
				cadastro.adicionarConta(nome, valor);
				break;
				
			case 2:
				System.out.println("\nContas cadastradas no sistema:");
				cadastro.listarContas();
				break;
				
			case 3:
				System.out.print("\nDigite o nome da conta que deseja procurar: ");
				String nomeProcurado = scanner.next();
				cadastro.procurarConta(nomeProcurado);
				break;
				
			case 4:
				System.out.println("Saindo do programa...");
				System.exit(0);
				
			default:
				System.out.println("Opção inválida.");
			}
		}
	}

}
