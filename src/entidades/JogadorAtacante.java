package entidades;

public class JogadorAtacante extends Jogador {
	private Integer velocidade;
	private Integer tecnica;

	public JogadorAtacante(String nome, Integer idade, Integer habilidade, Integer velocidade, Integer tecnica) {
		super(nome, idade, habilidade);
		this.velocidade = velocidade;
		this.tecnica = tecnica;
	}

	@Override
	public Integer getHabilidade() {

		return ((getHabilidade() * 5) + (velocidade * 2) + (tecnica * 3)) / 10;
	}

}
