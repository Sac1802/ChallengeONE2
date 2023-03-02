package Temperatura;

/**
 *
 * @author Acost
 */
public class Temperatura {
    
    public double GradoaFaremheit(double valorTemperatura){
        double total = valorTemperatura * 9/5 + 32;
        return total;
    }
    
    public double FaremheitaCelcius(double valorTemperatura){
        double total = (valorTemperatura - 32) * 5/9; 
        return total;
    }
    
    public double KelvinaCelcius(double valorTemperatura){
        double total = Math.round((valorTemperatura - 273.15) *100.0)/100.0;
        return total;
    }
    
    public double CelsiusaKelvin(double valorTemperatura){
        double total = valorTemperatura + 273.15;
        return total;
    }
    
    public double KelvinaFremheit(double valorTemperatura){
        double total = Math.round(((valorTemperatura * 9/5) - 459.67) * 100.0)/100.0;
        return total;
    }
    
    public double FaremheitaKelvin(double valorTemperatura){
        double total = Math.round(((valorTemperatura + 459.67) * 5/9) * 100.0)/100.0;
        return total;
    }
}
