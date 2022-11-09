package entities;

public class PessoaFisica extends Pessoa {
	private Double gastosSaude; 
	
	public PessoaFisica () {
		super();
	}
	public PessoaFisica(String nome, Double rendaMensal, Double gastosSaude) {
		super(nome, rendaMensal);
		this.gastosSaude = gastosSaude;
	}
	public Double getGastosSaude() {
		return gastosSaude;
	}
	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	@Override
	public double impostos() {
		double imposto = 0;
		if (getRendaMensal() <= 20000) {
			imposto = (getRendaMensal() * 1.15) - getRendaMensal(); 			
		}
		if (getRendaMensal() > 20000) {
			imposto = (getRendaMensal() * 1.25) - getRendaMensal(); 			
		}
		if (gastosSaude > 0) {
			imposto =+ imposto - (gastosSaude/2);
		}
		return imposto;
	}
	
	

}
