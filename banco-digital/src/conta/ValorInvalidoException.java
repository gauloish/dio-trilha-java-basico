package conta;

/**
 * ValorInvalidoException
 */
public class ValorInvalidoException extends RuntimeException {
    /**
     * Construtor da exceção de valor inválido
     *
     * @param menssagem Mensagem da exceção
     */
    public ValorInvalidoException(String menssagem) {
        super(menssagem);
    }
}
