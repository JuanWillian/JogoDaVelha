package lpa;

import java.util.Scanner;

public class Jogodavelha {
	public static int troca(int player) {
		int resultado = 0;
		if (player == 1) {
			player = -1;
		} else if (player == -1) {
			player = 1;
		}
		resultado = player;
		return resultado;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jogar, troca, jogador, c = 3;
		int j = 0, i, l = 3;
		int opcao = 0, op = 0;
		int[][] x = new int[l][c];
		do {
			opcao = 0;
			System.out.println("1- Novo Jogo \n2- Instruções \n3- Sair");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("+-------------+");
				System.out.println("|Jogo da velha|");
				System.out.println("+_____________+");
				System.out.println("                ");
				int cont = 0;
				// MONTAR JOGO DA VELHA
				for (i = 0; i < x.length; i++) {
					for (j = 0; j < x.length; j++) {
						cont++;
						x[i][j] = cont;
					}
				}
				// MOSTRAR JOGO DA VELHA
				for (i = 0; i < l; i++) {
					for (j = 0; j < c; j++) {
						System.out.printf("%d|", x[i][j]);
					}
					System.out.println("");
				}
				int jogadas = 0;
				// BOLA JOGA
				do {
					System.out.println("Vez do O");
					System.out.println("Onde você quer jogar?");
					jogar = sc.nextInt();
					if (jogar > 0 && jogar < 10) {
						for (i = 0; i < x.length; i++) {
							for (j = 0; j < x.length; j++) {
								if (x[i][j] == jogar) {
									x[i][j] = 0;
								}
							}
						}
					} else {
						System.out.println("Digite um numero valido");
						break;
					}
					for (i = 0; i < l; i++) {
						for (j = 0; j < c; j++) {
							System.out.printf("%d|", x[i][j]);
						}
						System.out.println("");
					}

					// X JOGA

					System.out.println("Vez do X");
					System.out.println("Onde você quer jogar?");
					jogar = sc.nextInt();
					if (jogar > 0 && jogar < 10) {
						for (i = 0; i < x.length; i++) {
							for (j = 0; j < x.length; j++) {
								if (x[i][j] == jogar) {
									x[i][j] = 1;
								}
							}
						}
					} else {
						System.out.println("Digite um numero valido");
						break;
					}
					for (i = 0; i < l; i++) {
						for (j = 0; j < c; j++) {
							System.out.printf("%d|", x[i][j]);
						}
						System.out.println("");
					}

					// Aqui eu vou ver se ganhou ou nao para confirmar se vai terminar o jogo
					jogadas++;
				} while (jogadas < 4);
				break;

			case 2:
				System.out.println("Para escolher a posição, utilize os numeros a seguir:");
				System.out.println("1|2|3" + "\n4|5|6" + "\n7|8|9");
				break;
			}
		} while (opcao != 3);
		System.out.printf("\t\t\t    .oooooo.          .o.       ooo        ooooo oooooooooooo   \n");
		System.out.printf("\t\t\t   d8P'  `Y8b        .888.      `88.       .888' `888'     `8   \n");
		System.out.printf("\t\t\t  888               .8\"888.      888b     d'888   888           \n");
		System.out.printf("\t\t\t  888              .8' `888.     8 Y88. .P  888   888oooo8      \n");
		System.out.printf("\t\t\t  888     ooooo   .88ooo8888.    8  `888'   888   888    \"      \n");
		System.out.printf("\t\t\t  `88.    .88'   .8'     `888.   8    Y     888   888       o   \n");
		System.out.printf("\t\t\t   `Y8bood8P'   o88o     o8888o o8o        o888o o888ooooood8   \n\n\n");
		System.out.printf("\t\t\t       .oooooo.   oooooo     oooo oooooooooooo ooooooooo.       \n");
		System.out.printf("\t\t\t      d8P'  `Y8b   `888.     .8'  `888'     `8 `888   `Y88.     \n");
		System.out.printf("\t\t\t     888      888   `888.   .8'    888          888   .d88'     \n");
		System.out.printf("\t\t\t     888      888    `888. .8'     888oooo8     888ooo88P'      \n");
		System.out.printf("\t\t\t     888      888     `888.8'      888    \"     888`88b.        \n");
		System.out.printf("\t\t\t     `88b    d88'      `888'       888       o  888  `88b.      \n");
		System.out.printf("\t\t\t      `Y8bood8P'        `8'       o888ooooood8 o888o  o888o     \n\n");

	}

}
