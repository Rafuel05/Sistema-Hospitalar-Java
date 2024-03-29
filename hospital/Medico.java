package hospital;

public class Medico {
	private String nome;
	private int sala;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
	@Override
	public String toString() {
		return "Medico [nome=" + nome + ", sala=" + sala + "]";
	}
	public Medico(String nome, int sala) {
		super();
		this.nome = nome;
		this.sala = sala;
	}
}
