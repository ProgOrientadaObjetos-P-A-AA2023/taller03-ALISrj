package paquetedos;


public class EquipoCelular {
    
    private String so;
    private double tamanio;
    private double costoInicial;
    private int ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String dirMac;
    private String imei;
    
    
    // Métodos establecer 
    public void establecerSo(String n){
        so = n;
    }
    
    public void establecerTamanio(double d){
        tamanio = d;
    }
    
    public void establecerCostoInicial(double d){
        costoInicial = d;
    }
    
    public void establecerIvaPorcentaje(int d){
        ivaPorcentaje = d;
    }
    
    public void calcularIvaCostoInicial(){
        ivaCostoInicial = (ivaPorcentaje * costoInicial)/100;
    }
    
    public void calcularCostoFinal(){
        costoFinal = costoInicial + ivaCostoInicial;
    }
    
    public void establecerDirMac(String n){
        dirMac = n;
    }
    
    public void establecerIMEI(String n){
        imei = n;
    }
    
    // Métodos obtener  
    public String obtenerSo(){
        return so;
    }
    
    public double obtenerTamanio(){
        return tamanio;
    }
    
    public double obtenerCostoInicial(){
        return costoInicial;
    }
    
    public int obtenerIvaPorcentaje(){
        return ivaPorcentaje;
    }
    
    public double obtenerIvaCostoInicial(){
        return ivaCostoInicial;
    }
    
    public double obtenerCostoFinal(){
        return costoFinal;
    }
    
    public String obtenerDirMac(){
        return dirMac;
    }
    
    public String obtenerIMEI(){
        return imei;
    }
    
}
