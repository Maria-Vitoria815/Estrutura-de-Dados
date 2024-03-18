package questaoBanco;
import java.util.Arrays; 

public class CadastrarConta {

	private Conta[] contas = new Conta[100]; 
	private int numContas = 0;
	
	public CadastrarConta() {
		super();
	}

	public CadastrarConta(Conta[] contas, int numContas) {
		super();
		this.contas = contas;
		this.numContas = numContas;
	}

    

	public Conta[] getContas() {
		return contas;
	}

	public void setContas(Conta[] contas) {
		this.contas = contas;
	}

	public int getNumContas() {
		return numContas;
	}

	public void setNumContas(int numContas) {
		this.numContas = numContas;
	}

	
	 public void adicionarConta(String nome, double valor) {
	     Conta novaConta = new Conta(); 
	     novaConta.setNome(nome);
	     novaConta.setValor(valor); 
	     contas[numContas] = novaConta; 
	     numContas++; 
	 }

	 public void listarContas() {
	     for (int i = 0; i < numContas; i++) { 
	         System.out.println("Nome: " + contas[i].getNome() + ", Valor: " + contas[i].getValor()); 
	     }
	 }

	
	public void procurarConta(String nome) {
	     for (int i = 0; i < numContas; i++) { 
	         if (contas[i].getNome().equals(nome)) {
	             System.out.println("Conta encontrada:");
	             System.out.println("Nome: " + contas[i].getNome() + ", Valor: " + contas[i].getValor()); 
	             return; 
	         }
	     }
	     System.out.println("Conta não encontrada."); 
	 }

}
