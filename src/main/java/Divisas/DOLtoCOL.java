package Divisas;

public class DOLtoCOL {
	
    public double convertirDolaraPeso(double valor){
        double DolaraPesoCo = Math.round(4779 * valor);
        return DolaraPesoCo;
    }
    
    public double convertirEuroaPeso(double valor){
        double EuroaPeso = Math.round(5069 * valor);
        return EuroaPeso;
    }
    
    public double convertirLibraaPeso(double valor){
        double LibraaPeso = Math.round(5765 * valor);
        return LibraaPeso;
    }
    
    public double convertirYenaPeso(double valor){
        double YenaPeso = Math.round(35.38 * valor);
        return YenaPeso;
    }
    
    public double convertirWonaPeso(double valor){
        double WonaPeso = Math.round(3.65 * valor);
        return WonaPeso;
    }
}
