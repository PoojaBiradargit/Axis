

//write a program for printing pyramid
 class Pyramids {
    public void leftPyramid(int rows){
        for (int i=1; i<= rows; i++){
            int spaces = rows-i;
            int stars =2*i-1;
            for (int k=1; k<=stars; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void centerPyramid(int rows){
        for (int i=1; i<= rows; i++){
            int spaces = rows-i;
            int stars =2*i-1;
            for (int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=stars; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    public void rightPyramid(int rows){
//        for (int i=1; i<= rows; i++){
//            int spaces = rows-i;
//            int stars =2*i-1;
//            for (int j=1; j<=spaces; j++){
//                System.out.print(" ");
//            }
//            for (int k=1; k<=stars; k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
}
public class PyramidMain{
    public static void main(String[] args) {
        Pyramids pyramids = new Pyramids();
        pyramids.centerPyramid(5);
        pyramids.leftPyramid(5);
        //pyramids.rightPyramid(5);

    }
}
