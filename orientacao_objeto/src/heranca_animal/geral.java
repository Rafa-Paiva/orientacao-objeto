package heranca_animal;

public class geral {
	
	private String nome;
	private int idade;
	private String alimento;
	
	public geral (String nome,int idade, String alimento) {
		super();
		this.nome=nome;
		this.idade=idade;
		this.alimento=alimento;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getAlimento() {
		return alimento;
	}
	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	
}