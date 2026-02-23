import java.util.Scanner;
import java.util.Arrays;

public class arraySort {
    public static void main (String[] args ) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input first number:");
        int num1 = scan.nextInt();

        System.out.println("Input second number:");
        int num2 = scan.nextInt();

        System.out.println("Input third number:");
        int num3 = scan.nextInt();

        System.out.println("******OUTPUT******");

        int[] numbers = {num1, num2, num3};

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        scan.close();
    }
}