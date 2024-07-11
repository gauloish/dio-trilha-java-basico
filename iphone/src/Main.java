import celular.Iphone;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Métodos de ´ReprodutorMusical´\n");

        // Métodos de ´ReprodutorMusical´
        iphone.selecionarMusica("Flume - Hyperreal");
        iphone.tocar();
        iphone.pausar();

        System.out.println("\nMétodos de ´AparelhoTelefonico´\n");

        // Métodos de ´AparelhoTelefonico´
        iphone.ligar("(62) 98459-5071");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\nMétodos de ´NavegadorInternet´\n");

        // Métodos de ´NavegadorInternet´
        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://www.youtube.com/");
        iphone.atualizarPagina();
    }
}
