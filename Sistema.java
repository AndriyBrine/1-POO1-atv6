// Arquivo Sistema.java
import java.util.Scanner;
import java.lang.Math;
public class Sistema {
 public static void main(String[] args){
 Scanner teclado = new Scanner(System.in);
 Circulo tampa;
 Circulo rodela;
 double chapaAlt, chapaLarg, chapaCusto, tampaDiam;
 System.out.println("DADOS DE ENTRADA");
 System.out.println("================");
 System.out.print("Largura da chapa (m): ");
 chapaLarg = teclado.nextDouble();
 System.out.print("Altura da chapa (m): ");
 chapaAlt = teclado.nextDouble();
 System.out.print("Preço da chapa (R$): ");
 chapaCusto = teclado.nextDouble();
 System.out.print("Diâmetro da tampa do bueiro (m): ");
 tampaDiam = teclado.nextDouble();
 // Processando a saída da aplicação
 tampa = new Circulo(); // Aqui, a tampa é do tipo círculo
 tampa.raio = tampaDiam/2; // tampa.raio ta definindo o raio lá do objeto Círculo
 rodela = new Circulo(); // Teste
 rodela.raio = 2; // Teste
 double quantTampas = Math.ceil((chapaAlt * chapaLarg)/tampa.area());
 double tampaCusto = chapaCusto/quantTampas;
 System.out.println("\nRELATÓRIO DE SAÍDA");
 System.out.print("Quantidade de tampas de bueiro com diâmetro de ");
 System.out.printf("%.2f m: %.0f\n", tampaDiam, quantTampas);
 System.out.printf("Custo de cada tampa (R$): %.2f\n", tampaCusto);
 } // main
} // Sistema
// SO DE ESTAREM NA MESMA PASTA NO MESMO NÍVEL ELES CONSEGUEM SE VER, NÃO PRECISA IMPORTAR