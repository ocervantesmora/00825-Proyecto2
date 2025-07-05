/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/* UNED II Cuatrimestre
 * 00825 - Estructuras de datos
 * Proyecto 2: Sistema de gestión de celebraciones
 * Estudiante: Oscar Eduardo Cervantes Mora
 * Fecha: 2025-07-13
 * @author ocervantesmora
 */
public class Utils {
    public static boolean isNullOrWhiteSpace(String pString){
        // Esta función es una implementación manual del método del mismo nombre que existe en otros lenguajes como C#
        // Revisa si el string parámetro es null o si son solamente espacios en blanco
        return pString == null || pString.trim().isEmpty();
    }
}
