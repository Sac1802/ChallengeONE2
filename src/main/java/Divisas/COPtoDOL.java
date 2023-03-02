package Divisas;

public class COPtoDOL {


    public double convertirPesosaDolar(double valor){
        double PesosaDolar = valor / 4779;
        PesosaDolar = Math.round(PesosaDolar * 100) / 100;
        return PesosaDolar;
    }

    public double convertirPesosaEuro(double valor){
        double PesosaEuro = valor / 5069;
        PesosaEuro = Math.round(PesosaEuro * 100) / 100;
        return PesosaEuro;
    }

    public double convertirPesoaLibra(double valor){
    	double PesoaLibra = valor / 5765;
    	PesoaLibra = Math.round(PesoaLibra * 100.00) / 100;
    	return PesoaLibra;
    }
    
    public double convertirPesoaYen(double valor) {
    	double PesoaYen = valor / 35.38;
    	PesoaYen = Math.round(PesoaYen * 100) / 100;
    	return PesoaYen;
    }
    
    public double convertirPesoaWon(double valor) {
    	double PesoaWon = valor / 3.65;
    	PesoaWon = Math.round(PesoaWon * 100) / 100;
    	return PesoaWon;
    }


}
