import java.util.Scanner;

public class problem8 {
    public static void main(String args[]) {
        int num, reversednum=0;
        Scanner n = new Scanner(System.in);
        System.out.println("enter the number:");
        num = n.nextInt();
        int num1=num;

        while (num > 0){
            int remainder = num % 10;
            reversednum = reversednum*10 + remainder;
            num = num/10;
        }


        if (num1 == reversednum) {
            System.out.println("given number is a palindorome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
