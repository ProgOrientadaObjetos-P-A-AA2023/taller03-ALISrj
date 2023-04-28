package paqueteuno;

import paquetedos.Terreno;

public class Ejecutor {

    
    
    public static void main(String[] args) {
        
        Terreno pitas = new Terreno();
        
        double ancho = 20;
        double largo = 100;
        double valorMetroCuadrado = 12;
        
        // Establezco los valores necesarios para calcular el costo de terreno
        pitas.establecerAncho(ancho);
        pitas.establecerLargo(largo);
        pitas.establecerValorMetroCuadrado(valorMetroCuadrado);
        
        // Llamo a la funcion calcular area sin mandarle ningun argumento
        // que trabaja con los valores con los que ya cuenta el objeto
        
        pitas.calcularArea();
        pitas.calcularCostoTerreno();
        
        System.out.printf("""
                          Ancho del terreno: %.2f 
                          Largo del terreno: %.2f
                          Valor del metro cuadrado: $%.2f 
                          Area: del terreno: %.2f metros cuadrados
                          Costo del terreno: $%.2f
                          """,pitas.obtenerAncho()
                ,pitas.obtenerLargo()
                ,pitas.obtenerValorMetroCuadrado()
                ,pitas.obtenerArea()
                ,pitas.obtenerCostoTerreno());
        
    }
    
}
