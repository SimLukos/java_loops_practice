public class patternThree {
    public static void main(String[] args) {
        System.out.println("Printing pattern:");

        for (int i = 0, k = 2; i < 5; i++, k++) {
            for (int j = 0, l = k; j < 5; j++, l++) {
                System.out.print(l + " | ");
            }
            System.out.println("");
        }
    }
}
