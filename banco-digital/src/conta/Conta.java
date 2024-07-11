package conta;

import cliente.Cliente;

/**
 * Conta
 */
public abstract class Conta implements IConta {
    private static final int AGENCIA = 1;
	private static int NUMERO = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
    protected Cliente cliente;

    /**
     * Contrutor para Conta
     *
     * @param cliente Cliente da conta
     */
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA;
        this.numero = Conta.NUMERO++;
        this.saldo = 0.0;
        this.cliente = cliente;
    }

    public abstract void imprimirExtrato();

    /**
     * Efetua o saque na conta
     *
     * @param valor Valor do saque
     * @throws ValorInvalidoException Caso o saque seja inválido
     * @throws throw new ValorInvalidoException("Valor de saque inválido."); Caso o valor do saque seja inválido
     * @throws throw new ValorInvalidoException("Saldo insuficiente."); Caso o saldo seja insuficiente
     */
    @Override
    public void sacar(double valor) throws ValorInvalidoException {
        if (valor < 0.0) {
            throw new ValorInvalidoException("Valor de saque inválido.");
        }
        else if (this.saldo < valor) {
            throw new ValorInvalidoException("Saldo insuficiente.");
        }
        else {
            this.saldo -= valor;
        }
    }

    /**
     * Efetua o depósito na conta
     *
     * @param valor Valor do depósito
     * @throws ValorInvalidoException Caso o depósito seja inválido
     * @throws throw new ValorInvalidoException("Valor de depósito inválido."); Caso o valor do depósito seja inválido
     */
    @Override
    public void depositar(double valor) throws ValorInvalidoException {
        if (valor < 0.0) {
            throw new ValorInvalidoException("Valor de depósito inválido.");
        }
        else {
            this.saldo += valor;
        }
    }

    /**
     * Efetua a transferência para outra conta
     *
     * @param contaDestino Conta que irá receber a transferência
     * @param valor Valor da transferência
     * @throws ValorInvalidoException Caso a transferência seja inválida
     */
    @Override
    public void transferir(IConta contaDestino, double valor) throws ValorInvalidoException {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    /**
     * Agência da conta
     *
     * @return Agência da conta
     */
    public int getAgencia() {
        return this.agencia;
    }

    /**
     * Número da conta
     *
     * @return Número da conta
     */
    public int getNumero() {
        return this.numero;
    }

    /**
     * Saldo da conta
     *
     * @return Saldo da conta
     */
    public double getSaldo() {
        return this.saldo;
    }

    /**
     * Cliente da conta
     *
     * @return Cliente da conta
     */
    public Cliente getCliente() {
        return this.cliente;
    }
}
