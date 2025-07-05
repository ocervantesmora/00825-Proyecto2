/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Articulo;

/**
 * UNED II Cuatrimestre
 * 00825 - Estructuras de datos
 * Proyecto 2: Sistema de gestión de tienda por departamentos
 * Estudiante: Oscar Eduardo Cervantes Mora
 * Fecha: 2025-07-13
 * @author ocervantesmorav
 */
public class ArticuloAD {
    private final Articulo[] articulos;
    private int contadorArticulos;
    
    public ArticuloAD(){
        this.articulos = new Articulo[20];
        this.contadorArticulos = 0;
    }
    
    public boolean guardarArticulo(Articulo pArticulo){
        if(contadorArticulos < articulos.length){
            articulos[contadorArticulos] = pArticulo;
            contadorArticulos++;
            return true;
        } else return false;
    }
    
    public Articulo[] consultarArticulos(){
        Articulo[] articulosRegistrados = new Articulo[contadorArticulos];
        for(int i = 0; i < contadorArticulos ; i++){
            articulosRegistrados[i] = articulos[i];
        }
        return articulosRegistrados;
    }
    
    public Articulo consultarPorId(int pId){
        for(int i = 0; i < contadorArticulos ; i++){
            if(articulos[i] != null && articulos[i].getId() == pId) return articulos[i];
        }
        return null;
    }
}
