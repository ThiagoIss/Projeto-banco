
public class Conta {
	private int conta;
	private int agencia;
	private double saldo;
	private double valorDeposita;
	private double valorSaca;
	private Cadastro titular;
	
	private static int numeroDeContas;
	
	public Conta (int conta, int agencia) {
		Conta.numeroDeContas++;
		this.conta = conta;
		this.agencia = agencia;
	}
	
	public boolean deposita(double valor) {
		if(valor > 0) {
			this.saldo += valor;
			this.valorDeposita = valor;
			return true;
		}
		return false;
	}
	
	public double getDeposita () {
		return this.valorDeposita;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor && valor > 0) {
			this.saldo -= valor;
			this.valorSaca = valor;
			return true;
		}
		return false;
	}
	
	public double getSaca() {
		return this.valorSaca;
	}
	
	public boolean transfere(double valor, Conta referencia) {
		if(saldo >= valor) {
			this.saldo -= valor;
			referencia.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setTitular(Cadastro titular) {
		this.titular = titular;
	}
	
	public Cadastro getTitular() {
		return titular;
	}
}
