import java.util.Scanner;
public class IT24100327Lab7Q1 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;
        int mark;
        double average;
        int sum = 0;
        String grade = "";

        while (count<=4) {
            System.out.print("Enter Mark "+(count)+": ");
            mark = input.nextInt();
            
            if (mark<=100 && mark>=0) {
                sum = sum + mark;
                count++;
            } else {
                System.out.println("incorrect Mark");
            }
            
        }

        average = sum/4;

        if (average<=100 && average>=75) {
            grade = "Distinction";
        } else if (average<75 && average>=50) {
            grade = "Credit";
        }else if (average<50 && average>=0) {
            grade = "Fail";
        } else {
            System.out.print("Error");
        }

        System.out.println("\nAverage is: " + average);
        System.out.println("Overall Grade is: " + grade);

        input.close();
    }
}