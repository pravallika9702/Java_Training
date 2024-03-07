public class problem9 {
    public static void main(String args[]) {
        int[] num = {1,3,5,7,9};
        int i = num.length;
        int  sum = 0;

        for (i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("Sum of given array is" + sum);
    }
}
