package questaoTres;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	 public static void main(String[] args) {

	        RegraNegocioFuncionario regraFuncionario = new RegraNegocioFuncionario();
	        RegraNegocioEmpresa regraEmpresa = new RegraNegocioEmpresa();

	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("----CADASTRO FUNCIONÁRIOS----\n");
	        
	        for (int i = 0; i < 3; i++) {
	            Funcionario funcionario = new Funcionario();
	            System.out.println("Funcionário " + (i + 1));
	            System.out.println("CPF:");
	            funcionario.setCpf(scanner.nextLine());
	            System.out.println("Nome:");
	            funcionario.setNome(scanner.nextLine());
	            System.out.println("RG:");
	            funcionario.setRg(scanner.nextLine());
	            System.out.println("Telefone:");
	            funcionario.setTelefone(scanner.nextLine());
	            regraFuncionario.cadastrarFuncionario(funcionario);
	        }

	        
	        System.out.println("----CADASTRO EMPRESAS----\n");
	        
	        for (int i = 0; i < 3; i++) {
	            Empresa empresa = new Empresa();
	            System.out.println("Empresa " + (i + 1));
	            System.out.println("CNPJ:");
	            empresa.setCnpj(scanner.nextLine());
	            System.out.println("Nome:");
	            empresa.setNome(scanner.nextLine());
	            System.out.println("Telefone:");
	            empresa.setTelefone(scanner.nextLine());
	            regraEmpresa.cadastrarEmpresa(empresa);
	        }
                scanner.close();
	        
	        System.out.println("\n----Listagem de Funcionários----\n");
	        Funcionario[] funcionarios = regraFuncionario.listarFuncionarios();
	        for (int i = 0; i < regraFuncionario.totalFuncionarios; i++) {
	            Funcionario fun = funcionarios[i];
	            System.out.println("Nome: " + fun.getNome() + ", CPF: " + fun.getCpf() + ", RG: " + fun.getRg() + ", Telefone: " + fun.getTelefone());
	        }

	       
	        System.out.println("\n----Listagem de Empresas----\n");
	        Empresa[] empresas = regraEmpresa.listarEmpresas();
	        for (int i = 0; i < regraEmpresa.totalEmpresas; i++) {
	            Empresa emp = empresas[i];
	            System.out.println("Nome: " + emp.getNome() + ", CNPJ: " + emp.getCnpj() + ", Telefone: " + emp.getTelefone());
	        }

	     
	    }
}
