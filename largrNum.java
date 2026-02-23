import java.util.Scanner;

public class largrNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input First number: ");
        int num1 = scanner.nextInt();

        System.out.println("Input Second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Input Third number: ");
        int num3 = scanner.nextInt();

        System.out.println("****OUTPUT****");

        //Checking for num1 being the of all
        if ((num1 >= num2) && (num2 >= num3)){
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        } else if ((num1 >= num3) && (num3 >= num2)) {
            System.out.println(num1);
            System.out.println(num3);
            System.out.println(num2);
        } else if ((num2 >= num1 ) && (num1 >= num3)) {
            System.out.println(num2);
            System.out.println(num1);
            System.out.println(num3);
        } else if ((num2 >= num3) && (num3 >= num1)) {
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num1);
        } else if ((num3 >= num1) && (num1 >= num2)) {
            System.out.println(num3);
            System.out.println(num1);
            System.out.println(num2);
        } else {
            System.out.println(num3);
            System.out.println(num2);
            System.out.println(num1);
        }
}
}