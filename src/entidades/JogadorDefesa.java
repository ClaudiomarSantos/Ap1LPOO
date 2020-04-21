package entidades;

public class JogadorDefesa extends Jogador {
	private Integer cobertura;
	private Integer desarme;

	public JogadorDefesa(String nome, Integer idade, Integer habilidade, Integer cobertura, Integer desarme) {
		super(nome, idade, habilidade);
		this.cobertura = cobertura;
		this.desarme = desarme;
	}

	@Override
	public Integer getHabilidade() {

		return ((getHabilidade() * 5) + (cobertura * 3) + (desarme * 2)) / 10;
	}

}
