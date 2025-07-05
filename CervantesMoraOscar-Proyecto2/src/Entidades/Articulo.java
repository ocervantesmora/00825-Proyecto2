/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *UNED II Cuatrimestre
 * 00825 - Estructuras de datos
 * Proyecto 2: Sistema de gestión de tienda por departamentos
 * Estudiante: Oscar Eduardo Cervantes Mora
 * Fecha: 2025-07-13
 * @author ocervantesmora
 */
public class Articulo {
    private static int siguienteId = 1;
    private int id;
    private String nombre;
    private String categoria;
    
    public Articulo(String pNombre, String pCategoria){
        this.id = siguienteId++;
        this.nombre = pNombre;
        this.categoria = pCategoria;
    }
    
    public int getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getCategoria(){
        return categoria;
    }
    
    public void setNombre(String pNombre){
        this.nombre = pNombre;
    }
    
    public void setCategoria(String pCategoria){
        this.categoria = pCategoria;
    }
}
