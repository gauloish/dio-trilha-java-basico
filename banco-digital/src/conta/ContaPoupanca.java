package conta;

import cliente.Cliente;

/**
 * Conta Poupanca
 */
public class ContaPoupanca extends Conta {
    /**
     * Construtor de conta poupanca
     *
     * @param cliente Cliente da conta
     */
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    /**
     * Imprime o extrato bancário
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("----- Extrato Bancário Conta Poupança -----");
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agência: " + this.getAgencia());
        System.out.println("Número: " + this.getNumero());
        System.out.println("Saldo: R$" + this.getSaldo());
    }
}
