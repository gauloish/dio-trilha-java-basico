package aluno;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import bootcamp.Bootcamp;
import conteudo.Conteudo;

/**
 * Aluno
 */
public class Aluno {
    private String nome;
    private Set<Conteudo> conteudosInscritos;
    private Set<Conteudo> conteudosConcluidos;

    /**
     * Construtor de aluno
     *
     * @param nome Nome do aluno
     */
    public Aluno(String nome) {
        this.nome = nome;

        this.conteudosInscritos = new LinkedHashSet<>();
        this.conteudosConcluidos = new LinkedHashSet<>();
    }

    /**
     * Increve o aluno no bootcamp
     *
     * @param bootcamp Bootcamp onde o aluno será inscrito
     */
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getAlunos().add(this);
    }

    /**
     * Progredir no bootcamp
     */
    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();

        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }
        else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    /**
     * Calcula a potuação do aluno
     *
     * @return Pontuação do aluno
     */
    public int calcularPontuacao() {
        return this.conteudosConcluidos
            .stream()
            .mapToInt(Conteudo::calcularPontuacao)
            .sum();
    }


    /**
     * Obtem o nome do aluno
     *
     * @return Nome do aluno
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Obtem os conteudos em que o aluno está inscrito
     *
     * @return Conteudos em que o aluno esta inscrito
     */
    public Set<Conteudo> getConteudosInscritos() {
        return this.conteudosInscritos;
    }

    /**
     * Obtem os conteudos que o aluno concluiu
     *
     * @return Conteudos que o aluno concluiu
     */
    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    /**
     * Sobrecarga de equals
     *
     * @param outro Outro objeto
     * @return Se os objetos são iguais
     */
    @Override
    public boolean equals(Object outro) {
        if (outro == null) {
            return false;
        }
        if (this.getClass() != outro.getClass()) {
            return false;
        }

        Aluno aluno = (Aluno) outro;

        return (
            Objects.equals(this.nome, aluno.nome) &&
            Objects.equals(this.conteudosInscritos, aluno.conteudosInscritos) &&
            Objects.equals(this.conteudosConcluidos, aluno.conteudosConcluidos)
        );
    }

    /**
     * Sobrecarga de hashCode
     *
     * @return O hash code do aluno
     */
    @Override
    public int hashCode() {
        return Objects.hash(
            this.nome,
            this.conteudosInscritos,
            this.conteudosConcluidos
        );
    }

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}
}
