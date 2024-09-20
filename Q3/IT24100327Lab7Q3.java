import java.util.Scanner;
public class IT24100327Lab7Q3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int customerCount = 5;
        double billAmount;
        char payment_Metd;
        double discount;
        double payAmount;

        for (int i = 1; i<=customerCount; i++) {
            System.out.println("Customer " + i);
            System.out.print("Enter total bill amount: ");
            billAmount = input.nextDouble();
            System.out.print("Enter mode of payment (C or cash, O for other): ");
            payment_Metd = input.next().charAt(0);
            switch (payment_Metd) {
                case ('C'):
                    discount = billAmount*0.05;
                    payAmount = billAmount - discount;
                    System.out.println("Discount is: " + discount);
                    System.out.println("Amount to be Paid: " + payAmount);
                    System.out.println();
                    break;
                case ('c'):
                    discount = billAmount*0.05;
                    payAmount = billAmount - discount;
                    System.out.println("Discount is: " + discount);
                    System.out.println("Amount to be Paid: " + payAmount);
                    System.out.println();
                    break;
                case 'O':
                    System.out.println("No discount applicable");
                    System.out.println("Amount to be Paid: " + billAmount);
                    System.out.println();
                    break;
                case 'o':
                    System.out.println("No discount applicable");
                    System.out.println("Amount to be Paid: " + billAmount);
                    System.out.println();
                    break;
                default:
                    System.out.println("Payment Mode Not Valid");
                    System.out.println();
                    break;
            }
        }
        

        input.close();
    }
}