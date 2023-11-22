package org.example;

public class Quarto {
    private int numero;
    private boolean vago;

    public Quarto(int numero, boolean vago) {
        this.numero = numero;
        this.vago = vago;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isVago() {
        return vago;
    }

    public void setVago(boolean vago) {
        this.vago = vago;
    }
}
