package paquetedos;


public class Terreno {
    private double costoTerreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    
    // Métodos establecer 
    public void calcularCostoTerreno(){
        costoTerreno = area * valorMetroCuadrado;
    }
    
    public void establecerAncho(double c){
        ancho = c;
    }
    
    public void establecerLargo(double c){
        largo = c;
    }
    
    public void calcularArea(){
        area = ancho * largo;
    }
    
    public void establecerValorMetroCuadrado(double c){
        valorMetroCuadrado = c;
    }
    
    // Métodos obtener  
    public double obtenerAncho(){
        return ancho;
    }
    
    public double obtenerLargo(){
        return largo;
    }
    
    public double obtenerArea(){
        return area;
    }
    
    public double obtenerValorMetroCuadrado(){
        return valorMetroCuadrado;
    }
    
    public double obtenerCostoTerreno(){
        return costoTerreno;
    }
}
