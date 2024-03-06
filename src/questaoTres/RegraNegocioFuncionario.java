package questaoTres;

public class RegraNegocioFuncionario {
	
	   private Funcionario[] funcionarios = new Funcionario[3];
	   public int totalFuncionarios = 0;

	    public void cadastrarFuncionario(Funcionario funcionario) {
	    	
	        if (totalFuncionarios < 3) {
	            funcionarios[totalFuncionarios] = funcionario;
	            totalFuncionarios++;
	            System.out.println("Funcionário cadastrado com sucesso.\n\n");
	            
	        } else {
	            System.out.println("Limite de funcionários atingido.\n\n");
	        }
	    }

	    public Funcionario[] listarFuncionarios() {
	        return funcionarios;
	        
	    }
	}


