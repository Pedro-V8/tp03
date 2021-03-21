package principal;

public abstract class Pessoa {
	//Atributos
	protected String nome;
	protected int idade;
	protected String sexo;
	
	//Construtor
	public Pessoa(String n , int i , String s) {
		nome = n;
		idade = i;
		sexo = s;
	}
	
	//Getters e Setters
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public String getSexo() {
		return this.sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
