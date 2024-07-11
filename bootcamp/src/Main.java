import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import aluno.Aluno;
import bootcamp.Bootcamp;
import conteudo.Conteudo;
import conteudo.Curso;
import conteudo.Mentoria;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp("Java Back-End", "Bootcamp de Java para Back-End", 45);

        Curso java = new Curso("Introdução ao Java", "Introdução ao Java", 5);
        Curso poo = new Curso("Programação Orientada a Objetos", "Programação Orientada a Objetos", 6);
        Curso sql = new Curso("Banco de Dados SQL", "Banco de Dados SQL", 3);
        Curso spring = new Curso("Spring e Spring Boot", "Spring e Spring Boot", 4);

        Mentoria praticas = new Mentoria("Práticas Ágeis", "Práticas Ágeis", LocalDate.now());

        Aluno aluno = new Aluno("Matheus");

        List<Conteudo> conteudos = new ArrayList<>();

        conteudos.add(java);
        conteudos.add(poo);
        conteudos.add(sql);
        conteudos.add(spring);
        conteudos.add(praticas);

        bootcamp.getConteudos().addAll(conteudos);

        aluno.inscreverBootcamp(bootcamp);

        aluno.progredir();
        aluno.progredir();
        aluno.progredir();
        aluno.progredir();
        aluno.progredir();

        System.out.println("Pontuação: " + aluno.calcularPontuacao());
    }
}
