class Loops {
    public void basicFor() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
    public void basicWhile(){
        int i = 0;
        while (true){
            if (i>10) break;
            else {
                i++;
            } continue; //if you don't write continue still it okay just for explaining, i have written
        }
    }
    public void basicDoWhile(){
        int i=0;
        do{
            if (i>10) break;
            i++;
        }while (i<10);
    }
    public void nestedFor(){
        for (int i=0; i<3; i++){
            for (int j=0;j<2; j++){
                System.out.println("i =" +i+ " j =" +j);
            }
        }
    }
    public void setWaterSensor(int val){

    }
    public void nestedWhile(){
        boolean isRPMThreshold = true;
        int ltr = 70;
        while (isRPMThreshold){
            while (ltr < 100){
                //check water level by sensor value
                ltr = 56;
            }
            do {
                //set water level sensor
                setWaterSensor(89);
            }while (true);
        }
    }
}

public class LoopMain {
    public static void main(String[] args) {
        Loops lp = new Loops();
        //lp.basicFor();
        //lp.basicWhlie();
        // lp.basicDoWhile();
        //lp.nestedFor();
        lp.nestedWhile();
    }
}
