public class Pessoa{
	String nome, genero;
	int idade;
	Double peso, altura;

	double imc(){
		return peso/(altura * altura);
	}
	 double BT(){ BT = (1,20 x IMC) + (0,23 x idade) – (10,8 x sexo) – 5,4 
	 	if genero == "F"{ 
	 		return (1.20*(peso/(altura*altura))) + (0.23*idade) - (10.8 * 0) - 5.4
	 	} else if genero == "M" {
	 		return (1.20*(peso/(altura*altura))) + (0.23*idade) - (10.8 * 1) - 5.4
	 	}
	 }
}