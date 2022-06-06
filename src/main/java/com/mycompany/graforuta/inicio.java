/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graforuta;

import GrafosPkg.Departamentos.Departamento;
import GrafosPkg.Grafo;

import java.util.Arrays;

/**
 *
 * @author Ruldin Ayala
 */
public class inicio {
    
    public static void main(String[] args) {

          Grafo g = new Grafo(Departamento.DEPARTAMENTOS);

          //Grafo g = new Grafo("iabcdeft");


/*        g.agregarRuta('a','b', 3);
        g.agregarRuta('a','e', 6);
        g.agregarRuta('a','f',10);
        g.agregarRuta('b','c', 5);
        g.agregarRuta('b','e', 2);
        g.agregarRuta('c','d', 8);
        g.agregarRuta('c','e', 9);
        g.agregarRuta('c','f', 7);
        g.agregarRuta('d','f', 4);
        g.agregarRuta('e','f', 4);*/


/*
        Ejemplo ruta
        g.agregarRuta('i','a',9);
        g.agregarRuta('i','c',2);

        g.agregarRuta('a','d',1);

        g.agregarRuta('b','a',1);
        g.agregarRuta('b','d',7);
        g.agregarRuta('b','f',6);

        g.agregarRuta('c','b',1);
        g.agregarRuta('c','f',10);

        g.agregarRuta('d','e',2);
        g.agregarRuta('d','t',8);

        g.agregarRuta('e','t',9);

        g.agregarRuta('f','t',2);
        char inicio = 'i';
        char fin    = 't';
        */

        //Petén
        g.agregarRuta(Departamento.PETEN,Departamento.ALTA_VERAPAZ,147);
        g.agregarRuta(Departamento.PETEN,Departamento.IZABAL,327);

        //Alta Verapaz
        g.agregarRuta(Departamento.ALTA_VERAPAZ, Departamento.BAJA_VERAPAZ, 58);

        //Izabal
        g.agregarRuta(Departamento.IZABAL, Departamento.ZACAPA, 117);

        //Zacapa
        g.agregarRuta(Departamento.ZACAPA, Departamento.EL_PROGRESO, 71);
        g.agregarRuta(Departamento.ZACAPA, Departamento.CHIQUIMULA, 26);

        //Baja Verapaz
        g.agregarRuta(Departamento.BAJA_VERAPAZ, Departamento.EL_PROGRESO, 69);

        //El Progreso
        g.agregarRuta(Departamento.EL_PROGRESO, Departamento.GUATEMALA, 93);
        g.agregarRuta(Departamento.EL_PROGRESO, Departamento.JALAPA, 86);

        //Guatemala
        g.agregarRuta(Departamento.GUATEMALA, Departamento.CHIMALTENANGO, 56);
        g.agregarRuta(Departamento.GUATEMALA, Departamento.SACATEPEQUEZ, 43);
        g.agregarRuta(Departamento.GUATEMALA, Departamento.ESCUINTLA, 48);
        g.agregarRuta(Departamento.GUATEMALA, Departamento.SANTA_ROSA, 82);

        //Jalapa
        g.agregarRuta(Departamento.JALAPA, Departamento.JUTIAPA, 39);

        //Chiquimula
        g.agregarRuta(Departamento.CHIQUIMULA, Departamento.JUTIAPA, 72);

        //Jutiapa
        g.agregarRuta(Departamento.JUTIAPA, Departamento.SANTA_ROSA, 71);

        //Santa Rosa
        g.agregarRuta(Departamento.SANTA_ROSA, Departamento.ESCUINTLA, 86);

        //Escuintla
        g.agregarRuta(Departamento.ESCUINTLA, Departamento.SACATEPEQUEZ, 22);
        g.agregarRuta(Departamento.ESCUINTLA, Departamento.SUCHITEPEQUEZ, 95);

        //Sacatepequez
        g.agregarRuta(Departamento.SACATEPEQUEZ, Departamento.CHIMALTENANGO, 26);

        //Chimaltenango
        g.agregarRuta(Departamento.CHIMALTENANGO, Departamento.SOLOLA, 70);

        //Solola
        g.agregarRuta(Departamento.SOLOLA, Departamento.QUICHE, 158);
        g.agregarRuta(Departamento.SOLOLA, Departamento.TOTONICAPAN, 58);
        g.agregarRuta(Departamento.SOLOLA, Departamento.QUETZALTENANGO, 76);

        //Suchitepequez
        g.agregarRuta(Departamento.SUCHITEPEQUEZ, Departamento.RETALHUEU, 55);

        //Retalhueu
        g.agregarRuta(Departamento.RETALHUEU, Departamento.QUETZALTENANGO, 56);

        //Quetzaltenango
        g.agregarRuta(Departamento.QUETZALTENANGO, Departamento.SAN_MARCOS, 51);

        //San Marcos
        g.agregarRuta(Departamento.SAN_MARCOS, Departamento.HUEHUETENANGO, 105);


        char inicio = Departamento.PETEN;
        char fin = Departamento.CHIMALTENANGO;

        String respuesta = g.encontrarRutaMinimaDijkstra(inicio, fin);
        System.out.println(respuesta);
    }
}
