package heranca_animal;

public class juan extends geral{
	private String tipo;

	public juan( String cientifico,String nome,int idade, String alimento,String tipo) {
		super(nome, idade,  alimento);		
		this.tipo=tipo;		
	}
	
	public void print() {
		System.out.print("cavalo");
		System.out.print("\n Nome: "+getNome());
		System.out.print("\n Alimenta��o: "+getAlimento());
		System.out.print("\n Ra�a: "+tipo);
	}
	public void som() {
		System.out.print("\n sla poh kkk");
	}
	public void correr() {
		System.out.print("\n o cavalo deu um mortal");
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}