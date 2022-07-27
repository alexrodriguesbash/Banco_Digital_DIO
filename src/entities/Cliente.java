package entities;

public class Cliente {
	
	private String nome;
	private String Telefone;  

	public Cliente(String nome, String telefone) {
		super();
		this.nome = nome;
		Telefone = telefone;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	} 
	
}
