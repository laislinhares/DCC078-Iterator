package org.example;

public class Controle {

    public static Integer contarQuartosDisponiveis(Hotel hotel) {
        int quantidade = 0;
        for (Quarto quarto : hotel) {
            if (quarto.isVago()) {
                quantidade++;
            }
        }
        return quantidade;
    }
}
