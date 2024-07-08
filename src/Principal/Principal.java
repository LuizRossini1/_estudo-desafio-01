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

        for (int i = 0; i <= 1500 ; i++) {
            minhaMusica.curtir();
        }

        for (int i = 0; i < 5000; i++) {
            minhaMusica.reproduzir();
        }

        System.out.println(minhaMusica.getTotalDeReproducoes());
        System.out.println(minhaMusica.getCurtidas());
    }
}