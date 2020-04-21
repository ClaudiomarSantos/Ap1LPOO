package entidades;

public class JogadorGoleiro extends Jogador {
	private Integer reflexo;
	private Double altura;

	public JogadorGoleiro(String nome, Integer idade, Integer habilidade, Integer camisa, Integer reflexo,
			Double altura) {
		super(nome, idade, habilidade, camisa);
		this.reflexo = reflexo;
		this.altura = altura;
	}

	public JogadorGoleiro(String nome, Integer idade, Integer habilidade, Integer reflexo, Double altura) {
		super(nome, idade, habilidade);
		this.reflexo = reflexo;
		this.altura = altura;
	}

	public Integer getReflexo() {
		return reflexo;
	}

	public Double getAltura() {
		return altura;
	}

	@Override
	public Integer getHabilidade() {

		return ((this.habilidade * 5) + (this.reflexo * 3)) / 10;
	}

	@Override
	public String toString() {
		return "nome: " + getNome() + ", idade: " + getIdade() + ", Habilidade: " + getHabilidade() + ", gols: "
				+ getGols() + ", Camisa: " + getCamisa() + ", Reflexo: " + getReflexo() + ", Altura: " + getAltura();
	}

}
