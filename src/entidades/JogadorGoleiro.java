package entidades;

public class JogadorGoleiro extends Jogador {
	private Integer reflexo;
	private Float altura;

	public JogadorGoleiro(String nome, Integer idade, Integer habilidade, Integer reflexo, Float altura) {
		super(nome, idade, habilidade);
		this.reflexo = reflexo;
		this.altura = altura;
	}

	@Override
	public Integer getHabilidade() {

		return ((getHabilidade() * 5) + (((int) (altura * 100) * 2)) + (reflexo * 3)) / 10;
	}

}
