package hospital;

public class Senha {
	
	private int senha;
	private String grauDePrioridade;
	
	
	public Senha(int senha, String grauDePrioridade) {
		super();
		this.senha = senha;
		this.grauDePrioridade = grauDePrioridade;
	}
	
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public String getGrauDePrioridade() {
		return grauDePrioridade;
	}
	public void setGrauDePrioridade(String grauDePrioridade) {
		this.grauDePrioridade = grauDePrioridade;
	}
	@Override
	public String toString() {
		return grauDePrioridade + "" + senha;
	}
	
	
}
