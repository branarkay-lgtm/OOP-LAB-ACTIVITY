import java.util.Scanner;

public class PassFailLogical {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        int grade = input.nextInt();

        // Check invalid input using OR
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid grade. Please enter a value from 0 to 100.");
        }
        // Check pass using AND
        else if (grade >= 75 && grade <= 100) {
            System.out.println("You passed!");
        }
        // Use NOT to determine fail
        else if (!(grade >= 75)) {
            System.out.println("You failed.");
        }

        input.close();
    }
}
