package Temperatura;

/**
 *
 * @author Acost
 */
public class SeleccionTemperatura {
    String Seleccion;
    Temperatura temperatura = new Temperatura();
    
    public SeleccionTemperatura(){
    
    }
    
    public double Eleccion(double valor){
        switch(Seleccion){
            case "1.Grados Celsius a Grados Fahrenheit": {
                return temperatura.GradoaFaremheit(valor);
            }case "2.Grados Fahrenheit a Grados Celsius":{
                return temperatura.FaremheitaCelcius(valor);
            }case "3.Kelvin a Grados Celsius":{
                return temperatura.KelvinaCelcius(valor);
            }case "4.Grados Celsius a Kelvin":{
                return temperatura.CelsiusaKelvin(valor);
            }case "5.Kelvin a Grados Fahrenheit":{
                return temperatura.KelvinaFremheit(valor);
            }case "6.Grados Fahrenheit a Kelvin":{
                return temperatura.FaremheitaKelvin(valor);
            }default:{
                System.out.println("No se a Podido Encontrar la Temperatura que quieres");
            }
        }
        
        return valor;
    }
}
