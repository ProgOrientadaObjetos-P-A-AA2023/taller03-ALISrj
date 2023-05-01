package paqueteuno;

import paquetedos.InstitucionEducativa;

public class Ejecutor {

    public static void main(String[] args) {

        InstitucionEducativa calasanz = new InstitucionEducativa();
        InstitucionEducativa apc = new InstitucionEducativa();

        String nombre = "Calasanz";
        String tipo = "Fiscomosional";
        int numAlumnos = 450;
        int numDocentes = 50;
        int numSedes = 10;
        double gastoxEstudiante = 48;

        calasanz.establecerNombre(nombre);
        apc.establecerNombre("Antonio Peña Celi");
        
        calasanz.establecerTipo(tipo);
        apc.establecerTipo("Privado");
        
        calasanz.establecerNumAlumnos(numAlumnos);
        apc.establecerNumAlumnos(12301);
        
        calasanz.establecerNumDocentes(numDocentes);
        apc.establecerNumDocentes(1000);
        
        calasanz.establecerNumSedes(numSedes);
        apc.establecerNumSedes(21);
        
        calasanz.establecerGastoxEstudiante(gastoxEstudiante);
        apc.establecerGastoxEstudiante(200);
        
        calasanz.calcularPresupuesto();
        apc.calcularPresupuesto();

        System.out.printf("""
                          %s
                          Tipo: %s
                          Número de alumnos: %s
                          Número de docentes: %d
                          Número de sedes: %d
                          Gasto por estudiante: %.2f
                          Presupuesto: %.2f
                          --------------------------------------------------
                          %s
                          Tipo: %s
                          Número de alumnos: %s
                          Número de docentes: %d
                          Número de sedes: %d
                          Gasto por estudiante: %.2f
                          Presupuesto: %.2f
                          """,
                 calasanz.obtenerNombre(),
                 calasanz.obtenerTipo(),
                 calasanz.obtenerNumAlumnos(),
                 calasanz.obtenerNumDocentes(),
                 calasanz.obtenerNumSedes(),
                 calasanz.obtenerGastoxEstudiante(),
                 calasanz.obtenerPresupuesto(),
                 apc.obtenerNombre(),
                 apc.obtenerTipo(),
                 apc.obtenerNumAlumnos(),
                 apc.obtenerNumDocentes(),
                 apc.obtenerNumSedes(),
                 apc.obtenerGastoxEstudiante(),
                 apc.obtenerPresupuesto()
                 );

    }

}
