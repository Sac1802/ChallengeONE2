# ChallengeONE2

Segundo Challenge es un convertidor de Divisas y de temperatura el cual su codigo fuente fue hecho con el lenguaje de Java 

Buenas Tardes mi nombre es Said Acosta Cepeda, Estudiante del programa ONE (Oracle Next Education).
Hoy les vengo a mostrar mi Conversosr de Divisas y de Temperatura el cual su codigo fuente (Back End) fue hecho con el 
lenguaje de Programacion de Java y su Front End fue diseñado con la aplicacion de Apache NeatBeans espero y te agrade :).

# Ejercicio planteado 

## Funciones del Convertor

* Conversor de Divisas

* Conversosr de Temperatura 

>En el convertidor te encontraras por primera vez una pantalla la cual te pedira que selecciones el tipo de conversion que quieres al darle click al que quieres se te abrira la ventana con su respectivo tipo de conversos que elegistes, este reto me ayudo mucho a mejorar mi logica de programacion la cual me impulso a investigar y indigar como podria por medio de NetBeans darle interaccion a los botones.

### Ejemplo de Codigo 

A continuacion les mostrare un poco del codigo implementado para poder realizar las operaciones del cambio de Divisas y de Temperatura:

* Primero les presento como es la operacion para poder obtener el valor de Peso Colombiano a Dollar Estadounidense:

```
      public double convertirPesosaDolar(double valor){
        double PesosaDolar = valor / 4779;
        PesosaDolar = Math.round(PesosaDolar * 100) / 100;
        return PesosaDolar;
    }
```

* Primero Declaro la funcion el cual retorna un double y se le pasa un parametro, el cual es valor para despues con ese parametro dividirlo por cuando vale un dollar a peso colombiano despues este resultado el redondeado a un numero el cual solo muestra un decimal y despues retorna el valor total 
* Para las demas divisas es el mismo procedimiento lo unico que cambia es el valor el cual es dividido 

* Para poder seleccionar la divisa deseada he incluido un switch el cual es el siguiente 
```
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
```
* Primero declaro una variable String para poder pasarselo como parametro al switch para poder seleccionar cual es el tipo de divisa a convertir, despues instancio las clases las cuales tienes las operaciones para poder hacer la respectivo operacion de conversion, despues creo una funcioan la cual se le pasa un parametro el cual debe de ser double para despues enviarlo como un valor a la funcion llamada para convertirla a peso a dollar o etc...


* Para poder seleccionar el tipo de divisa y darle un valor al parametro seria:

```
        CasosDivisas caso = new CasosDivisas();
        double valorTotal; 
        String selector;
        
        selector = SelectorDivisas.getSelectedItem().toString();
        caso.SeleccionDivisa = selector;
        
        try{
            valorTotal = Double.parseDouble(Valor.getText());
            double total = caso.convertirMonedas(valorTotal);

            Resultado.setText(String.valueOf(total));
        }catch(Exception e){
            String validar = Valor.getText();
            if(validar.isEmpty()){
                JOptionPane.showMessageDialog(null, "Por favor ingrese un valor valido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
```

* Primero instacio los casos para seleccionar que divisa quiero, despues declaro una variable como double y otra como String ahora a la variable la cual es un String le declaro que su valor es el JComboBox el cual obtiene el item seleccionado y lo combierto a String depues, llamo a la variable declarada en el switch el cual da a saber cual fue la divisa seleccionada y le doy el valor de la cadena de texto obtenida.
* Hago try catch para poder decirle que si el campo donde va el valor a comvertir esta vacio le envie un mensaje diciendole que ingrese un numero valido despues llamo a la variable que es double para darle un valor el cual es convertir el JTextField a un double y enviarlo como el parametro que se necesita para obtener el valor de conversion y despues le doy el valor obtenido de la operacion a la JTextField el cual es donde muestra el valor obtenido 

* Segundo le mostratare como es la operacion para obtener la temperatura de Grados Celcius a Grados Frenheit 

```
    public double GradoaFaremheit(double valorTemperatura){
        double total = valorTemperatura * 9/5 + 32;
        return total;
    }
```
* Primero se declara una funcion la cual se le pasa un parametro el cual el un double , despues se hace la respectiva operacion el cual es el parametro por la respectivo operacion para poder obtener el nunmero deseado 


Los demas pasos son iguales a la de la divida pero aun asi voy a dejar el codigo para que puedan verlo 

* Switch
```
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
```

```
        SeleccionTemperatura temperatura = new SeleccionTemperatura();
        String selector;
        double valorTotal;
        
        selector = SelectorTem.getSelectedItem().toString();
        temperatura.Seleccion = selector;
        
        
        try{
            valorTotal = Double.parseDouble(Valor.getText());
            double total = temperatura.Eleccion(valorTotal);

            ValorTotal1.setText(String.valueOf(total));
        }catch(Exception e){
                
            String validar = Valor.getText();
            if(validar.isEmpty()){
                JOptionPane.showMessageDialog(null, "Por favor ingrese un valor valido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
```
![Texto Corto](imagenes/principal)
