package entidades;

public class JogadorDefesa extends Jogador {
	private Integer cobertura;
	private Integer desarme;

	
	
	public JogadorDefesa(String nome, Integer idade, Integer habilidade, Integer camisa,
			Integer cobertura, Integer desarme) {
		super(nome, idade, habilidade, camisa);
		this.cobertura = cobertura;
		this.desarme = desarme;
	}

	public JogadorDefesa(String nome, Integer idade, Integer habilidade, Integer cobertura, Integer desarme) {
		super(nome, idade, habilidade);
		this.cobertura = cobertura;
		this.desarme = desarme;
	}

	public Integer getCobertura() {
		return cobertura;
	}

	public Integer getDesarme() {
		return desarme;
	}

	@Override
	public Integer getHabilidade() {

		return ((this.habilidade * 5) + (this.cobertura * 3) + (this.desarme * 2)) / 10;
	}

	@Override
	public String toString() {
		return "nome: " + getNome() + ", idade: " + getIdade() + ", Habilidade: " + getHabilidade() + ", gols: " + getGols()
				+ ", Camisa: " + getCamisa() + ", Cobertura: " + getCobertura()+", Desarme: " + getDesarme();
	}

}
