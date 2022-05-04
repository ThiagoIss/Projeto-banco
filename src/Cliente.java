
public class Cliente {
	public static void main(String[] args) {
		
		Conta contaThiago = new Conta(1322, 4004);
		Cadastro thiago = new Cadastro();
		contaThiago.setTitular(thiago);
		contaThiago.getTitular().setNome("Thiago Izidoro");
		contaThiago.getTitular().setCpf("000.111.222-33");
		contaThiago.getTitular().setRg("444.555.666");
		
		contaThiago.deposita(1000);
		System.out.println(contaThiago.getTitular().getNome() + " ,voc� depositou " + contaThiago.getDeposita() + " R$.");
		contaThiago.saca(50);
		System.out.println(contaThiago.getTitular().getNome() + " ,voc� sacou " + contaThiago.getSaca() + " R$.");
		System.out.println(contaThiago.getTitular().getNome() + " ,seu saldo �: " + contaThiago.getSaldo() + " R$.");

		Conta contaMaria = new Conta(1422, 3443);
		Cadastro maria = new Cadastro();
		contaMaria.setTitular(maria);
		contaMaria.getTitular().setNome("Maria Aparecida");
		
		contaThiago.transfere(50, contaMaria);
		System.out.println(contaMaria.getTitular().getNome() + " ,seu saldo �: " + contaMaria.getSaldo() + " R$.");

	}
}
