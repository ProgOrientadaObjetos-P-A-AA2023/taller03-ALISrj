package paqueteuno;

import paquetedos.EquipoCelular;

public class Ejecutor {

    public static void main(String[] args) {

        EquipoCelular ag33 = new EquipoCelular();
        EquipoCelular sma22 = new EquipoCelular();
        
        
        String so = "Android" ;
        double tamanio = 7;
        double costoInicial = 324;
        int ivaPorcentaje = 12;
        String dirMac = "00-1B-77-70-32";
        String imei = "862139812998231";
                
        ag33.establecerSo(so);
        sma22.establecerSo("Apple");
        
        ag33.establecerTamanio(tamanio);
        sma22.establecerTamanio(10);
        
        ag33.establecerCostoInicial(costoInicial);
        sma22.establecerCostoInicial(500);
        
        ag33.establecerIvaPorcentaje(ivaPorcentaje);
        sma22.establecerIvaPorcentaje(10);
        
        ag33.calcularIvaCostoInicial();
        sma22.calcularIvaCostoInicial();
        
        ag33.calcularCostoFinal();
        sma22.calcularCostoFinal();
        
        ag33.establecerDirMac(dirMac);
        sma22.establecerDirMac("10-9A-69-13-42");
        
        ag33.establecerIMEI(imei);
        sma22.establecerIMEI("862213212998231");
        
        System.out.printf("""
                          Sistema Operativo: %s
                          Tamaño en pulgadas: %.2f
                          Dirección Mac: %s
                          IMEI: %s
                          Costo inicial: %.2f
                          Iva en porcentaje: %d
                          Iva del Costo Inicial: %.2f
                          CostoFinal: %.2f
                          -----------------------------------------------------
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
                , ag33.obtenerCostoFinal()
                , sma22.obtenerSo()
                , sma22.obtenerTamanio()
                , sma22.obtenerDirMac()
                , sma22.obtenerIMEI()
                , sma22.obtenerCostoInicial()
                , sma22.obtenerIvaPorcentaje()
                , sma22.obtenerIvaCostoInicial()
                , sma22.obtenerCostoFinal());
        
        
}

}
