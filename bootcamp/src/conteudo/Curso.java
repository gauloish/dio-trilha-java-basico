package conteudo;

/**
 * Curso
 *
 */
public class Curso extends Conteudo {
    private int cargaHoraria;

    /**
     * Construtor de curso
     *
     * @param titulo Titulo do curso
     * @param descricao Descricao do curso
     * @param cargaHoraria Carga horaria do curso
     */
    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);

        this.cargaHoraria = cargaHoraria;
    } 

    /**
     * Calcula a pontuacao dada pelo curso
     *
     * @return Potuacao dada pelo curso
     */
    @Override
    public int calcularPontuacao() {
        return Conteudo.PONTUACAO_PADRAO * this.cargaHoraria;
    }

    /**
     * Obtem a carga horaria do curso
     *
     * @return Carga horaria do curso
     */
    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    /**
     * Sobrecarga de toString()
     *
     * @return Conversao de curso para String
     */
    @Override
    public String toString() {
        return (
            "Curso {" +
            "Título: '" + this.getTitulo() + "', " +
            "Descrição: '" + this.getDescricao() + "', " +
            "Carga Horária: " + this.getCargaHoraria() + "h}\n"
        );
    }
}
