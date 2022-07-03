package com.company;

public class Main {

    public static void main(String[] args) {
        Equipo equipo= new Equipo("C7");

        equipo.addJugador(new Jugador(32,"Almendra", true));
        equipo.addJugador(new Jugador(7,"Francy", true));
        equipo.addJugador(new Jugador(13, "Ale", true));
        equipo.addJugador(new Jugador(4,"Yes", true));
        equipo.mostrarJugadoresTitulares();
        equipo.jugadorLesionado(32);
        System.out.println(equipo.cantidadJugadoresLesionados());
    }
}
