package principal;
import java.util.*;
import java.text.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Gerenciador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		String descricao , status , tipo;
		String nome , sexo , usuario , email , ensino;
		int idade;
		
		// data/hora atual
		LocalDateTime agora = LocalDateTime.now();

		// formatar a data
		DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
		String data = formatterData.format(agora);
		
		System.out.println("----CADASTRO DE USUÁRIO----");
		System.out.println("Digite o nome: ");
		nome = ler.next();

		
		System.out.println("Digite a idade: ");
		idade = ler.nextInt();
		
		System.out.println("Digite o sexo: ");
		sexo = ler.next();
		
		System.out.println("Digite o usuário: ");
		usuario = ler.next();
		
		System.out.println("Digite o email: ");
		email = ler.next();
		
		System.out.println("Digite o ensino: ");
		ensino = ler.next();
		
		Usuario user = new Usuario(nome , idade , sexo , usuario , email , ensino);
		System.out.println("Cadastrado com sucesso!!");
		System.out.println("Seguem os dados do Usuario...");
		System.out.println(user.toString());
		
		
		System.out.println("----CADASTRO DE TAREFAS----");
		
		System.out.println("Digite a descrição: ");
		descricao = ler.next();
		System.out.println("Digite o tipo: ");
		tipo = ler.next();
		
		Tarefa tarefa = new Tarefa(descricao , "aberto" , tipo , data);
		
		user.salvaTarefa(tarefa);
		
		System.out.println("Cadastrado com sucesso!!");
		System.out.println("Seguem os dados da Tarefa...");
		//System.out.println(tarefa.toString());
		user.mostraTarefas();
	
	}

}
