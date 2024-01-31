import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Choose a number:");
        long number = scan.nextInt();
        long numberToPrint = number;
        int count = 0;

        while (number > 0) {
            number = number / 10;
            count++;
        }
        scan.close();
        System.out.println("Number: " + numberToPrint + " has " + count + " digit(s).");
    }
}
