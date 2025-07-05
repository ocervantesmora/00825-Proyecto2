/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Departamento;

/**
 * UNED II Cuatrimestre
 * 00825 - Estructuras de datos
 * Proyecto 2: Sistema de gestión de tienda por departamentos
 * Estudiante: Oscar Eduardo Cervantes Mora
 * Fecha: 2025-07-13
 * @author ocervantesmora
 */
public class DepartamentoAD {
    private static Departamento[] departamentos = new Departamento[20];
    private static int contadorDepartamentos = 0;
    
    public DepartamentoAD(){
    }
    
    public static boolean guardarDepartamento(Departamento pDepartamento){
        if(contadorDepartamentos < departamentos.length){
            departamentos[contadorDepartamentos] = pDepartamento;
            contadorDepartamentos++;
            return true;
        } else return false;
    }
    
    public static Departamento[] consultarDepartamentos(){
        Departamento[] departamentosRegistrados = new Departamento[contadorDepartamentos];
        for(int i = 0; i < contadorDepartamentos ; i++){
            departamentosRegistrados[i] = departamentos[i];
        }
        return departamentosRegistrados;
    }
    
    public static Departamento consultarPortId(int pId){
        for(int i = 0; i < contadorDepartamentos; i++){
            if(departamentos[i] != null && departamentos[i].getId() == pId) return departamentos[i];
        }
        return null;
    }
}
