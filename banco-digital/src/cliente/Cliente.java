package cliente;

/**
 * Cliente
 */
public class Cliente {
    private String nome;

    /**
     * Contrutor de cliente
     *
     * @param nome Nome do cliente
     */
    public Cliente(String nome) {
        this.nome = nome;
    }

    /**
     * Nome do Cliente
     *
     * @return Nome do cliente
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Sobrecarga de toString
     *
     * @return Conversão para String
     */
    @Override
    public String toString() {
        return this.nome;
    }
}
