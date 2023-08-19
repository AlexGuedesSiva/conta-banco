package desafio.contaBanco;

import java.util.Objects;

public class ContaBancaria {
	
	private int numeroConta;
	private String agencia = "067-8";
	private double saldo;
	
	public ContaBancaria() {
		// TODO Auto-generated constructor stub
	}

	public ContaBancaria(int numeroConta, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
		//System.out.println("Depósito de " + valor + " realizado. Novo Saldo: " + saldo);
	}
	
	public void sacar(double valor) {
		if(valor <= saldo) {
			saldo -= valor;
			//System.out.println("Saque de " + valor + "realizado. Novo saldo: " + saldo);
		} else {
			System.out.println("Saldo insuficiente para saque.");
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(agencia, numeroConta, saldo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContaBancaria other = (ContaBancaria) obj;
		return Objects.equals(agencia, other.agencia) && numeroConta == other.numeroConta
				&& Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo);
	}

	
}







