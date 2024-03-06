package questaoTres;

public class RegraNegocioEmpresa {

	 private Empresa[] empresas = new Empresa[3];
	 public int totalEmpresas = 0;

	    public void cadastrarEmpresa(Empresa empresa) {
	    	
	        if (totalEmpresas < 3) {
	            empresas[totalEmpresas] = empresa;
	            totalEmpresas++;
	            System.out.println("Empresa cadastrada com sucesso.\n\n");
	            
	        } else {
	            System.out.println("Limite de empresas atingido.\n\n");
	        }
	    }

	    public Empresa[] listarEmpresas() {
	        return empresas;
	    }
	    
	}

	

