package conta;

import cliente.Cliente;

/**
 * Conta Corrente
 */
public class ContaCorrente extends Conta {
    /**
     * Construtor de conta corrente
     *
     * @param cliente Cliente da conta
     */
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    /**
     * Imprime o extrato bancário
     */
    @Override
    public void imprimirExtrato() {
        System.out.println("----- Extrato Bancário Conta Corrente ----");
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agência: " + this.getAgencia());
        System.out.println("Número: " + this.getNumero());
        System.out.println("Saldo: R$" + this.getSaldo());
    }
}
