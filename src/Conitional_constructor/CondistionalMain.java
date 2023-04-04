class ConditionalChecks {
    public void basicIf() {
        int a = 10;
        if (a <= 10) {
            System.out.println("its true");
        }
    }

    public void ifElse() {
        int a = 10;
        if (a > 10) {
            System.out.println("its true");
        } else {
            System.out.println("its false");
        }
    }

    public void ifElseLadder() {
        int marks = 60;
        if (marks >= 90) {
            System.out.println("Distinction");
        } else if (marks < 90 && marks > 78) {
            System.out.println("First class");
        } else if (marks < 78 && marks >= 55) {
            System.out.println("Second class");
        } else {
            System.out.println("They can be Entrepreneur");
        }
    }

    public void nestedIf() {
        int threshold = 60;
        if (threshold < 60) {
            int current = 8;
            if (current < 10) {
                System.out.println("Good");
            }
        else {
                System.out.println("Stopping");
            }
        } else{
            System.out.println("Too high vibration");
        }
    }
    public void basicSwitchCase(){
        int day=7;
        String dayName = "";
        switch (day)
        {
            case 1 :
                dayName = "Mon";
                break;
            case  2 :
                dayName = "Tue";
                break;
            case 3 :
                dayName = "Wed";
                break;
            case 4 :
                dayName = "Thu";
                break;
            case 5 :
                dayName = "Fri";
                break;
            case 6 :
                dayName = "Sat";
                break;
            case 7 :
                dayName = "Sun";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println(dayName);
    }
    public void java8SwitchExpression(){
        int day=2;
        String dayName = switch (day){
            case 1-> "Mon";
            case 2-> "Tue";
            case 3-> "Wed";
            case 4-> "Thu";
            case 5-> "Fri";
            case 6-> "Sat";
            case 7-> "Sun";
            default -> "Invalid Day";
        };
        System.out.println(dayName);
    }
    public void java8SwitchExpressionEval(){
        int marks = 60;

        String result = switch (marks/10){
            case 90,100 -> "Distinction";
            case 70,89 -> "Second class";
            default -> "Entrepreneur";
        };
        System.out.println(result);
    }
}
public class CondistionalMain {
    public static void main(String[] args) {
        ConditionalChecks b = new ConditionalChecks();
        b.basicIf();
        b.ifElse();
        b.ifElseLadder();
        b.nestedIf();
        b.basicSwitchCase();
        b.java8SwitchExpressionEval();
        b.java8SwitchExpression();
    }

}
