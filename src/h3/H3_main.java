package h3;

public class H3_main {

	public static void main(String[] args) {
		int[][] einheiten = { { 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
		int input = 208;
		
		
		
		int inputcopy = input;

		for (int i = 0; i < einheiten[0].length; i++) {

			if (inputcopy / einheiten[0][i] > 0) {
				einheiten[1][i] = inputcopy / einheiten[0][i];
				inputcopy = inputcopy - (inputcopy / einheiten[0][i]) * einheiten[0][i];

			}

		}

	

		}

	}

