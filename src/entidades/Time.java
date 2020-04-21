package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Time {
	Scanner sc = new Scanner(System.in);

	private String nomeTime;
	private Integer vitorias = 0;
	private Integer derrotas = 0;
	private Integer empates = 0;

	private List<Jogador> jogadores = new ArrayList<>();

	public Time(String nome) {
		this.nomeTime = nome;
	}

	public String getNome() {
		return nomeTime;
	}

	public void inserirJogadores(String tipoJogador) {
		switch (tipoJogador.charAt(0)) {
		case 'g':
			System.out.print("nome: ");
			String nome = sc.nextLine();
			System.out.print("idade: ");
			int idade = sc.nextInt();
			System.out.print("habilidade: ");
			int habilidade = sc.nextInt();
			System.out.print("reflexo: ");
			int reflexo = sc.nextInt();
			System.out.print("altura: ");
			double altura = sc.nextFloat();
			System.out.println("camisa: ");
			int camisa = sc.nextInt();
			sc.nextLine();

			jogadores.add(new JogadorGoleiro(nome, idade, habilidade, camisa, reflexo, altura));
			break;
		case 'd':
			System.out.print("nome: ");
			nome = sc.nextLine();
			System.out.print("idade: ");
			idade = sc.nextInt();
			System.out.print("habilidade: ");
			habilidade = sc.nextInt();
			System.out.print("cobertura: ");
			int cobertura = sc.nextInt();
			System.out.print("desarme: ");
			int desarme = sc.nextInt();
			System.out.println("camisa: ");
			camisa = sc.nextInt();
			sc.nextLine();

			jogadores.add(new JogadorDefesa(nome, idade, habilidade, camisa, cobertura, desarme));
			break;
		case 'a':
			System.out.print("nome: ");
			nome = sc.nextLine();
			System.out.print("idade: ");
			idade = sc.nextInt();
			System.out.print("habilidade: ");
			habilidade = sc.nextInt();
			System.out.print("velocidade: ");
			int velocidade = sc.nextInt();
			System.out.print("tecnica: ");
			int tecnica = sc.nextInt();
			System.out.println("camisa: ");
			camisa = sc.nextInt();
			sc.nextLine();

			jogadores.add(new JogadorAtacante(nome, idade, habilidade, camisa, velocidade, tecnica));
			break;
		}
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public String getResultado() {
		return "Vitorias: " + vitorias + ", Empates: " + empates + ", Derrotas: " + derrotas + ".";

	}

	public void imprimeJogadores() {
		for (int i = 0; i < jogadores.size(); i++) {
			System.out.println(jogadores.get(i).toString());

		}
	}
}
