public class Temperatura {
    //ATRIBUTO PRIVADO PARA ARMAZENAR TEMP - CELCIUS
    
    private double tempCelcius;
    
    //CONSTRUTOR - CRIA OBJETO COM UMA TEMP INICIAL
    
    public Temperatura(double tempInicialCelcius){
        this.tempCelcius = tempInicialCelcius;
    }
    
    //GETTER - PARA LER A TEMPERATURA
    
    public double getTemperatura(){
        return tempCelcius;
    }
    
    //SETTER - PARA MUDAR A TEMPERATURA
    
    public void setTemperaturaCelcius(double mudarTempCelcius){
        this.tempCelcius = mudarTempCelcius;
    }
    
    //MÉTODO PARA CONVERTER CELCIUS PARA FAHRENHEIT
    
    public double converteParaFahrenheit(){
        return (tempCelcius*9/5)+32;
    }
    
    //MÉTODO PARA CONVERTER CELCIUS PARA KELVIN
    
    public double converteParaKelvin(){
        return tempCelcius+273.15;
    }
}

