/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buscar;

/**
 *
 * @author ALBA
 */

public abstract class Busqueda implements Buscar {
    public int id;
    public String titulo;
    public String descripcion;
    public String unidadesdisponibles;
    public String buscar;
    
        public Busqueda (){
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this. unidadesdisponibles= unidadesdisponibles;
        this.buscar=buscar;
    }

    public Busqueda (String titulo, String tipo)throws Exception{
        titulo="romeo y julieta"";
        tipo="novela";
    }    }


