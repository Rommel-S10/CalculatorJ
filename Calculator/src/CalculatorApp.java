import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {

        Scanner digi1= new Scanner(System.in);

        Scanner digit2 = new Scanner(System.in);

        double num1;
        double num2;
        System.out.println("Please enter first digit:");
        num1 = digi1.nextDouble();
        System.out.println("Please enter second digit:");
        num2 = digit2.nextDouble();

        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for substraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");

        int operationSelected = digi1.nextInt();

        if(operationSelected == 1){
            System.out.println(num1 + num2);
        }
        else if(operationSelected ==2){
            System.out.println(num1 - num2);
        }
        else if(operationSelected == 3){
            System.out.println(num1 * num2);
        }
        else if(operationSelected == 4){
            System.out.println(num1 / num2);
        }else{
            System.out.println("Error");
        }
    }
}