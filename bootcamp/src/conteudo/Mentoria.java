package conteudo;

import java.time.LocalDate;

/**
 * Mentoria
 */
public class Mentoria extends Conteudo {
    private LocalDate data;

    /**
     * Contrutor de mentoria
     *
     * @param titulo Titulo da mentoria
     * @param descricao Descricao da mentoria
     * @param data Data da mentoria
     */
    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);

        this.data = data;
    }

    /**
     * Calcula a potuacao da mentoria
     *
     * @return Pontuacao da mentoria
     */
    @Override
    public int calcularPontuacao() {
        return 2 * Conteudo.PONTUACAO_PADRAO;
    }

    /**
     * Obtem a data da mentoria
     *
     * @return Data da mentoria
     */
    public LocalDate getData() {
        return this.data;
    }

    /**
     * Sobrecarga de toString()
     *
     * @return Conversao de mentoria para String
     */
    @Override
    public String toString() {
        return (
            "Mentoria {" +
            "Título: '" + this.getTitulo() + "', " +
            "Descrição: '" + this.getDescricao() + "', " +
            "Data: " + this.getData() + "}\n"
        );
    }
}
