/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import EstructurasDeDatos.Cola;

/**
 * UNED II Cuatrimestre
 * 00825 - Estructuras de datos
 * Proyecto 2: Sistema de gestión de tienda por departamentos
 * Estudiante: Oscar Eduardo Cervantes Mora
 * Fecha: 2025-07-13
 * @author ocervantesmora
 */
public class Departamento {
    private static int siguienteId = 1;
    private final int id;
    private String nombre;
    private final Cola articulos;
    private int siguienteArticuloId;
    
    public Departamento(String pNombre){
        this.id = siguienteId++;
        this.nombre = pNombre;
        this.articulos = new Cola(20);
        this.siguienteArticuloId = 1;
    }
    
    public int getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Cola getArticulos(){
        return articulos;
    }
    
    public void setNombre(String pNombre){
        this.nombre = pNombre;
    }
    
    public boolean agregarArticulo(String pNombre,String pCategoria){
        Articulo articulo = new Articulo(this.siguienteArticuloId,pNombre,pCategoria);
        boolean articuloAgregado = articulos.enqueue(articulo);
        if(articuloAgregado) siguienteArticuloId++;
        return articuloAgregado;
    }
    
    public Articulo removerArticulo(){
        return (Articulo) articulos.dequeue();
    }
    
    @Override
    public String toString(){
        return this.getId()+" - "+this.getNombre();
    }
}
