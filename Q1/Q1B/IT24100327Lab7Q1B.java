import java.util.Scanner;
public class IT24100327Lab7Q1B {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        double average;
        int sum = 0;
        String grade = "";
        int studentCount = 3;
        String markString;
        String[] marks;

        for (int i = 1; i <= studentCount; i++) {
            System.out.println("Student " + i);
            System.out.print("Enter (marks separated by space): ");
            markString = input.nextLine();
            marks = markString.split(" ");
        
            int mark1 = Integer.parseInt(marks[0]);
            int mark2 = Integer.parseInt(marks[1]);
            int mark3 = Integer.parseInt(marks[2]);
            int mark4 = Integer.parseInt(marks[3]);
        
            sum = mark1 + mark2 + mark3 + mark4;
            average = sum / 4.0;

            if (average<=100 && average>=75) {
                grade = "Distinction";
            } else if (average<75 && average>=50) {
                grade = "Credit";
            }else if (average<50 && average>=0) {
                grade = "Fail";
            } else {
                System.out.print("Error");
            }

            System.out.println("Average is: " + average);
            System.out.println("Overall Grade is: " + grade);
            System.out.println();
        }

            input.close();
        }

       

        
    }
