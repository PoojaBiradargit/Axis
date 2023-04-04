//Write a java program to convert temperature in celsius to fahrenheit
public class TempToFah {
    private double tempcles;
    private double tempFah;

    public TempToFah(double tempcles){
        this.tempcles=tempcles;
        this.tempFah=0.0d;
    }
    public double clesToFah(){
        return  tempFah=(tempcles*(9/5))+32;
    }
}
class Temp{
    public static void main(String[] args) {
        TempToFah converter = new TempToFah(90);
        System.out.println("Temp in Fah " + converter.clesToFah());
    }
}