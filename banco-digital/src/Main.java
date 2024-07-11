import banco.*;
import cliente.*;
import conta.*;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Cliente ana = new Cliente("Ana");
        Cliente pedro = new Cliente("Pedro");

        Conta conta_ana = new ContaCorrente(ana);
        Conta conta_pedro = new ContaPoupanca(pedro);

        conta_ana.depositar(1000.0);
        conta_ana.sacar(375.0);

        conta_pedro.depositar(2000.0);
        conta_pedro.sacar(680.0);

        conta_pedro.imprimirExtrato(); System.out.println();
        conta_ana.imprimirExtrato(); System.out.println();

        conta_pedro.transferir(conta_ana, 200);

        conta_pedro.imprimirExtrato(); System.out.println();
        conta_ana.imprimirExtrato(); System.out.println();

        Banco banco = new Banco("NoBanco");

        banco.adicionarConta(conta_ana);
        banco.adicionarConta(conta_pedro);

        System.out.println(banco);
    }
}
