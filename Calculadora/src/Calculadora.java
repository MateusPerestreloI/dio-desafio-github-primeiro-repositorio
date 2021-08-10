import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1;
		int numero2;
		int operacao=0;
		int resposta;
		Scanner tc = new Scanner(System.in);
		
		operacao = Operacao(tc);
		numero1 = Numero(tc);
		numero2 = Numero(tc);
		
		resposta = Calculo(operacao,numero1,numero2);
		
		Imprimir(resposta);
		
		tc.close();
	}
	
	public static int Operacao(Scanner tc)
	{
		int aux = 0;
		System.out.println("Escolha uma operação(Caso selecionado um que não esteja listado sera feito a soma): ");
		System.out.println("1 - Soma ");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão /n");
		aux = tc.nextInt();
		return aux;
	}
	
	public static int Numero(Scanner tc)
	{
		int num = 0;
		System.out.println("Digite um numero: /n");
		num = tc.nextInt();
		return num;
	}
	
	public static int Calculo(int operacao,int num1, int num2)
	{
		int resposta = 0;
		switch (operacao) {
		case 1:
				resposta = num1 + num2;
			break;
		case 2:
				resposta = num1 - num2;
			break;
		case 3:
				resposta = num1 * num2;
			break;
		case 4:
				resposta = num1 / num2;
			break;
		default:
				resposta = num1 + num2;
			break;
		}
		return resposta;
	}
	public static void Imprimir(int resposta)
	{
		System.out.println("Resultado: " + resposta);
	}
}
