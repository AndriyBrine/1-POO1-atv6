// Arquivo Circulo.java
import java.lang.Math;
public class Circulo {
 double raio; // Atributo (porque está fora de função e dentro de classe)
 public double diametro(){ // Diametro não precisa receber raio, so de estarem na mesma classe eles conseguem se enxergar
 return 2 * raio;
 }
 public double area(){
 return raio * raio * Math.PI;
 }
 double perimetro(){
 return 2 * raio * Math.PI;
 }
}
// O STATIC só é usado na class que vai ser executada (no caso, o Sistema, aqui por ser Circulo não se usa)
// Mesmo sem por o public, o java entende que cada uma dessas é uma função que é public