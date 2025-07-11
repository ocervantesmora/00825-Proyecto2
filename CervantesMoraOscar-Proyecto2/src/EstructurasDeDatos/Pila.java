/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasDeDatos;

/**
 * UNED II Cuatrimestre
 * 00825 - Estructuras de datos
 * Proyecto 2: Sistema de gestión de tienda por departamentos
 * Estudiante: Oscar Eduardo Cervantes Mora
 * Fecha: 2025-07-13
 * @author ocervantesmora
 */
public class Pila {
    private Object[] elementos;
    private int tope;
    private static final int MAX_DEFAULT = 20;
    
    public Pila(){
        this(MAX_DEFAULT);
    }
    
    public Pila(int pTamano){
        this.elementos = new Object[pTamano];
        this.tope = -1;
    }
    
    public boolean push(Object pElemento){
        if(isFull()) return false;
        tope++;
        elementos[tope] = pElemento;
        return true;
    }
    
    public Object pop(){
        if(isEmpty()) return null;
        Object elementoRemovido = elementos[tope];
        tope--;
        return elementoRemovido;
    }
    
    public Object peek(){
        if(isEmpty()) return null;
        return elementos[tope];
    }
    
    public boolean isEmpty(){
        return tope == -1;
    }
    
    public boolean isFull(){
        return tope == elementos.length - 1;
    }
    
    public int size(){
        return tope + 1 ;
    }
    
    public void clear(){
        for(int i = 0 ; i <= tope ; i++){
            elementos[i] = null;
        }
        tope = -1;
    }
    
    public Object[] toArray(){
        if(isEmpty()) return new Object[0];
        Object[] resultado = new Object[size()];
        System.arraycopy(elementos, 0, resultado, 0, size());
        return resultado;
    }
}
