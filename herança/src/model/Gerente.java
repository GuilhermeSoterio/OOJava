package model;

public class Gerente extends Funcionario{

	private int senha;
	
    public void setSenha(int senha) {
    	this.senha = senha;
    }
	public Gerente() {
	};
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	
	}
	
	public double getBonificacao() {
        System.out.println("Chamando o m�todo bonificacao do GERENTE");
        return super.getBonificacao() + super.getSalario();
    }
}
//--	public double getBonificacao() {
//--		return this.salario;
//--	}-->
	
	

