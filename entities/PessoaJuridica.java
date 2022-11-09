package entities;

public class PessoaJuridica  extends Pessoa{
	private int numeroFuncionario;
	
	public PessoaJuridica () {
		super();
	}
	public PessoaJuridica(String nome, Double rendaMensal, int numeroFuncionario) {
		super(nome, rendaMensal);
		this.numeroFuncionario = numeroFuncionario;
	}
	public int getNumeroFuncionario() {
		return numeroFuncionario;
	}
	public void setNumeroFuncionario(int numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}
	@Override
	public double impostos() {
		double imposto = 0;
		if (getNumeroFuncionario() <=10) {
				imposto = (getRendaMensal() * 1.16) - getRendaMensal();			
		}
		if (getNumeroFuncionario() >10) {
				imposto = (getRendaMensal() * 1.14) - getRendaMensal();			
		}		
		return imposto;
	}
	public void Etiqueta () {
		System.out.println(getNome() 
							+ "  $  " 
							+ impostos());        // verificar
		
		
	}
	
	

}
