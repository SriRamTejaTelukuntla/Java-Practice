import java.util.Scanner;

public class PrintAnInteger {

    public static void main(String[] Args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a Number: ");

        int number = reader.nextInt();

        System.out.println("Entered Number: " + number);
    }
}
