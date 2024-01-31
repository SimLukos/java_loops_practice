public class patternFour {
    public static void main(String[] args) {
        System.out.println("Printing pattern:");

        int lastRowDigit = 0;

        for (int i = 0, k = 1; i < 5; i++, k = lastRowDigit) {
            for (int j = 0, l = k; j < 5; j++, l++, lastRowDigit = l) {
                System.out.print(l + " | ");
            }
            System.out.println("");
        }
    }
}
