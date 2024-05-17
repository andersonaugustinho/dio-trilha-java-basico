package contabanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Por favor, digite a Agência!");
		String agencia = scanner.next();
		
		System.out.println("Por favor, digite o Número da Conta!");
		int numeroConta = scanner.nextInt();
		
		System.out.println("Por favor, digite o Nome do Cliente!");
		String nomeCliente = scanner.next();
		
		System.out.println("Por favor, digite o Saldo da Conta!");
		double saldoConta = scanner.nextDouble();
		
		System.out.print("Olá " + nomeCliente);
		System.out.print(", obrigado por criar uma conta em nosso banco, sua agência é " + agencia);
		System.out.print(", conta " + numeroConta);
		System.out.print(" e seu saldo " + saldoConta);
		System.out.print(" já está disponível para saque.");
		
		scanner.close();
	}

}
