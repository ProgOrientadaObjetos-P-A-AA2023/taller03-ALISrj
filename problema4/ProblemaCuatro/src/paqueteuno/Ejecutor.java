package paqueteuno;

import paquetedos.EquipoCelular;

public class Ejecutor {

    public static void main(String[] args) {

        EquipoCelular ag33 = new EquipoCelular();
        
        String so = "Android" ;
        double tamanio = 7;
        double costoInicial = 324;
        int ivaPorcentaje = 12;
        String dirMac = "00-1B-77-70-32";
        String imei = "862139812998231";

        ag33.establecerSo(so);
        ag33.establecerTamanio(tamanio);
        ag33.establecerCostoInicial(costoInicial);
        ag33.establecerIvaPorcentaje(ivaPorcentaje);
        ag33.calcularIvaCostoInicial();
        ag33.calcularCostoFinal();
        ag33.establecerDirMac(dirMac);
        ag33.establecerIMEI(imei);
        
        System.out.printf("""
                          Sistema Operativo: %s
                          Tamaño en pulgadas: %.2f
                          Dirección Mac: %s
                          IMEI: %s
                          Costo inicial: %.2f
                          Iva en porcentaje: %d
                          Iva del Costo Inicial: %.2f
                          CostoFinal: %.2f
                          
                          """
                , ag33.obtenerSo()
                , ag33.obtenerTamanio()
                , ag33.obtenerDirMac()
                , ag33.obtenerIMEI()
                , ag33.obtenerCostoInicial()
                , ag33.obtenerIvaPorcentaje()
                , ag33.obtenerIvaCostoInicial()
                , ag33.obtenerCostoFinal());
        
        
}

}
