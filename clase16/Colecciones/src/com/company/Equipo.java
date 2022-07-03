package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadores;

    public Equipo(String nombre)
    {
        this.nombre=nombre;
        jugadores= new ArrayList<>();
    }
    public void addJugador(Jugador nuevo)
    {
        jugadores.add(nuevo);
    }
    public void mostrarJugadoresTitulares()
    {
        ordenarJugadores();
        for(int i=0;i<jugadores.size();i++)
        {
            if ( jugadores.get(i).isTitular())
                System.out.println(jugadores.get(i).toString());

        }
    }
    public int cantidadJugadoresLesionados()
    {   int cantidad=0;
        for(Jugador j: jugadores)
        {
            if(j.isLesionado())
                cantidad++;
        }
        return cantidad;
    }
    public void jugadorLesionado(int nroCamiseta)
    {
        for( int i=0;i<jugadores.size();i++)
        {
            if (nroCamiseta==jugadores.get(i).getNroCamiseta())
                jugadores.get(i).setLesionado(true);
        }

    }
    private void ordenarJugadores()
    {
        for (int i=0; i<jugadores.size(); i++)
            for(int j=0; j<jugadores.size()-1;j++)
                if(jugadores.get(j).compareTo(jugadores.get(j+1))==1)
                {
                    Jugador aux=jugadores.get(j+1);
                    jugadores.set(j+1,jugadores.get(j));
                    //jugadores.get(j+1)= jugadores.get(j);
                   // jugadores.get(j)=aux;
                    jugadores.set(j,aux);
                }
    }
}
