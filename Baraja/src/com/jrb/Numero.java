package com.jrb;

public enum Numero {
    AS("as",1), DOS("2",2), TRES("3",3), CUATRO("4",4), CINCO("5",5), SEIS("6",6),SIETE("7",7),
    SOTA("sota",10), CABALLO("caballo",11), REY("rey",12);

    final String texto;
    final int valor;

    Numero(String texto, int valor) {
        this.texto = texto;
        this.valor = valor;
    }


}
