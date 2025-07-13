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
public class Cola {
    private Object[] elementos;
    private int inicio;
    private int fin;
    private int tamano;
    private static final int MAX_DEFAULT = 20;
    
    public Cola(){
        this(MAX_DEFAULT);
    }
    
    public Cola(int pTamano){
        this.elementos = new Object[pTamano+1];
        this.inicio = 0;
        this.fin = 0;
        this.tamano = 0;
    }
    
    public boolean enqueue(Object pElemento){
        if(isFull()) return false;
        elementos[fin] = pElemento;
        fin = (fin + 1) % elementos.length;
        tamano++;
        return true;
    }
    
    public Object dequeue(){
        if(isEmpty()) return null;
        Object elementoRemovido = elementos[inicio];
        elementos[inicio] = null;
        inicio = (inicio + 1) % elementos.length;
        tamano--;
        return elementoRemovido;
    }
    
    public Object peek(){
        if(isEmpty()) return null;
        return elementos[inicio];
    }
    
    public boolean isEmpty(){
        return tamano == 0;
    }
    
    public boolean isFull(){
        return tamano == (elementos.length - 1);
    }
    
    public int size(){
        return tamano;
    }
    
    public void clear(){
        for(int i = 0 ; i < elementos.length ; i++){
            elementos[i] = null;
        }
        inicio = 0;
        fin = 0;
        tamano = 0;
    }
    
    public Object[] toArray(){
        if(isEmpty()) return new Object[0];
        Object[] resultado = new Object[tamano];
        int j = 0;
        int actual = inicio;
        for(int i = 0 ; i < tamano ; i++){
            resultado[j++] = elementos[actual];
            actual = (actual + 1) % elementos.length;
        }
        return resultado;
    }
    
    @Override
    public String toString(){
        if(isEmpty()) return "Cola vacía";
        int actual = inicio;
        String cola = "Cola: [";
        for(int i = 0 ; i < tamano ; i++){
            cola = cola + elementos[actual];
            if(i < tamano - 1) cola = cola + ", ";
            actual = (actual + 1) % elementos.length;
        }
        cola = cola + "]";
        return cola;
    }
}
