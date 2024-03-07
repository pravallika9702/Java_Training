import java.util.Scanner;

public class problem5 {
    public static void main(String args[]) {
        int x, y;
        Scanner x1 = new Scanner(System.in);
        Scanner y1 = new Scanner(System.in);


        System.out.println("enter the value of x");
        x = x1.nextInt();
        System.out.println("enter the value of y");
        y = y1.nextInt();
        if( x > y) {
            System.out.println("x is greater tha y");
        }
        else {
            System.out.println("x is less than y");
        }
    }
}
