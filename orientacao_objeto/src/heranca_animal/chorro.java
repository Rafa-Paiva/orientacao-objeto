package heranca_animal;

public class chorro extends geral{
	private String tipo;

	public chorro( String cientifico,String nome,int idade, String alimento,String tipo) {
		super(nome, idade,  alimento);	
		this.tipo=tipo;		
	}
	
	public void print() {
		System.out.print("cachorro");
		System.out.print("\n Nome: "+getNome());
		System.out.print("\n Idade: "+getIdade());
		System.out.print("\n Alimenta��o: "+getAlimento());
		System.out.print("\n Ra�a: "+tipo);
	}
	public void som() {
		System.out.print("\n au au tlg");
	}
	public void correr() {
		System.out.print("\n o cachorro resolveu dar grau de moto");
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}