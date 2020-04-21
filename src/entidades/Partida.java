package entidades;

import java.time.LocalDate;

public class Partida {
	@SuppressWarnings("unused")
	private LocalDate data = LocalDate.now();
	private Time timeCasa;
	private Time timeVisitante;
	private Integer placarCasa = 0;
	private Integer placarVisitante = 0;

	public Partida(LocalDate data, Time timeCasa, Time timeVisitante) {
		this.data = data;
		this.timeCasa = timeCasa;
		this.timeVisitante = timeVisitante;
	}

	public Time getTimeCasa() {
		return timeCasa;
	}

	public Time getTimeVisitante() {
		return timeVisitante;
	}

	public void golCasa(int gol) {
		gol = 0;
		placarCasa += gol++;

	}

	public void golVisitante(int gol) {
		gol = 0;
		placarVisitante += gol++;
	}

	public String placar() {
		return data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear() + "\n" + timeCasa.getNome()
				+ " " + placarCasa + " x " + timeVisitante.getNome() + " " + placarVisitante;
	}
}
