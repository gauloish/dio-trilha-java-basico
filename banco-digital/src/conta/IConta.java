package conta;

/**
 * IConta
 */
public interface IConta {
    void sacar(double valor) throws ValorInvalidoException;
    void depositar(double valor) throws ValorInvalidoException;
    void transferir(IConta contaDestino, double valor) throws ValorInvalidoException;
}
