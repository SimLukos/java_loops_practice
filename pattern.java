public class pattern {
    public static void main(String[] args) {
        System.out.println("Printing pattern from 1 to 5 five times...:");

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + ",");
            }
            System.out.println("");
        }
    }
}
