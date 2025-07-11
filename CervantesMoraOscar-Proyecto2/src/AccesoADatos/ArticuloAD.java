/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Articulo;
import EstructurasDeDatos.Cola;

/**
 * UNED II Cuatrimestre
 * 00825 - Estructuras de datos
 * Proyecto 2: Sistema de gestión de tienda por departamentos
 * Estudiante: Oscar Eduardo Cervantes Mora
 * Fecha: 2025-07-13
 * @author ocervantesmorav
 */
public class ArticuloAD {
    private Cola articulos;
    
    public ArticuloAD(){
        this.articulos = new Cola(20);
    }
    
    public  boolean guardarArticulo(Articulo pArticulo){
        return articulos.enqueue(pArticulo);
    }
    
    public  Articulo[] consultarArticulos(){
        Object[] objetosCola = articulos.toArray();
        
        Articulo[] articulosRegistrados = new Articulo[objetosCola.length];
        for(int i = 0; i < objetosCola.length ; i++){
            articulosRegistrados[i] = (Articulo) objetosCola[i];
        }
        return articulosRegistrados;
    }
    
    public int getCantidadArticulos() {
        return articulos.size();
    }
    
    public Articulo sacarArticulo(){
        return (Articulo) articulos.dequeue();
    }
}
