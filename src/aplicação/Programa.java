package aplicação;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import entidades.Partida;
import entidades.Time;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Partida partida = new Partida(LocalDate.now(), new Time("Barcelona do Nordeste"),
				new Time("Real Madrid do Sertão"));

		System.out.println("Inserir 5 jogadores para o time Barcelona do Nordeste: ");

		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite os Dados do Jogador " + i + ": ");
			partida.getTimeCasa().inserirJogadores(sc.nextLine());
			sc.nextLine();

		}

		System.out.println("Inserir 5 jogadores para o time Real Madrid do Sertão: ");

		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite os Dados do Jogador " + i + ": ");
			partida.getTimeVisitante().inserirJogadores(sc.nextLine());
			sc.nextLine();

		}

		sc.close();
	}

}
