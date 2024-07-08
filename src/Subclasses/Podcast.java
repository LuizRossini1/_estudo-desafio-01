package Subclasses;
import Superclasse.Audio;

public class Podcast extends Audio {
    //Mother class constructor
    public Podcast(String titulo, int duracaoEmSegundos, int totalDeReproducoes, int curtidas, double classificacao) {
        super(titulo, duracaoEmSegundos, totalDeReproducoes, curtidas, classificacao);
    }

    //Specific variables
    private String apresentador;
    private String descricao;

}