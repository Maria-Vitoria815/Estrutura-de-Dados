package questaoUm;
import java.util.Arrays;

public class OrdemAlfabeticaObjeto {

	private String[] nomes;

	
	
	public OrdemAlfabeticaObjeto() {    }

	public OrdemAlfabeticaObjeto(String[] nomes) {
		this.nomes = nomes;
	}

	public String[] getNomes() {
		return nomes;
	}

	public void setNomes(String[] nomes) {
		this.nomes = nomes;
	}
	
	 public void ordenarNomes() {
	        Arrays.sort(nomes);
	    }

	 public void imprimir() {
	        System.out.println("Concluído! Nomes em ordem alfabética: ");
	        for (String nome : nomes) {
	            System.out.println(nome);
	        }
	    }

	
}
