import java.util.Scanner;

public class arithmeticProgression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose starting number:");
        int a = scan.nextInt();
        System.out.println("Choose difference:");
        int d = scan.nextInt();
        System.out.println("How many number you want?");
        int n = scan.nextInt();
        String series = "";

        for (int i = 0; i < n; i++) {
            series = series + a + ", ";
            a = a + d;
        }

        System.out.println(series);
        scan.close();
    }
}
