package entidades;

public abstract class Jogador {
	private String nome;
	protected Integer idade;
	protected Integer habilidade;
	private Integer gols = 0;
	private Integer camisa = 0;

	public Jogador(String nome, Integer idade, Integer habilidade) {
		this.nome = nome;
		this.idade = idade;
		this.habilidade = habilidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHabilidade() {
		return habilidade;
	}

	public Integer getGols() {
		return gols;
	}

	public Integer getCamisa() {
		return camisa;
	}

	public void setCamisa(Integer camisa) {
		this.camisa = camisa;
	}

	public Integer somaGol(int gol) {
		gol = 0;
		this.gols += gol++;
		return gols;
	}

}
