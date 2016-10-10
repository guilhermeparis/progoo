import java.util.*;

public class Excecoes{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,c = 0;
		double d;
		double e[];
		e = new double[10];
		//Código de leitura de dados
		System.out.println("Digite um valor inteiro para a:");
		a = in.nextInt();
		System.out.println("Digite um valor inteiro para b:");
		b = in.nextInt();
		try{
			c = a / b;
		}
		catch(ArithmeticException divPorZero){
			System.out.println("Divisão por zero. Corrija os valores de entrada e tente novamente.");
		}
		
		try{
		d = e[a];
		System.out.println(d);
		}
		catch(ArrayIndexOutOfBoundsException posNula){
			System.out.println("Posição do array é nula. Verifique e tente novamente.");
		}
		
		ContaCorrente c1 = new ContaCorrente(c);
		
		try{
			c1.getSaldo();
			c1.retirada(5000f);
		}
		catch(InvalidBalanceException i){
			
		}
		
		finally{
			in.close();
		}
	}
}
