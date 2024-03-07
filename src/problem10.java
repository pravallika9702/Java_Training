import javafx.scene.SubScene;

import java.util.Scanner;

//check if given number is even or odd
public class problem10 {
    public static void main(String args[]){
        int i;
        Scanner i1 = new Scanner(System.in);
        System.out.println("Enter the number:");
        i = i1.nextInt();

        if (i % 2 == 0) {
            System.out.println("Given number is even");
        }
        else {
            System.out.println("Given number is odd" );
        }

    }

}
