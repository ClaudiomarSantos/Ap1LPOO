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

		// esse bloco de código é responsável por instanciar o objeto partida.
		// O mesmo tem no seu construtor a obrigatoriedade de instanciar dois objetos
		// Time.
		// (timeCasa e timeVisitante).
		// Os times são instanciados setando apenas os nomes dos times.

		Partida partida = new Partida(LocalDate.now(), new Time("Barcelona do Nordeste"),
				new Time("Real Madrid do Sertão"));

		// Esse bloco realiza a inserção dos jogadores na lista de jogadores do objeto
		// timeCasa.

		System.out.println("Inserir 5 jogadores para o time Barcelona do Nordeste: ");

		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite os Dados do Jogador " + i + ": ");
			System.out.println("Tipo de jogador: (goleiro/defesa/atacante)");
			partida.getTimeCasa().inserirJogadores(sc.nextLine());
			sc.nextLine();

		}

		// Esse bloco realiza a inserção dos jogadores na lista de jogadores do objeto
		// timeVisitante.

		System.out.println("Inserir 5 jogadores para o time Real Madrid do Sertão: ");

		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite os Dados do Jogador " + i + ": ");
			System.out.println("Tipo de jogador: (goleiro/defesa/atacante)");
			partida.getTimeVisitante().inserirJogadores(sc.nextLine());
			sc.nextLine();

		}

		System.out.println("Jogadores do Time Barcelona do Nordeste!!!");
		partida.getTimeCasa().imprimeJogadores();

		System.out.println();
		
		System.out.println("Jogadores do time Real Madrid do Sertão!!!");
		partida.getTimeVisitante().imprimeJogadores();
		
		System.out.println(partida.placar());

		// metodo que adiciona gols na partida.

		partida.golCasa();
		partida.golVisitante();
		partida.golVisitante();

		// placar da partida apos inserir gols aos times

		System.out.println(partida.placar());

		// metodo para acrescentar gols ao historico do jogador.

		partida.getTimeCasa().getJogadores().get(3).somaGol(1);
		partida.getTimeVisitante().getJogadores().get(4).somaGol(2);

		// status dos jogadores após partida.

		partida.getTimeCasa().imprimeJogadores();
		System.out.println();
		partida.getTimeVisitante().imprimeJogadores();

		sc.close();
	}

}
