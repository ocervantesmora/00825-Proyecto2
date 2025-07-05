/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

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
    private int id;
    private String nombre;
    private Articulo[] articulos;
    
    public Departamento(String pNombre){
        this.id = siguienteId++;
        this.nombre = pNombre;
        this.articulos = new Articulo[20];
    }
    
    public int getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Articulo[] getArticulos(){
        return articulos;
    }
    
    public void setNombre(String pNombre){
        this.nombre = pNombre;
    }
}
