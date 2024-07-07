import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static String nome = new String();
    public static String agencia = new String();
    public static int numero = 0;
    public static double saldo = 0.0;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("-- Conta Bancária --\n");

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        numero = scanner.nextInt(); scanner.nextLine();

        System.out.print("Digite o saldo da conta: ");
        saldo = scanner.nextDouble(); scanner.nextLine();

        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + String.valueOf(numero) + " e seu saldo " + String.valueOf(saldo) + " já está disponível para saque");

        scanner.close();
    }
}
