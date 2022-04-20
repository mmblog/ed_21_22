package com.jrb;

import java.util.ArrayList;

public class Main {
   static ArrayList<Carta> baraja = new ArrayList<>(40);
    public static void main(String[] args) {

        for(Palo p:Palo.values()){
            for(Numero n:Numero.values()){
                baraja.add(new Carta(p,n));
            }
        }
        System.out.println(baraja);

        for(int i= 0; i<5; i++){
            ArrayList<Carta> mano = pideMano(10);
            muestraMano(mano);
            devuelveMano();
        }
    }

    private static void devuelveMano(ArrayList<Carta> mano) {
        baraja.addAll(mano);
    }

    private static void muestraMano(ArrayList<Carta> mano) {
        for(Carta c:mano) System.out.println(c);

    }

    private static ArrayList<Carta> pideMano(int cantidad) {
        ArrayList<Carta> mano = new ArrayList<>(cantidad); //sabemos cuantas posiciones que tiene nuestro array por lo que podemos definirlo (cantidad)
        for(int i=0; i<cantidad; i++){
            int posicion = (int) (Math.random()* baraja.size());
            mano.add(baraja.remove(posicion)); //el método remove te devuelve el elemento eliminado
        }
        return mano;
    }
}
