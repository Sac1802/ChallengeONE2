package Divisas;



public class CasosDivisas {

    String SeleccionDivisa;
    COPtoDOL cop = new COPtoDOL();
    DOLtoCOL dol = new DOLtoCOL();

    public CasosDivisas(){

    }

    public double convertirMonedas(double Minput){
        switch (SeleccionDivisa){
            case "1. Peso Colombiano a Dollar" : {
                return cop.convertirPesosaDolar(Minput);
            } case "2.Peso Colombiano a Euro":{
                return cop.convertirPesosaEuro(Minput);
            } case "3.Peso Colombiano a Libra Esterlina":{
                return cop.convertirPesoaLibra(Minput);
            } case "4.Peso Colombiano a Yen Japones":{
                return cop.convertirPesoaYen(Minput);
            } case "5.Peso Colombiano a Won Surcoreano": {
                return cop.convertirPesoaWon(Minput);
            } case "6.Dollar a Peso Colombiano ":{
                return dol.convertirDolaraPeso(Minput);
            } case "7.Euro a Peso Colombiano":{
                return dol.convertirEuroaPeso(Minput);
            } case "8.Libra Esterlina a Peso Colombiano":{
                return dol.convertirLibraaPeso(Minput);
            } case "9.Yen Japones a Peso Colombiano":{
                return dol.convertirYenaPeso(Minput);
            } case "10. Won Surcoreano a Peso Colombiano":{
                return dol.convertirWonaPeso(Minput);
            } default:{
                System.out.println("La Divisa no se encuentra disponible por el momento");
                break;
            }
        } 
        
        return Minput;
    }
}
