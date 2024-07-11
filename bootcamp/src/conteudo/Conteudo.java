package conteudo;

/**
 * Conteudo
 *
 */
public abstract class Conteudo {
    protected static final int PONTUACAO_PADRAO = 10;

    private String titulo;
    private String descricao;

    /**
     * Construtor de conteudo
     *
     * @param titulo Titulo do conteudo
     * @param descricao Descricao do conteudo
     */
    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public abstract int calcularPontuacao();

    /**
     * Obtem o titulo do conteudo
     *
     * @return Titulo do conteudo
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Obtem a descricao do conteudo
     *
     * @return Descricao do conteudo
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * Define o titulo do conteudo
     *
     * @param titulo Titulo do conteudo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Define a descricao do conteudo
     *
     * @param descricao Descricao do conteudo
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
