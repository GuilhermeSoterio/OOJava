package model;

public class MainFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Nico");
		funcionario.setCpf("25451241-35");
		funcionario.setSalario(2600.00);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getBonificacao());
		

	}

}
