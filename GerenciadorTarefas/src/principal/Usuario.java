package principal;
import java.util.ArrayList;

public class Usuario extends Pessoa {
	//Atributos
	private String usuario;
	private String email;
	private String ensino;
	private ArrayList <Tarefa> tarefa = new ArrayList();
	
	//Contrutor
	public Usuario(String n , int i , String s , String u , String em , String en) {
		super(n , i , s);
		usuario = u;
		email = em;
		ensino = en;
		
	}
	
	//Getters e Setters
	public String getUsuario() {
		return this.usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getEnsino() {
		return this.ensino;
	}
	public void setEnsino(String ensino) {
		this.ensino = ensino;
	}
	
	//Adicionando Tarefas
	
	public void salvaTarefa(Tarefa tar) {
		tarefa.add(tar);
	}
	public void mostraTarefas() {
		for(int i = 0; i < tarefa.size(); i++) {
			System.out.println(tarefa.get(i));
		}
	}
	
	
	//toString
	public String toString() {
		return "Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Sexo: " + sexo + "\n" +
				"Usuario: " + usuario + "\n" + "email: " + email + "\n" + "ensino: " + ensino;
	}
	
		

}
