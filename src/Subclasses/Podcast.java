package Subclasses;
import Superclasse.Audio;

public class Podcast extends Audio {
    //Mother class constructor
    public Podcast(String titulo, int duracaoEmSegundos, int totalDeReproducoes, int curtidas, double classificacao,
                   String apresentador, String descricao) {
        super(titulo, duracaoEmSegundos, totalDeReproducoes, curtidas, classificacao);
    }

    //Specific variables
    private String apresentador;
    private String descricao;

    //Override a method
    @Override
    public double getClassificacao() {
        if (getCurtidas() >= 500) {
            return setClassificacao(10);
        } else {
            return setClassificacao(7);
        }
    }
}