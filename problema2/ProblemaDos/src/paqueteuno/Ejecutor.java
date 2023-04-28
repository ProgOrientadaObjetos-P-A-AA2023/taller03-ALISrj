package paqueteuno;

import paquetedos.EquivalenteHora;

public class Ejecutor {

    public static void main(String[] args) {

        EquivalenteHora prueba1 = new EquivalenteHora();

        double horas = 13;    
        
        prueba1.establecerHoras(horas);
        prueba1.calcularMinutos();
        prueba1.calcularSegundos();
        prueba1.calcularDias();

        System.out.printf("""
                          Horas: %.2f
                          Minutos: %.2f
                          Segundos: %.2f
                          Días: %.2f
                          """, prueba1.obtenerHoras(),
                 prueba1.obtenerMinutos(),
                 prueba1.obtenerSegundos(),
                 prueba1.obtenerDias());

    }

}
