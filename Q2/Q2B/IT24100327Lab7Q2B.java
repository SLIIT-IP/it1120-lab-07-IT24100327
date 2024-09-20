public class IT24100327Lab7Q2B {
    public static void main (String[] args) {

        int rowCount = 5;

        for (int i = 1; i<=rowCount; i++) {
            System.out.print(i + " - " );
            for (int x = 1; x <= i; x++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}