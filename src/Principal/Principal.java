package Principal;
import Subclasses.*;
import Superclasse.*;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica("Natural", 189, 623, 54,
                9, "Origins", "Dan Reynolds", "Pop rock");

        Podcast meuPodcast = new Podcast("ANA BEATRIZ BARBOSA - Inteligência Ltda. Podcast #689",
                13835, 10, 191, 9, "Rogério Vilela",
                "DR. ANA BEATRIZ BARBOSA é psiquiatra e escritora. Ana Beatriz escreveu vários livros sobre " +
                        "psiquiatria e o comportamento humano, incluindo \"Mentes Perigosas\". " +
                        "O Vilela não leu o livro, pois disse que está esperando sair o filme.");

        Preferencias minhasPreferencias = new Preferencias();

        for (int i = 0; i <= 1500 ; i++) {
            minhaMusica.curtir();
        }

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 500; i++) {
            meuPodcast.curtir();
        }

        System.out.println("Total de reproduções: " +minhaMusica.getTotalDeReproducoes());
        System.out.println("Total de curtidas: " +minhaMusica.getCurtidas());
        System.out.println("Classificação: " +minhaMusica.getClassificacao());

        System.out.println("****************");

        System.out.println("Total de reproduções: " +meuPodcast.getTotalDeReproducoes());
        System.out.println("Total de curtidas: " +meuPodcast.getCurtidas());
        System.out.println("Classificação: " +meuPodcast.getClassificacao());

        System.out.println("****************");

        minhasPreferencias.inclui(minhaMusica);
        minhasPreferencias.inclui(meuPodcast);
    }
}