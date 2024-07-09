import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException exception) {
			System.out.println("Erro: " + exception.getMessage());
		} finally {
            terminal.close();
        }
	}

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		int contagem = parametroDois - parametroUm;

        if (contagem >= 0) {
            for (int numero = 1; numero <= contagem; numero++) {
                System.out.printf("Imprimindo o número %d\n", numero);
            }
        }
        else {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }
	}
}
