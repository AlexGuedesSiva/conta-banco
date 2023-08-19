package desafio.contaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		c1.setNome("Maria Andrade");
		c1.setNumeroConta(1021);
		c1.depositar(237.48);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Por favor, digite o numero da agência: ");
		String agencia = entrada.nextLine();
		
		System.out.print("Digite o numero da conta: ");
		int numero = entrada.nextInt();
		
		if(agencia.equals(c1.getAgencia()) && numero == c1.getNumeroConta()) {
			System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, "
					+ "sua agência é %s, conta %d e seu saldo %.2f", c1.getNome(), c1.getAgencia()
					,c1.getNumeroConta(), c1.getSaldo());
		} else {
			System.out.println("Por favor, insira dados validos!!!");
		}
		
		entrada.close();
	}
}
