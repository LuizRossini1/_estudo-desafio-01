package Superclasse;

public class Audio {
    //Variables
    private String titulo;
    private int duracaoEmSegundos;
    private int totalDeReproducoes;
    private int curtidas;
    private double classificacao;

    //Constructor
    public Audio(String titulo, int duracaoEmSegundos, int totalDeReproducoes, int curtidas, double classificacao) {
        this.titulo = titulo;
        this.duracaoEmSegundos = duracaoEmSegundos;
        this.totalDeReproducoes = totalDeReproducoes;
        this.curtidas = curtidas;
        this.classificacao = classificacao;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    //Methods
    public void curtir() {
        curtidas += curtidas;
    }

    public void reproduzir() {
        totalDeReproducoes += totalDeReproducoes;
    }

}