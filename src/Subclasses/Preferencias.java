package Subclasses;
import Superclasse.Audio;

public class Preferencias {
    public void inclui(Audio audio) {
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto!");
        } else {
            System.out.println(audio.getTitulo()+ " também é uma das mais tocadas!");
        }
    }
}