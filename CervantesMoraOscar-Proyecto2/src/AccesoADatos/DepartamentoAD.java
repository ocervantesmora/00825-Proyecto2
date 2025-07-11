/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Departamento;
import EstructurasDeDatos.Pila;

/**
 * UNED II Cuatrimestre
 * 00825 - Estructuras de datos
 * Proyecto 2: Sistema de gestión de tienda por departamentos
 * Estudiante: Oscar Eduardo Cervantes Mora
 * Fecha: 2025-07-13
 * @author ocervantesmora
 */
public class DepartamentoAD {
    private static final Pila departamentos;
    static{
        departamentos = new Pila(20);
    }
    public DepartamentoAD(){
    }
    
    public static boolean guardarDepartamento(Departamento pDepartamento){
        return departamentos.push(pDepartamento);
    }
    
    public static Departamento[] consultarDepartamentos(){
        Object[] objetosPila = departamentos.toArray();
        
        Departamento[] departamentosRegistrados = new Departamento[objetosPila.length];
        for(int i = 0; i < objetosPila.length ; i++){
            departamentosRegistrados[i] = (Departamento) objetosPila[i];
        }
        return departamentosRegistrados;
    }
    
    public static int getCantidadDepartamentos() {
        return departamentos.size();
    }
    
    public static Departamento sacarDepartamento(){
        return (Departamento) departamentos.pop();
    }
    
    public static Departamento consultarPorId(int pId){
        Departamento[] todosLosDepartamentos = consultarDepartamentos();
        for(int i = 0 ; i < todosLosDepartamentos.length ; i++){
            if(todosLosDepartamentos[i] != null && todosLosDepartamentos[i].getId() == pId) return todosLosDepartamentos[i];
        }
        return null;
    }

}
