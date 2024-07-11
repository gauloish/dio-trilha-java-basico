package celular;

import componentes.AparelhoTelefonico;
import componentes.ReprodutorMusical;
import componentes.NavegadorInternet;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    /**
     * Inicia o iphone
     */
    public void iniciar() {
        System.out.println("Iniciando iphone.");
    }

    /**
     * Desliga o iphone
     */
    public void desligar() {
        System.out.println("Desligando iphone.");
    }

    /**
     * Toca a música atual
     */
    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    /**
     * Pausa a música atual
     */
    @Override
    public void pausar() {
        System.out.println("Pausando música.");
    }

    /**
     * Seleciona uma música específica
     *
     * @param musica Música a ser selecionada
     */
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    /**
     * Faz uma ligação para um número
     *
     * @param numero Número que se fará a ligação
     */
    @Override
    public void ligar(String numero) {
        System.out.println("Fazendo ligação para o número: " + numero);
    }

    /**
     * Atende uma ligação
     */
    @Override
    public void atender() {
        System.out.println("Atendendo ligação.");
    }

    /**
     * Inicia um correio de voz
     */
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando um correio de voz.");
    }

    /**
     * Exibe uma página web via url no navegador
     *
     * @param url Url da página a ser exibida
     */
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página web.");
    }

    /**
     * Adiciona uma nova aba no navegador
     */
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba.");
    }

    /**
     * Atualiza a página web
     */
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página web.");
    }
}
