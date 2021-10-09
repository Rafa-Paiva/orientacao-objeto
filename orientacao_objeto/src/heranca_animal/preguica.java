package heranca_animal;

public class preguica extends geral {
	private String tipo;

	public preguica( String cientifico,String nome,int idade, String alimento,String tipo) {
		super(nome, idade,  alimento);		
		this.tipo=tipo;		
	}
	
	public void print() {
		System.out.print("bicho pregui�a");
		System.out.print("\n nome: "+getNome());
		System.out.print("\n idade: "+getIdade());
		System.out.print("\n alimenta��o: "+getAlimento());
		System.out.print("\n ra�a: "+tipo);
	}
	public void som() {
		System.out.print("\n *som de bicho pregui�a*");
	}
	public void subir() {
		System.out.print("\n O bicho Pregui�a come�ou a dormir zzz");
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}