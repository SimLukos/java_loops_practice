public class patternTwo {
    public static void main(String[] args) {
        System.out.println("Printing pattern:");

        for (int i = 0, j = 1; i < 5; i++, j++) {
            for (int k = 0; k < 5; k++) {
                System.out.print(j + ", ");
            }
            System.out.println("");
        }
    }
}
