import java.util.Scanner;
public class IT24100327Lab7Q2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int rowCount = 4;
        int columnCount = 5;

        for (int i = 1; i<=rowCount; i++) {
            for (int x = 1; x <= columnCount; x++) {
                System.out.print("$ ");
            }
            System.out.println();

        }

        input.close();
    }
}