
    //import javax.sound.midi.Soundbank;
//Write a program for swapping varia bles
//class Swap1 {
//    int a,b,c;
//     Swap1(int a,int b){
//        this.a=a;
//        this.b=b;
//    }
//    int swapping1(){
//        System.out.println("Before swap");
//        System.out.println(a);
//        System.out.println(b);
//        return 0;
//    }
//    int swapping2(){
//        c=a;
//        a=b;
//        b=c;
//
//        System.out.println("After swap");
//        System.out.println(a);
//        System.out.println(b);
//        return 0;
//    }
//}
//  public class Swap{
//    public static void main(String[] args) {
//         Swap1 s = new Swap1(10,20);
//          s.swapping1();
//          s.swapping2();
//
//    }
//}
//Sir approach
    class Dt{
        private int a;
        private int b;
        public Dt(int a, int b){
            this.a=a;
            this.b=b;
        }
        public int getA() {
            return a;
        }
        public void setA(int a) {
            this.a = a;
        }
        public int getB() {
            return b;
        }
        public void setB(int b) {
            this.b = b;
        }
    }
    class Swap1{
        public Dt doSwap(int a, int b){
            int c=a;
            a=b;
            b=c;
            return new Dt(a,b);
        }
    }
    public class Swap{
        public static void main(String[] args) {
            int a=10;
            int b=20;

            Swap1 sp=new Swap1();
            System.out.println(" Before swap a "+ a  +" b "+ b);
            Dt swapped = sp.doSwap(a,b);
            System.out.println("After swap a "+ swapped.getA()+" b "+swapped.getB());

        }
    }

