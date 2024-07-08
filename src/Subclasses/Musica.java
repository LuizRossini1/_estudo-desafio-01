package Subclasses;
import Superclasse.Audio;

public class Musica extends Audio {
    //Mother class constructor
    public Musica(String titulo, int duracaoEmSegundos, int totalDeReproducoes, int curtidas, double classificacao,
        String album, String cantor, String genero) {
        super(titulo, duracaoEmSegundos, totalDeReproducoes, curtidas, classificacao);
    }

    //Specific variables
    private String album;
    private String cantor;
    private String genero;

}