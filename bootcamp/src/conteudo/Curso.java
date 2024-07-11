package conteudo;

/**
 * Curso
 *
 */
public class Curso extends Conteudo {
    private int carga_horaria;

    /**
     * Construtor de curso
     *
     * @param titulo Titulo do curso
     * @param descricao Descricao do curso
     * @param carga_horaria Carga horaria do curso
     */
    public Curso(String titulo, String descricao, int carga_horaria) {
        super(titulo, descricao);

        this.carga_horaria = carga_horaria;
    } 

    /**
     * Calcula a pontuacao dada pelo curso
     *
     * @return Potuacao dada pelo curso
     */
    @Override
    public int calcularPontuacao() {
        return Conteudo.PONTO * this.carga_horaria;
    }

    /**
     * Obtem a carga horaria do curso
     *
     * @return Carga horaria do curso
     */
    public int getCargaHoraria() {
        return this.carga_horaria;
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
