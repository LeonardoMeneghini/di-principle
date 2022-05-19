package com.springframework;

public class Condutor {

	public static void main(String[] args) {
	
	Condutor condutor = new Condutor(new Carro());
	condutor.automovel();
	}
	@Autorwired
	private Veiculo veiculo;
	
	public Condutor(Veiculo obj) {
		this.veiculo = obj;
	}
		
	public void automovel() {
		veiculo.acao();
	}
}
