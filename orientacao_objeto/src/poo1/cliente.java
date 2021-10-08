package poo1;

public class cliente {
	private String primeiroNome;
	private String segundoNome;
	private String ultimoNome;
	private int cpf;
	private int idade;
	
	public cliente (String primeiro, String meio, String ultimo,int cpf, int idade )
	{
		primeiroNome=primeiro;
		segundoNome=meio;
		ultimoNome=ultimo;
		this.setIdade(idade);
		this.setCpf(cpf);
	}
	
	
	
    public String getNomeCompleto()
    {
    	String nomeCompleto = primeiroNome+" "+ segundoNome+" "+ultimoNome;
    	return nomeCompleto;
    }
    
    public void imprimirInfo()
	{
		System.out.println("\n" + this.getNomeCompleto() + " Inscrito no CPF " + cpf+ " com a idade de "+idade+" anos ");
	}
	

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
    
}
