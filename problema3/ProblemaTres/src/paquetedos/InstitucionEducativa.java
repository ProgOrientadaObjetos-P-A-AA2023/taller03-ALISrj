/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;

/**
 *
 * @author Alexito
 */
public class InstitucionEducativa {
    
    private String nombre;
    private String tipo;
    private int numAlumnos;
    private int numDocentes;
    private int numSedes;
    private double gastoxEstudiante;
    private double presupuesto;
    
    
    // Métodos establecer 
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerTipo(String t){
        tipo = t;
    }
    
    public void establecerNumAlumnos(int n){
        numAlumnos = n;
    }
    
    public void establecerNumDocentes(int n){
        numDocentes = n;
    }
    
    public void establecerNumSedes(int n){
        numDocentes = n;
    }
    
    public void establecerGastoxEstudiante(double d){
        gastoxEstudiante = d;
    }
    
    public void calcularPresupuesto(){
        presupuesto = numAlumnos * gastoxEstudiante;
    }
    
    
    
    // Métodos obtener  
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipo(){
        return tipo;
    }
    
    public int obtenerNumAlumnos(){
        return numAlumnos;
    }
    
    public int obtenerNumDocentes(){
        return numDocentes;
    }
    
    public int obtenerNumSedes(){
        return numDocentes;
    }
    
    public double obtenerGastoxEstudiante(){
        return gastoxEstudiante;
    }
    
    public double establecerPresupuesto(){
        return presupuesto;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
}
