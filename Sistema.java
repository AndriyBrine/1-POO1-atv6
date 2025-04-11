import java.util.Scanner;
public class Sistema {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		Pessoa person = new Pessoa();

		System.out.print("Nome: ");
		person.nome = teclado.nextLine();

		while (person.nome != ""){
			System.out.print("Peso: ");
			person.peso = teclado.nextDouble();
			
			System.out.print("Idade: ");
			person.idade = teclado.nextInt();

			System.out.print("Gênero (M ou F): ");
			person.genero = teclado.nextLine();

			System.out.print("Altura: ");
			person.altura = teclado.nextDouble();

			System.out.println("Nome: " + person.nome);
			System.out.println("IMC: " + person.imc());


			System.out.print("Nome: ");
			person.nome = teclado.nextLine();
		}
		
		teclado.close();

	}
}