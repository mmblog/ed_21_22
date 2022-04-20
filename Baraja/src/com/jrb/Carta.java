package com.jrb;

public class Carta {
    Palo palo;
    Numero numero;

    public Carta(Palo palo, Numero numero) {
        this.palo = palo;
        this.numero = numero;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(numero.texto);
        sb.append(" de ").append(palo);
        return sb.toString();
    }
}
