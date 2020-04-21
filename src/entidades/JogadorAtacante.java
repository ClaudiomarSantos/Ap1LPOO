package entidades;

public class JogadorAtacante extends Jogador {
	private Integer velocidade;
	private Integer tecnica;

	public JogadorAtacante(String nome, Integer idade, Integer habilidade, Integer camisa,
			Integer velocidade, Integer tecnica) {
		super(nome, idade, habilidade, camisa);
		this.velocidade = velocidade;
		this.tecnica = tecnica;
	}

	public JogadorAtacante(String nome, Integer idade, Integer habilidade, Integer velocidade, Integer tecnica) {
		super(nome, idade, habilidade);
		this.velocidade = velocidade;
		this.tecnica = tecnica;
	} 

	public Integer getVelocidade() {
		return velocidade;
	}

	public Integer getTecnica() {
		return tecnica;
	}

	@Override
	public Integer getHabilidade() {

		return ((this.habilidade * 5) + (this.velocidade * 2) + (this.tecnica * 3)) / 10;
	}

	@Override
	public String toString() {
		return "nome: " + getNome() + ", idade: " + getIdade() + ", Habilidade: " + getHabilidade() + ", gols: " + getGols()
				+ ", Camisa: " + getCamisa() + ", Velocidade: " + getVelocidade() + ", Técnica: " + getTecnica();
	}

}
