package application;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Conta minhaConta = new Conta();
		
		minhaConta.titular = "Nathalia Marchini";
		minhaConta.numero =12289;
		minhaConta.saldo = 200;
		
		
		System.out.println("saldo atual:" + minhaConta.saldo);
		
		//TODO: Adicionar mensagem caso o cliente não consiga sacar ou uma mensagem de sucesso!
		
		if (minhaConta.sacar(201.00)){
			System.out.println("Operação efetuada com sucesso");
		}else {
			System.out.println("Erro....Verfique o saldo!");
		}
	
		
		System.out.println("saldo depois de sacar:" + minhaConta.saldo);
		
		
		System.out.println("saldo atual:" + minhaConta.saldo);
		
		minhaConta.depositar(500);
		
		System.out.println("saldo depois de depositar:" + minhaConta.saldo);
		
		
		
	}

}
