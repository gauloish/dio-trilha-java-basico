package banco;

import java.util.ArrayList;
import java.util.List;

import conta.Conta;

/**
 * Banco
 */
public class Banco {
    private String nome;
    private List<Conta> contas;

    /**
     * Construtor de banco
     *
     * @param nome Nome do banco
     */
    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    /**
     * Nome do banco
     *
     * @return Nome do banco
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Contas do banco
     *
     * @return Contas do banco
     */
    public List<Conta> getContas() {
        return this.contas;
    }

    /**
     * Adiciona uma conta ao banco
     *
     * @param conta Conta a ser adicionada
     */
    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    /**
     * Sobrecarga de toString
     *
     * @return Conversão para String
     */
    @Override
    public String toString() {
        return this.nome + ": " +
            this.contas
            .stream()
            .map(Conta::getCliente)
            .toList()
            .toString();
    }
}
