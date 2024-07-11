package bootcamp;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import aluno.Aluno;
import conteudo.Conteudo;

/**
 * Bootcamp
 */
public class Bootcamp {
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Set<Aluno> alunos;
    private Set<Conteudo> conteudos;

    /**
     * Construtor de bootcamp
     *
     * @param nome Nome do bootcamp
     * @param descricao Descricao do bootcamp
     * @param duracao Duracao do bootcamp em dias
     */
    public Bootcamp(String nome, String descricao, int duracao) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = LocalDate.now();
        this.dataFim = this.dataInicio.plusDays(duracao);
        this.alunos = new HashSet<>();
        this.conteudos = new LinkedHashSet<>();
    }

    /**
     * Obtem o nome do bootcamp
     *
     * @return Nome do bootcamp
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Obtem a descricao do bootcamp
     *
     * @return Descricao do bootcamp
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * Obtem a data de inicio do bootcamp
     *
     * @return Data de inicio do bootcamp
     */
    public LocalDate getDataInicio() {
        return this.dataInicio;
    }

    /**
     * Obtem a data do fim do bootcamp
     *
     * @return Data do fim do bootcamp
     */
    public LocalDate getDataFim() {
        return this.dataFim;
    }

    /**
     * Obtem os alunos do bootcamp
     *
     * @return Alunos do bootcamp
     */
    public Set<Aluno> getAlunos() {
        return this.alunos;
    }

    /**
     * Obtem os conteudos do bootcamp
     *
     * @return Conteudos do bootcamp
     */
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }
}
