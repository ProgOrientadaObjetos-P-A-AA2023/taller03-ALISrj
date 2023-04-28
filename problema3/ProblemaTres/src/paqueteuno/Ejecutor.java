package paqueteuno;

import paquetedos.InstitucionEducativa;

public class Ejecutor {

    public static void main(String[] args) {

        InstitucionEducativa calasanz = new InstitucionEducativa();

        String nombre = "Calasanz";
        String tipo = "Fiscomosional";
        int numAlumnos = 1000;
        int numDocentes = 50;
        int numSedes = 140;
        double gastoxEstudiante = 100;

        calasanz.establecerNombre(nombre);
        calasanz.establecerTipo(tipo);
        calasanz.establecerNumAlumnos(numAlumnos);
        calasanz.establecerNumDocentes(numDocentes);
        calasanz.establecerNumSedes(numSedes);
        calasanz.establecerGastoxEstudiante(gastoxEstudiante);
        calasanz.calcularPresupuesto();

        System.out.printf("""
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
                 calasanz.obtenerPresupuesto());

    }

}
