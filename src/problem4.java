import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class problem4 {
    public static void main(String args[]){
        Scanner a1 = new Scanner(System.in);
        Scanner b1 = new Scanner(System.in);
        Scanner c1 = new Scanner(System.in);
        int a, b, operator;


        System.out.println("enter a");
        a = a1.nextInt();
        System.out.println("enter the value of b");
        b = b1.nextInt();
        System.out.println(" 1 -Add\n 2-Subtract\n 3-Multipy\n 4-Div\n");
        System.out.println("choose the operator");
        operator = c1.nextInt();

        int result = 0;

        switch (operator) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                result = a / b;
                break;
        }
        System.out.println("Result is: " + result );
    }
}
